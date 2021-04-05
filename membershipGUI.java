
//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

public class membershipGUI {
	private final JFrame MembershipPage = new JFrame("Membership Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;


	public void init() {
		try {
			//获取登录界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			MembershipPage.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			MembershipPage.setResizable(false);
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			MembershipPage.setLayout(new FlowLayout());
			//添加组件
			Box vBox = Box.createVerticalBox();
			//标题栏
			Box reminderBox =Box.createHorizontalBox();
			JLabel note = new JLabel("Interests of Members");
			reminderBox.add(note);
			//Monthly栏目		
			Box MonthlyBox = Box.createHorizontalBox();
			JPanel monthMember = new JPanel(new GridLayout(0,3));
			JLabel month = new JLabel ("Monthly Membership: ");
			monthMember.add(month);
			JButton monthBut = new JButton("I want this");
			monthMember.add(monthBut);
			monthBut.setName("monthBut");
			MonthlyBox.add(monthMember);
			monthBut.addActionListener(new newWindow());

			//quarterly栏目
			Box quarterlyBox = Box.createHorizontalBox();
			JPanel quarterMember = new JPanel(new GridLayout(0,3));
			JLabel quarter = new JLabel ("Quarterly Membership: ");
			quarterMember.add(quarter);
			JButton quarterBut = new JButton("I want this");
			quarterMember.add(quarterBut);
			quarterBut.setName("quarterBut");
			quarterlyBox.add(quarterMember);
			quarterBut.addActionListener(new newWindow());

	        //yearly栏目
			Box yearlyBox = Box.createHorizontalBox();
			JPanel yearMember = new JPanel(new GridLayout(0,3));
			JLabel year = new JLabel ("Yearly Membership: ");
			yearMember.add(year);
			JButton yearBut = new JButton("I want this");
			yearMember.add(yearBut);
			yearBut.setName("yearBut");
			yearMember.add(yearBut);
			yearlyBox.add(yearMember);
			yearBut.addActionListener(new newWindow());
			
			
			//添加button和监听事件
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new newWindow());

			vBox.add(Box.createVerticalStrut(15));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(10));
			vBox.add(MonthlyBox);
			vBox.add(Box.createVerticalStrut(80));
			vBox.add(quarterlyBox);
			vBox.add(Box.createVerticalStrut(80));
			vBox.add(yearlyBox);
			vBox.add(Box.createVerticalStrut(100));
			vBox.add(homeBtn);
			MembershipPage.add(vBox);
			MembershipPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MembershipPage.setVisible(true);
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
				case "monthBut":
					new paymentGUI().init(2);
					MembershipPage.setVisible(false);

					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
					break;
				case "quarterBut":
					new paymentGUI().init(3);
					MembershipPage.setVisible(false);

					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
					break;
				case "yearBut":
					new paymentGUI().init(4);
					MembershipPage.setVisible(false);

					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
					break;
				case "homeBtn":
					MembershipPage.setVisible(false);
					new Welcome();
					break;
				default:
					break;
			}
		}
	}

	public static void main(String[] args) {
		new membershipGUI().init();
	}
}