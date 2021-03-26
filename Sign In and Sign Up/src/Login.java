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
			//获取电脑界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//获取resources路径下的文件
//			InputStream stream = Resources.class.getResourceAsStream("/img/login.png");
			//JFrame设置icon
//			jf.setIconImage(ImageIO.read(stream));
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new FlowLayout());
			//添加组件
			Box vBox = Box.createVerticalBox();
			
			//photo栏目
			
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/a.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
	
			
			JTextField uField1 = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(20));
			
			
			//ID栏目
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID：              ");
			JTextField uField = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(20));
			uBox.add(uField);
			
			//PassWord栏目
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord：");
			JTextField pField = new JTextField(15);
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(20));
			pBox.add(pField);
			
			//button栏目
			Box btnBox = Box.createHorizontalBox();
			//添加button和监听事件
			JButton loginBtn = new JButton("OK");
			loginBtn.setName("loginBtn");//登录状态返回主界面
			loginBtn.addActionListener(new MyActionListener());
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
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
 
	//自定义监听类
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "loginBtn":
					//使用消息对话框
					//JOptionPane.showMessageDialog(jf, "主界面");
					//以登录状态去主界面
					break;
				case "homeBtn":
					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
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