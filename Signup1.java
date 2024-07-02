//this is a 2nd page of ATM Simulator project

package bank_management_system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class Signup extends JFrame implements ActionListener
	{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		long random;
		JTextField nameTextField, fathernameTextField, emailTextField, dateOfBirthTextField, genderTextField, maritalStatusTextField, addressTextField, stateTextField, cityTextField, pinTextField;
		JButton next, back;
		JRadioButton male, female, other, married, unmarried;
		JDateChooser dateChooser;
		
		Signup()
		{
			setLayout(null);
				
				
			Random ran = new Random();	
			random = (Math.abs(ran.nextLong() % 9000L) + 1000L);	
				
			JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
			formno.setFont(new Font("Raleway",Font.BOLD,38));	
			formno.setBounds(140, 20, 600, 40);
			add(formno);
			
			JLabel personalDetails = new JLabel("Page no 1: PERSONAL DETAILS");
			personalDetails.setFont(new Font("Raleway",Font.BOLD,25));	
			personalDetails.setBounds(210, 45, 870, 70);
			add(personalDetails);
			
			JLabel name = new JLabel("Name:");
			name.setFont(new Font("Raleway",Font.BOLD,25));	
			name.setBounds(50, 150, 200, 50);
			add(name);
			
			nameTextField = new JTextField();
			nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			nameTextField.setBounds(250, 160, 300, 28);
			add(nameTextField);
			
			JLabel fatherName = new JLabel("Father Name:");
			fatherName.setFont(new Font("Raleway",Font.BOLD,23));	
			fatherName.setBounds(50, 200, 200, 50);
			add(fatherName);
			
			fathernameTextField = new JTextField();
			fathernameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			fathernameTextField.setBounds(250, 210, 300, 28);
			add(fathernameTextField);
			
			JLabel dateOfBirth = new JLabel("Date Of Birth:");
			dateOfBirth.setFont(new Font("Raleway",Font.BOLD,25));	
			dateOfBirth.setBounds(50, 250, 200, 50);
			add(dateOfBirth);
			
			dateChooser = new JDateChooser();
			dateChooser.setFont(new Font("Raleway",Font.BOLD, 20));
	 		dateChooser.setBounds(250, 260, 300, 28);
			add(dateChooser);
			
			JLabel gender = new JLabel("Gender:");
			gender.setFont(new Font("Raleway",Font.BOLD,25));	
			gender.setBounds(50, 300, 200, 50);
			add(gender);
			
			male = new JRadioButton("Male");
			male.setBounds(350, 310,70, 35);
			male.setBackground(Color.WHITE);
			add(male);
			
			female = new JRadioButton("Female");
			female.setBounds(250, 310,70, 35);
			female.setBackground(Color.WHITE);
			add(female);
			
			other = new JRadioButton("Other");
			other.setBounds(450, 310, 70, 35);
			other.setBackground(Color.WHITE);
			add(other);
			
			ButtonGroup gendergroup = new ButtonGroup();
			gendergroup.add(male);
			gendergroup.add(female);
			gendergroup.add(other);
			
			JLabel eMail = new JLabel("Email:");
			eMail.setFont(new Font("Raleway",Font.BOLD,22));	
			eMail.setBounds(50, 350, 200, 50);
			add(eMail);
			
			emailTextField = new JTextField();
			emailTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			emailTextField.setBounds(250, 360, 300, 28);
			add(emailTextField);
			
			JLabel maritalStatus = new JLabel("Marital Status:");
			maritalStatus.setFont(new Font("Raleway",Font.BOLD,22));	
			maritalStatus.setBounds(50, 400, 200, 50);
			add(maritalStatus);
			
			married = new JRadioButton("Married");
			married.setBounds(250, 410,100, 35);
			married.setBackground(Color.WHITE);
			add(married);
			
			unmarried = new JRadioButton("Unmarried");
			unmarried.setBounds(380, 410,100, 35);
			unmarried.setBackground(Color.WHITE);
			add(unmarried);
			
			other = new JRadioButton("Other");
			other.setBounds(510, 410, 100, 35);
			other.setBackground(Color.WHITE);
			add(other);
			
			ButtonGroup marriedStatus = new ButtonGroup();
			marriedStatus.add(married);
			marriedStatus.add(unmarried);
			marriedStatus.add(other);
			
			JLabel aDD = new JLabel("Address:");
			aDD.setFont(new Font("Raleway",Font.BOLD,22));	
			aDD.setBounds(50, 450, 200, 50);
			add(aDD);
			
			addressTextField = new JTextField();
			addressTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			addressTextField.setBounds(250, 460, 300, 28);
			add(addressTextField);
			
			JLabel state = new JLabel("State:");
			state.setFont(new Font("Raleway",Font.BOLD,22));	
			state.setBounds(50, 500, 200, 50);
			add(state);
			
			stateTextField = new JTextField();
			stateTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			stateTextField.setBounds(250, 510, 300, 28);
			add(stateTextField);
			
			JLabel city = new JLabel("City:");
			city.setFont(new Font("Raleway",Font.BOLD,22));	
			city.setBounds(50, 550, 200, 50);
			add(city);
			
			cityTextField = new JTextField();
			cityTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			cityTextField.setBounds(250, 560, 300, 28);
			add(cityTextField);
			
			JLabel pinCode = new JLabel("Pin Code:");
			pinCode.setFont(new Font("Raleway",Font.BOLD,22));	
			pinCode.setBounds(50, 600, 200, 50);
			add(pinCode);
			
			pinTextField = new JTextField();
			pinTextField.setFont(new Font("Raleway",Font.BOLD, 14));
			pinTextField.setBounds(250, 610, 300, 28);
			add(pinTextField);
			
			
			next = new JButton("Next");
			next.setBackground(Color.BLACK);
			next.setForeground(Color.WHITE);
			next.setFont(new Font("Raleway",Font.BOLD,14));
			next.setBounds(450, 650, 80, 30);
			next.addActionListener(this);
			add(next);
			
			back = new JButton("Back");
			back.setBackground(Color.BLACK);
			back.setForeground(Color.WHITE);
			back.setFont(new Font("Raleway",Font.BOLD,14));
			back.setBounds(300, 650, 80, 30);
			back.addActionListener(this);
			add(back);
				
			getContentPane().setBackground(Color.PINK);
			
				
				
			setSize(800,765);
			setLocation(300,5);
			setVisible(true);
			
		}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == next) {
					
				
				
				String formno = "" + random;
				String name = nameTextField.getText();
				String fathername = fathernameTextField.getText();
				String dateOfBirth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
				String gender = null;
				if (male.isSelected()) {
					gender = "male";
				}else if (female.isSelected()) {
					gender = "Female";
				}
				
				String email = emailTextField.getText();
				String marital = null;
				if (married.isSelected()) {
					marital = "single";
				}else if (unmarried.isSelected()) {
					marital = "unmarried";
				}else if (other.isSelected()) {
					marital = "other";
				}
				
				String address = addressTextField.getText();
				String city = cityTextField.getText();
				String state = stateTextField.getText();
				String pincode = pinTextField.getText();
				
				
				try {
					if (name.equals("")) {
						JOptionPane.showMessageDialog(null, "Name is Required");
						
					}else if (fathername.equals("")){
						JOptionPane.showMessageDialog(null, "Father Name is Required");
					}else if (dateOfBirth.equals("")){
						JOptionPane.showMessageDialog(null, "Date of Birth is Required");
					}else if (gender.equals("")){
						JOptionPane.showMessageDialog(null, "Please Select your gender");
					}else if (marital.equals("")){
						JOptionPane.showMessageDialog(null, "Please Select your Marital Status");
					}else if (address.equals("")){
						JOptionPane.showMessageDialog(null, "Address is Required");
					}else if (city.equals("")){
						JOptionPane.showMessageDialog(null, "City is Required");
					}else if (state.equals("")){
						JOptionPane.showMessageDialog(null, "State is Required");
					}else if (pincode.equals("")){
						JOptionPane.showMessageDialog(null, "Enter your Pin code");
					}else {
						Connection c = new Connection();
//						Connection s = new Connection();
						String query = "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dateOfBirth+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
						c.s.executeUpdate(query);
						
						setVisible(false);
						new SignupTwo().setVisible(true);
						
					}
				} catch (Exception ae) {
					System.out.println(ae);
				}
				
				
			}else if (e.getSource() == back){
				setVisible(false);
				new Login().setVisible(true);
			}

	}
	
	public static void main(String[]args)
	{
		new Signup();
	}


}
