import javax.print.DocFlavor.STRING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class digitalWorkOutVideosPage_0 extends JFrame implements ActionListener {

	Font btn = new Font("Georgia", Font.BOLD, 25);

	final int WIDTH = 475;
	final int HEIGHT = 625;

	final int WIDTH_new = 380;
	final int HEIGHT_new = 500;

	JLabel label1 = new JLabel("Videos"); // creates label

	JButton button1 = new JButton("Search");
	JButton button2 = new JButton("Back"); // creates button
	JButton button3 = new JButton("Play the video");

	JButton nwButton1 = new JButton("Yes");
	JButton nwButton2 = new JButton("Back");
	
	JComboBox<String> type = new JComboBox<String>(); // creates comboBox
	JComboBox<String> complexity = new JComboBox<String>();

	JPanel panelp1 = new JPanel();
	// panelt1.setBackground(new Color(250,240,215));

	// 以后的新窗口
	JFrame jf=new JFrame();

	String typeContent;
	String complexityContent;

	digitalWorkOutVideosPage_0() { // constructor

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		this.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		
		this.getContentPane().setBackground(new Color(250,240,215));
		this.setLayout(null);




		// 为以后的new window 做准备
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
		button3.addActionListener(this);
		panel4.add(button3);
		panel4.add(button2);
		panel4.setBounds(0, 550, 475, 50); // sets the location of the pane4
		panel4.setBackground(new Color(250,240,215));

		panelp1.setBounds(100, 165, 275, 275);


		this.add(panel0);
		this.add(panel1); // add components to the frame
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);

		this.setTitle("Digital WorkOut Videos Page"); // sets the title of the frame

		
		setSize(WIDTH, HEIGHT); // sets the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
		setResizable(false);
		setVisible(true); // sets the visible

		// Color backgroundColor = new Color(250,240,215);
	}

	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource.equals(button1)) {

			// String typeContent;
			typeContent = (String) type.getSelectedItem(); // gets the item selected in the comboBox

			// String complexityContent;
			complexityContent = (String) complexity.getSelectedItem();


			panelp1.removeAll();

			if (typeContent == "HIIT" && complexityContent == "Easy") {
				//
				// VideoPlayer video = new VideoPlayer("filename");
				// frame.getContentPane().add(video);
				// video.play();
				//
				ImageIcon icon = new ImageIcon("./image/HIIT1.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);

				panelp1.add(labelp1); // creates a panel to put button on


				this.add(panelp1);

				setVisible(true);

			}


			if (typeContent == "Yoga" && complexityContent == "Easy") {

				ImageIcon icon = new ImageIcon("./image/Yoga1.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);

				panelp1.add(labelp1); // creates a panel to put button on


				this.add(panelp1);

				setVisible(true);

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
				// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation     为了点击新窗口的X时只关闭的是新窗口 而不是两个窗口
				jf.setResizable(false);
				jf.setVisible(true); // sets the visible

			}
			

		} else if (eventSource.equals(button2)) {

			this.setVisible(false);

			new Welcome();

		} else if (eventSource.equals(button3)) {

			// String typeContent;
			// typeContent = (String) type.getSelectedItem(); // gets the item selected in the comboBox

			// String complexityContent;
			// complexityContent = (String) complexity.getSelectedItem();

			if (typeContent == "HIIT" && complexityContent == "Easy") {

				// ProcessBuilder process = new ProcessBuilder(
				// 		"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe",
				// 		"C:\\Users\\82425\\Desktop\\交互媒体Lab\\Demo\\Lab1. Demo.mov");

				// try {
				// 	process.start();
				// } catch (IOException e1) {
				// 	e1.printStackTrace();
				// }


				File file = new File("./Demo/1.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}




				// try {
				// 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://www.bilibili.com/video/BV1hs411G7am?from=search&seid=5552250855579505869");
				// 	//go to the website to play the video
				// } catch (IOException e1) {
				// 	// TODO Auto-generated catch block
				// 	e1.printStackTrace();
				// }

			}

			if (typeContent == "Yoga" && complexityContent == "Easy") {
				
				File file = new File("./Demo/2.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}





				// try {
				// 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://www.bilibili.com/video/BV1Zz4y1o7Vx?from=search&seid=1277355613209143152");
				// 	//go to the website to play the video
				// } catch (IOException e1) {
				// 	// TODO Auto-generated catch block
				// 	e1.printStackTrace();
				// }

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
				// nwButton1.addActionListener(this); // adds an actionListener to the button
				// nwButton2.addActionListener(this);
				nwPanel.add(nwButton1);
				nwPanel.add(nwButton2);
				nwPanel.setBounds(0, 400, 380, 100); // sets the location of the pane4
				nwPanel.setBackground(new Color(255,255,255));

				
				jf.add(nwLabel);
				jf.add(nwPanel);

				jf.setTitle("Error"); // sets the title of the frame
				jf.setSize(WIDTH_new, HEIGHT_new); // sets the size of the frame
				// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation     为了点击新窗口的X时只关闭的是新窗口 而不是两个窗口
				jf.setResizable(false);
				jf.setVisible(true); // sets the visible

			}

		} else if (eventSource.equals(nwButton1)){

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
