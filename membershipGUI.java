import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
/**
 * the GUI of membership selection
 * @author Jingyuan Tang
 * @version 3.2
 * @since 5/20/2021
 */

public class membershipGUI {
	public int sourcePage;
	private final JFrame MembershipPage = new JFrame("Membership Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font myFont1 = new Font("Georgia", Font.BOLD, 15);
	Font myFont2 = new Font("Georgia", Font.BOLD, 12);
	membershipMatch memberMatch = new membershipMatch();
	membershipState mState = new membershipState();
	String id = new GetID().getID();

	public void init(int i) {
		sourcePage = i;
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

			//current state
			Box currentState = Box.createHorizontalBox();
			JPanel userInfor = new JPanel(new GridLayout(0,4));
			JLabel myID = new JLabel("id:");
			JLabel displayID = new JLabel(id);
			JLabel myState = new JLabel("Current State:");
			int s = mState.state();
			JLabel displayState = new JLabel(""+s);
			myID.setFont(myFont2);
			displayID.setFont(myFont2);
			myState.setFont(myFont2);
			displayState.setFont(myFont2);
			userInfor.add(myID);
			userInfor.add(displayID);
			userInfor.add(myState);
			userInfor.add(displayState);
			currentState.add(userInfor);
			userInfor.setSize(475, 20);
			userInfor.setBackground(new Color(250,234,183));

			//Monthly栏目		
			Box MonthlyBox = Box.createHorizontalBox();
			JPanel monthMember = new JPanel(new GridLayout(0,3));
			//JPanel monthMember = new JPanel();
			JLabel month = new JLabel ("Monthly Membership: ");
			month.setFont(myFont2);
			monthMember.add(month);
			//add image
			JPanel jPanel1=new JPanel(new BorderLayout());
			JLabel monthlyPhoto = new JLabel();
	        ImageIcon Icon1 = new ImageIcon(new ImageIcon("image/month.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        monthlyPhoto.setIcon(Icon1);
			monthlyPhoto.setHorizontalAlignment(SwingConstants.CENTER); 
			jPanel1.add(monthlyPhoto);
			//add Button
			JPanel butn1 = new JPanel(new FlowLayout());
			JButton monthBut = new JButton("I want this");
			monthBut.setBackground(new Color(242,215,146));
			butn1.setBackground(new Color(250,240,215));
			monthBut.setBorder(new EmptyBorder(5, 17, 5, 17));
			monthBut.setFocusPainted(false); 
			monthMember.setBackground(new Color(250,240,215));
			monthBut.setForeground(Color.white);
			monthBut.setFont(myFont2);
			butn1.add(monthBut);

			//add price tag
			JLabel price1 = new JLabel ("Price: $20 per month");
			price1.setFont(myFont2);
			//combined
			monthMember.add(monthlyPhoto);
			monthMember.add(price1);
			monthMember.add(butn1);
			monthBut.setName("monthBut");
			MonthlyBox.add(monthMember);
			monthBut.addActionListener(new newWindow());

			//quarterly栏目
			Box quarterlyBox = Box.createHorizontalBox();
			JPanel quarterMember = new JPanel(new GridLayout(0,3));
			JLabel quarter = new JLabel ("Quarterly Membership: ");
			quarter.setFont(myFont2);
			quarterMember.add(quarter);
			//add image
			JPanel jPanel2=new JPanel(new BorderLayout());
			JLabel quarterlyPhoto = new JLabel();
	        ImageIcon Icon2 = new ImageIcon(new ImageIcon("image/quarter.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        quarterlyPhoto.setIcon(Icon2);
			quarterlyPhoto.setHorizontalAlignment(SwingConstants.CENTER); 
			jPanel2.add(quarterlyPhoto);
			//add button
			JPanel butn2 = new JPanel(new FlowLayout());
			JButton quarterBut = new JButton("I want this");
			quarterBut.setBackground(new Color(242,215,146));
			butn2.setBackground(new Color(250,240,215));
			quarterMember.setBackground(new Color(250,240,215));
			quarterBut.setBorder(new EmptyBorder(5, 17, 5, 17));
			quarterBut.setForeground(Color.white);
			quarterBut.setFont(myFont2);
			butn2.add(quarterBut);
			///add price tag
			JLabel price2 = new JLabel ("Price: $50 per quarter");
			price2.setFont(myFont2);
			//
			quarterMember.add(quarterlyPhoto);
			quarterMember.add(price2);
			quarterMember.add(butn2);
			quarterBut.setName("quarterBut");
			quarterlyBox.add(quarterMember);
			quarterBut.addActionListener(new newWindow());

	        //yearly栏目
			Box yearlyBox = Box.createHorizontalBox();
			JPanel yearMember = new JPanel(new GridLayout(0,3));
			JLabel year = new JLabel ("Yearly Membership: ");
			year.setFont(myFont2);
			yearMember.add(year);
			yearMember.setBackground(new Color(250,240,215));
			//add image
			JPanel jPanel3=new JPanel(new BorderLayout());
			JLabel yearlyPhoto = new JLabel();
	        ImageIcon Icon3 = new ImageIcon(new ImageIcon("image/year.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	        yearlyPhoto.setIcon(Icon3);
			yearlyPhoto.setHorizontalAlignment(SwingConstants.CENTER); 
			jPanel3.add(yearlyPhoto);
			//add button
			JPanel butn3 = new JPanel(new FlowLayout());
			JButton yearBut = new JButton("I want this");
			butn3.add(yearBut);
			yearBut.setBackground(new Color(242,215,146));
			butn3.setBackground(new Color(250,240,215));
			yearBut.setForeground(Color.white);
			yearBut.setFont(myFont2);
			yearBut.setName("yearBut");
			yearBut.setBorder(new EmptyBorder(5, 17, 5, 17));
			//add price tag
			JLabel price3 = new JLabel ("Price: $180 per year");
			price3.setFont(myFont2);
			//combine
			yearMember.add(yearlyPhoto);
			yearMember.add(price3);
			yearMember.add(butn3);
			yearlyBox.add(yearMember);
			yearBut.addActionListener(new newWindow());
			
			
			//添加button和监听事件
			JButton homeBtn = new JButton("Back");//游客状态返回主界面
			homeBtn.setFont(myFont2);
			homeBtn.setBackground(new Color(245,195,102));
			homeBtn.setForeground(Color.white);
			homeBtn.setName("back");
			homeBtn.addActionListener(new newWindow());
			homeBtn.setBorder(new EmptyBorder(5, 17, 5, 17));

			vBox.add(Box.createVerticalStrut(15));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(15));
			vBox.add(currentState);
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(MonthlyBox);

			vBox.add(quarterlyBox);

			vBox.add(yearlyBox);
			vBox.add(Box.createVerticalStrut(20));
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
					new paymentGUI().init(sourcePage);
					MembershipPage.setVisible(false);
					memberMatch.match(2,id);
					break;
				case "quarterBut":
					new paymentGUI().init(sourcePage);
					MembershipPage.setVisible(false);
					memberMatch.match(3,id);
					break;
				case "yearBut":
					MembershipPage.setVisible(false);
					new paymentGUI().init(sourcePage);
					memberMatch.match(4,id);
					break;
				case"back":
					MembershipPage.setVisible(false);
					new Welcome();
					break;
			}
		}
	}

	public static void main(String[] args) {
		new membershipGUI().init(2);
	}
}