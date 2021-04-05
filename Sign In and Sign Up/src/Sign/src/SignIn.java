//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
 
public class SignIn {
	private final JFrame jf = new JFrame("Sign In Page");
	final int WIDTH = 475;
	final int HEIGHT = 575;
	JTextField uField = new JTextField();
	JTextField pField = new JTextField();
	public	int state=0;//state 0=游客;1=登录普通人员;2=月度VIP;3=季度VIP;4=年度VIP
	
	
	
	public void init() {
		try {
			//获取电脑界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//设置布局
			jf.setLayout(new FlowLayout());
			//添加组件
			Box vBox = Box.createVerticalBox();
			
			//photo栏目
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/photo.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
			//在布局中添加组件，并使用占位符（以下同理）
	        photoBox.add(Box.createHorizontalStrut(110));//photo左边空出110的距离
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));//photo右边边空出100的距离
			
			
			//ID栏目
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID：              ");
			uField = new JTextField(25);
			//在布局中添加组件，并使用占位符（以下同理）
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(20));
			uBox.add(uField);
			
			//PassWord栏目
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord：");
			pField = new JTextField(25);
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
			btnBox.add(Box.createHorizontalStrut(40));
			btnBox.add(homeBtn);
 
			//菜单栏目
			Box menuBox = Box.createHorizontalBox();
			//添加菜单项和监听事件
			JMenuBar jmb=new JMenuBar();;	//定义菜单栏
			JMenuItem jm1=new JMenuItem("Sign In");	//创建菜单
			jm1.setBounds(20, 5, 5, 1);
			jm1.setName("In");
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	//创建菜单
			jm1.setBounds(30, 5, 5, 1);
			jm2.setName("Up");
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);	//把菜单添加到菜单栏中
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
 
	//自定义监听类对menu
	public class ViewAction implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JMenuItem jmenu=(JMenuItem)event.getSource();//创建事件源对象
			String name=jmenu.getName();
			switch(name){
				case "In":
					new SignIn().init();//new一个View类并调用里面的view函数
					jf.setVisible(false);//关闭穿进来的那个类的视图
					break;
				//如果按下视图2
				case "Up":
					new SignUp().init();
					jf.setVisible(false);
				}
		}
	}
	
	//自定义监听类对button
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
					try {
						int a=ch.Check();
						if(a!=0) {
							state=1;//设置该用户状态为普通登录游客
							//使用消息对话框
							JOptionPane.showMessageDialog(jf,"Login Sucessfully!");
							//跳转主界面
						}else {
							System.out.print(a);
							JOptionPane.showMessageDialog(jf,"Please input right ID&Password !");
						}
					
					}catch (Exception e1) {
						e1.printStackTrace();
					}
					break;
				case "homeBtn":
					//以游客状态跳转主界面
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