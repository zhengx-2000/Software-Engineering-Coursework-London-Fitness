//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
 
public class SignUp {
	private final JFrame jf = new JFrame("Sign Up Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	JTextField uField=new JTextField();
	JTextField pField=new JTextField();
	JTextField pcField=new JTextField();
	JTextField phField=new JTextField();
	JTextField emField=new JTextField();
//	String ID="" ;
//	String PassWord="";
//	String PassWordCon="" ;
//	String Phone="";
//	String Email="";
	public void init() {
		
		try {
			//��ȡ���Խ���
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//���ý��������ʾ
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//�޸�ΪFlowLayout���֣����򴰿��е��������ݴ��ڴ�С�仯�ߴ�
			jf.setLayout(new FlowLayout());
			//������� ����Box
			Box vBox = Box.createVerticalBox();
			
			//photo��Ŀ
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/photo.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
			//�ڲ����������������ʹ��ռλ��������ͬ����
	        photoBox.add(Box.createHorizontalStrut(100));//photo��߿ճ�100�ľ���
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));//photo�ұ߱߿ճ�100�ľ���
			
			//sex��Ŀ
			Box sBox = Box.createHorizontalBox();
			JRadioButton jrb1=new JRadioButton("Female");			//������ѡ��
			JRadioButton jrb2=new JRadioButton("Male");
			JRadioButton jrb3=new JRadioButton("Secret");
			//�ڲ����������������ʹ��ռλ��������ͬ����
			ButtonGroup bg=new ButtonGroup();				//������ť��,����Ҫ�ѵ�ѡ����밴ť���������в���ʵ�ֵ�ѡ��������
			bg.add(jrb1);
			bg.add(jrb2);
			bg.add(jrb3);
			sBox.add(jrb1);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb2);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb3);
			
			//ID��Ŀ
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID:              ");
			uField = new JTextField(25);
			//�ڲ����������������ʹ��ռλ��������ͬ����
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(50));
			uBox.add(uField);
			
			//PassWord��Ŀ
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord:");
			pField = new JTextField(25);
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(50));
			pBox.add(pField);
			
			//PassWord Confirm��Ŀ
			Box pcBox = Box.createHorizontalBox();
			JLabel pcLabel = new JLabel("PassWord Confirm:");
			pcField = new JTextField(25);
			pcBox.add(pcLabel);
			pcBox.add(pcField);
			
			//Phone��Ŀ
			Box phBox = Box.createHorizontalBox();
			JLabel phLabel = new JLabel("Phone:      ");
			phField = new JTextField(25);
			phBox.add(phLabel);
			phBox.add(Box.createHorizontalStrut(50));
			phBox.add(phField);
			
			//Email��Ŀ
			Box emBox = Box.createHorizontalBox();
			JLabel emLabel = new JLabel("E-mail:      ");
			emField = new JTextField(25);
			emBox.add(emLabel);
			emBox.add(Box.createHorizontalStrut(50));
			emBox.add(emField);
			
			//button��Ŀ
			Box btnBox = Box.createHorizontalBox();
			//����button�ͼ����¼�
			JButton loginBtn = new JButton("OK");
			loginBtn.setName("loginBtn");//��¼״̬����������
			loginBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);
 
			//�˵���Ŀ
			Box menuBox = Box.createHorizontalBox();
			//���Ӳ˵���ͼ����¼�
			JMenuBar jmb=new JMenuBar();;	//����˵���
			JMenuItem jm1=new JMenuItem("Sign In");	//�����˵�
			jm1.setName("In");
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	//�����˵�
			jm2.setName("Up");
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);	//�Ѳ˵����ӵ��˵�����
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(125));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(125));
	

			vBox.add(Box.createVerticalStrut(30));
			vBox.add(photoBox);
			vBox.add(Box.createVerticalStrut(10));
			vBox.add(sBox);
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(uBox);
			vBox.add(Box.createVerticalStrut(12));
			vBox.add(pBox);
			vBox.add(Box.createVerticalStrut(12));
			vBox.add(pcBox);
			vBox.add(Box.createVerticalStrut(12));
			vBox.add(phBox);
			vBox.add(Box.createVerticalStrut(12));
			vBox.add(emBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(btnBox);
			vBox.add(Box.createVerticalStrut(70));
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
			
			//FileWriter out;
			try {
				String ID = uField.getText();//��ȡ�ı���������
				String PassWord = pField.getText();//��ȡ�ı���������
				String PassWordCon = pcField.getText();//��ȡ�ı���������
				String Phone = phField.getText();//��ȡ�ı���������
				String Email = pField.getText();//��ȡ�ı���������
				System.out.print("One customer signs up.");		
				SignUpLog  t = new SignUpLog();
				t.write2file(ID+" "+PassWord+" "+Phone+" "+Email+"\n");
				JOptionPane.showMessageDialog(jf, "Sign Up Successfully!");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
 
	public static void main(String[] args) {
		new SignUp().init();
	}
}