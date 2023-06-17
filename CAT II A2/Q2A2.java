import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Q2A2  extends JFrame implements ActionListener {

	JLabel label; JTextField phone;  JButton call;     JButton end;
		JButton clear;

	Q2A2() {
		super("ATM program");
			
		setSize(640, 480); setLocation (100, 100); 
		setVisible(true); setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		phone = new JTextField(20);
		label = new JLabel("Phone number:  ");
		call = new JButton("CALL");
		clear = new JButton("CLEAR");
		end = new JButton("END");
		add(label); add(phone); add(call);  add(clear); add(end);
		call.addActionListener(this);
		end.addActionListener(this);
		clear.addActionListener(this); pack();
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == call) { call.setText("Hang up");
			JOptionPane.showMessageDialog(this, "Call initiated"); }
		
		if (ae.getSource() == end) {JOptionPane.showMessageDialog(this, "Call ended"); call.setText("CALL"); }
		if (ae.getSource() == clear) phone.setText("");
	}
	public static void main(String ... args) {
		new Q2A2();
	}
}