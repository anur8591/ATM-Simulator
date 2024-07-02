package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupTwo extends JFrame implements ActionListener{
     
     JLabel l1,religion,category,income,educational,occupation,panNumber,aadharNumber,seniorCitizen,existingAccount,qualification,l12,l13;
     JButton b, back;
     JRadioButton r1,r2,r3,r4;
     JTextField t1,t2,t3;
     JComboBox c1,c2,c3,c4,c5;
     String formno;
     
     SignupTwo(){
         
//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel l14 = new JLabel(i3);
//         l14.setBounds(150, 0, 100, 100);
//         add(l14);
//         
       
         this.formno = formno;
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
         l1 = new JLabel("Page 2: Additonal Details");
         l1.setFont(new Font("Raleway", Font.BOLD, 22));
         l1.setBounds(280,30,600,40);
         add(l1);
         
         
         religion = new JLabel("Religion:");
         religion.setFont(new Font("Raleway", Font.BOLD, 18));
         religion.setBounds(100,120,100,30);
         add(religion);
         
         category = new JLabel("Category:");
         category.setFont(new Font("Raleway", Font.BOLD, 18));
         category.setBounds(100,170,100,30);
         add(category);
         
         income = new JLabel("Income:");
         income.setFont(new Font("Raleway", Font.BOLD, 18));
         income.setBounds(100,220,100,30);
         add(income);
         
         educational = new JLabel("Educational");
         educational.setFont(new Font("Raleway", Font.BOLD, 18));
         educational.setBounds(100,270,150,30);
         add(educational);
         
         
         occupation = new JLabel("Occupation:");
         occupation.setFont(new Font("Raleway", Font.BOLD, 18));
         occupation.setBounds(100,340,150,30);
         add(occupation);
         
         panNumber = new JLabel("PAN Number:");
         panNumber.setFont(new Font("Raleway", Font.BOLD, 18));
         panNumber.setBounds(100,390,150,30);
         add(panNumber);
         
         aadharNumber = new JLabel("Aadhar Number:");
         aadharNumber.setFont(new Font("Raleway", Font.BOLD, 18));
         aadharNumber.setBounds(100,440,180,30);
         add(aadharNumber);
         
         seniorCitizen = new JLabel("Senior Citizen:");
         seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 18));
         seniorCitizen.setBounds(100,490,150,30);
         add(seniorCitizen);
         
         existingAccount = new JLabel("Existing Account:");
         existingAccount.setFont(new Font("Raleway", Font.BOLD, 18));
         existingAccount.setBounds(100,540,180,30);
         add(existingAccount);
         
         qualification = new JLabel("Qualification:");
         qualification.setFont(new Font("Raleway", Font.BOLD, 18));
         qualification.setBounds(100,290,150,30);
         add(qualification);
         
         
         l12 = new JLabel("Form No:");
         l12.setBounds(700,10,60,30);
         l12.setFont(new Font("Raleway", Font.BOLD, 13));
         add(l12);        
         
         l13 = new JLabel(formno );
         l13.setBounds(760,10,60,30);
         l13.setFont(new Font("Raleway", Font.BOLD, 13));
         add(l13);
         
         b = new JButton("Next");
         b.setBounds(570,640,100,30);
         b.setFont(new Font("Raleway", Font.BOLD, 14));
         b.setBackground(Color.BLACK);
         b.setForeground(Color.WHITE);
         b.addActionListener(this);
         add(b);
         
         back = new JButton("Back");
         back.setBounds(150,640,100,30);
         back.setFont(new Font("Raleway", Font.BOLD, 14));
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
         
         t1 = new JTextField();
         t1.setFont(new Font("Raleway", Font.BOLD, 14));
         t1.setBounds(350,390,320,30);
         add(t1);
         
         
         
         t2 = new JTextField();
         t2.setFont(new Font("Raleway", Font.BOLD, 14));
         t2.setBounds(350,440,320,30);
         add(t2);
         
         r1 = new JRadioButton("Yes");
         r1.setFont(new Font("Raleway", Font.BOLD, 14));
         r1.setBackground(Color.WHITE);
         r1.setBounds(350,490,100,30);
         add(r1);
         
         
         r2 = new JRadioButton("No");
         r2.setFont(new Font("Raleway", Font.BOLD, 14));
         r2.setBackground(Color.WHITE);
         r2.setBounds(460,490,100,30);
         add(r2);
         
         
         r3 = new JRadioButton("Yes");
         r3.setFont(new Font("Raleway", Font.BOLD, 14));
         r3.setBackground(Color.WHITE);
         r3.setBounds(350,540,100,30);
         add(r3);
         
         
         r4 = new JRadioButton("No");
         r4.setFont(new Font("Raleway", Font.BOLD, 14));
         r4.setBackground(Color.WHITE);
         r4.setBounds(460,540,100,30);
         add(r4);
         
         
         String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
         c1 = new JComboBox(religion);
         c1.setBackground(Color.WHITE);
         c1.setFont(new Font("Raleway", Font.BOLD, 14));
         c1.setBounds(350,120,320,30);
         add(c1);
         
         
         String category[] = {"General","OBC","SC","ST","Other"};
         c2 = new JComboBox(category);
         c2.setBackground(Color.WHITE);
         c2.setFont(new Font("Raleway", Font.BOLD, 14));
         c2.setBounds(350,170,320,30);
         add(c2);
         
         
         
         String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
         c3 = new JComboBox(income);
         c3.setBackground(Color.WHITE);
         c3.setFont(new Font("Raleway", Font.BOLD, 14));
         c3.setBounds(350,220,320,30);
         add(c3);
         
         
         
         String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
         c4 = new JComboBox(education);
         c4.setBackground(Color.WHITE);
         c4.setFont(new Font("Raleway", Font.BOLD, 14));
         c4.setBounds(350,270,320,30);
         add(c4);
         
         
         
         String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
         c5 = new JComboBox(occupation);
         c5.setBackground(Color.WHITE);
         c5.setFont(new Font("Raleway", Font.BOLD, 14));
         c5.setBounds(350,340,320,30);
         add(c5);
        
         
         setLayout(null);
                 
         getContentPane().setBackground(Color.PINK);
         
         setSize(800,765);
		 setLocation(300,5);
		 setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae){
    	 if (ae.getSource() == b) {
         String religion = (String)c1.getSelectedItem(); 
         String category = (String)c2.getSelectedItem();
         String income = (String)c3.getSelectedItem();
         String education = (String)c4.getSelectedItem();
         String occupation = (String)c5.getSelectedItem();
         
         String pan = t1.getText();
         String aadhar = t2.getText();
         
         String scitizen = "";
         if(r1.isSelected()){ 
             scitizen = "Yes";
         }
         else if(r2.isSelected()){ 
             scitizen = "No";
         }
            
         String eaccount = "";
         if(r3.isSelected()){ 
             eaccount = "Yes";
         }else if(r4.isSelected()){ 
             eaccount = "No";
 
            
         }
         
             
         
         try{
             if(t2.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Fill all the required fields");
             }else{
                 Connection c1 = new Connection();
                 String q1 = "insert into signupTwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                 c1.s.executeUpdate(q1);
                 
                 setVisible(false);
                 new SignupThree(formno).setVisible(true); 
             }
        
             
         }catch(Exception ex){
              ex.printStackTrace();
         } 
     
                
    }else if (ae.getSource() == back){
   	 setVisible(false);
   	 new Signup().setVisible(true);
    }
     
  }     
     
     
     
    public static void main(String[] args){
        new SignupTwo();
    }
} 
