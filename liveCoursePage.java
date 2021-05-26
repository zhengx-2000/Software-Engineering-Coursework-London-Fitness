import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

/**
 * Title        :liveCoursePage.java
 * Description  : A simple GUI for the Live Course Page
 * @author      : Yijue Zhang
 * @since       :20/5/2020
 */
public class liveCoursePage extends JFrame implements ActionListener {

	Font btn = new Font("Georgia", Font.BOLD, 25);

	final int WIDTH = 475;
	final int HEIGHT = 625;

	JLabel label1 = new JLabel("Live Course"); // creates label
	JButton button1 = new JButton("Good");
	JButton button2 = new JButton("Back"); // creates button

	/**
     * The constructor of liveCoursePage.java
     */
	liveCoursePage() { // constructor
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		this.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		
		this.getContentPane().setBackground(new Color(250,240,215));
		this.setLayout(null);

		JPanel panel1 = new JPanel();
		label1.setFont(btn);
		panel1.add(label1); // creates a panel to put label1 on
		panel1.setBounds(75, 0, 325, 100); // sets the location of the panel
		panel1.setBackground(new Color(250,240,215));

		JPanel panel2 = new JPanel();
		button1.addActionListener(this); // adds an actionListener to the button
		button1.setFocusPainted(false); 
		button1.setBackground(new Color(242,215,146));
		button1.setBorder(new EmptyBorder(5,17,5,17));
		panel2.add(button1); // creates a panel to put button on
		panel2.setBounds(125, 525, 75, 75); // sets the location of the pane4
		panel2.setBackground(new Color(250,240,215));

		JPanel panel3 = new JPanel();
		button2.addActionListener(this); // adds an actionListener to the button
		button2.setBackground(new Color(242,215,146));
		button2.setBorder(new EmptyBorder(5,17,5,17));
		
		panel3.add(button2); // creates a panel to put button on
		panel3.setBounds(275, 525, 75, 75);
		panel3.setBackground(new Color(250,240,215));

		ImageIcon icon1 = new ImageIcon("./image/live123.jpg");
		JLabel labelp2 = new JLabel(); // creates label
		labelp2.setIcon(icon1);

		JPanel panel4 = new JPanel();
		panel4.add(labelp2); // creates a panel to put button on
		panel4.setBounds(37, 100, 400, 400);
		panel4.setBackground(new Color(250,240,215));


		this.add(panel1); // add components to the frame
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.setTitle("Live Course Page"); // sets the title of the frame

		setSize(WIDTH, HEIGHT); // sets the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
		setResizable(false);
		setVisible(true); // sets the visible

	}

	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource.equals(button1)) {

			ImageIcon icon = new ImageIcon("./image/dianZan.jpg");
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
		new liveCoursePage();
	}
}