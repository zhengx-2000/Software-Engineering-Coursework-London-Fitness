
//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.border.EmptyBorder;
public class SignIn {
	private final JFrame jf = new JFrame("Sign In Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font btn = new Font("Georgia", Font.BOLD, 13);
	JTextField uField = new JTextField();
	JTextField pField = new JTextField();
	public	int state=0;//state 0=�ο�;1=��¼��ͨ��Ա;2=�¶�VIP;3=����VIP;4=���VIP
	
	
	
	public void init() {
		try {
			jf.getContentPane().setBackground(new Color(250,240,215));
			//��ȡ���Խ���
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//���ý��������ʾ
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//���ò���
			jf.setLayout(new FlowLayout());
			jf.setBackground(new Color(250,240,215));
			//�������
			Box vBox = Box.createVerticalBox();
			
			//photo��Ŀ
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/boy.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
			//�ڲ����������������ʹ��ռλ��������ͬ����
	        photoBox.add(Box.createHorizontalStrut(110));//photo��߿ճ�110�ľ���
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));//photo�ұ߱߿ճ�100�ľ���
			
			
			//ID��Ŀ
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID:                ");
			uLabel.setFont(btn);
			uField = new JTextField(25);
			uField.setPreferredSize(new Dimension (25,25));
			uField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			//�ڲ����������������ʹ��ռλ��������ͬ����
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(20));
			uBox.add(uField);
			
			//PassWord��Ŀ
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord:");
			pField = new JTextField(25);
			pLabel.setFont(btn);
			pField.setPreferredSize(new Dimension (25,25));
			pField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250,240,215)));
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(20));
			pBox.add(pField);
			
			//button��Ŀ
			Box btnBox = Box.createHorizontalBox();
			//����button�ͼ����¼�
			JButton loginBtn = new JButton("OK");
			loginBtn.setBackground(new Color(242,215,146));
			loginBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
			loginBtn.setName("loginBtn");//��¼״̬����������
			loginBtn.addActionListener(new MyActionListener());
			// JButton homeBtn = new JButton("Back");//�ο�״̬����������
			// homeBtn.setName("homeBtn");
			// homeBtn.setBackground(new Color(255,165,0));
			// homeBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
			// homeBtn.addActionListener(new MyActionListener());
			//btnBox.add(homeBtn);
			btnBox.add(loginBtn);
			btnBox.add(Box.createHorizontalStrut(0));
			
 
			//�˵���Ŀ
			Box menuBox = Box.createHorizontalBox();
			//���Ӳ˵���ͼ����¼�
			JMenuBar jmb=new JMenuBar();;	//����˵���
			JMenuItem jm1=new JMenuItem("Sign In");	
			jm1.setFont(btn);
			jm1.setBackground(new Color(250,240,215));
			jm1.setBounds(20, 5, 5, 1);
			jm1.setName("In");
			jmb.setBorder(BorderFactory.createLineBorder(new Color(242,215,146),0));
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	//�����˵�
			jm1.setBounds(30, 5, 5, 1);
			jm2.setName("Up");
			jm2.setFont(btn);
			jm2.setBackground(new Color(250,240,215));
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);	//�Ѳ˵����ӵ��˵�����
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(125));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(125));

			
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
 
	//�Զ���������menu
	public class ViewAction implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JMenuItem jmenu=(JMenuItem)event.getSource();//�����¼�Դ����
			String name=jmenu.getName();
			switch(name){
				case "In":
					new SignIn().init();//newһ��View�ಢ���������view����
					jf.setVisible(false);//�رմ��������Ǹ������ͼ
					break;
				//���������ͼ2
				case "Up":
					new SignUp().init();
					jf.setVisible(false);
				}
		}
	}
	
	//�Զ���������button
	private class MyActionListener implements ActionListener {		
		@Override
		public void actionPerformed(ActionEvent e) {	
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "loginBtn":
					String I=uField.getText();
					String P=pField.getText();
					IDcheck ch=new IDcheck(I,P);
					SaveID  t = new SaveID();
					t.write2file(I);
					try {
						int a=ch.Check();
						if(a!=0) {
							state=1;//���ø��û�״̬Ϊ��ͨ��¼�ο�
							//ʹ����Ϣ�Ի���
							JOptionPane.showMessageDialog(jf,"Login Sucessfully!");
							jf.setVisible(false);
							new Welcome();
							//��ת������
						}else {
							System.out.print(a);
							JOptionPane.showMessageDialog(jf,"Please input right ID&Password !");
						}
					
					}catch (Exception e1) {
						e1.printStackTrace();
					}
					break;
				case "homeBtn":
					//���ο�״̬��ת������
					break;
				default:
					break;
			}
		}
	}
 
	public static void main(String[] args) {
		
		new SignIn().init();
	}
}