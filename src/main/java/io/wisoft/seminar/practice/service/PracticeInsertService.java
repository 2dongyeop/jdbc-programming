package io.wisoft.seminar.practice.service;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PracticeInsertService {
    public void question14(String emp_code, String emp_name, String emp_mgt, int emp_sal) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO employee(emp_code, emp_name, emp_mgt, emp_sal) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, emp_code);
            pstmt.setString(2, emp_name);
            pstmt.setString(3, emp_mgt);
            pstmt.setInt(4, emp_sal);


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
}
