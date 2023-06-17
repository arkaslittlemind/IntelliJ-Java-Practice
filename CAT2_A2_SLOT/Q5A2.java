import java.sql.*;
import java.util.*;

class Q5A2 {
	static Scanner sc = new Scanner(System.in); static int countUpdate;

    	public static void main(String[] args) throws Exception {

	Class.forName("oracle.jdbc.driver.OracleDriver");  

	Connection conn = DriverManager.getConnection(
      					"jdbc:oracle:thin:@localhost:1521:XE", "system", "JavaOracle");

		System.out.println(conn);
	
		Statement stmt = conn.createStatement();

//	      	stmt.executeUpdate("create table book__(isbn integer primary key, title varchar(20), publisher varchar(20) )" );

//	      	stmt.executeUpdate("create table author_(aid integer primary key, name varchar(20), email varchar(20) )" );
//		stmt.executeUpdate("create table AuthorISBN(isbn references book__, aid references author_, primary key(isbn, aid))");

	/*	addAuthor(1234, "Gsjsj Kjs", "sff@qmail.com", conn); 
		addTitle(8976, "Haos", "sowidj" , conn); 

		addAuthor(2345, "Nssm Kaksk", "nss@smail.com", conn); 
		addTitle(9876, "Nakwk s", "Mkakm" , conn); 

		addAuthor(3459, "Bansn Kaksk", "ban@zmail.com", conn); 
		addTitle(7876, "Miis slos", "Kaksks akak" , conn); 
*/
		System.out.println("Number of updates "+countUpdate);

		display(conn);

	}
	static void addAuthor(int aid, String name, String email, Connection conn) throws Exception {

		PreparedStatement pstmt = 
			conn.prepareStatement("insert into author_  values(?, ?, ?)");

		pstmt.setInt(1, aid);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		countUpdate += pstmt.executeUpdate();
		conn.commit();	
	}
	static void editAuthor(int aid, Connection conn) throws Exception {
		PreparedStatement pstmt = conn.prepareStatement("update author_ set email = ? where aid = ?");
		pstmt.setInt(2, aid); 
		System.out.println("Enter author's email address");
		String email = sc.nextLine();
		pstmt.setString(1, email);
		countUpdate += pstmt.executeUpdate();		
		conn.commit(); 
	}
	static void addTitle(int isbn, String title, String  publisher, Connection conn) throws Exception {
		PreparedStatement pstmt = conn.prepareStatement("insert into book__ values (?, ?, ?)");
		pstmt.setInt(1, isbn);
		pstmt.setString(2, title);
		pstmt.setString(3, publisher);
		countUpdate += pstmt.executeUpdate();
		pstmt = conn.prepareStatement("insert into authorISBN values (?, ?)");
		pstmt.setInt(1, isbn);
		System.out.println("Enter an existing author id");
		String aid = sc.nextLine();
		pstmt.setString(2, aid);
		countUpdate += pstmt.executeUpdate();
		conn.commit();
	} 
	static void display(Connection conn) throws Exception {		
		Statement stmt = conn.createStatement( );
		ResultSet rs = stmt.executeQuery("select * from author_");
		System.out.println("Author\'s information");
		while(rs.next() ) 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));

		stmt = conn.createStatement( );
		rs = stmt.executeQuery("select * from book__");
		System.out.println("Book\'s information");
		while(rs.next() ) 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	
		System.out.println("Author ISBN information");
		rs = stmt.executeQuery("select * from authorisbn");

		while(rs.next() ) 
			System.out.println(rs.getInt(1)+"  "+rs.getInt(2));

	} 				
}