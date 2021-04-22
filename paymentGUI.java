
//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.imageio.ImageIO;

 
public class paymentGUI {
	private final JFrame paymentPage = new JFrame("Payment Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font myFont1 = new Font("Georgia", Font.BOLD, 15);
	Font myFont2 = new Font("Georgia", Font.BOLD, 12);
 
	public void init(int i) {
		try {
			paymentPage.getContentPane().setBackground(new Color(250,240,215));
			//获取登录界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			paymentPage.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			paymentPage.setResizable(false);
			//获取resources路径下的文件
//			InputStream stream = Resources.class.getResourceAsStream("/img/login.png");
			//JFrame设置icon
//			jf.setIconImage(ImageIO.read(stream));
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			paymentPage.setLayout(new FlowLayout());
			//添加组件
			Box vBox = Box.createVerticalBox();
			//标题栏
			Box reminderBox =Box.createHorizontalBox();
			JLabel note = new JLabel("Please Choose Payment Method");
			note.setFont(myFont1);

			reminderBox.add(note);
			//visa栏目		
			Box visaBox = Box.createHorizontalBox();
			JRadioButton selection1 = new JRadioButton("visa");
			selection1.setBackground(new Color(250,240,215));
			selection1.setFont(myFont2);
			visaBox.add(selection1);

			//visa photo栏目
			Box visaPhotoBox = Box.createHorizontalBox();
			JLabel visaPhoto = new JLabel();
	        ImageIcon visaIcon = new ImageIcon(new ImageIcon("image/visa.jpg").getImage().getScaledInstance(220, 130, Image.SCALE_SMOOTH));
	        visaPhoto.setIcon(visaIcon);

	        //paypal栏目
	        Box paypalBox = Box.createHorizontalBox();
			JRadioButton selection2 = new JRadioButton("PayPal");
			selection2.setBackground(new Color(250,240,215));
			selection2.setFont(myFont2);
			paypalBox.add(selection2);
			
			//buttongroup
			ButtonGroup bg=new ButtonGroup();
			bg.add(selection1);
			bg.add(selection2);
			
			//paypal photo栏目
			Box paypalPhotoBox = Box.createHorizontalBox();
			JLabel paypalPhoto = new JLabel();
	        ImageIcon paypalIcon = new ImageIcon(new ImageIcon("image/PayPal.jpeg").getImage().getScaledInstance(220, 130, Image.SCALE_SMOOTH));
	        paypalPhoto.setIcon(paypalIcon);
			//在布局中添加组件，并使用占位符（以下同理）
			visaPhotoBox.add(visaPhoto);
			visaPhotoBox.add(Box.createHorizontalStrut(10));
			paypalPhotoBox.add(paypalPhoto);
			paypalPhotoBox.add(Box.createHorizontalStrut(10));
			
			
			//button栏目
			Box btnBox = Box.createHorizontalBox();
			//添加button和监听事件
			JButton pay = new JButton("OK");
			pay.setBackground(new Color(255,206,95));
			pay.setForeground(Color.white);
			pay.setName("payTheBill");//登录状态返回主界面
			pay.setFont(myFont2);
			pay.addActionListener(new newWindow());
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
			homeBtn.setFont(myFont2);
			homeBtn.setBackground(new Color(255,206,95));
			homeBtn.setName("homeBtn");
			homeBtn.setForeground(Color.white);
			homeBtn.addActionListener(new newWindow());
			btnBox.add(pay);
			btnBox.add(Box.createHorizontalStrut(60));
			btnBox.add(homeBtn);
			
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(visaBox);
			vBox.add(Box.createVerticalStrut(5));
			vBox.add(visaPhotoBox);
			vBox.add(Box.createVerticalStrut(40));
			vBox.add(paypalBox);
			vBox.add(Box.createVerticalStrut(5));
			vBox.add(paypalPhotoBox);
			
			vBox.add(Box.createVerticalStrut(40));
			vBox.add(btnBox);
			paymentPage.add(vBox);
			paymentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			paymentPage.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	//自定义监听类
	private class newWindow implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "payTheBill":
					JOptionPane.showMessageDialog(paymentPage,"Payment Sucessfully!");
				break;
				case "homeBtn":
					System.out.print("llllll");
					new Welcome();
					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
				break;
				default:
					break;
			}
		}
	}
 
	public static void main(String[] args) {
		new paymentGUI().init(0);
	}
}