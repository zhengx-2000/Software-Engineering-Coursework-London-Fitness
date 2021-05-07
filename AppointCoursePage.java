//page Appoint Course Page
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppointCoursePage {

	private String id;
	private final JFrame jf = new JFrame("Appoint Course Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Color color = new Color(242,215,146);
	Color backgroundColor = new Color(250,240,215);
	//设置字体格式
	Font font1 = new Font("Georgia", Font.BOLD, 13);

	Border boxMaxBorder = new EmptyBorder(50, 10, 30, 10);
	Box vBox = Box.createVerticalBox();//从左往右

	//trainer栏目 JComboBox
	Box trainerBox = Box.createHorizontalBox();
    JLabel trainerLabel = new JLabel("Trainer: ");
	JComboBox<String> trainer = new JComboBox<String>();
	
	//Time栏目
	Box timeBox = Box.createHorizontalBox();
	JLabel timeLabel = new JLabel("Time:    ");		
	JTextField timeField = new JTextField(15);
    //Aim栏目 JComboBox
	Box aimBox = Box.createHorizontalBox();
    JLabel aimLabel = new JLabel("Aim:       ");
	JComboBox<String> aim = new JComboBox<String>();
    //Height栏目 JComboBox
	Box heightBox = Box.createHorizontalBox();
    JLabel heightLabel = new JLabel("Height:  ");		
	JComboBox<String> heightComboBox = new JComboBox<String>();
	//weight栏目 JComboBox
	Box weightBox = Box.createHorizontalBox();
	JLabel weightLabel = new JLabel("Weight:  ");            
	JComboBox<String> weightComboBox = new JComboBox<String>();

	//remark栏目
	Box remarkBox = Box.createHorizontalBox();
	JLabel remarkLabel = new JLabel("Remark: ");		
	JTextField remarkField = new JTextField(30);
	
	Box menuBox = Box.createHorizontalBox();
	JMenuBar jmb=new JMenuBar();;
	JMenuItem jm1=new JMenuItem("Introduction for Trainer 	 ");
	JMenuItem jm2=new JMenuItem(" Appoint a Course");

	//button栏目
	Box btnBox = Box.createHorizontalBox();
	JButton submitBtn = new JButton("Submit");

	//返回上一界面的button
	JButton homeBtn = new JButton("Back");
	
	public AppointCoursePage(){

		try {
			//设置窗口界面大小
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置整个窗口界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setSize(WIDTH, HEIGHT);
			jf.setResizable(false);
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			//jf.setLayout(new FlowLayout());
			//GridLayout
			jf.setLayout(new GridLayout(1,0));
			jf.getContentPane().setBackground(backgroundColor);
			//jf.setBackground(color);

			//总box
			vBox.setBorder(boxMaxBorder);	
			
			//trainer栏目 JComboBox 设置题目和选项的内容、字体
			trainerLabel.setFont(font1);
			//trainer.setBorder(labelBorder);
			trainer.setFont(font1);
            trainer.addItem("Please choose...");
            trainer.addItem("trainer1");
            trainer.addItem("trainer2");
			trainer.addItem("trainer3");
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox.add(Box.createVerticalStrut(10));
			trainerBox.add(trainerLabel);
			trainerBox.add(Box.createHorizontalStrut(20));
			trainerBox.add(trainer);
			trainerBox.add(Box.createVerticalStrut(10));

			//Time栏目
			timeLabel.setFont(font1);
			//timeField.setBorder(labelBorder);
			timeField.setFont(font1);
			timeBox.add(Box.createHorizontalStrut(80));
			timeBox.add(timeLabel);
			timeBox.add(Box.createHorizontalStrut(20));
			timeBox.add(timeField);
			timeBox.add(Box.createHorizontalStrut(80));

			//Aim栏目 JComboBox
			aimLabel.setFont(font1);
            //aim.setBorder(labelBorder);
			aim.setFont(font1);
			aim.addItem("Please choose...");
            aim.addItem("lose weight");
            aim.addItem("Shape and Fitness");
			//在布局中添加组件，并使用占位符（以下同理）
			aimBox.add(Box.createVerticalStrut(10));
			aimBox.add(aimLabel);
			aimBox.add(Box.createHorizontalStrut(20));
			aimBox.add(aim);
			aimBox.add(Box.createVerticalStrut(10));
			
			//Height栏目 JComboBox
			heightLabel.setFont(font1);
            //height.setBorder(labelBorder);
			heightComboBox.setFont(font1);
			heightComboBox.addItem("Please choose...");
            heightComboBox.addItem("<1.5 M");
            heightComboBox.addItem("1.5-1.6M");
			heightComboBox.addItem("1.6-1.7M");
			heightComboBox.addItem("1.7-1.8M");
			heightComboBox.addItem("1.8-1.9M");
			heightComboBox.addItem(">1.9M");
			//在布局中添加组件，并使用占位符（以下同理）
			heightBox.add(Box.createVerticalStrut(10));
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(20));
			heightBox.add(heightComboBox);
			heightBox.add(Box.createVerticalStrut(10));

			//weight栏目 JComboBox
			weightLabel.setFont(font1);
            weightComboBox.setFont(font1);
			//weight.setBorder(labelBorder);
			weightComboBox.addItem("Please choose...");
			weightComboBox.addItem("<40kg");
			weightComboBox.addItem("40kg-50kg");
            weightComboBox.addItem("50kg-60kg");
            weightComboBox.addItem("60kg-70kg");
			weightComboBox.addItem("70kg-80kg");
			weightComboBox.addItem("80kg-90kg");
			weightComboBox.addItem(">90kg");
            //在布局中添加组件，并使用占位符（以下同理）
			weightBox.add(Box.createVerticalStrut(10));
            weightBox.add(weightLabel);
            weightBox.add(Box.createHorizontalStrut(20));
            weightBox.add(weightComboBox);
			weightBox.add(Box.createVerticalStrut(10));

			//remark栏目
			remarkLabel.setFont(font1);
			//remarkField.setBorder(labelBorder);
			remarkField.setFont(font1);
			remarkBox.add(Box.createHorizontalStrut(70));
			//remarkBox.add(Box.createVerticalStrut(10));
			remarkBox.add(remarkLabel);
			remarkBox.add(Box.createHorizontalStrut(20));
			remarkBox.add(remarkField);
			//remarkBox.add(Box.createVerticalStrut(10));
			remarkBox.add(Box.createHorizontalStrut(70));
			
			//Menu跳转教练和预约界面
			jm1.setFont(font1);
			//jm1.setBounds(30, 490, 400, 30);
			jm1.setName("Trainer");
			jm1.addActionListener(new ViewAction());
			jm1.setBackground(backgroundColor);

			jm2.setFont(font1);
			//jm2.setBounds(230, 490, 400, 30);
			jm2.setName("Appoint");
			jm2.addActionListener(new ViewAction());
			jm2.setBackground(backgroundColor);
			//jmb.add(Box.createHorizontalStrut(25));
			jmb.add(jm1);
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(50));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

			//button栏目
			//提交预约信息，转到支付界面。添加button和监听事件
			submitBtn.setBackground(color);
			submitBtn.setFont(font1);
			submitBtn.setName("submitBtn");//提交选择的教练信息
			submitBtn.addActionListener(new MyActionListener());
			
			//返回上一界面的button
			homeBtn.setBackground(color);
			homeBtn.setFont(font1);
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new MyActionListener());
			btnBox.add(submitBtn);
			btnBox.add(Box.createHorizontalStrut(80));
			btnBox.add(homeBtn);
            
            //将组件加入容器            
			vBox.add(Box.createHorizontalStrut(30));
			vBox.add(trainerBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(timeBox);
			vBox.add(Box.createVerticalStrut(32));
			vBox.add(aimBox);
            vBox.add(Box.createVerticalStrut(30));
			vBox.add(heightBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(weightBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(remarkBox);   
			vBox.add(Box.createVerticalStrut(30));        
			vBox.add(menuBox);               
            vBox.add(Box.createVerticalStrut(30));
			vBox.add(btnBox);
			jf.add(vBox);
			   
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
			jf.setVisible(true);//可见
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	public void getUserID(String id) {
		this.id = id;
	}

	//自定义监听类
	private class MyActionListener implements ActionListener {
		//@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			//String name = button.getName();
			//String fileName = "appoinrment.txt";
			String userId = "yyy";
			String trainerName = (String) trainer.getSelectedItem();//选择的类型名字
			String trainingTime = (String) timeField.getText();//选择的时间
			String aimContent = (String) aim.getSelectedItem();//选择的目标
			String height = (String) heightComboBox.getSelectedItem();//选择的身高
			String weight = (String) weightComboBox.getSelectedItem();//选择的体重
			String remark = (String) remarkField.getText();//评论

			ArrayList<String> AppointmentList = new ArrayList<String>();;	
	//userId trainingTime trainerName trainingAim height weight remark
	//yyy sss trainer1 lose weight 1.7-1.8M 80kg-90kg xxxx 
			if (button.equals(submitBtn)) {
				if (userId!=""&&remark!=""&&trainingTime!=""&&trainerName!="Please choose..."&&height!="Please choose..."&&weight!="Please choose..."){
					System.out.println(userId+trainerName+aimContent+height+weight+remark);
					AppointmentList.add(userId);
					AppointmentList.add(trainingTime);
					AppointmentList.add(trainerName);
					AppointmentList.add(aimContent);
					AppointmentList.add(height);
					AppointmentList.add(weight);
					AppointmentList.add(remark);
					new Control_WriteIntoFile(AppointmentList);
					new paymentGUI().init(1); 
					jf.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(jf,"Must fill all the infomation");
				}
			}

			if (button.equals(homeBtn)) {				
				jf.setVisible(false);				 
				new LivePersonalTrainingPage();				
			}

		}
	}
 
	public class ViewAction implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JMenuItem jmenu=(JMenuItem)event.getSource();
			String name=jmenu.getName();
			switch(name){
				case "Trainer":
					new LivePersonalTrainingPage();
					jf.setVisible(false);
					break;
				case "Appoint":
					new AppointCoursePage();
					jf.setVisible(false);
				}
		}
	}
	public static void main(String[] args) {
		new AppointCoursePage();
	}
}
