package postgresql;

import java.sql.*;

public class JavaDataBase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String user = "postgres";
        String password = "";
        String query = "Select dept_no From Departments";
        String url = "jdbc:postgresql://localhost/employeesql";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement state = con.createStatement();
        ResultSet rs = state.executeQuery(query);
        rs.next();
        //System.out.println(rs.getArray(1));

        Array rsArray = rs.getArray("dept_no");
        System.out.println(rsArray);
        //String[] type = (String[]) rsArray.getArray();
        //System.out.println(type);


    }
}
