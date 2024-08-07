//this is a 7th page of ATM Simulator project

package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
	
	JTextField amount;
	JButton deposit, exit;
	static String pinnumber;
	
	Deposit(String pinnumber){
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg") );
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        deposit = new JButton ("DEPOSIT");
        deposit.addActionListener(this);
        deposit.setBounds(355, 485, 150, 30);
        image.add(deposit);
        
        exit = new JButton ("Exit");
        exit.addActionListener(this);
        exit.setBounds(355, 520, 150, 30);
        image.add(exit);
        
        
		
		setSize(900, 900);
		setLocation(300, 0);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == deposit) {
			String number = amount.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
			}else {
				try {
				Connection connection = new Connection();
				String query = "insert into bank values('"+pinnumber+"','"+date+"', 'Deposit', '"+number+"')";
				connection.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs"+number+"Deposited successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}else if (ae.getSource() == exit) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}

	public static void main (String[]args) {
		new Deposit(pinnumber);
	}
	
	
}
