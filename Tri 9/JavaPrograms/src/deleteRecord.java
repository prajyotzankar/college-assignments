import java.sql.*;
import java.util.*;

public class deleteRecord {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/college";

    static final String USER = "root";
    static final String PASS = "t211xxamk2";

    public static void main(String args[]){

        Connection conn_obj = null;
        Statement statement = null;

        Integer[] prnArray = {300, 301, 302};
        String[] nameArray = {"Amit", "Amay", "Sanjana"};
        String[] courseArray = {"BCS", "MCA", "MCS"};
        String[] yearArray = {"TY", "SY", "FY"};
        String[] divisionArray = {"A", "B", "B"};

        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connection to database ... ");
            conn_obj = DriverManager.getConnection(DB_URL, USER, PASS);

            //Insert values
            String sqlQuery = "insert into Student values (?, ?, ?, ?, ?)";
            PreparedStatement prepStmt = conn_obj.prepareStatement(sqlQuery);

            conn_obj.setAutoCommit(false);

            for(int i = 0 ; i < prnArray.length ; i++){
                prepStmt.setInt(1, prnArray[i]);
                prepStmt.setString(2, nameArray[i]);
                prepStmt.setString(3, courseArray[i]);
                prepStmt.setString(4, yearArray[i]);
                prepStmt.setString(5, divisionArray[i]);

                prepStmt.addBatch();
            }
            prepStmt.executeBatch();

            //Delete record
            statement = conn_obj.createStatement();
            sqlQuery = "DELETE FROM Student WHERE PRN=302";
            statement.executeUpdate(sqlQuery);

            sqlQuery = "SELECT * FROM Student";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            System.out.println("\n PRN \tName \t\tCourse \tYear \tDivision");
            while(resultSet.next()){
                System.out.println(" "+resultSet.getInt("PRN") + 
                "\t" + resultSet.getString("Name") + 
                "\t" + resultSet.getString("Course") +
                "\t" + resultSet.getString("Year") +
                "\t" + resultSet.getString("Division")
                );
            }

            conn_obj.close();
        }
        catch(Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
