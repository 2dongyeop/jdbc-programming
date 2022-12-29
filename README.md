## jdbc-programming

<br/>

> WiSoft 연구실에서 jdbc 세미나를 진행한 실습 및 과제 코드들을 기록합니다.
>
> [정리한 노션 링크 보러가기](https://leedongyeop.notion.site/SQL-82d1d9255a604c9cb3202d9c30fb07ba)

<br/>

- Database 접속을 위한 개인 정보가 담겨 ignore된 파일이 있습니다.
    - `src/main/java/io/wisoft/seminar/PostgresqlAccess.java`
        ```java
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

        public class PostgresqlAccess {
            private static Connection conn = null;

            public void init() {
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            public static Connection setConnection() {
                String url = "jdbc:postgresql://호스트이름:포트번호/DB이름";
                String username = "********";
                String password = "********";

                try {
                    conn = DriverManager.getConnection(url, username, password);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return conn;
            }
        }
        ```