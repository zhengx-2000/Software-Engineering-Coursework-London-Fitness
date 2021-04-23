import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * A GUI for the Help page
 * @author Taowu Zhang
 * @version 2.0.0
 * @since 4/23/2021
 */

public class HelpPage {

	private final JFrame jf = new JFrame("HelpPage");
	final int WIDTH = 475;
	final int HEIGHT = 625;

	public void Help() {
		try {

			/**
			 * Set the base of the page
			 */

			//Background Color Settings			
			jf.getContentPane().setBackground(new Color(250,240,215));
			//Gets the page size
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//Center the page
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//Change the layout to FlowLayout, otherwise the components in the window will resize according to the window size
			jf.setLayout(new FlowLayout());
		
			/**
			 * Put the Box in the Page
			 */

			//Add an helpbox that holds all boxes
			Box helpBox = Box.createVerticalBox();
			
			//Add Common Question title box
			Box commonQuestionBox = Box.createHorizontalBox();
			JLabel commonQuestionLabel = new JLabel("Common Questions");
			commonQuestionBox.add(commonQuestionLabel);
			commonQuestionBox.add(Box.createHorizontalStrut(10));
			//Add Question 1 box
			Box question1Box = Box.createHorizontalBox();
			JLabel question1Label = new JLabel("Q1：         Why can't I watch medium and advanced videos?");
			question1Box.add(question1Label);
			question1Box.add(Box.createHorizontalStrut(10));
			//Add Answer 1 box			
			Box answer1Box = Box.createHorizontalBox();
			JLabel answer1Label = new JLabel("A1：  You need to subscribe to the membership you need.");
			answer1Box.add(answer1Label);
			answer1Box.add(Box.createHorizontalStrut(10));
			//Add Question 2 box
			Box question2Box = Box.createHorizontalBox();
			JLabel question2Label = new JLabel("Q2：                                      How should I make payment?");
			question2Box.add(question2Label);
			question2Box.add(Box.createHorizontalStrut(10));
			//Add Answer 2 box	
			Box answer2Box = Box.createHorizontalBox();
			JLabel answer2Label = new JLabel("A2：                                    You can pay by Visa or Paypal.");
			answer2Box.add(answer2Label);
			answer2Box.add(Box.createHorizontalStrut(10));
			//Add Question 2 box
			Box question3Box = Box.createHorizontalBox();
			JLabel question3Label = new JLabel("Q3：                                 How do I log out of my account?");
			question3Box.add(question3Label);
			question3Box.add(Box.createHorizontalStrut(10));
			//Add Answer 3 box	
			Box answer3Box = Box.createHorizontalBox();
			JLabel answer3Label = new JLabel("A3：        You can log out by closing the system program.");
			answer3Box.add(answer3Label);
			answer3Box.add(Box.createHorizontalStrut(10));

			//Other Question栏目
			Box otherQuestionBox = Box.createHorizontalBox();
			JLabel otherQuestionLabel = new JLabel("Other Questions:    ");
			JTextArea otherQuestionArea = new JTextArea(10,20);
			JScrollPane scrollPane = new JScrollPane(otherQuestionArea);
			otherQuestionArea.setColumns(20); 
			otherQuestionBox.add(otherQuestionLabel);
			otherQuestionBox.add(scrollPane);
			otherQuestionBox.add(Box.createHorizontalStrut(60));
			//Submit栏目
			Box submitBox = Box.createHorizontalBox();
			JLabel submitLabel = new JLabel("                                                     ");
			JButton submitButton = new JButton("Submit");
			submitButton.setName("submitButton");
			submitButton.addActionListener(new MyActionListener());
			submitBox.add(submitLabel);
			submitBox.add(submitButton);
			submitBox.add(Box.createHorizontalStrut(60));
			//Back Button栏目
			Box buttonBox = Box.createHorizontalBox();
			JButton backButton = new JButton("Back");
			backButton.setName("backButton");
			backButton.addActionListener(new MyActionListener());
			buttonBox.add(backButton);
			buttonBox.add(Box.createHorizontalStrut(70));

			//Add all boxes into helpbox
			helpBox.add(Box.createVerticalStrut(50));
			helpBox.add(commonQuestionBox);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(question1Box);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(answer1Box);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(question2Box);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(answer2Box);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(question3Box);
			helpBox.add(Box.createVerticalStrut(25));
			helpBox.add(answer3Box);
			helpBox.add(Box.createVerticalStrut(30));
			helpBox.add(otherQuestionBox);
			helpBox.add(Box.createVerticalStrut(10));
			helpBox.add(submitBox);
			helpBox.add(Box.createVerticalStrut(10));
			helpBox.add(buttonBox);

			//Add idbox into ID page
			jf.add(helpBox);
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
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "submitButton":
					JOptionPane.showMessageDialog(jf,"Submit Sucessfully!");
					break;
				case "backButton":
				{
					jf.setVisible(false);
					new Welcome();
					break;
				}				

				default:
					break;
			}
		}
	}
 
	public static void main(String[] args) {
		new HelpPage().Help();
	}
}

