//this is a 11th page of ATM Simulator project

package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField t1,t2;
    JButton b1,b2;                               
    JLabel l1,l2,l3;
    String PinChange;
    PinChange(String PinChange){
        this.PinChange = PinChange;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 960, 1080);
        add(l4);
        
        l1 = new JLabel("CHANGE YOUR PinChange");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(280,330,800,35);
        l4.add(l1);
        
        l2 = new JLabel("New PinChange:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(180,390,150,35);
        l4.add(l2);
        
        l3 = new JLabel("Re-Enter New PinChange:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        l3.setBounds(180,440,200,35);
        l4.add(l3);
        
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        t1.setBounds(350,390,180,25);
        l4.add(t1);
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));
        t2.setBounds(350,440,180,25);
        l4.add(t2);
        
        b1 = new JButton("CHANGE");
        b1.setBounds(390,588,150,35);
        b1.addActionListener(this);
        l4.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(390,633,150,35);
        b2.addActionListener(this);
        l4.add(b2);
        
        setLayout(null);
        
        
        
        
        
        
        
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String nPinChange = t1.getText();
            String rPinChange = t2.getText();
            
            if(!nPinChange.equals(rPinChange)){
                JOptionPane.showMessageDialog(null, "Entered PinChange does not match");
                return;
            }
            
            if(ae.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PinChange");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PinChange");
                }
                
                Connection c1 = new Connection();
                String q1 = "update bank set PinChange = '"+rPinChange+"' where PinChange = '"+PinChange+"' ";
                String q2 = "update login set PinChange = '"+rPinChange+"' where PinChange = '"+PinChange+"' ";
                String q3 = "update signupThree set PinChange = '"+rPinChange+"' where PinChange = '"+PinChange+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PinChange changed successfully");
                setVisible(false);
                new Transactions(rPinChange).setVisible(true);
            
            }else if(ae.getSource()==b2){
                new Transactions(PinChange).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new PinChange("").setVisible(true);
    }
}
