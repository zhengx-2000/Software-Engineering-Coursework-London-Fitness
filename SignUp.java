	/**
	 *	Title		:	SignUp.java
	 *	Description	:	This class is used for user to log up.
	 *	@author		:	Yuheng Li
	 *	@date		:	12/4/2021
	 **/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
 
public class SignUp {
	private final JFrame jf = new JFrame("Sign Up Page");
	Font btn = new Font("Georgia", Font.BOLD, 13);
	final int WIDTH = 475;
	final int HEIGHT = 625;
	JTextField uField=new JTextField();
	JTextField pField=new JTextField();
	JTextField pcField=new JTextField();
	JTextField phField=new JTextField();
	JTextField emField=new JTextField();
	ImageIcon logoIcon;
	JLabel photo;
	int sex;

	/**
	     * This function is used to build the structure of the sign up page.
	     * @param no. 
	     * @return no.
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
			Box vBox = Box.createVerticalBox();
			
			/*photo panel*/
			Box photoBox = Box.createHorizontalBox();
			photo = new JLabel();
	        logoIcon = new ImageIcon(new ImageIcon("image/secret.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
	        photoBox.add(Box.createHorizontalStrut(120));
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));
			
			/*sex panel*/
			Box sBox = Box.createHorizontalBox();
			JRadioButton jrb1=new JRadioButton("Female  ");
			jrb1.setFont(btn);
			jrb1.setBackground(new Color(250,240,215));
			jrb1.setBorder(null);
			JRadioButton jrb2=new JRadioButton("Male  ");
			jrb2.setBackground(new Color(250,240,215));
			jrb2.setFont(btn);
			jrb2.setBorder(null);
			JRadioButton jrb3=new JRadioButton("Secret ");
			jrb3.setBackground(new Color(250,240,215));
			jrb3.setBorder(null);
			jrb3.setFont(btn);
			
			ButtonGroup bg=new ButtonGroup();				
			bg.add(jrb1);
			bg.add(jrb2);
			bg.add(jrb3);
			
			sBox.add(jrb1);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb2);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb3);
			jrb1.addActionListener(new jrb1ActionListener());
			jrb2.addActionListener(new jrb2ActionListener());
			jrb3.addActionListener(new jrb3ActionListener());
			
			/* ID input textbox panel*/
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID:");
			uField = new JTextField(15);
			uField.setPreferredSize(new Dimension (15,25));
			uField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			uLabel.setFont(btn);
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(130));
			uBox.add(uField);
			
			/*PassWord input textbox panel*/
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord: ");
			pLabel.setFont(btn);
			pField = new JTextField(15);
			pField.setPreferredSize(new Dimension (15,25));
			pField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(74));
			pBox.add(pField);
			
			/*PassWord Confirm input textbox panel*/
			Box pcBox = Box.createHorizontalBox();
			JLabel pcLabel = new JLabel("PassWord Confirm:     ");
			pcLabel.setFont(btn);
			pcField = new JTextField(15);
			pcField.setPreferredSize(new Dimension (15,25));
			pcField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			pcBox.add(pcLabel);
			pcBox.add(pcField);
			
			
			/*Phone input textbox panel*/
			Box phBox = Box.createHorizontalBox();
			JLabel phLabel = new JLabel("Phone: ");
			phLabel.setFont(btn);
			phField = new JTextField(15);
			phField.setPreferredSize(new Dimension (15,25));
			phField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			phBox.add(phLabel);
			phBox.add(Box.createHorizontalStrut(100));
			phBox.add(phField);
			
			/*Email input textbox panel*/
			Box emBox = Box.createHorizontalBox();
			JLabel emLabel = new JLabel("Email: ");
			emLabel.setFont(btn);
			emField = new JTextField(15);
			emField.setPreferredSize(new Dimension (15,25));
			emField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			emBox.add(emLabel);
			emBox.add(Box.createHorizontalStrut(105));
			emBox.add(emField);
			
			/*button panel*/
			Box btnBox = Box.createHorizontalBox();
			JButton loginBtn = new JButton("OK");
			loginBtn.setBackground(new Color(242,215,146));
			loginBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
			
			loginBtn.setFont(btn);
			loginBtn.setName("loginBtn");
			loginBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);

			/*Page choose panel*/
			Box menuBox = Box.createHorizontalBox();
			JMenuBar jmb=new JMenuBar();
			JMenuItem jm1=new JMenuItem("Sign In");	
			jm1.setName("In");
			jm1.setFont(btn);
			jm1.setBackground(new Color(250,240,215));
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	
			jm2.setName("Up");
			jm2.setBackground(new Color(250,240,215));
			jm2.setFont(btn);
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);
			jmb.add(jm2);
			jmb.setBorder(BorderFactory.createLineBorder(new Color(242,215,146),0));
			menuBox.add(Box.createHorizontalStrut(125));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(125));
	
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(photoBox);
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(sBox);
			vBox.add(Box.createVerticalStrut(25));
			vBox.add(uBox);
			vBox.add(Box.createVerticalStrut(17));
			vBox.add(pBox);
			vBox.add(Box.createVerticalStrut(17));
			vBox.add(pcBox);
			vBox.add(Box.createVerticalStrut(17));
			vBox.add(phBox);
			vBox.add(Box.createVerticalStrut(17));
			vBox.add(emBox);
			vBox.add(Box.createVerticalStrut(50));
			vBox.add(btnBox);
			vBox.add(Box.createVerticalStrut(80));
			vBox.add(menuBox);
			jf.add(vBox);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

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
 
	
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String ID = uField.getText();
				UniqueID uId=new UniqueID(ID);
				int h=uId.Check();
				
				if(h!=0){
					Object[] options = { "OK" };
					JOptionPane.showOptionDialog(null, "ID exits.", "Message",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					
				}else{
						
						String PassWord = pField.getText();
						String PassWordCon = pcField.getText();
						if(!PassWord.equals(PassWordCon)){
							pcField.setText("NOT same as the password!");
						}else{				
							try {
								
								String Phone = phField.getText();
								String Email = emField.getText();
								System.out.print("One customer signs up.");		
								SignUpLog  t = new SignUpLog();
								t.write2file(ID+" "+sex+" "+PassWord+" "+Phone+" "+Email+" "+0+"\n");
								Object[] options = { "OK" };
								JOptionPane.showOptionDialog(null, "Sign Up Successfully!", "Message",
								JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
								
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					
				}
			
			
		}
	}

	private class jrb1ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				sex=1;
				logoIcon = new ImageIcon(new ImageIcon("image/girl.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
				photo.setIcon(logoIcon);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	private class jrb2ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				sex=2;
				logoIcon = new ImageIcon(new ImageIcon("image/boy.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
				photo.setIcon(logoIcon);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	private class jrb3ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				sex=3;
				logoIcon = new ImageIcon(new ImageIcon("image/secret.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
				photo.setIcon(logoIcon);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
 

	public static void main(String[] args) {
		new SignUp().init();
	}
}
