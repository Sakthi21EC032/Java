import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

 

public class Prg1 {

    public static void main(String[] sgd){

        String URL="jdbc:mysql://localhost:3306/  Students";

        String USER="root";

        String PASSWORD="root";

        try{

            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);

            System.out.println("Success");

            Statement selectStatement=con.createStatement();

            //create table

            String createTableSQL="CREATE  TABLE CompliantReg("

+"Person_Id INT AUTO_INCREMENT PRIMARY KEY,"

+"Person_Name VARCHAR(20) NOT NULL,"

+"Compliant_Name VARCHAR(18)NOT NULL,"

+"Person_Email VARCHAR(35)NOT NULL,"

+"Complianting_date DATE NOT NULL"+")";

selectStatement.executeUpdate(createTableSQL);

System.out.println("Table created successfully");

 

        }

        catch(SQLException e){

            System.out.println(e);

        }

    }

}

 