import java.sql.*;
import java.util.*;

class Q4 {
    public static void main(String[] args) throws Exception {

	Class.forName("oracle.jdbc.driver.OracleDriver");  

	Connection conn = DriverManager.getConnection(
     		 "jdbc:oracle:thin:@localhost:1521:XE", "system", "JavaOracle");

		System.out.println(conn);

		Statement stmt = conn.createStatement();

	//stmt.executeUpdate("create table car(carid integer primary key, model varchar(20), status varchar(20) )" );

//		addCar("BMW", conn); addCar(" Maruti Suzuki", conn);
//		addCar("Hyundai Elite", conn); addCar("Slavia", conn);

//		removeCar(1234, conn);

//		getAllCars(conn);

//		bookCar(5566, conn);

	//	getAllCars(conn);

		removeCar(5566, conn);
            	
	}
	static void addCar(String model, Connection conn) throws Exception {
		PreparedStatement pstmt = 
                                                    conn.prepareStatement("insert into car values(?, ?, ?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car id as integer");
		int m = Integer.parseInt(sc.nextLine());
		pstmt.setInt(1, m);
		pstmt.setString(2, model);
		pstmt.setString(3, "Available");
		pstmt.executeUpdate();
		conn.commit();	
	}
	static void getAllCars(Connection conn) throws Exception {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from car");
		while(rs.next() ) 
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+ rs.getString(3));
	
	}
	static void bookCar(int carid, Connection conn) throws Exception {
		PreparedStatement pstmt = 
			conn.prepareStatement("select status from car where carid = ?");
		pstmt.setInt(1, carid);
		ResultSet rs = pstmt.executeQuery( );
		while(rs.next() ) {
		if(rs.getString(1).equals("Booked")) {
			System.out.println("Car is not available"); return; }
		}
		pstmt = conn.prepareStatement("update car set status = ? where carid = ?");
		pstmt.setString(1, "Booked");
		pstmt.setInt(2, carid);
		pstmt.executeUpdate();
		conn.commit();
	} 
	static void removeCar(int carid, Connection conn) throws Exception {		
		PreparedStatement pstmt = 
			conn.prepareStatement("delete from car where carid = ?");
		pstmt.setInt(1, carid);
		pstmt.executeUpdate();
		conn.commit();
	} 				
}