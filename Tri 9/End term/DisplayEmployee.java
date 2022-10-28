//Create Employee(eno, ename, department, designation, salary) table with employee details of various departments. Write a JDBC program to display the details of employees whose department is “Computer Science”.
import java.io.*;
import java.sql.*;

public class DisplayEmployee {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/emp";
    
    static final String USER = "root";
    static final String PASS = "t211xxamk2";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Limit: ");
        int limit = Integer.parseInt(br.readLine());
        int eno[] = new int[limit];
        String ename[] = new String[limit];
        String department[] = new String[limit];
        String designation[] = new String[limit];
        int sal[] = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter Employee number: ");
            eno[i] = Integer.parseInt(br.readLine());
            System.out.print("Enter Employee Name: ");
            ename[i] = br.readLine();
            System.out.print("Enter Employee Department: ");
            department[i] = br.readLine();
            System.out.print("Enter Employee Designation: ");
            designation[i] = br.readLine();
            System.out.print("Enter Salary: ");
            sal[i] = Integer.parseInt(br.readLine());
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "INSERT INTO info VALUES (?, ?, ?, ?, ?); ";
            PreparedStatement pstm = con.prepareStatement(query);
            for (int i = 0; i < limit; i++) 
            {
                pstm.setInt(1, eno[i]);
                pstm.setString(2, ename[i]);
                pstm.setString(3, department[i]);
                pstm.setString(4, designation[i]);
                pstm.setInt(5, sal[i]);
                pstm.addBatch();
            }
            pstm.executeBatch();
            System.out.println("Record Inserted");
            query = "SELECT * FROM info WHERE department='COMPUTER SCIENCE'";
            ResultSet rs = pstm.executeQuery(query);
            while (rs.next()) 
            {
                System.out.println("Employee Number:\n" + rs.getInt("eno"));
                System.out.println("Employee Name:\n" + rs.getString("ename"));
                System.out.println("Employee Department:\n" + rs.getString("department"));
                System.out.println("Employee Designation:\n" + rs.getString("designation"));
                System.out.println("Salary:\n" + rs.getInt("sal"));
                System.out.println();
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}