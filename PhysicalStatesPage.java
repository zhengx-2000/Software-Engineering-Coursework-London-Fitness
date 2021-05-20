import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * A GUI for altering the Physical States page
 * @author Taowu Zhang
 * @version 4.0
 * @since 5/20/2021
 */



public class PhysicalStatesPage {
	private final JFrame jf = new JFrame("Physical States Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;

	JButton backbutton = new JButton("Back");
	JButton savebutton = new JButton("Save");

	JTextField heightField = new JTextField();
	JTextField weightField = new JTextField();
	JTextField ageField = new JTextField();

	public PhysicalStatesPage() {
		try {
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
			
			/* Add Height box */
			Box heightBox = Box.createHorizontalBox();
			JLabel heightLabel = new JLabel("Height(cm):");
			heightLabel.setFont(font1);
			heightField = new JTextField(25);
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(50));
			heightBox.add(heightField);

			/* Add Weight box */
			Box weightBox = Box.createHorizontalBox();
			JLabel weightLabel = new JLabel("Weight(kg):");
			weightLabel.setFont(font1);
			weightField = new JTextField(25);
			weightBox.add(weightLabel);
			weightBox.add(Box.createHorizontalStrut(50));
			weightBox.add(weightField);

			/* Add Age box */
			Box ageBox = Box.createHorizontalBox();
			JLabel ageLabel = new JLabel("Age:                 ");
			ageLabel.setFont(font1);
			ageField = new JTextField(25);
			ageBox.add(ageLabel);
			ageBox.add(Box.createHorizontalStrut(50));
			ageBox.add(ageField);

			/* Add Button box */
			Box buttonBox = Box.createHorizontalBox();
			backbutton.setFont(font1);
			backbutton.setName("backbutton");
			backbutton.addActionListener(new MyActionListener());
			JLabel blankLabel = new JLabel("                ");
			savebutton.setFont(font1);
			savebutton.setName("savebutton");
			savebutton.addActionListener(new MyActionListener());
			buttonBox.add(backbutton);
			buttonBox.add(blankLabel);
			buttonBox.add(savebutton);
			buttonBox.add(Box.createHorizontalStrut(1));

			/* Add all boxes into physicalStates box */
			physicalStatesBox.add(Box.createVerticalStrut(35));
			physicalStatesBox.add(heightBox);
			physicalStatesBox.add(Box.createVerticalStrut(35));
			physicalStatesBox.add(weightBox);
			physicalStatesBox.add(Box.createVerticalStrut(35));
			physicalStatesBox.add(ageBox);
			physicalStatesBox.add(Box.createVerticalStrut(35));
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

		/* Determine whether the height, weight and age entered in the format are correct */
		if (button.equals(savebutton)){
			ArrayList<String> physicalStatesList = new ArrayList<String>();
			if (hei.equals("")||wei.equals("")||age.equals("")||isNotNumeric(hei)||isNotNumeric(wei)||isNotNumeric(age)) {
				JOptionPane.showMessageDialog(jf,"Error, You must fill it right!");
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
							physicalStatesList.add(hei);
							physicalStatesList.add(wei);
							physicalStatesList.add(age);
							JOptionPane.showMessageDialog(jf, "Save Successfully!");
							new alterPhysicalStates(physicalStatesList);
							new IDPage().Identity();
							jf.setVisible(false);
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

