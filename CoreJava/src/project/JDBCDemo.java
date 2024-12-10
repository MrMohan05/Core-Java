package project;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "c##mohan";
        String password = "123";

       
        Connection connection = null;

        
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully!");
            Statement statement = connection.createStatement();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name : ");
            String name=sc.nextLine();
            System.out.println("Enter ID : ");
            int id=sc.nextInt();
            String query = "INSERT INTO DEMO (id,name) VALUES(?,?)"; 
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,name);
            
            pst.executeUpdate();
            pst.close();
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
            sc.close();
		
		
	}
}
