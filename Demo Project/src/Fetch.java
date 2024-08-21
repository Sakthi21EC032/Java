import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

 

public class Fetch {

    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/Students";

        String USER = "root";

        String PASSWORD = "root";

 

        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

 

            // Read Operation

            String selectSQL = "SELECT * FROM CompliantReg";

            Statement selectStatement = con.createStatement();

            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

 

            System.out.println("Read operation results:");

            while (resultSet.next()) {

                // Corrected column names to match your table schema

                System.out.println("Person Id: " + resultSet.getInt("Person_Id")

                    + ", Person Name: " + resultSet.getString("Person_Name")

                    + ", Compliant  Name: " + resultSet.getString("Compliant_Name")

                    + ", Person Email: " + resultSet.getString("Person_Email")

                    + ", Complainting Date: " + resultSet.getDate("Complianting_date"));

            }

        } catch (SQLException e) {

            System.out.println(e);

        }

    }

}

 