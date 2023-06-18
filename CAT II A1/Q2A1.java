import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Q2A1 extends JFrame implements ActionListener, ItemListener  {
	double fuelCapacity;
	double fuel;
	double fuelEfficiency;
	JLabel label; JTextField tf; JButton bt; JLabel labeld; JTextField tfd; JButton bts;
	JLabel labelfl; JLabel labelst; JCheckBox cb; 
	Q2A1 (double fuelCapacity, double fuel, double fuelEfficiency ) {
		super("This Car frame");
		setLocation(100, 100);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 3, 40, 40));
		label = new JLabel("Enter amount of fuel");
		tf = new JTextField(20);
		bt = new JButton("Add Fuel"); 
		labeld = new JLabel("Enter the distance to be driven");
		tfd = new JTextField(20);
		bts = new JButton("Start Trip");  labelfl = new JLabel("Fuel Level");
		labelst = new JLabel("Status Label ");
		cb = new JCheckBox("VIP yes/no");
		add(label); add(tf); add(bt); add(labeld); add(tfd); add(bts); add(labelfl);
		add(labelst); add(cb);
		pack();
		bt.addActionListener(this);
		bts.addActionListener(this); cb.addItemListener(this); 
		this.fuelCapacity = fuelCapacity;
		this.fuel = fuel;
		this.fuelEfficiency = fuelEfficiency;
	}
	synchronized void addFuelLevel(double amount) {
		 fuel += amount;
	}

	synchronized void drive (double distance) {		
		if(fuel - distance*fuelEfficiency >= 0) { 
			fuel -= distance*fuelEfficiency;	
	
		}		
	}
	synchronized double getFuelLevel ( ) {
		return fuel;	
	}

	public static void main(String... args) {
		Q2A1 car = new Q2A1(0, 0, 0.75);		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == bt) {
			fuel += Double.parseDouble(tf.getText());
			labelfl.setText(""+fuel); 
		}
		else if(ae.getSource() == bts) {
			double distance = Double.parseDouble(tfd.getText());
			if(fuel*fuelEfficiency > distance)	{
				labelst.setText("Driving"); 
				fuel = fuel - fuel*fuelEfficiency;
				labelfl.setText(""+fuel); 
						
			}
			else labelst.setText("Waiting for fuel");
		}
	}
	public void itemStateChanged(ItemEvent ie) {
		if(cb.isSelected()) JOptionPane.showMessageDialog(this, "VIP driving");
	} 
}

 	