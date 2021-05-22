import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * the GUI of membership selection
 * @author Jingyuan Tang
 * @version 3.2
 * @since 5/20/2021
 */

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
			//JPanel monthMember = new JPanel(new GridLayout(0,2));
			JPanel monthMember = new JPanel();
			JLabel month = new JLabel ("Monthly Membership: ");
			month.setFont(myFont2);
			monthMember.add(month);
			//add image
			JLabel monthlyPhoto = new JLabel();
	        ImageIcon Icon1 = new ImageIcon(new ImageIcon("image/month.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        monthlyPhoto.setIcon(Icon1);
			//
			JButton monthBut = new JButton("I want this");
			monthBut.setBackground(new Color(242,215,146));
			monthMember.setBackground(new Color(250,240,215));
			monthBut.setForeground(Color.white);
			monthBut.setFont(myFont2);
			monthMember.add(monthlyPhoto);
			monthMember.add(monthBut);
			monthBut.setName("monthBut");
			MonthlyBox.add(monthMember);
			monthBut.addActionListener(new newWindow());

			//quarterly栏目
			Box quarterlyBox = Box.createHorizontalBox();
			JPanel quarterMember = new JPanel();
			JLabel quarter = new JLabel ("Quarterly Membership: ");
			quarter.setFont(myFont2);
			quarterMember.add(quarter);
			//add image
			JLabel quarterlyPhoto = new JLabel();
	        ImageIcon Icon2 = new ImageIcon(new ImageIcon("image/quarter.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        quarterlyPhoto.setIcon(Icon2);
			JButton quarterBut = new JButton("I want this");
			quarterBut.setBackground(new Color(242,215,146));
			quarterMember.setBackground(new Color(250,240,215));
			quarterBut.setForeground(Color.white);
			
			quarterBut.setFont(myFont2);
			quarterMember.add(quarterlyPhoto);
			quarterMember.add(quarterBut);
			quarterBut.setName("quarterBut");
			quarterlyBox.add(quarterMember);
			quarterBut.addActionListener(new newWindow());

	        //yearly栏目
			Box yearlyBox = Box.createHorizontalBox();
			JPanel yearMember = new JPanel();
			JLabel year = new JLabel ("Yearly Membership: ");
			year.setFont(myFont2);
			yearMember.add(year);
			yearMember.setBackground(new Color(250,240,215));
			//add image
			JLabel yearlyPhoto = new JLabel();
	        ImageIcon Icon3 = new ImageIcon(new ImageIcon("image/year.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        yearlyPhoto.setIcon(Icon3);
			//
			JButton yearBut = new JButton("I want this");
			yearBut.setBackground(new Color(242,215,146));
			yearBut.setForeground(Color.white);
			yearBut.setFont(myFont2);
			yearMember.add(yearlyPhoto);
			yearMember.add(yearBut);
			yearBut.setName("yearBut");
			yearMember.add(yearBut);
			yearlyBox.add(yearMember);
			yearBut.addActionListener(new newWindow());
			
			
			//添加button和监听事件
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
			homeBtn.setFont(myFont2);
			homeBtn.setBackground(new Color(245,195,102));
			homeBtn.setForeground(Color.white);
			homeBtn.setName("back");
			homeBtn.addActionListener(new newWindow());

			vBox.add(Box.createVerticalStrut(15));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(MonthlyBox);
			vBox.add(Box.createVerticalStrut(60));
			vBox.add(quarterlyBox);
			vBox.add(Box.createVerticalStrut(60));
			vBox.add(yearlyBox);
			vBox.add(Box.createVerticalStrut(80));
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
					break;
				case "quarterBut":
					new paymentGUI().init(2);
					MembershipPage.setVisible(false);
					memberMatch.match(3,"01");
					break;
				case "yearBut":
					MembershipPage.setVisible(false);
					new paymentGUI().init(2);
					memberMatch.match(4,"01");
					break;
				case"back":
					MembershipPage.setVisible(false);
					new Welcome();
					break;
			}
		}
	}

	public static void main(String[] args) {
		new membershipGUI().init();
	}
}