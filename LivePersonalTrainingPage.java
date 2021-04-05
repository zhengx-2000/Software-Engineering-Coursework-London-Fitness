//package Project;
//page Live Personal Training

//import javax.annotation.Resources;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivePersonalTrainingPage {
    private final JFrame jf = new JFrame("Live Personal Training Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
    
	public LivePersonalTrainingPage(){
    //public void init() {
        try{
            //设置窗口界面大小
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//import java.awt.*;就可用了
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置整个窗口界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			//不可以变size
            //jf.setResizable(false);
            //修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new GridLayout());
            
            //添加组件
			Box vBox = Box.createVerticalBox();
            
            //lose weight 标题
            Box loseWeightBox = Box.createVerticalBox();
            JLabel loseWeightLabel = new JLabel("Lose Weight", JLabel.CENTER);
			loseWeightBox.add(loseWeightLabel);
			loseWeightBox.add(Box.createHorizontalStrut(20));

            //trainer1栏目
			Box trainerBox1 = Box.createVerticalBox();//从上往下
			JLabel trainerLabel1 = new JLabel("trainer1：              "+ "\n");
			JTextField trainerField1 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox1.add(trainerLabel1);
			trainerBox1.add(Box.createHorizontalStrut(20));
			trainerBox1.add(trainerField1);

            //trainer2栏目
			Box trainerBox2 = Box.createVerticalBox();//从上往下
			JLabel trainerLabel2 = new JLabel("trainer2：              "+ "\n");
			JTextField trainerField2 = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox2.add(trainerLabel2);
			trainerBox2.add(Box.createHorizontalStrut(20));
			trainerBox2.add(trainerField2);

            //trainer3栏目
			Box trainerBox3 = Box.createVerticalBox();//从上往下
			JLabel trainerLabel3 = new JLabel("trainer3：              "+ "\n");
			JTextField trainerField3 = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox3.add(trainerLabel3);
			trainerBox3.add(Box.createHorizontalStrut(20));
			trainerBox3.add(trainerField3);

            //Shape and Fitness 标题
            Box shapeAndFitnessBox = Box.createVerticalBox();
            JLabel shapeAndFitnessLabel = new JLabel("Shape and Fitness", JLabel.CENTER);
			shapeAndFitnessBox.add(shapeAndFitnessLabel);
			shapeAndFitnessBox.add(Box.createHorizontalStrut(20));
            
            //trainer4栏目
			Box trainerBox4 = Box.createVerticalBox();//从上往下
			JLabel trainerLabel4 = new JLabel("trainer1：              "+ "\n");
			JTextField trainerField4 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox4.add(trainerLabel4);
			trainerBox4.add(Box.createHorizontalStrut(20));
			trainerBox4.add(trainerField4);
            
            //trainer5栏目
			Box trainerBox5 = Box.createVerticalBox();//从上往下
			JLabel trainerLabel5 = new JLabel("trainer2：              "+ "\n");
			JTextField trainerField5 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox5.add(trainerLabel5);
			trainerBox5.add(Box.createHorizontalStrut(20));
			trainerBox5.add(trainerField5);
            
            //Introduction for Trainer Appoint a Course 标题
            Box IntroductionBox = Box.createVerticalBox();
            JLabel IntroductionLabel = new JLabel("Introduction for Trainer | Appoint a Course", JLabel.CENTER);
			IntroductionBox.add(IntroductionLabel);
			IntroductionBox.add(Box.createHorizontalStrut(20));

            //button栏目
			Box backBox = Box.createVerticalBox();
			//添加button和监听事件
			JButton backBtn = new JButton("Back");//返回主界面
			backBtn.setName("backBtn");
			backBtn.addActionListener(new MyActionListener());
			backBox.add(backBtn);
			//backBox.add(Box.createHorizontalStrut(80));
			backBox.add(backBtn);
            
            //将组件加入容器
            vBox.add(Box.createVerticalStrut(10));
            vBox.add(loseWeightBox);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox1);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox2);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox3);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(shapeAndFitnessBox);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox4);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox5);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(IntroductionBox);                        
            vBox.add(Box.createVerticalStrut(20));
            vBox.add(backBtn);
            jf.add(vBox);

            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭程序
            jf.setVisible(true);//可见
            //jf.pack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //可用类似方法处理intro和appoint
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			
			String name = button.getName();
			switch (name) {
				//case "loginBtn":
					//使用消息对话框
					//JOptionPane.showMessageDialog(jf, "主界面");
					//以登录状态去主界面
					//break;
				case "backBtn":
					//JOptionPane.showMessageDialog(jf, "主界面");
					//返回主界面
					new Welcome(); 
					jf.setVisible(false);
					break;
				default:
					break;
			}
		}
	}

    public static void main(String[] args) {
        new LivePersonalTrainingPage();
    }
}