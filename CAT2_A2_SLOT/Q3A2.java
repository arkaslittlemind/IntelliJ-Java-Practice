import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.event.*;


class Q3A2  extends JFrame implements ActionListener {
	
	JTextField username; JPasswordField password; JButton login;    

	JList<String> options; 

	double balance = 125000;

	void withdraw(double amount) { balance -= amount;}

	void deposit(double amount) { balance += amount;}

	void display() { System.out.println(balance);}


	Q3A2() {
		super("ATM program");
			
		setSize(640, 480); setLocation (100, 100); 
		setVisible(true); setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		username = new JTextField(20);
		password = new JPasswordField(20);
		
		add(username); add(password);

		login = new JButton("Login");
		add(login);
		login.addActionListener(this);
		pack();		
	}

	static void addUser(String uname, String password, Connection conn) throws Exception {
		PreparedStatement pstmt = conn.prepareStatement("insert into userinfo values(?, ?)");
		pstmt.setString(1, uname); pstmt.setString(2, password);
		pstmt.executeUpdate();
		conn.commit();
	}		

 
    	public static void main(String[] args) throws Exception {
		new Q3A2();
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		Connection conn = DriverManager.getConnection(
      			"jdbc:oracle:thin:@localhost:1521:XE", "system", "JavaOracle");
	
		Statement stmt = conn.createStatement();

//	      	stmt.executeUpdate("create table userinfo(username varchar(20), password varchar(20), primary key(username, password)  )" );

//		addUser("John_Smith", "Asdfdkifjg@1", conn);
//		addUser("James Borg", "Bsidjndos$2", conn);

	}
	public void actionPerformed(ActionEvent ae) {
		String uname; char[] pwd;
		uname = username.getText(); pwd = password.getPassword();
		if(validateUser(uname, pwd)) createMenu(); 
		
	}
	boolean validateUser(String uname, char[] pwd) {
		boolean flag = false;
		for(int i=0; i<pwd.length; i++) 
			if(Character.isUpperCase(pwd[i])) { flag = true; break;}

		for(int i=0; i<pwd.length; i++) 
			if(Character.isDigit(pwd[i])) { flag = true; break;}

		for (int i = 0; i < pwd.length; i++) 
			if ( !Character.isDigit((pwd[i]))
                			&& !Character.isLetter(pwd[i])
                				&& !Character.isWhitespace(pwd[i]) )
			{ flag = true ; break;}
		
		if(pwd.length >= 8) flag = true; else flag = false;

		return flag;
	}

	void createMenu( ) {
		String choice[] = {"Withdraw money", "Deposit money", "View balance"};
		options = new JList<String>(choice); options.setVisibleRowCount(3);
		JFrame frame = new JFrame("Account Manipulation");
		frame.add(options); frame.setSize(600, 480); frame.setVisible(true);
		
		options.addListSelectionListener(
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {

				if(options.getSelectedIndex() == 0) {
				  double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be withdrawn"));
					withdraw(b); }
				else if(options.getSelectedIndex() == 1) {
				  double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be deposited"));
					deposit(b); }

				else if(options.getSelectedIndex() == 2) 
					displayMessage();					 
			}
		});

	}
	void displayMessage() {
		JOptionPane.showMessageDialog(this, "your account balanace is "+balance);
	}			
}		 