import java.sql.*;

public class App {
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";
    static final String USER = "root";
    static final String PASS = "root";
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e) {
            System.out.println("Driver  Connection Failed");
       } 
       try{
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = con.createStatement();
        String createTable = "CREATE TABLE IF NOT EXISTS Student (" +
                    "Roll_No INT PRIMARY KEY, " +
                    "Name VARCHAR(50), " +
                    "Percentage DOUBLE)";

            stmt.executeUpdate(createTable);
            System.out.println("Student Table Created Successfully.");

            // Insert Record
            String insert = "INSERT INTO Student(Roll_No, Name, Percentage) VALUES (101,'Amit',85.5)";
            stmt.executeUpdate(insert);
            System.out.println("Record Inserted Successfully.");

            // Display Students with Percentage > 70
            String select = "SELECT Roll_No, Name FROM Student WHERE Percentage > 70";

            ResultSet rs = stmt.executeQuery(select);

            System.out.println("\nStudents having Percentage > 70");
            System.out.println("--------------------------------");
            while (rs.next()) {
                System.out.println("Roll No : " + rs.getInt("Roll_No"));
                System.out.println("Name    : " + rs.getString("Name"));
                System.out.println();
            }

            rs.close();
            stmt.close();
            con.close();
              } catch (Exception e) {
        System.out.println(" Connection Failed");
      } 
    }
}
