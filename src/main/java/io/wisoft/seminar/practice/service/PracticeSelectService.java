package io.wisoft.seminar.practice.service;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PracticeSelectService {
    public void question1() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM DEPARTMENT";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[부서코드] " + rs.getString(1) + " || ");
                System.out.print("[부서이름] " + rs.getString(2) + " || ");
                System.out.println("[부서위치] " + rs.getString(3));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question2() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[연예관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[이름] " + rs.getString(2) + " || ");
                System.out.print("[관리자] " + rs.getString(3) + " || ");
                System.out.println("[급여] " + rs.getInt(4));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question3(String drm_prd) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM DRAMA WHERE DRM_RPD = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, drm_prd);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[드라마코드] " + rs.getString(1) + " || ");
                System.out.println("[이름] " + rs.getString(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question4() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT DISTINCT * FROM DRAMA WHERE DRM_BRD IN ('KBC', 'SBC')";
            pstmt = conn.prepareStatement(query);
//            pstmt.setString(1, studentNo);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[드라마이름] " + rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question5() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT DISTINCT DRM_RPD FROM DRAMA";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[드라마 제작사] " + rs.getString(1));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question6() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT sum(emp_sal), avg(emp_sal) FROM employee";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[총합] " + rs.getInt(1));
                System.out.println("\t[평균] " + rs.getDouble(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }

    }

    public void question7() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT drm_name FROM drama WHERE drm_opdate IS NULL";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[총합] " + rs.getInt(1));
                System.out.println("\t[평균] " + rs.getDouble(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question8() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.emp_name, M.emp_name FROM employee E, employee M WHERE E.emp_mgt = M.emp_code";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[연예관계자 이름] " + rs.getString(1));
                System.out.println(" [매니저 이름] " + rs.getString(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question9() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_name, emp_sal FROM employee ORDER BY emp_sal DESC, emp_name ASC";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[이름] " + rs.getString(1));
                System.out.println(" [급여] " + rs.getInt(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question10() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_rcode, avg(emp_sal), min(emp_sal), max(emp_sal) FROM employee GROUP BY emp_rcode HAVING avg(emp_sal) >= 5000";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직급] " + rs.getString(1));
                System.out.print(" [평균급여] " + rs.getInt(2));
                System.out.print(" [최소급여] " + rs.getInt(3));
                System.out.println(" [최대급여] " + rs.getInt(4));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void question11() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_name, emp_sal " +
                             "FROM employee " +
                            "WHERE emp_sal > (SELECT avg(emp_sal) " +
                                               "FROM employee)";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[이름] " + rs.getString(1));
                System.out.println(" [급여] " + rs.getInt(2));
            }

        } catch (SQLException sqex) {
            System.err.println("SQLException: " + sqex.getMessage());
            System.err.println("SQLState: " + sqex.getSQLState());
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }


    }

    public void question16(String emp_rname) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT E.emp_name FROM employee E, emp_role ER " +
                    "WHERE E.emp_rcode = ER.emp_rcode " +
                    "AND ER.emp_rname != ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, emp_rname);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void question15(String deptName1, String deptName2) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.emp_name FROM employee E, rel_department RD, department D " +
                           "WHERE E.emp_code = RD.rd_emp_code " +
                           "AND RD.rd_dept_code = D.dept_code " +
                           "AND D.dept_name = ? " +
                           "INTERSECT " +
                           "SELECT E.emp_name FROM employee E, rel_department RD, department D " +
                           "WHERE E.emp_code = RD.rd_emp_code " +
                           "AND RD.rd_dept_code = D.dept_code " +
                           "AND D.dept_name = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, deptName1);
            pstmt.setString(2, deptName2);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }
}
