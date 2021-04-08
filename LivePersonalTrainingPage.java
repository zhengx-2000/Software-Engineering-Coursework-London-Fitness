//page Live Personal Training

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LivePersonalTrainingPage {
    private final JFrame jf = new JFrame("Live Personal Training Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Color color = new Color(242,215,146);
    
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
			Font font1 = new Font("Georgia", Font.BOLD, 13);

            //lose weight 标题
            Box loseWeightBox = Box.createVerticalBox();
            JLabel loseWeightLabel = new JLabel("Lose Weight", JLabel.CENTER);
			loseWeightLabel.setFont(font1);
			//loseWeightBox.add(Box.createHorizontalStrut(10));
			loseWeightBox.add(loseWeightLabel);
			//loseWeightBox.add(Box.createHorizontalStrut(10));

            //trainer1栏目
			Box trainerBox1 = Box.createHorizontalBox();//
			JLabel trainerLabel1 = new JLabel("trainer1:              "+ "\n");
			trainerLabel1.setFont(font1);
			JTextField trainerField1 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox1.add(Box.createHorizontalStrut(20));  
			trainerBox1.add(trainerLabel1);
			trainerBox1.add(trainerField1);
			trainerBox1.add(Box.createHorizontalStrut(20));  

            //trainer2栏目
			Box trainerBox2 = Box.createHorizontalBox();//
			JLabel trainerLabel2 = new JLabel("trainer2:              "+ "\n");
			trainerLabel2.setFont(font1);
			JTextField trainerField2 = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox2.add(Box.createHorizontalStrut(20));  
			trainerBox2.add(trainerLabel2);
			trainerBox2.add(trainerField2);
			trainerBox2.add(Box.createHorizontalStrut(20));

            //trainer3栏目
			Box trainerBox3 = Box.createHorizontalBox();//
			JLabel trainerLabel3 = new JLabel("trainer3:              "+ "\n");
			trainerLabel3.setFont(font1);
			JTextField trainerField3 = new JTextField(15);
			//在布局中添加组件，并使用占位符（以下同理）
			trainerBox3.add(Box.createHorizontalStrut(20));
			trainerBox3.add(trainerLabel3);
			trainerBox3.add(trainerField3);
			trainerBox3.add(Box.createHorizontalStrut(20));

            //Shape and Fitness 标题
            Box shapeAndFitnessBox = Box.createVerticalBox();
            JLabel shapeAndFitnessLabel = new JLabel("Shape and Fitness", JLabel.CENTER);
			shapeAndFitnessLabel.setFont(font1);
			shapeAndFitnessBox.add(shapeAndFitnessLabel);
			//shapeAndFitnessBox.add(Box.createHorizontalStrut(20));
            
            //trainer4栏目
			Box trainerBox4 = Box.createHorizontalBox();//
			JLabel trainerLabel4 = new JLabel("trainer1:              "+ "\n");
			trainerLabel4.setFont(font1);
			JTextField trainerField4 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox4.add(Box.createHorizontalStrut(20));
			trainerBox4.add(trainerLabel4);
			trainerBox4.add(trainerField4);
			trainerBox4.add(Box.createHorizontalStrut(20));
            
            //trainer5栏目
			Box trainerBox5 = Box.createHorizontalBox();//
			JLabel trainerLabel5 = new JLabel("trainer2:              "+ "\n");
			trainerLabel5.setFont(font1);
			JTextField trainerField5 = new JTextField(15);
			//在布局中添加组件，并使用占位符--保留行/列直间的位置（以下同理）
			trainerBox5.add(Box.createHorizontalStrut(20));
			trainerBox5.add(trainerLabel5);
			trainerBox5.add(trainerField5);
			trainerBox5.add(Box.createHorizontalStrut(20));
            
/*          //Introduction for Trainer Appoint a Course 标题
            Box IntroductionBox = Box.createVerticalBox();
            JLabel IntroductionLabel = new JLabel("Introduction for Trainer | Appoint a Course", JLabel.CENTER);
			IntroductionBox.add(IntroductionLabel);
*/			//IntroductionBox.add(Box.createHorizontalStrut(20));

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
			menuBox.add(Box.createHorizontalStrut(70));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

            //button栏目
			Box backBox = Box.createHorizontalBox();
			//添加button和监听事件
			JButton backBtn = new JButton("Back");//返回主界面
			backBtn.setName("backBtn");
			backBtn.setFont(font1);
			backBtn.setBackground(color);
			backBtn.addActionListener(new MyActionListener());
			backBox.add(backBtn);
			backBox.add(Box.createHorizontalStrut(80));
			//backBox.add(backBtn);
            
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
			vBox.add(menuBox);                        
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
        new LivePersonalTrainingPage();
    }
}