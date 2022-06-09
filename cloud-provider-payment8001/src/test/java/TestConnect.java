import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {
    @Test
    public void testConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db1001?allowPublicKeyRetrieval=true&characterEncoding=utf8" +
                "&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        DriverManager.getConnection(url,"root","qwe123");
    }
}
