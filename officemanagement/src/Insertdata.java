import java.sql.*;
public class Insertdata {
	public void insert() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/officemanagement";
			String username ="root";
			String password ="2823";
			String Querry = "insert into members values(?,?,?,?,?)";
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst= con.prepareStatement(Querry);
			pst.setInt(1,3);
			pst.setString(2, "sangi");
			pst.setString(3,"devops");
			pst.setString(4,"sangi@gmail.com");
			pst.setInt(5,9000);
			pst.executeUpdate();
			con.close();
			
			
	}
		
	
	public static void main (String[]args)throws Exception {
		Insertdata obj= new Insertdata();
		obj.insert();

	}
}
