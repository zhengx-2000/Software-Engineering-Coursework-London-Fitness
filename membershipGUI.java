
//import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class membershipGUI {
	private final JFrame MembershipPage = new JFrame("Membership Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font myFont1 = new Font("Georgia", Font.BOLD, 15);
	Font myFont2 = new Font("Georgia", Font.BOLD, 12);
	membershipMatch memberMatch = new membershipMatch();

	String ID;
	public void saveId(String userID){
        this.ID = userID;
    }

	public void init() {
		try {
			//获取登录界面
			MembershipPage.getContentPane().setBackground(new Color(250,240,215));
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
			note.setFont(myFont1);
			reminderBox.add(note);
			//Monthly栏目		
			Box MonthlyBox = Box.createHorizontalBox();
			JPanel monthMember = new JPanel(new GridLayout(0,2));
			JLabel month = new JLabel ("Monthly Membership: ");
			month.setFont(myFont2);
			monthMember.setBackground(new Color(250,240,215));
			monthMember.add(month);

			/*JLabel monthIcon = new JLabel();
			ImageIcon monthP = new ImageIcon(new ImageIcon("image/monthly.JPEG").getImage().getScaledInstance(140, 90, Image.SCALE_SMOOTH));
			monthIcon.setIcon(monthP);
			monthMember.add(monthIcon);*/

			JButton monthBut = new JButton("I want this");
			monthBut.setFont(myFont2);
			monthBut.setBackground(new Color(116,96,77));
			monthBut.setForeground(Color.white);
			monthMember.add(monthBut);
			//monthBut.setSize(50, 20);

			monthBut.setName("monthBut");
			MonthlyBox.add(monthMember);
			monthBut.addActionListener(new newWindow());

			//quarterly栏目
			Box quarterlyBox = Box.createHorizontalBox();
			JPanel quarterMember = new JPanel(new GridLayout(0,2));
			JLabel quarter = new JLabel ("Quarterly Membership: ");
			quarter.setFont(myFont2);
			quarterMember.add(quarter);
			JButton quarterBut = new JButton("I want this");
			quarterBut.setBackground(new Color(81,59,39));
			quarterMember.setBackground(new Color(250,240,215));
			quarterBut.setForeground(Color.white);
			
			quarterBut.setFont(myFont2);
			quarterMember.add(quarterBut);
			quarterBut.setName("quarterBut");
			quarterlyBox.add(quarterMember);
			quarterBut.addActionListener(new newWindow());

	        //yearly栏目
			Box yearlyBox = Box.createHorizontalBox();
			JPanel yearMember = new JPanel(new GridLayout(0,2));
			JLabel year = new JLabel ("Yearly Membership: ");
			year.setFont(myFont2);
			yearMember.add(year);
			yearMember.setBackground(new Color(250,240,215));
			JButton yearBut = new JButton("I want this");
			yearBut.setBackground(new Color(116,96,77));
			yearBut.setForeground(Color.white);
			yearBut.setFont(myFont2);
			yearMember.add(yearBut);
			yearBut.setName("yearBut");
			yearMember.add(yearBut);
			yearlyBox.add(yearMember);
			yearBut.addActionListener(new newWindow());
			
			
			//添加button和监听事件
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
			homeBtn.setFont(myFont2);
			homeBtn.setBackground(new Color(255,206,95));
			homeBtn.setForeground(Color.white);
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new newWindow());

			vBox.add(Box.createVerticalStrut(15));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(40));
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
					memberMatch.match(2,"eee");

					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
					break;
				case "quarterBut":
					new paymentGUI().init(3);
					MembershipPage.setVisible(false);
					memberMatch.match(3,"01");

					//JOptionPane.showMessageDialog(jf, "主界面");
					//以游客状态去主界面
					break;
				case "yearBut":
					new paymentGUI().init(4);
					MembershipPage.setVisible(false);
					memberMatch.match(4,"01");

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