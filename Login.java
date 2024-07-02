//	This is the first page of ATM simulator project
//	this is a desktop base application code 
//	not for any operating system;

package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	JButton login, sign, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	static String pin;
	
	Login()
	{
		
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon ii = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image ij = ii.getImage() .getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon ik = new ImageIcon(ij);
		JLabel label = new JLabel(ik);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setBounds(200, 40, 400, 40);
		text.setFont(new Font("Osward", Font.BOLD,38));
		add (text);
		
		JLabel card_no = new JLabel("Card number:");
		card_no.setBounds(120, 150, 500, 30);
		card_no.setFont(new Font("Osward", Font.BOLD,38));
		add (card_no);
		
		cardTextField= new JTextField();
		cardTextField.setBounds(380, 150, 250, 35);
		cardTextField.setFont(new Font("Arial",Font.BOLD,15)); 
		add(cardTextField);  
		
		JLabel pin = new JLabel("Pin:");
		pin.setBounds(120, 220, 400, 40);
		pin.setFont(new Font("Osward", Font.BOLD,38));
		add (pin);
		
		pinTextField= new JPasswordField();
		pinTextField.setBounds(380, 220, 250, 35);
		pinTextField.setFont(new Font("Arial",Font.BOLD,15));
		add(pinTextField); 
		

		login= new JButton("SIGN IN");
		login.setBounds(280, 280, 100, 30);
		login.setBackground(Color.yellow);
		login.setForeground(Color.black);
		login.addActionListener(this);
		add(login);
		
		clear= new JButton("CLEAR");
		clear.setBounds(450, 280, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.yellow);
		clear.addActionListener(this);
		add(clear); 
		
		sign= new JButton("SIGN UP");
		sign.setBounds(340, 330, 170, 30);
		sign.setBackground(Color.blue);
		sign.setForeground(Color.yellow);
		sign.addActionListener(this);
		add(sign);
		
		getContentPane().setBackground(Color.gray);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == clear){
			cardTextField.setText("");
			pinTextField.setText("");
		}else if (ae.getSource() == login) {
			Connection connection = new Connection ();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
		
			try {
				
				ResultSet rs = connection.s.executeQuery(query);
				if (rs.next()) {
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect card Number or pin");
				}
				
				
			} catch (Exception e) {
				
				System.out.println(e);
				
			}
		
		
		}else if (ae.getSource() == sign) {
			setVisible(false);
			new Signup().setVisible(true);
			}
	
	
	}

	public static void main(String[]args)
	{
		new Login();
	}

}

