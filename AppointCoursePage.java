//page Appoint Course Page
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class AppointCoursePage {

	private final JFrame jf = new JFrame("Appoint Course Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Color color = new Color(242,215,146);
	
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
			
			//jf.setBackground(color);
			//设置字体格式
			Font font1 = new Font("Georgia", Font.BOLD, 13);
			Border boxMaxBorder = new EmptyBorder(50, 10, 30, 10);
/*			Border boxComboBoxBorder = new EmptyBorder(0, 0, 20, 0);
			Border boxTextBorder = new EmptyBorder(0, 20, 20, 20);
            Border labelBorder = new EmptyBorder(0, 0, 0, 0);
			//添加最大组件
			JPanel jp = new JPanel(); 
			jp.setBackground(color);
			jp.setLayout(new GridLayout(7,2));
*/			Box vBox = Box.createVerticalBox();//从左往右
			vBox.setBorder(boxMaxBorder);
			//vBox.setBackground(color);		
			
			//trainer栏目 JComboBox 设置题目和选项的内容、字体
			Box trainerBox = Box.createHorizontalBox();
			//trainerBox.setBackground(color);
			//trainerBox.setBorder(boxComboBoxBorder);
            JLabel trainerLabel = new JLabel("Trainer: ");
			//trainerLabel.setBorder(labelBorder);
			trainerLabel.setFont(font1);
			JComboBox<String> trainer = new JComboBox<String>();
			//trainer.setBorder(labelBorder);
			trainer.setFont(font1);
            trainer.addItem("Please choose...");
            trainer.addItem("trainer1");
            trainer.addItem("trainer2");
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox.add(Box.createVerticalStrut(10));
			trainerBox.add(trainerLabel);
			trainerBox.add(Box.createHorizontalStrut(20));
			trainerBox.add(trainer);
			trainerBox.add(Box.createVerticalStrut(10));
			
			//Time栏目
			Box timeBox = Box.createHorizontalBox();
			//timeBox.setBackground(color);
			//timeBox.setBorder(boxTextBorder);
			JLabel timeLabel = new JLabel("Time:    ");
			//timeLabel.setBorder(labelBorder);
			timeLabel.setFont(font1);
			JTextField timeField = new JTextField(15);
			//timeField.setBorder(labelBorder);
			timeField.setFont(font1);
			timeBox.add(Box.createHorizontalStrut(80));
			timeBox.add(timeLabel);
			timeBox.add(Box.createHorizontalStrut(20));
			timeBox.add(timeField);
			timeBox.add(Box.createHorizontalStrut(80));
			
            //Aim栏目 JComboBox
			Box aimBox = Box.createHorizontalBox();
			//aimBox.setBackground(color);
			//aimBox.setBorder(boxComboBoxBorder);
            JLabel aimLabel = new JLabel("Aim:       ");
			//aimLabel.setBorder(labelBorder);
			aimLabel.setFont(font1);
			JComboBox<String> aim = new JComboBox<String>();
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
			Box heightBox = Box.createHorizontalBox();
			//heightBox.setBackground(color);
			//heightBox.setBorder(boxComboBoxBorder);
            JLabel heightLabel = new JLabel("Height:  ");
			//heightLabel.setBorder(labelBorder);
			heightLabel.setFont(font1);
			JComboBox<String> height = new JComboBox<String>();
            //height.setBorder(labelBorder);
			height.setFont(font1);
			height.addItem("Please choose...");
            height.addItem("1.5 M");
            height.addItem("1.6 M");
			//在布局中添加组件，并使用占位符（以下同理）
			heightBox.add(Box.createVerticalStrut(10));
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(20));
			heightBox.add(height);
			heightBox.add(Box.createVerticalStrut(10));

            //weight栏目 JComboBox
            Box weightBox = Box.createHorizontalBox();
			//weightBox.setBackground(color);
			//weightBox.setBorder(boxComboBoxBorder);
            JLabel weightLabel = new JLabel("Weight:  ");
			//weightLabel.setBorder(labelBorder);
            weightLabel.setFont(font1);
			JComboBox<String> weight = new JComboBox<String>();
            weight.setFont(font1);
			//weight.setBorder(labelBorder);
			weight.addItem("Please choose...");
            weight.addItem("50kg-60kg");
            weight.addItem("60kg-70kg");
            //在布局中添加组件，并使用占位符（以下同理）
			weightBox.add(Box.createVerticalStrut(10));
            weightBox.add(weightLabel);
            weightBox.add(Box.createHorizontalStrut(20));
            weightBox.add(weight);
			weightBox.add(Box.createVerticalStrut(10));

			//remark栏目
			Box remarkBox = Box.createHorizontalBox();
			//remarkBox.setBorder(boxTextBorder);
			//remarkBox.setBackground(color);
			JLabel remarkLabel = new JLabel("Remark: ");
			//remarkLabel.setBorder(labelBorder);
			remarkLabel.setFont(font1);
			JTextField remarkField = new JTextField(30);
			//remarkField.setBorder(labelBorder);
			remarkField.setFont(font1);
			remarkBox.add(Box.createHorizontalStrut(70));
			//remarkBox.add(Box.createVerticalStrut(10));
			remarkBox.add(remarkLabel);
			remarkBox.add(Box.createHorizontalStrut(20));
			remarkBox.add(remarkField);
			//remarkBox.add(Box.createVerticalStrut(10));
			remarkBox.add(Box.createHorizontalStrut(70));


			Box menuBox = Box.createHorizontalBox();
			//���Ӳ˵���ͼ����¼�
			JMenuBar jmb=new JMenuBar();;	//����˵���
			JMenuItem jm1=new JMenuItem("Introduction for Trainer 	 |");
			jm1.setFont(font1);
			//jm1.setBounds(30, 490, 400, 30);
			jm1.setName("Trainer");
			jm1.addActionListener(new ViewAction());
			JMenuItem jm2=new JMenuItem(" Appoint a Course");
			jm2.setFont(font1);
			//jm2.setBounds(230, 490, 400, 30);
			jm2.setName("Appoint");
			jm2.addActionListener(new ViewAction());
			//jmb.add(Box.createHorizontalStrut(25));
			jmb.add(jm1);
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(50));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

            //button栏目
			Box btnBox = Box.createHorizontalBox();
			//btnBox.setBackground(color);
			//提交预约信息，转到支付界面。添加button和监听事件
			JButton loginBtn = new JButton("Submit");
			loginBtn.setBackground(color);
			loginBtn.setFont(font1);
			loginBtn.setName("submitBtn");//提交选择的教练信息
			loginBtn.addActionListener(new MyActionListener());
			
			//返回上一界面的button
			JButton homeBtn = new JButton("Back");
			homeBtn.setBackground(color);
			homeBtn.setFont(font1);
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new MyActionListener());
			btnBox.add(loginBtn);
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
			
	/*		jp.add(Box.createHorizontalStrut(30));
			jp.add(trainerBox);
			jp.add(Box.createVerticalStrut(30));
			jp.add(timeBox);
			jp.add(Box.createVerticalStrut(32));
			jp.add(aimBox);
			jp.add(Box.createVerticalStrut(30));
			jp.add(heightBox);
			jp.add(Box.createVerticalStrut(30));
			jp.add(weightBox);
			jp.add(Box.createVerticalStrut(30));
			jp.add(remarkBox);                        
			jp.add(Box.createVerticalStrut(30));
			jp.add(btnBox);
			jf.add(jp);
    */        
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
			jf.setVisible(true);//可见
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	//自定义监听类
	private class MyActionListener implements ActionListener {
		//@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				//提交选择的教练信息和预约信息，转到支付界面
				case "submitBtn":
					//使用消息对话框
					//JOptionPane.showMessageDialog(jf, "主界面");					
					new paymentGUI().init(1); 
					jf.setVisible(false);
					break;
				//back回到主界面
				case "homeBtn":
					new LivePersonalTrainingPage();
					//使用消息对话框
					//JOptionPane.showMessageDialog(jf, "主界面");
					jf.setVisible(false);
					break;
				default:
					break;
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

/*JComboBox是javax.swing.JComboBox。在SE7中声明为泛型。

javax.swing.JComboBox<类型>。
因此需要在实例化它时指明传入指定参数类型,不然就报类型不安全的warning了。


代码改成下面的就能正常运行了
...
JComboBox<String> comBox = new JComboBox<String>( );

comBox.addItem("123");*/