package sys.voc.model2.dao;

import sys.voc.model2.vo.MemberVO;

import java.sql.*;

public class MemberDAO {
    private static MemberDAO dao = new MemberDAO();

    private MemberDAO() {};

    public static MemberDAO getInstance() {
        return dao;
    }

    public Connection connect() {
       Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "tiger");
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println("exception = " + exception);
        }
        return conn;
    }

    public void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException sqlException) {
                System.out.println("sqlException = " + sqlException);
            }
        }
    }

    public void close(Connection connection, PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException sqlException) {
                System.out.println("sqlException = " + sqlException);
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException sqlException) {
                System.out.println("sqlException = " + sqlException);
            }
        }
    }

    public void memberInsert(MemberVO memberVO) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            conn = connect();

            preparedStatement = conn.prepareStatement("insert into member values(?,?,?,?)");
            preparedStatement.setString(1, memberVO.getId());
            preparedStatement.setString(2, memberVO.getPassword());
            preparedStatement.setString(3, memberVO.getName());
            preparedStatement.setString(4, memberVO.getMail());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("sqlException = " + sqlException);
        }
    }
}
