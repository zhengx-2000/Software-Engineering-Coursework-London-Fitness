//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
 
public class Login {
	private final JFrame jf = new JFrame("Sign In Page");
	final int WIDTH = 475;
	final int HEIGHT = 525;
 
	public void init() {
		try {
			//��ȡ���Խ���
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//���ý��������ʾ
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//��ȡresources·���µ��ļ�
//			InputStream stream = Resources.class.getResourceAsStream("/img/login.png");
			//JFrame����icon
//			jf.setIconImage(ImageIO.read(stream));
			//�޸�ΪFlowLayout���֣����򴰿��е��������ݴ��ڴ�С�仯�ߴ�
			jf.setLayout(new FlowLayout());
			//������
			Box vBox = Box.createVerticalBox();
			
			//photo��Ŀ
			
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/a.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
	
			
			JTextField uField1 = new JTextField(15);
			//�ڲ���������������ʹ��ռλ��������ͬ��
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(20));
			
			
			//ID��Ŀ
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID��              ");
			JTextField uField = new JTextField(15);
			//�ڲ���������������ʹ��ռλ��������ͬ��
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(20));
			uBox.add(uField);
			
			//PassWord��Ŀ
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord��");
			JTextField pField = new JTextField(15);
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(20));
			pBox.add(pField);
			
			//button��Ŀ
			Box btnBox = Box.createHorizontalBox();
			//���button�ͼ����¼�
			JButton loginBtn = new JButton("OK");
			loginBtn.setName("loginBtn");//��¼״̬����������
			loginBtn.addActionListener(new MyActionListener());
			JButton homeBtn = new JButton("Back");//�ο�״̬����������
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);
			btnBox.add(Box.createHorizontalStrut(80));
			btnBox.add(homeBtn);
 
			vBox.add(Box.createVerticalStrut(80));
			vBox.add(photoBox);
			vBox.add(Box.createVerticalStrut(50));
			vBox.add(uBox);
			vBox.add(Box.createVerticalStrut(12));
			vBox.add(pBox);
			vBox.add(Box.createVerticalStrut(50));
			vBox.add(btnBox);
			jf.add(vBox);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	//�Զ��������
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "loginBtn":
					//ʹ����Ϣ�Ի���
					//JOptionPane.showMessageDialog(jf, "������");
					//�Ե�¼״̬ȥ������
					break;
				case "homeBtn":
					//JOptionPane.showMessageDialog(jf, "������");
					//���ο�״̬ȥ������
					break;
				default:
					break;
			}
		}
	}
 
	public static void main(String[] args) {
		new Login().init();
	}
}