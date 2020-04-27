package postgresql;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JavaDatabaseX2 {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        connectDB();
    }

    public static Properties properties() throws IOException {
        InputStream input = new FileInputStream("/Users/navid/Documents/JavaDatabase/src/main/java/postgresql/app.properties");
        Properties pro = new Properties();
        pro.load(input);
        input.close();
        return pro;
    }


    public static Connection connectDB() throws IOException, ClassNotFoundException, SQLException {
        String user = properties().getProperty("user");
        String password = properties().getProperty("password");
        String url = properties().getProperty("url");
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        return con;

    }

}
