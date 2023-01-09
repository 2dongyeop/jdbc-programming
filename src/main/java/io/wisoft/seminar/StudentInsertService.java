package io.wisoft.seminar;

import java.sql.*;

import static java.sql.Types.*;

public class StudentInsertService {

    public void insertStudent(Student student) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, student.getStudentNo());
            pstmt.setString(2, student.getStudentName());

            if (student.getStudentBirthday() == null) {
                pstmt.setNull(3, DATE);
            } else {
                pstmt.setDate(3, Date.valueOf(student.getStudentBirthday()));
            }

            int retValue = pstmt.executeUpdate();
            conn.commit();
            System.out.println(retValue + "건의 사항이 처리되었습니다.");

        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } //finally

    }

    public void insertStudentMulti(Student[] students) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            int retValue = 0;
            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);

            for (int i = 0; i < students.length; i++) {
                if (students[i].getStudentNo() == null && students[i].getStudentName() == null) {
                    break;
                }

                pstmt.setString(1, students[i].getStudentNo());
                pstmt.setString(2, students[i].getStudentName());

                if (students[i].getStudentBirthday() == null) {
                    pstmt.setNull(3, DATE);
                } else {
                    pstmt.setDate(3, Date.valueOf(students[i].getStudentBirthday()));
                }

                retValue += pstmt.executeUpdate();
                pstmt.clearParameters();
            }

            conn.commit();
            System.out.println(retValue + "건의 사항이 처리되었습니다.");

        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } //finally
    }

    public void insertStudentMultiBatch(Student[] students) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);

            for (int i = 0; i < students.length; i++) {
                if (students[i].getStudentNo() == null && students[i].getStudentName() == null) {
                    break;
                }

                pstmt.setString(1, students[i].getStudentNo());
                pstmt.setString(2, students[i].getStudentName());

                if (students[i].getStudentBirthday() == null) {
                    pstmt.setNull(3, DATE);
                } else {
                    pstmt.setDate(3, Date.valueOf(students[i].getStudentBirthday()));
                }

                pstmt.addBatch();
                pstmt.clearParameters();
            }

            int[] retValue = pstmt.executeBatch();
            conn.commit();
            System.out.println(retValue.length + "건의 사항이 처리되었습니다.");

        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } //finally
    }
}
