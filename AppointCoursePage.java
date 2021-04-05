//package Project;

//page Appoint Course Page
//import javax.annotation.Resources;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class AppointCoursePage {

	private final JFrame jf = new JFrame("Appoint Course Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	
	public AppointCoursePage(){
	
	//public void init() {
		try {
			//设置窗口界面大小
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置整个窗口界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);

			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new FlowLayout());
			
            //添加组件
			Box vBox = Box.createVerticalBox();//从左往右
						
			//trainer栏目
			Box trainerBox = Box.createHorizontalBox();
            JLabel trainerLabel = new JLabel("Trainer：");
			JComboBox<String> trainer = new JComboBox<String>();
            trainer.addItem("Please choose...");
            trainer.addItem("trainer1");
            trainer.addItem("trainer2");
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox.add(trainerLabel);
			trainerBox.add(Box.createHorizontalStrut(20));
			trainerBox.add(trainer);
			
			//Time栏目
			Box timeBox = Box.createHorizontalBox();
			JLabel timeLabel = new JLabel("Time：");
			JTextField timeField = new JTextField(15);
			timeBox.add(timeLabel);
			timeBox.add(Box.createHorizontalStrut(20));
			timeBox.add(timeField);
			
            //Aim栏目
			Box aimBox = Box.createHorizontalBox();
            JLabel aimLabel = new JLabel("Aim：");
			JComboBox<String> aim = new JComboBox<String>();
            aim.addItem("Please choose...");
            aim.addItem("lose weight");
            aim.addItem("Shape and Fitness");
			//在布局中添加组件，并使用占位符（以下同理）
			aimBox.add(aimLabel);
			aimBox.add(Box.createHorizontalStrut(20));
			aimBox.add(aim);
			
            //Height栏目
			Box heightBox = Box.createHorizontalBox();
            JLabel heightLabel = new JLabel("Height：");
			JComboBox<String> height = new JComboBox<String>();
            height.addItem("Please choose...");
            height.addItem("1.5 M");
            height.addItem("1.6 M");
			//在布局中添加组件，并使用占位符（以下同理）
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(20));
			heightBox.add(height);

            //weight栏目
            Box weightBox = Box.createHorizontalBox();
            JLabel weightLabel = new JLabel("Weight：");
            JComboBox<String> weight = new JComboBox<String>();
            weight.addItem("Please choose...");
            weight.addItem("50kg-60kg");
            weight.addItem("60kg-70kg");
            //在布局中添加组件，并使用占位符（以下同理）
            weightBox.add(weightLabel);
            weightBox.add(Box.createHorizontalStrut(20));
            weightBox.add(weight);

			//remark栏目
			Box remarkBox = Box.createHorizontalBox();
			JLabel remarkLabel = new JLabel("Remark：");
			JTextField remarkField = new JTextField(30);
			remarkBox.add(remarkLabel);
			remarkBox.add(Box.createHorizontalStrut(20));
			remarkBox.add(remarkField);

            //button栏目
			Box btnBox = Box.createHorizontalBox();
			//添加button和监听事件
			JButton loginBtn = new JButton("submit");
			loginBtn.setName("submitBtn");//提交选择的教练信息
			loginBtn.addActionListener(new MyActionListener());
			
			//返回上一界面的button
			JButton homeBtn = new JButton("Back");
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new MyActionListener());
			
			btnBox.add(loginBtn);
			btnBox.add(Box.createHorizontalStrut(80));
			btnBox.add(homeBtn);
            
            //将组件加入容器            
			vBox.add(Box.createVerticalStrut(30));
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
			vBox.add(btnBox);
            JPanel jp=new JPanel();
			jp.setBackground(Color.WHITE);
			jp.add(vBox);
			jf.add(jp);

			//vBox.setBackground(Color.WHITE);
			//jf.setBackground(Color.white);
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
				//提交选择的教练信息
				case "submitBtn":
					//使用消息对话框
					//JOptionPane.showMessageDialog(jf, "主界面");					
					new paymentGUI().init(1); 
					jf.setVisible(false);
					break;
				//back回到主界面
				case "homeBtn":
					new LivePersonalTrainingPage(); 
					//JOptionPane.showMessageDialog(jf, "主界面");
					jf.setVisible(false);
					break;
				default:
					break;
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