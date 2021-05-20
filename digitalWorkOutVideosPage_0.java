import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

/**
 * Title        :digitalWorkOutVideosPage.java
 * Description  : A simple GUI for the Digital Workout Videos Page two
 * @author      : Yijue Zhang
 * @date        :20/5/2020
 */

public class digitalWorkOutVideosPage_0 extends JFrame implements ActionListener {

	Font btn = new Font("Georgia", Font.BOLD, 25);
	Font btn1 = new Font("Georgia", Font.BOLD, 20);

	final int WIDTH = 475;
	final int HEIGHT = 625;

	final int WIDTH_new = 380;
	final int HEIGHT_new = 500;

	JLabel label1 = new JLabel("Videos"); // creates label

	JButton button1 = new JButton("Search"); // creates button
	JButton button2 = new JButton("Back"); 
	JButton button3 = new JButton("Play");
	JButton button4 = new JButton("Play");

	JButton nwButton1 = new JButton("Yes");
	JButton nwButton2 = new JButton("Back");
	
	JComboBox<String> type = new JComboBox<String>(); // creates comboBox
	JComboBox<String> complexity = new JComboBox<String>();

	JPanel panelp1 = new JPanel();
	JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));

	// new window
	JFrame jf=new JFrame();

	String typeContent;
	String complexityContent;


	/**
     * The constructor of digitalWorkOutVideosPage_0.java
     */
	digitalWorkOutVideosPage_0() { // constructor

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		this.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		this.getContentPane().setBackground(new Color(250,240,215));
		this.setLayout(null);

		// prepare for new window 
		nwButton1.addActionListener(this); 
		nwButton2.addActionListener(this);

		JPanel panel1 = new JPanel();
		label1.setFont(btn);
		panel1.add(label1); // creates a panel to put label1 on
		panel1.setBounds(150, 0, 175, 75); // sets the location of the panel
		panel1.setBackground(new Color(250,240,215));

		JPanel panel2 = new JPanel();
		type.addItem("Type");
		type.addItem("HIIT");
		type.addItem("Yoga");
		panel2.add(type); // creates a panel to put label3 and comboBox on
		panel2.setBounds(25, 75, 125, 50); // sets the location of the pane3
		panel2.setBackground(new Color(250,240,215));

		JPanel panel3 = new JPanel();
		complexity.addItem("Complexity");
		complexity.addItem("Easy");
		complexity.addItem("Difficulty");
		panel3.add(complexity); // creates a panel to put label3 and comboBox on
		panel3.setBounds(175, 75, 125, 50);
		panel3.setBackground(new Color(250,240,215));

		JPanel panel0 = new JPanel();
		button1.addActionListener(this);
		panel0.add(button1);
		panel0.setBounds(325, 75, 125, 50);
		panel0.setBackground(new Color(250,240,215));

		JPanel panel4 = new JPanel();
		button2.addActionListener(this); // adds an actionListener to the button
		panel4.add(button2);
		panel4.setBounds(0, 550, 475, 50); // sets the location of the pane4
		panel4.setBackground(new Color(250,240,215));

		panel5.setBounds(0, 165, 475, 300);
		panel5.setBackground(new Color(250,240,215));

		this.add(panel0);	// add components to the frame
		this.add(panel1); 
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);

		this.setTitle("Digital WorkOut Videos Page"); // sets the title of the frame

		setSize(WIDTH, HEIGHT); // sets the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
		setResizable(false);
		setVisible(true); // sets the visible

	}

	/**
     * Actions involved in the page.
     * @param e different actions
     */
	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource.equals(button1)) {

			// String typeContent;
			typeContent = (String) type.getSelectedItem(); // gets the item selected in the comboBox

			// String complexityContent;
			complexityContent = (String) complexity.getSelectedItem();

			panelp1.removeAll();

			if (typeContent == "HIIT" && complexityContent == "Easy") {
				
				panel5.removeAll();

				JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp1 = new JPanel();
				ImageIcon icon = new ImageIcon("./image/HIIT1_0.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);
				panelp1.add(labelp1); 
				panelp1.setBounds(20 , 165, 100 , 100);	
				panelp1.setBackground(new Color(250,240,215));
		
				JTextArea textArea1 = new JTextArea("");	
				textArea1.setText("Video 1"+"\r\n"+"Type: HIIT"+"\r\n"+"Complexity: Easy");
				textArea1.setEditable(false);
				JPanel panelt1 = new JPanel();
				panelt1.add(textArea1);	
				panelt1.setBounds( 150, 165 , 200 , 100);	
				textArea1.setFont(btn1);
				textArea1.setBackground(new Color(250,240,215));
				panelt1.setBackground(new Color(250,240,215));

				button3.addActionListener(this);

				panel11.add(panelp1);
				panel11.add(panelt1);
				panel11.add(button3);
				panel11.setBounds(0, 165, 475, 100); // sets the location of the panel
				panel11.setBackground(new Color(250,240,215));
		
		
				JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp2 = new JPanel();
				ImageIcon icon2 = new ImageIcon("./image/HIIT1_1.jpg");
				JLabel labelp2 = new JLabel(); // creates label
				labelp2.setIcon(icon2);
				panelp2.add(labelp2); 
				panelp2.setBounds( 20, 315 , 100 , 100);
				panelp2.setBackground(new Color(250,240,215));
		
				JTextArea textArea2 = new JTextArea("");	
				textArea2.setText("Video 2"+"\r\n"+"Type: HIIT"+"\r\n"+"Complexity: Easy");
				textArea2.setEditable(false);
				JPanel panelt2 = new JPanel();
				panelt2.add(textArea2);									//creates a panel to put button on
				panelt2.setBounds( 150, 315 , 200 , 100);	
				textArea2.setFont(btn1);
				textArea2.setBackground(new Color(250,240,215));
				panelt2.setBackground(new Color(250,240,215));

				button4.addActionListener(this);
				
				panel12.add(panelp2);
				panel12.add(panelt2);
				panel12.add(button4);
				panel12.setBounds(0, 315, 475, 100); // sets the location of the panel
				panel12.setBackground(new Color(250,240,215));
		

				panel5.add(panel11);
				panel5.add(panel12);

				this.add(panel5);

				setVisible(true);

			}

			if (typeContent == "HIIT" && complexityContent == "Difficulty") {
				
				panel5.removeAll();

				JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp1 = new JPanel();
				ImageIcon icon = new ImageIcon("./image/HIIT2_0.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);
				panelp1.add(labelp1); 
				panelp1.setBounds(20 , 165, 100 , 100);	
				panelp1.setBackground(new Color(250,240,215));
		
				JTextArea textArea1 = new JTextArea("");	
				textArea1.setText("Video 1"+"\r\n"+"Type: HIIT"+"\r\n"+"Complexity: Difficulty");
				textArea1.setEditable(false);
				JPanel panelt1 = new JPanel();
				panelt1.add(textArea1);	
				// panelt1.add(button3);		//creates a panel to put button on
				panelt1.setBounds( 150, 165 , 200 , 100);	
				textArea1.setFont(btn1);
				textArea1.setBackground(new Color(250,240,215));
				panelt1.setBackground(new Color(250,240,215));

				button3.addActionListener(this);
				
				panel11.add(panelp1);
				panel11.add(panelt1);
				panel11.add(button3);
				panel11.setBounds(0, 165, 475, 100); // sets the location of the panel
				panel11.setBackground(new Color(250,240,215));
		
		
				JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp2 = new JPanel();
				ImageIcon icon2 = new ImageIcon("./image/HIIT2_1.jpg");
				JLabel labelp2 = new JLabel(); // creates label
				labelp2.setIcon(icon2);
				panelp2.add(labelp2); 
				panelp2.setBounds( 20, 315 , 100 , 100);
				panelp2.setBackground(new Color(250,240,215));
		
				JTextArea textArea2 = new JTextArea("");	
				textArea2.setText("Video 2"+"\r\n"+"Type: HIIT"+"\r\n"+"Complexity: Difficulty");
				textArea2.setEditable(false);
				JPanel panelt2 = new JPanel();
				panelt2.add(textArea2);						
				panelt2.setBounds( 150, 315 , 200 , 100);	
				textArea2.setFont(btn1);
				textArea2.setBackground(new Color(250,240,215));
				panelt2.setBackground(new Color(250,240,215));

				button4.addActionListener(this);
				
				panel12.add(panelp2);
				panel12.add(panelt2);
				panel12.add(button4);
				panel12.setBounds(0, 315, 475, 100); // sets the location of the panel
				panel12.setBackground(new Color(250,240,215));
		

				panel5.add(panel11);
				panel5.add(panel12);

				this.add(panel5);

				setVisible(true);

			}


			if (typeContent == "Yoga" && complexityContent == "Easy") {

				panel5.removeAll();

				JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp1 = new JPanel();
				ImageIcon icon = new ImageIcon("./image/Yoga1_0.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);
				panelp1.add(labelp1); 
				panelp1.setBounds(20 , 165, 100 , 100);	
				panelp1.setBackground(new Color(250,240,215));
		
				JTextArea textArea1 = new JTextArea("");	
				textArea1.setText("Video 1"+"\r\n"+"Type: Yoga"+"\r\n"+"Complexity: Easy");
				textArea1.setEditable(false);
				JPanel panelt1 = new JPanel();
				panelt1.add(textArea1);	
				panelt1.setBounds( 150, 165 , 200 , 100);	
				textArea1.setFont(btn1);
				textArea1.setBackground(new Color(250,240,215));
				panelt1.setBackground(new Color(250,240,215));

				button3.addActionListener(this);

				panel11.add(panelp1);
				panel11.add(panelt1);
				panel11.add(button3);
				panel11.setBounds(0, 165, 475, 100); // sets the location of the panel
				panel11.setBackground(new Color(250,240,215));
		
		
				JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp2 = new JPanel();
				ImageIcon icon2 = new ImageIcon("./image/Yoga1_1.jpg");
				JLabel labelp2 = new JLabel(); // creates label
				labelp2.setIcon(icon2);
				panelp2.add(labelp2); 
				panelp2.setBounds( 20, 315 , 100 , 100);
				panelp2.setBackground(new Color(250,240,215));
		
				JTextArea textArea2 = new JTextArea("");	
				textArea2.setText("Video 2"+"\r\n"+"Type: Yoga"+"\r\n"+"Complexity: Easy");
				textArea2.setEditable(false);
				JPanel panelt2 = new JPanel();
				panelt2.add(textArea2);									
				panelt2.setBounds( 150, 315 , 200 , 100);	
				textArea2.setFont(btn1);
				textArea2.setBackground(new Color(250,240,215));
				panelt2.setBackground(new Color(250,240,215));

				button4.addActionListener(this);
				
				panel12.add(panelp2);
				panel12.add(panelt2);
				panel12.add(button4);
				panel12.setBounds(0, 315, 475, 100); // sets the location of the panel
				panel12.setBackground(new Color(250,240,215));
		

				panel5.add(panel11);
				panel5.add(panel12);

				this.add(panel5);

				setVisible(true);

			}

			if (typeContent == "Yoga" && complexityContent == "Difficulty") {

				panel5.removeAll();

				JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp1 = new JPanel();
				ImageIcon icon = new ImageIcon("./image/Yoga2_0.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);
				panelp1.add(labelp1); 
				panelp1.setBounds(20 , 165, 100 , 100);	
				panelp1.setBackground(new Color(250,240,215));
		
				JTextArea textArea1 = new JTextArea("");	
				textArea1.setText("Video 1"+"\r\n"+"Type: Yoga"+"\r\n"+"Complexity: Difficulty");
				textArea1.setEditable(false);
				JPanel panelt1 = new JPanel();
				panelt1.add(textArea1);	
				panelt1.setBounds( 150, 165 , 200 , 100);	
				textArea1.setFont(btn1);
				textArea1.setBackground(new Color(250,240,215));
				panelt1.setBackground(new Color(250,240,215));

				button3.addActionListener(this);

				panel11.add(panelp1);
				panel11.add(panelt1);
				panel11.add(button3);
				panel11.setBounds(0, 165, 475, 100); // sets the location of the panel
				panel11.setBackground(new Color(250,240,215));
		
		
				JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JPanel panelp2 = new JPanel();
				ImageIcon icon2 = new ImageIcon("./image/Yoga2_1.jpg");
				JLabel labelp2 = new JLabel(); // creates label
				labelp2.setIcon(icon2);
				panelp2.add(labelp2); 
				panelp2.setBounds( 20, 315 , 100 , 100);
				panelp2.setBackground(new Color(250,240,215));
		
				JTextArea textArea2 = new JTextArea("");	
				textArea2.setText("Video 2"+"\r\n"+"Type: Yoga"+"\r\n"+"Complexity: Difficulty");
				textArea2.setEditable(false);
				JPanel panelt2 = new JPanel();
				panelt2.add(textArea2);									
				panelt2.setBounds( 150, 315 , 200 , 100);	
				textArea2.setFont(btn1);
				textArea2.setBackground(new Color(250,240,215));
				panelt2.setBackground(new Color(250,240,215));

				button4.addActionListener(this);
				
				panel12.add(panelp2);
				panel12.add(panelt2);
				panel12.add(button4);
				panel12.setBounds(0, 315, 475, 100); // sets the location of the panel
				panel12.setBackground(new Color(250,240,215));
		

				panel5.add(panel11);
				panel5.add(panel12);

				this.add(panel5);

				setVisible(true);

			}

			

		} else if (eventSource.equals(button2)) {

			this.setVisible(false);

			new Welcome();

		} else if (eventSource.equals(button3)) {

			if (typeContent == "HIIT" && complexityContent == "Easy") {

				File file = new File("./Demo/11.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}

			if (typeContent == "Yoga" && complexityContent == "Easy") {
				
				File file = new File("./Demo/31.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}

			if (complexityContent == "Difficulty") {
				
				Font nwBtn = new Font("Georgia", Font.BOLD, 25);
			
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				int sw = screenSize.width;
				int sh = screenSize.height;
				jf.setBounds((sw - WIDTH_new) / 2, (sh - HEIGHT_new) / 2, WIDTH_new, HEIGHT_new);
				
				jf.getContentPane().setBackground(new Color(255,255,255));
				jf.setLayout(null);

				String str = "<html>Your membership level is insufficient. Do you want to jump to the member recharge window?</html>";

				JLabel nwLabel = new JLabel(str);
				
				nwLabel.setFont(nwBtn);
				nwLabel.setBounds(20, 0, 340, 300); // sets the location of the panel


				JPanel nwPanel = new JPanel();
				nwPanel.add(nwButton1);
				nwPanel.add(nwButton2);
				nwPanel.setBounds(0, 400, 380, 100); // sets the location of the pane4
				nwPanel.setBackground(new Color(255,255,255));

				
				jf.add(nwLabel);
				jf.add(nwPanel);

				jf.setTitle("Error"); // sets the title of the frame
				jf.setSize(WIDTH_new, HEIGHT_new); // sets the size of the frame
				jf.setResizable(false);
				jf.setVisible(true); // sets the visible

			}

		} else if (eventSource.equals(button4)) {

			if (typeContent == "HIIT" && complexityContent == "Easy") {

				File file = new File("./Demo/21.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}

			if (typeContent == "Yoga" && complexityContent == "Easy") {
				
				File file = new File("./Demo/41.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}

			if (complexityContent == "Difficulty") {
				
				Font nwBtn = new Font("Georgia", Font.BOLD, 25);
			
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				int sw = screenSize.width;
				int sh = screenSize.height;
				jf.setBounds((sw - WIDTH_new) / 2, (sh - HEIGHT_new) / 2, WIDTH_new, HEIGHT_new);
				
				jf.getContentPane().setBackground(new Color(255,255,255));
				jf.setLayout(null);

				String str = "<html>Your membership level is insufficient. Do you want to jump to the member recharge window?</html>";

				JLabel nwLabel = new JLabel(str);
				
				nwLabel.setFont(nwBtn);
				nwLabel.setBounds(20, 0, 340, 300); // sets the location of the panel

				JPanel nwPanel = new JPanel();
				nwPanel.add(nwButton1);
				nwPanel.add(nwButton2);
				nwPanel.setBounds(0, 350, 380, 100); // sets the location of the pane4
				nwPanel.setBackground(new Color(255,255,255));

				jf.add(nwLabel);
				jf.add(nwPanel);

				jf.setTitle("Error"); // sets the title of the frame
				jf.setSize(WIDTH_new, HEIGHT_new); // sets the size of the frame
				jf.setResizable(false);
				jf.setVisible(true); // sets the visible

			}

		}	else if (eventSource.equals(nwButton1)){

			this.setVisible(false);
			jf.setVisible(false);

			// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!此处改为tjy的充值
			// new liveCoursePage();

			new paymentGUI().init(0);

		} else if (eventSource.equals(nwButton2)){

			this.setVisible(false);
			jf.setVisible(false);

			new digitalWorkOutVideosPage_0();
		}
	}

	public static void main(String[] args) {
		new digitalWorkOutVideosPage_0(); // create a new object
	}
}
