import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class digitalWorkOutVideosPage extends JFrame implements ActionListener {

	Font btn = new Font("Georgia", Font.BOLD, 25);

	final int WIDTH = 475;
	final int HEIGHT = 625;

	JLabel label1 = new JLabel("Videos"); // creates label

	JButton button1 = new JButton("Search");
	JButton button2 = new JButton("Back"); // creates button
	JButton button3 = new JButton("Play the video");
	// JTextField textField = new JTextField(23); //creates textField
	// JTextField textField1 = new JTextField();
	// JTextField textField2 = new JTextField();
	// // JTextField textField3 = new JTextField();
	// JTextArea textArea1 = new JTextArea("Video Name:"); //creates textArea
	// JTextArea textArea2 = new JTextArea("Video Name:");
	// JTextArea textArea3 = new JTextArea("Video Name:");


	JComboBox<String> type = new JComboBox<String>(); // creates comboBox
	JComboBox<String> complexity = new JComboBox<String>();

	String typeContent;
	String complexityContent;


	JPanel panelp1 = new JPanel();
	// panelt1.setBackground(new Color(250,240,215));

	digitalWorkOutVideosPage() { // constructor

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		this.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		
		this.getContentPane().setBackground(new Color(250,240,215));
		this.setLayout(null);

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

		// setBackground(Color.BLUE);

		// setBackground(Color.decode("复制的字符串"));
		// super.paintComponent(g);
		//
		// g.setBackground(new Color(250,240,215));

		// setLocation(0, 0); // sets the location of the frame
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

			if (typeContent == "HIIT" && complexityContent == "Difficulty") {

				ImageIcon icon = new ImageIcon("./image/HIIT2.jpg");
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

			if (typeContent == "Yoga" && complexityContent == "Difficulty") {

				ImageIcon icon = new ImageIcon("./image/Yoga2.jpg");
				JLabel labelp1 = new JLabel(); // creates label
				labelp1.setIcon(icon);

				panelp1.add(labelp1); // creates a panel to put button on

				this.add(panelp1);

				setVisible(true);

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


				/*try {
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://www.bilibili.com/video/BV1hs411G7am?from=search&seid=5552250855579505869");
					//go to the website to play the video
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
			}

			if (typeContent == "HIIT" && complexityContent == "Difficulty") {

				File file = new File("./Demo/2.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}


				// try {
				// 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://www.bilibili.com/video/BV1pt411P7wf?from=search&seid=16132236175140062706");
				// 	//go to the website to play the video
				// } catch (IOException e1) {
				// 	// TODO Auto-generated catch block
				// 	e1.printStackTrace();
				// }

			}

			if (typeContent == "Yoga" && complexityContent == "Easy") {
				
				File file = new File("./Demo/3.mov");
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

			if (typeContent == "Yoga" && complexityContent == "Difficulty") {
				
				File file = new File("./Demo/4.mov");
				try {
					Runtime.getRuntime().exec("cmd /k start "+file);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}


				// try {
				// 	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://www.bilibili.com/video/BV1Ub411L7SJ?from=search&seid=9574779862899539973");
				// 	//go to the website to play the video
				// } catch (IOException e1) {
				// 	// TODO Auto-generated catch block
				// 	e1.printStackTrace();
				// }

			}

		}

	}

	public static void main(String[] args) {
		new digitalWorkOutVideosPage(); // create a new object
	}
}
