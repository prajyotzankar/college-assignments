import java.sql.*;
import java.util.*;
import java.io.*;

public class empProcedure {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/college";

    static final String USER = "root";
    static final String PASS = "t211xxamk2";

    public static void main(String args[])throws Exception{

        Connection conn_obj = null;

        int idArray[] = new int[2];
        String nameArray[] = new String[2];
        String deptArray[] = new String[2];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee Details");
        for(int i = 0 ; i < idArray.length ; i++){
            System.out.println("ID : ");
            idArray[i] = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Name : ");
            nameArray[i] = bufferedReader.readLine();

            System.out.println("Department : ");
            deptArray[i] = bufferedReader.readLine();

        }

        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database ... ");

            conn_obj = DriverManager.getConnection(DB_URL, USER, PASS);
            String sqlQuery;
            Statement statement = conn_obj.createStatement();

            //Create table
            DatabaseMetaData dbm = conn_obj.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "empInfo", null);

            if(!tables.next()){
                sqlQuery = "CREATE TABLE empInfo" +
                            "(ID INTEGER NOT NULL, " +
                            "Name VARCHAR(255), " +
                            "Department VARCHAR(255), " +
                            "PRIMARY KEY (ID))";

                statement.executeUpdate(sqlQuery);
            }

            //Store Procedure
            sqlQuery = "DROP PROCEDURE IF EXISTS insertEmployee ";
            statement.execute(sqlQuery);

            sqlQuery = "CREATE PROCEDURE insertEmployee " +
                        "(IN ID INT, IN Name VARCHAR(255), IN Department VARCHAR(255))" +
                        "BEGIN " +
                        "INSERT INTO empInfo VALUES (ID, Name, Department);" +
                        "END";
            
            statement.execute(sqlQuery);

            //Insert values
            sqlQuery = "{call insertEmployee (?, ?, ?)}";
            CallableStatement cstmt = conn_obj.prepareCall(sqlQuery);
            
            for(int i = 0 ; i < idArray.length ; i++){
                cstmt.setInt(1, idArray[i]);
                cstmt.setString(2, nameArray[i]);
                cstmt.setString(3, deptArray[i]);

                cstmt.execute();
            }
            System.out.println("Stored procedure created successfully!");
            conn_obj.close();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
}
