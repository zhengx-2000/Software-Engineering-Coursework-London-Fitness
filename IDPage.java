import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

public class IDPage {
	private final JFrame jf = new JFrame("IDPage");
	final int WIDTH = 475;
	final int HEIGHT = 625;
 
	public void init() {
		try {
			jf.getContentPane().setBackground(new Color(250,240,215));
			//获取登录界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new FlowLayout());
			//添加大组件
			Box vBox = Box.createVerticalBox();
			
			//Identity栏目
			Box oqBox = Box.createHorizontalBox();
			//Identity左栏目
			Box oq1Box = Box.createVerticalBox();
			ImageIcon imgID =new ImageIcon("image/photo.png");
			JLabel imageID =new JLabel();
			imageID.setIcon(imgID);
			oq1Box.add(imageID);
			oq1Box.add(Box.createHorizontalStrut(10));
			//Identity右栏目
			Box oq2Box = Box.createVerticalBox();
			JLabel idLabel = new JLabel("ID:**");
			JLabel pwLabel = new JLabel("PassWord:**");
			JLabel genderLabel = new JLabel("Gender:**");
			JLabel phoneLabel = new JLabel("Phone:**");
			JLabel emailLabel = new JLabel("E-mail:**");
			JLabel vipLabel = new JLabel("VIP:**");

			oq2Box.add(idLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			oq2Box.add(pwLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			oq2Box.add(genderLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			oq2Box.add(phoneLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			oq2Box.add(emailLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			oq2Box.add(vipLabel);
			oq2Box.add(Box.createVerticalStrut(10));
			
			oqBox.add(oq1Box);
			oq2Box.add(Box.createHorizontalStrut(15));
			oqBox.add(oq2Box);
			oq2Box.add(Box.createHorizontalStrut(15));
			
			//Physical States栏目
			Box psBox = Box.createHorizontalBox();
			JLabel cqLabel = new JLabel("Physical States                                                                    ");
			psBox.add(cqLabel);
			psBox.add(Box.createHorizontalStrut(10));
			//My Appointment栏目
			Box maBox = Box.createHorizontalBox();
			JLabel q1Label = new JLabel("My Appointment                             ");
			JButton goToLivebtn = new JButton("Go to live course");
			goToLivebtn.setName("goToLivebtn");
			goToLivebtn.addActionListener(new MyActionListener());
			maBox.add(q1Label);
			maBox.add(goToLivebtn);
			maBox.add(Box.createHorizontalStrut(10));
			//Videos Record栏目
			Box vdBox = Box.createHorizontalBox();
			JLabel q2Label = new JLabel("Videos Records                                                                    ");
			vdBox.add(q2Label);
			vdBox.add(Box.createHorizontalStrut(10));
			//My Concumption栏目
			Box mcBox = Box.createHorizontalBox();
			JLabel q3Label = new JLabel("My Consumption                                                                  ");
			mcBox.add(q3Label);
			mcBox.add(Box.createHorizontalStrut(10));
			//Back Button栏目
			Box btnBox = Box.createHorizontalBox();
			JButton backbtn = new JButton("Back");
			backbtn.setName("backbtn");
			backbtn.addActionListener(new MyActionListener());
			btnBox.add(backbtn);
			btnBox.add(Box.createHorizontalStrut(35));

			//添加小组件到大组件
			vBox.add(Box.createVerticalStrut(35));
			vBox.add(oqBox);
			vBox.add(Box.createVerticalStrut(35));
			vBox.add(psBox);
			vBox.add(Box.createVerticalStrut(35));
			vBox.add(maBox);
			vBox.add(Box.createVerticalStrut(35));
			vBox.add(vdBox);
			vBox.add(Box.createVerticalStrut(35));
			vBox.add(mcBox);
			vBox.add(Box.createVerticalStrut(35));
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
				case "goToLivebtn":
				{
					jf.setVisible(false);
					new liveCoursePage();
					break;
				}
				case "backbtn":
				{
					jf.setVisible(false);
					new Welcome();
					break;
				}
				default:
					break;
			}
		}
	}
 
	public static void main(String[] args) {
		new IDPage().init();
	}
}

