package Java.JavaProjects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
class Book {
    String title;
    String author;
    boolean issued;
    int issueDays;
    Book() {
        this.title = "";
        this.author = "";
        this.issued = false;
        this.issueDays = 0;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
        this.issueDays = 0;
    }

    public String toString() {
        return title + " by " + author +
                (issued ? " [Issued]" : " [Available]");
    }
}
public class libraryManagementWithMysql {
    // 
    public static void main(String[] args) {
        // add , remove, search, issue, return book
        // connect to mysql database
        
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/library"; // Replace with your database URL
            String username = "root"; // Replace with your database username
            String password = "password"; // Replace with your database password
            
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully.");
            
            // You can now perform database operations here
            while (true) {
                System.out.println("Library Management System");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Search Book");
                System.out.println("4. Issue Book");
                System.out.println("5. Return Book");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                Book book = new Book();
                switch (choice) {
                    case 1:
                        // Add book logic
                        //input book details and insert into database
                        System.out.print("Enter book title: ");
                        book.title = scanner.next();
                        System.out.print("Enter book author: ");
                        book.author = scanner.next();
                        
                        break;
                    case 2:
                        // Remove book logic
                        break;
                    case 3:
                        // Search book logic
                        break;
                    case 4:
                        // Issue book logic
                        break;
                    case 5:
                        // Return book logic
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            // Close the connection when done
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
