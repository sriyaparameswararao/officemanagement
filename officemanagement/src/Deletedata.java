import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedata {
	public void insert() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/officemanagement";
			String username ="root";
			String password ="2823";
			String Querry = "delete from members where membersid = 3 ";
					 
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst= con.prepareStatement(Querry);
			pst.executeUpdate();
			con.close();
			
			
	}
		
	
	public static void main (String[]args)throws Exception {
		Deletedata obj= new Deletedata();
		obj.insert();

	}
}
