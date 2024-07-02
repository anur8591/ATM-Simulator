//this is a 9th page of ATM Simulator project

package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{

    JLabel l1;
    JButton deposit,cashWithdrawl,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
    static String pin;
    FastCash(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        l1 = new JLabel("Select balanceEnquiry pinChange");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(210,300,700,35);
        l2.add(l1);
        
        setLayout(null);        
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(170,410,150,35);
        deposit.addActionListener(this);
        l2.add(deposit);
        
        cashWithdrawl = new JButton("Rs 200");
        cashWithdrawl.setBounds(355,410,150,35);
        cashWithdrawl.addActionListener(this);
        l2.add(cashWithdrawl);
        
        fastCash = new JButton("Rs 500");
        fastCash.setBounds(170,452,150,35);
        fastCash.addActionListener(this);
        l2.add(fastCash);
        
        miniStatement = new JButton("Rs 1000");
        miniStatement.setBounds(355,452,150,35);
        miniStatement.addActionListener(this);
        l2.add(miniStatement);
        
        pinChange = new JButton("Rs 5000");
        pinChange.setBounds(170,495,150,35);
        pinChange.addActionListener(this);
        l2.add(pinChange);
        
        balanceEnquiry = new JButton("Rs 10000");
        balanceEnquiry.setBounds(355,495,150,35);
        balanceEnquiry.addActionListener(this);
        l2.add(balanceEnquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(355,540,150,35);
        exit.addActionListener(this);        
        l2.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
    	if (ae.getSource() == exit) {
    		setVisible(false);
    		new Transactions(pin).setVisible(true);
    		
    	}else {
    		String amount = ((JButton)ae.getSource()).getText().substring(3);
    		Connection c = new Connection();
    		try {
    			ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
    			int balance = 0;
    			while(rs.next()) {
    				if (rs.getString("type").equals("Deposit")) {
    					balance += Integer.parseInt(rs.getString("amount"));
    				}else {
    					balance = Integer.parseInt(rs.getString("amount"));
    				}
    			}
    			
    			if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
    				JOptionPane.showMessageDialog(null," Insufficient Balance");
    				return;
    			}
    			
    			Date date = new Date();
    			String query = "insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')";
    			c.s.execute(query);
    			JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Sucessfully");
    			
    			setVisible(false);
    			new Transactions(pin).setVisible(true);
    			
    		}catch(Exception e) {
    			System.out.print(e);
    		}
    		
    	}
    	
    }
    
    public static void main(String[] args){
        new FastCash(pin).setVisible(true);
    }
}
