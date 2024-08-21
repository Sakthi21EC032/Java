import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/Students";
        String USER = "root";
        String PASSWORD = "root";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Corrected query for inserting data into the Employee table
            String insertSQL = "INSERT INTO CompliantReg (Person_Id, Person_Name,Compliant_Name, Person_Email, Complianting_date) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setInt(1, 12); // Id
            insertStatement.setString(2, "sakthi"); 
            insertStatement.setString(3, "Ragging"); // 
            insertStatement.setString(4, "sakthi032@gmail.com"); // Email (Corrected, Email must be provided as per schema)
            insertStatement.setString(5, "2024-08-15"); // Joining_date in proper format 'YYYY-MM-DD'

            insertStatement.executeUpdate();
            System.out.println("Insert operation completed successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
