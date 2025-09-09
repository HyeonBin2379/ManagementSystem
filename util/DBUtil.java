package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {

    private static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("util.dbinfo");

        try {
            // 1. DB 드라이버를 찾아서 로드
            Class.forName(bundle.getString("driver"));
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            // 2. DB 드라이버 로드 성공 시, Connection 객체를 생성
            // (연결할 DB, 사용자, 비밀번호 제공)
            return DriverManager.getConnection(
                    bundle.getString("url"),
                    bundle.getString("user"),
                    bundle.getString("password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
