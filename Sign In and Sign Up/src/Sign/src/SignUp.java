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
	private final JFrame jf = new JFrame("Sign In Page");
	final int WIDTH = 475;
	final int HEIGHT = 575;
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
			//获取电脑界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new FlowLayout());
			//添加组件 最大的Box
			Box vBox = Box.createVerticalBox();
			
			//photo栏目
			Box photoBox = Box.createHorizontalBox();
			JLabel photo = new JLabel();
	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/photo.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
	        photo.setIcon(logoIcon);
			//在布局中添加组件，并使用占位符（以下同理）
	        photoBox.add(Box.createHorizontalStrut(100));//photo左边空出100的距离
			photoBox.add(photo);
			photoBox.add(Box.createHorizontalStrut(100));//photo右边边空出100的距离
			
			//sex栏目
			Box sBox = Box.createHorizontalBox();
			JRadioButton jrb1=new JRadioButton("Female");			//创建单选框
			JRadioButton jrb2=new JRadioButton("Male");
			JRadioButton jrb3=new JRadioButton("Secret");
			//在布局中添加组件，并使用占位符（以下同理）
			ButtonGroup bg=new ButtonGroup();				//创建按钮组,必须要把单选框放入按钮组作用域中才能实现单选！！！！
			bg.add(jrb1);
			bg.add(jrb2);
			bg.add(jrb3);
			sBox.add(jrb1);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb2);
			sBox.add(Box.createHorizontalStrut(5));
			sBox.add(jrb3);
			
			//ID栏目
			Box uBox = Box.createHorizontalBox();
			JLabel uLabel = new JLabel("ID：              ");
			uField = new JTextField(25);
			//在布局中添加组件，并使用占位符（以下同理）
			uBox.add(uLabel);
			uBox.add(Box.createHorizontalStrut(50));
			uBox.add(uField);
			
			//PassWord栏目
			Box pBox = Box.createHorizontalBox();
			JLabel pLabel = new JLabel("PassWord：");
			pField = new JTextField(25);
			pBox.add(pLabel);
			pBox.add(Box.createHorizontalStrut(50));
			pBox.add(pField);
			
			//PassWord Confirm栏目
			Box pcBox = Box.createHorizontalBox();
			JLabel pcLabel = new JLabel("PassWord Confirm：");
			pcField = new JTextField(25);
			pcBox.add(pcLabel);
			pcBox.add(pcField);
			
			//Phone栏目
			Box phBox = Box.createHorizontalBox();
			JLabel phLabel = new JLabel("Phone：");
			phField = new JTextField(25);
			phBox.add(phLabel);
			phBox.add(Box.createHorizontalStrut(50));
			phBox.add(phField);
			
			//Email栏目
			Box emBox = Box.createHorizontalBox();
			JLabel emLabel = new JLabel("E-mail：");
			emField = new JTextField(25);
			emBox.add(emLabel);
			emBox.add(Box.createHorizontalStrut(50));
			emBox.add(emField);
			
			//button栏目
			Box btnBox = Box.createHorizontalBox();
			//添加button和监听事件
			JButton loginBtn = new JButton("OK");
			loginBtn.setName("loginBtn");//登录状态返回主界面
			loginBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);
 
			//菜单栏目
			Box menuBox = Box.createHorizontalBox();
			//添加菜单项和监听事件
			JMenuBar jmb=new JMenuBar();;	//定义菜单栏
			JMenuItem jm1=new JMenuItem("Sign In");	//创建菜单
			jm1.setName("In");
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem("Sign Up");	//创建菜单
			jm2.setName("Up");
			jm2.addActionListener(new ViewAction());
			jmb.add(jm1);	//把菜单添加到菜单栏中
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
			
			//FileWriter out;
			try {
				String ID = uField.getText();//获取文本框中内容
				String PassWord = pField.getText();//获取文本框中内容
				String PassWordCon = pcField.getText();//获取文本框中内容
				String Phone = phField.getText();//获取文本框中内容
				String Email = pField.getText();//获取文本框中内容
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