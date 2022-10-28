import java.sql.*;

public class JdbcSelect{

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/college";
    
    static final String USER = "root";
    static final String PASS = "t211xxamk2";

    public static void main(String[] args){
        Connection conn_obj = null;
        Statement stmt = null;

        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database .... ");
            conn_obj = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating Statement .... ");
            stmt = conn_obj.createStatement();
            String sql_query = "select * from Student";
            Statement stmt1 = conn_obj.createStatement();
            ResultSet rs = stmt1.executeQuery(sql_query);

            System.out.println("\n PRN \tName \t\tCourse \tYear \tDivision");
            while(rs.next()){
                System.out.println(" "+rs.getInt("PRN") + 
                "\t" + rs.getString("Name") + 
                "\t" + rs.getString("Course") +
                "\t" + rs.getString("Year") +
                "\t" + rs.getString("Division")
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
