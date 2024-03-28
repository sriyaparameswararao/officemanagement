import java.sql.*;
public class Getdata {
	public void insert() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/officemanagement";
			String username ="root";
			String password ="2823";
			String Querry = "select * from members";
			Connection con = DriverManager.getConnection(url,username,password);
			Statement smt = con.createStatement();
			ResultSet rs=smt.executeQuery(Querry);
			while(rs.next()) {
				System.out.println("membersid :"+rs.getInt(1));
				System.out.println("membersname :"+rs.getString(2));
				System.out.println("membersdivision :"+rs.getString(3));
				System.out.println("membersmail :"+rs.getString(4));
				System.out.println("memberssalary:"+rs.getInt(5));
				
			}
			con.close();
			
			
	}
		
	
	public static void main (String[]args)throws Exception {
		Getdata obj= new Getdata();
		obj.insert();

	}
}
