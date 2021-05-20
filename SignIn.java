	/**
	 *	Title		:	SignIn.java
	 *	Description	:	This class is used for user to log in.
	 *	@author		:	Yuheng Li
	 *	@date		:	12/4/2021
	 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
public class SignIn {
	private final JFrame jf = new JFrame("Sign In Page");/*The whole panel */
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font btn = new Font("Georgia", Font.BOLD, 13);
	JTextField uField = new JTextField();/* ID input textbox panel*/
	JTextField pField = new JTextField();/* Passport input textbox panel*/
	public	int state=0;/*state 0=>no VIP;1=> month VIP;2=> season VIP;3=> year VIP*/
	String I;
	String P;
	int a;
	int b;
	/**
	 *	Set the login panel outlook.
	 *	@param option no param needed,it is the initial page. 
	 *	@return Return nothing.
	 **/
	public void init() {
		try {
			jf.getContentPane().setBackground(new Color(250,240,215));
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			jf.setLayout(new FlowLayout());
			jf.setBackground(new Color(250,240,215));
			Box vBox = Box.createVerticalBox();

			/*The photo box panel */
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/boy.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
			
	        photoBox.add(Box.createHorizontalStrut(110));
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));
			
			
			/*The ID box panel */
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID:                ");
			uLabel.setFont(btn);
			uField = new JTextField(25);
			uField.setPreferredSize(new Dimension (25,25));
			uField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(20));
			uBox.add(uField);
			
			/*The PassWord box panel */
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord:");
			pField = new JTextField(25);
			pLabel.setFont(btn);
			pField.setPreferredSize(new Dimension (25,25));
			pField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(20));
			pBox.add(pField);
			
			/*The button box panel */
			Box btnBox = Box.createHorizontalBox();
			JButton loginBtn = new JButton("OK");
			loginBtn.setBackground(new Color(242,215,146));
			loginBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
			loginBtn.setName("loginBtn");
			loginBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);
			btnBox.add(Box.createHorizontalStrut(0));
			
			/*The menu box panel */
			Box menuBox = Box.createHorizontalBox();
			JMenuBar jmb=new JMenuBar();	
			JMenuItem jm1=new JMenuItem("Sign In");	
			jm1.setFont(btn);
			jm1.setBackground(new Color(250,240,215));
			jm1.setBounds(20, 5, 5, 1);
			jm1.setName("In");
			jmb.setBorder(BorderFactory.createLineBorder(new Color(242,215,146),0));
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	
			jm1.setBounds(30, 5, 5, 1);
			jm2.setName("Up");
			jm2.setFont(btn);
			jm2.setBackground(new Color(250,240,215));
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(125));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(125));

			/*Set and align the box panels */
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(photoBox);
			vBox.add(Box.createVerticalStrut(50));
			vBox.add(uBox);
			vBox.add(Box.createVerticalStrut(32));
			vBox.add(pBox);
			vBox.add(Box.createVerticalStrut(90));
			vBox.add(btnBox);
			vBox.add(Box.createVerticalStrut(110));
			vBox.add(menuBox);
			
			jf.add(vBox);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*The ActionListener method for jmenu button*/
	public class ViewAction implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JMenuItem jmenu=(JMenuItem)event.getSource();
			String name=jmenu.getName();
			switch(name){
				case "In":
					new SignIn().init();
					jf.setVisible(false);
					break;
				case "Up":
					new SignUp().init();
					jf.setVisible(false);
				}
		}
	}

	/*The ActionListener method for click login button*/
	private class MyActionListener implements ActionListener {		
		
		@Override
		public void actionPerformed(ActionEvent e) {	
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "loginBtn":
					I=uField.getText();
					P=pField.getText();
					IDcheck ch=new IDcheck(I,P);
					SaveID  t = new SaveID();
					t.write2file(I);
					try {
						 a=ch.Check();
						if(a!=0) {
							state=1;
							Object[] options = { "OK" };
							JOptionPane.showOptionDialog(null, "Login Successfully !", "Message",
							JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
							jf.setVisible(false);
							new Welcome();
							
						}else {
							
							Object[] options = { "Try Again" };
							JOptionPane.showOptionDialog(null, "Please input right ID&Password !", "Message",
							JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
						}
						getAnswer(a);
					}catch (Exception e1) {
						e1.printStackTrace();
					}
					break;
				case "homeBtn":
					break;
				default:
					break;
				
			}
		}
		
	}
	
	public int getAnswer(int a) {
		System.out.print("444: "+a);
		b=a;
		return a;
	}
	public static void main(String[] args) {
		new SignIn().init();
	}
}