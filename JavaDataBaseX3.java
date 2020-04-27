package postgresql;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDataBaseX3 {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        getData();
    }

    public static void getData() throws SQLException, IOException, ClassNotFoundException {
        String query = "Select * From Departments";
        Statement state = JavaDatabaseX2.connectDB().createStatement();
        ResultSet rs = state.executeQuery(query);
        while (rs.next()){

            System.out.println(rs.getString(1));
        }

    }
}
