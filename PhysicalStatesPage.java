import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.border.EmptyBorder;


/**
 * A GUI for altering the Personal information page
 * @author Taowu Zhang
 * @version 5.0
 * @since 5/25/2021
 */



public class PhysicalStatesPage {
	private final JFrame jf = new JFrame("Personal Information Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;

	JButton backbutton = new JButton("Back");
	JButton savebutton = new JButton("Save");

	JTextField heightField = new JTextField();
	JTextField weightField = new JTextField();
	JTextField ageField = new JTextField();

	JComboBox<String> genderComBox = new JComboBox<String>();
	JTextField passwordField = new JTextField();
	JTextField phoneField = new JTextField();
	JTextField e_mailField = new JTextField();

	String identity;

	public PhysicalStatesPage() {
		try {
			/* Get user's ID */
			GetID getid = new GetID();
			identity=getid.getID();

			/* Font used in the GUI */
			Font font1 = new Font("Georgia", Font.BOLD, 13);

			/* Background Color Settings */
			jf.getContentPane().setBackground(new Color(250,240,215));
			
			/* Gets the page size */
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			/* Center the page */
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			/* Change the layout to FlowLayout, otherwise the components in the window will resize according to the window size */
			jf.setLayout(new FlowLayout());
			
			/**
			 * Put the Box in the Page
			 */

			/* Add an physicalStatesBox that holds all boxes */
			Box physicalStatesBox = Box.createVerticalBox();

			/* Add Title box */
			Box titleBox = Box.createHorizontalBox();
			JLabel titleLabel = new JLabel("        Please update your personal information                ");
			titleLabel.setFont(font1);
			titleBox.add(titleLabel);
			titleBox.add(Box.createHorizontalStrut(1));

			/* Add Gender box */
			Box genderBox = Box.createHorizontalBox();
			JLabel genderLabel = new JLabel("Gender:       ");
			genderLabel.setFont(font1);
			genderComBox.addItem("Unknown");
			genderComBox.addItem("Male");
			genderComBox.addItem("Female");
			genderComBox.setFont(font1);
			genderBox.add(genderLabel);
			genderBox.add(Box.createHorizontalStrut(1));
			genderBox.add(genderComBox);

			/* Add Password box */
			Box passwordBox = Box.createHorizontalBox();
			JLabel passwordLabel = new JLabel("Password:  ");
			passwordLabel.setFont(font1);
			passwordField = new JTextField(25);
			passwordBox.add(passwordLabel);
			passwordBox.add(Box.createHorizontalStrut(1));
			passwordBox.add(passwordField);

			/* Add Phone box */
			Box phoneBox = Box.createHorizontalBox();
			JLabel phoneLabel = new JLabel("Phone:           ");
			phoneLabel.setFont(font1);
			phoneField = new JTextField(25);
			phoneBox.add(phoneLabel);
			phoneBox.add(Box.createHorizontalStrut(1));
			phoneBox.add(phoneField);

			/* Add E-mail box */
			Box emailBox = Box.createHorizontalBox();
			JLabel emailLabel = new JLabel("E-mail:          ");
			emailLabel.setFont(font1);
			e_mailField = new JTextField(25);
			emailBox.add(emailLabel);
			emailBox.add(Box.createHorizontalStrut(1));
			emailBox.add(e_mailField);
			
			/* Add Height box */
			Box heightBox = Box.createHorizontalBox();
			JLabel heightLabel = new JLabel("Height(cm):");
			heightLabel.setFont(font1);
			heightField = new JTextField(25);
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(1));
			heightBox.add(heightField);

			/* Add Weight box */
			Box weightBox = Box.createHorizontalBox();
			JLabel weightLabel = new JLabel("Weight(kg):");
			weightLabel.setFont(font1);
			weightField = new JTextField(25);
			weightBox.add(weightLabel);
			weightBox.add(Box.createHorizontalStrut(1));
			weightBox.add(weightField);

			/* Add Age box */
			Box ageBox = Box.createHorizontalBox();
			JLabel ageLabel = new JLabel("Age:                 ");
			ageLabel.setFont(font1);
			ageField = new JTextField(25);
			ageBox.add(ageLabel);
			ageBox.add(Box.createHorizontalStrut(1));
			ageBox.add(ageField);

			/* Add Button box */
			Box buttonBox = Box.createHorizontalBox();
			backbutton.setFont(font1);
			backbutton.setName("backbutton");
			backbutton.addActionListener(new MyActionListener());
			backbutton.setBackground(new Color(242,215,146));
			backbutton.setBorder(new EmptyBorder(5,17,5,17));
			JLabel blankLabel = new JLabel("                ");
			savebutton.setFont(font1);
			savebutton.setName("savebutton");
			savebutton.addActionListener(new MyActionListener());
			savebutton.setBackground(new Color(242,215,146));
			savebutton.setBorder(new EmptyBorder(5,17,5,17));
			buttonBox.add(backbutton);
			buttonBox.add(blankLabel);
			buttonBox.add(savebutton);
			buttonBox.add(Box.createHorizontalStrut(1));

			/* Add all boxes into physicalStates box */
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(titleBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(genderBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(passwordBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(phoneBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(emailBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(heightBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(weightBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(ageBox);
			physicalStatesBox.add(Box.createVerticalStrut(40));
			physicalStatesBox.add(buttonBox);

			/* Add physicalStates box into Physical States page */
			jf.add(physicalStatesBox);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * Actions involved in the page.
 * @param e different actions
 */
private class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String hei = heightField.getText();
		String wei = weightField.getText();
		String age = ageField.getText();
		String gen =(String) genderComBox.getSelectedItem();
		String psw = passwordField.getText();
		String pho = phoneField.getText();
		String eml = e_mailField.getText();

		/* Determine whether the height, weight, age, gender, password, phone and e-mail entered in the format are correct */
		if (button.equals(savebutton)){
			ArrayList<String> physicalStatesList = new ArrayList<String>();
			ArrayList<String> personalInformationList = new ArrayList<String>();

			if (hei.equals("")||wei.equals("")||age.equals("")||psw.equals("")||pho.equals("")||eml.equals("")||isNotNumeric(hei)||isNotNumeric(wei)||isNotNumeric(age)) {
				JOptionPane.showMessageDialog(jf,"Error, You must fill it through !");
			}else{	
				if (Integer.parseInt(hei)<0||Integer.parseInt(hei)>300) {
					JOptionPane.showMessageDialog(jf,"You have incorrectly entered the height.");
				}else{
					if (Integer.parseInt(wei)<0||Integer.parseInt(wei)>600) {
						JOptionPane.showMessageDialog(jf,"You have incorrectly entered the weight.");
					}else{
						if (Integer.parseInt(age)<0||Integer.parseInt(age)>150) {
							JOptionPane.showMessageDialog(jf,"You have incorrectly entered the age.");
						}else{
							if (psw.length()<3||psw.length()>15) {
								JOptionPane.showMessageDialog(jf,"Please enter a 3-15 character password.");
							}else{
								if (pho.length()<4||pho.length()>15) {
									JOptionPane.showMessageDialog(jf,"Please enter a 4-15 character phone number.");
								}else{
									if (eml.contains("@")&&eml.contains(".")) {
										physicalStatesList.add(hei);
										physicalStatesList.add(wei);
										physicalStatesList.add(age);
										personalInformationList.add(identity);
										if (gen == "Unknown") {
											personalInformationList.add("0");
										}
										if (gen == "Male") {
											personalInformationList.add("1");
										}
										if (gen == "Female") {
											personalInformationList.add("2");
										}
										personalInformationList.add(psw);
										personalInformationList.add(pho);
										personalInformationList.add(eml);
										JOptionPane.showMessageDialog(jf, "Save Successfully!");
										new alterPhysicalStates(physicalStatesList);
										new alterPersonalInformation(personalInformationList);
										new IDPage().Identity();
										jf.setVisible(false);
									}else{
										JOptionPane.showMessageDialog(jf,"Please enter the correct email format.(with @ .)");
									}
								}
							}
						}
					}
				}					
			}
		}
		if (button.equals(backbutton)) {
			jf.setVisible(false);
			new IDPage().Identity();
		}
	}
}

/**
 * function determined whether the string is numeric or not in the page.
 * @param str to examine whether the string is numeric or not
 * @return boolean value of input information
 */
public boolean isNotNumeric(String str){ 
	Pattern pattern = Pattern.compile("[0-9]*"); 
	Matcher isNum = pattern.matcher(str);
	if( !isNum.matches() ){
		return true; 
	} 
	return false; 
}

 
	public static void main(String[] args) {
		new PhysicalStatesPage();
	}
}

