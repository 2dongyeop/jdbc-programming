package io.wisoft.seminar.practice.service;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PracticeDeleteService {
    public void question15(String emp_name) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "DELETE FROM employee WHERE emp_name = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, emp_name);

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
