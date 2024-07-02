//this is a 6th page of ATM Simulator project

package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton deposit,withdrawl,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
    static String pin;
    
    Transactions(String pin ){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(210,300,700,35);
        l2.add(l1);
        
        setLayout(null);        
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(170,410,150,35);
        deposit.addActionListener(this);
        l2.add(deposit);
        
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(355,410,150,35);
        withdrawl.addActionListener(this);
        l2.add(withdrawl);
        
        fastCash = new JButton("FAST CASH");
        fastCash.setBounds(170,452,150,35);
        fastCash.addActionListener(this);
        l2.add(fastCash);
        
        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setBounds(355,452,150,35);
        miniStatement.addActionListener(this);
        l2.add(miniStatement);
        
        pinChange = new JButton("PIN CHANGE");
        pinChange.setBounds(170,495,150,35);
        pinChange.addActionListener(this);
        l2.add(pinChange);
        
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setBounds(355,495,150,35);
        balanceEnquiry.addActionListener(this);
        l2.add(balanceEnquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(355,540,150,35);
        exit.addActionListener(this);        
        l2.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
    	if (ae.getSource() == exit) {
    		System.exit(0);
    	}else if (ae.getSource() == deposit) {
    		setVisible(false);
    		new Deposit(pin).setVisible(true);
    	}else if (ae.getSource() == withdrawl) {
    		setVisible(false);
    		new Withdrawl(pin).setVisible(true);
    	}else if (ae.getSource() == fastCash) {
    		setVisible(false);
    		new FastCash(pin).setVisible(true);
    	}
    }
    	
    
    public static void main(String[] args){
        new Transactions(pin).setVisible(true);
    }
}
