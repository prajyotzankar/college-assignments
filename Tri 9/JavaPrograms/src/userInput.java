import java.sql.*;
import java.util.*;
import java.io.*;

public class userInput {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/college";

    static final String USER = "root";
    static final String PASS = "t211xxamk2";

    public static void main(String args[]) throws Exception{

        Connection conn_obj = null;
        Statement statement = null;

        int prnArray[] = new int[3];
        String nameArray[] = new String[3];
        String courseArray[] = new String[3];
        int ageArray[] = new int[3];
        String genderArray[] = new String[3];
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  

        System.out.println("Enter Student details");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("PRN : ");
            prnArray[i] = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Name : ");
            nameArray[i] = bufferedReader.readLine();

            System.out.println("Course : ");
            courseArray[i] = bufferedReader.readLine();

            System.out.println("Age : ");
            ageArray[i] = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Gender : ");
            genderArray[i] = bufferedReader.readLine();

            System.out.println("\n");
        }

        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database....");

            conn_obj = DriverManager.getConnection(DB_URL, USER, PASS);
            String sqlQuery;
            statement = conn_obj.createStatement();

            //Create table
            DatabaseMetaData dbm = conn_obj.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "studentAgeInfo", null);

            if(!tables.next()){
                sqlQuery = "CREATE TABLE studentAgeInfo"  +
                            "(PRN INTEGER NOT NULL, " +
                            "Name VARCHAR(255), " +
                            "Course VARCHAR(255), " +
                            "Age INTEGER, " +
                            "Gender VARCHAR(255), " +
                            "PRIMARY KEY (PRN))";

                            
                statement.executeUpdate(sqlQuery);
            } 

            //Insert values
            sqlQuery = "INSERT into studentAgeInfo values (?, ?, ?, ?, ?)";
            PreparedStatement prepStmt = conn_obj.prepareStatement(sqlQuery);

            conn_obj.setAutoCommit(false);

            for(int i = 0 ; i < prnArray.length ; i ++){
                prepStmt.setInt(1, prnArray[i]);
                prepStmt.setString(2, nameArray[i]);
                prepStmt.setString(3, courseArray[i]);
                prepStmt.setInt(4, ageArray[i]);
                prepStmt.setString(5, genderArray[i]);

                prepStmt.addBatch();
            }
            prepStmt.executeBatch();

            sqlQuery = "SELECT * FROM studentAgeInfo WHERE Age > 15 AND Gender = 'male'";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            System.out.println("\n PRN \tName \tCourse \tAge \tGender");
            while(resultSet.next()){
                System.out.println(" "+resultSet.getInt("PRN") + 
                "\t" + resultSet.getString("Name") + 
                "\t" + resultSet.getString("Course") +
                "\t" + resultSet.getInt("Age") +
                "\t" + resultSet.getString("Gender")
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
