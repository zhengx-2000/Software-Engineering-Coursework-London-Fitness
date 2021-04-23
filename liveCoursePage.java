//package zyjGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class liveCoursePage extends JFrame implements ActionListener {

	Font btn = new Font("Georgia", Font.BOLD, 25);

	JLabel label1 = new JLabel("Live Course"); // creates label
	// JLabel label2 = new JLabel("Test URL");
	// JLabel label3 = new JLabel("No. of probes");
	// JLabel label4 = new JLabel("Histogram");
	// JLabel label5 = new JLabel("X");
	JButton button1 = new JButton("Good");

	JButton button2 = new JButton("Back"); // creates button
	// JTextField textField = new JTextField(23); //creates textField
	// JTextField textField1 = new JTextField();
	// JTextField textField2 = new JTextField();
	// JTextField textField3 = new JTextField();
	// JTextArea textArea = new JTextArea("Live Window"); //creates textArea

	// JComboBox type=new JComboBox(); //creates comboBox
	// JComboBox complexity=new JComboBox();
	// ArrayList<String> middleOutput = new ArrayList<String>(); //creates a
	// container to put strings in
	// ArrayList<Integer> RTT = new ArrayList<Integer>(); //creates a container for
	// integers

	/**
	 * This method defines many panels and adds all the components to the framework.
	 * 
	 * @return Nothing.
	 */

	liveCoursePage() { // constructor
		this.setLayout(null);

		JPanel panel1 = new JPanel();
		label1.setFont(btn);
		panel1.add(label1); // creates a panel to put label1 on
		panel1.setBounds(75, 0, 325, 100); // sets the location of the panel
		panel1.setBackground(new Color(250,240,215));

		JPanel panel2 = new JPanel();
		button1.addActionListener(this); // adds an actionListener to the button
		panel2.add(button1); // creates a panel to put button on
		panel2.setBounds(125, 525, 75, 75); // sets the location of the pane4
		panel2.setBackground(new Color(250,240,215));

		// ImageIcon icon = new ImageIcon("dianZan.jpg");
		// button1.setIcon(icon);

		JPanel panel3 = new JPanel();
		button2.addActionListener(this); // adds an actionListener to the button
		panel3.add(button2); // creates a panel to put button on
		panel3.setBounds(275, 525, 75, 75);
		panel3.setBackground(new Color(250,240,215));

		// JPanel panel4 = new JPanel();
		// panel4.add(textArea); //creates a panel to put textArea on
		// panel4.setBounds(0 , 125 , 475 , 400); //sets the location of the pane5
		//

		ImageIcon icon1 = new ImageIcon("C://Users/82425/Desktop/image/live123.jpg");
		JLabel labelp2 = new JLabel(); // creates label
		labelp2.setIcon(icon1);

		JPanel panel4 = new JPanel();
		panel4.add(labelp2); // creates a panel to put button on
		panel4.setBounds(37, 100, 400, 400);
		panel4.setBackground(new Color(250,240,215));

		// JPanel panel6 = new JPanel();
		// panel6.add(textArea2); //creates a panel to put textArea on
		// panel6.setBounds(350 , 400 , 200 , 200);
		//
		// JPanel panel7 = new JPanel();
		// panel7.add(textArea3); //creates a panel to put textArea on
		// panel7.setBounds(350 , 600 , 200 , 200);

		//
		// JPanel panel6 = new JPanel(); //creates a panel
		// panel6.setLayout(new FlowLayout(FlowLayout.LEFT)); //sets the layout of the
		// panel to be left-aligned
		// panel6.add(label4); //puts label4 on panel6
		// panel6.setBounds(850 , 30 , 300 , 70); //sets the location of the pane6

		this.add(panel1); // add components to the frame
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		// this.add(panel5);
		// this.add(panel6);
		// this.add(panel7);
		// this.add(textField1);
		// this.add(textField2);
		// this.add(textField3);
		this.setTitle("Live Course Page"); // sets the title of the frame

		setLocation(0, 0); // sets the location of the frame
		setSize(475, 625); // sets the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
		setResizable(false);
		setVisible(true); // sets the visible

	}

	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource.equals(button1)) {

			ImageIcon icon = new ImageIcon("C://Users/82425/Desktop/image/dianZan.jpg");
			JLabel labelp1 = new JLabel(); // creates label
			labelp1.setIcon(icon);

			JPanel panelp1 = new JPanel();
			panelp1.add(labelp1); // creates a panel to put button on
			panelp1.setBounds(50, 525, 75, 75);

			this.add(panelp1);

			setVisible(true);

		} else if (eventSource.equals(button2)) {

			this.setVisible(false);

			new Welcome();

		}
	}

	public static void main(String[] args) {
		liveCoursePage lcp = new liveCoursePage(); // create a new object
		lcp.getContentPane().setBackground(new Color(250,240,215));
	}

}