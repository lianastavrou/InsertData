package InsertData;

import java.sql.*;

public class Data {

	public static void main(String[] args) {
	
		
		try   {
			
			
			Connection myConn = DriverManager.getConnection 
					("jdbc:mysql://localhost:3306/company", "root", "6973998543bobi");
			
			Statement myStmt = myConn.createStatement ();
			
			String sql="insert into employees"
					+"(id,first_name,last_name,birth_date,afm)"
					+"values (9,'Kostas','Alexiou','1985-08-12','122338676')";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("Insert complete");
			
			
		    }
		
        catch (Exception exc)	{
			
			exc.printStackTrace();
			
		   }

	}

}
