
//page Live Personal Training

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LivePersonalTrainingPage {
    private static final int LEFT = 0;
	private final JFrame jf = new JFrame("Live Personal Training Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	
	Font font1 = new Font("Georgia", Font.BOLD, 13);					//character format
	Font font2 = new Font("Georgia", Font.BOLD+ Font.ITALIC, 15);		//character format
	Color color = new Color(242,215,146);								//character color
	Color backgroundColor = new Color(250,240,215);						//background color
    String initialTextContent = "Please choose your aim first... ";		//original word in textArea
	
	//Image image = new ImageIcon("Img/ackground.jpg").getImage();// 这是背景图片 .png .jpg .gif 等格式的图片都可以
	//image.setImage(image.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));//这里设置图片大小，目前是20*20
	//Image iconBoy = (new ImageIcon("image/trainer_boy.jpg")).getImage();					//man trainer picture
	//iconBoy.setImage(iconBoy.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
	//private ImageIcon iconBoy = new ImageIcon("image/trainer_girl.jpg");
	//Image img =	iconBoy.getImage();
	//img = img.getScaledInstance(20,20,Image.SCALE_DEFAULT);
	//iconBoy.setImage(img);

	//iconBoy.setImage(iconBoy.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));

	//ImageIcon iconGirl = new ImageIcon("image/trainer_girl.jpg");		//girl trainer picture
    

	Box vBox = Box.createVerticalBox();									//添加总box
	//Box trainerBox = Box.createHorizontalBox();							//添加总tainerbox
	//Box trainerWordBox = Box.createVerticalBox();						//添加教练信息的部分
	//Box trainerPhotoBox = Box.createVerticalBox();						//添加教练照片部分
	
	JComboBox<String> aimComboBox = new JComboBox<String>();			//creates aim comboBox		
	//search button栏目
    Box searchBox = Box.createHorizontalBox();
	JPanel searchPanel = new JPanel();
	JLabel AimLabel = new JLabel("Aim:  ");
	JButton searchBtn = new JButton("Search");							//search trainer botton

	//trainer1栏目
	Box trainerBox1 = Box.createHorizontalBox();
	JPanel trainerPanel1 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel1 = new JLabel("Trainer1:    "+ "\n");       
	JTextArea trainerTextArea1 = new JTextArea(initialTextContent,6,30);
	//JLabel photoTrainerLabel1 = new JLabel(); 							// creates label for trainer photo
	Box trainerPhotoBox1 = Box.createVerticalBox();						//添加教练照片部分
	
	//trainer2栏目
	Box trainerBox2 = Box.createHorizontalBox();
	JPanel trainerPanel2 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel2 = new JLabel("Trainer2:    "+ "\n");
    JTextArea trainerTextArea2 = new JTextArea(initialTextContent,6,30);	
	
	//trainer3栏目
	Box trainerBox3 = Box.createHorizontalBox();
	JPanel trainerPanel3 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel3 = new JLabel("Trainer3:    "+ "\n");
	JTextArea trainerTextArea3 = new JTextArea(initialTextContent,6,30);
	//String aimContent = (String) aimComboBox.getSelectedItem();
	
	//Menu跳转教练和预约界面
	Box menuBox = Box.createHorizontalBox();
	JMenuBar jmb=new JMenuBar();				
	JMenuItem jm1=new JMenuItem("Introduction for Trainer 	 |");
	JMenuItem jm2=new JMenuItem(" Appoint a Course");

	JButton backBtn = new JButton("Back");								// back to main interface botton

	public LivePersonalTrainingPage(){
        try{
            //windows
			//set the size of windows
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//Sets the entire window interface to be centered
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			//不可以变size
            //jf.setResizable(false);
            //修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new GridLayout());
			jf.getContentPane().setBackground(backgroundColor);
                       
			//search button栏目
			//searchPanel声明和背景字体设置
			searchPanel.setFont(font1);
            searchPanel.setBackground(backgroundColor);			
			//AimLabel 声明和字体设置
			AimLabel.setFont(font1);			
			//item of aimComboBox
            aimComboBox.addItem("aim");    
            aimComboBox.addItem("Lose weight");
            aimComboBox.addItem("Shape and Fitness");					            
			//搜索按钮格式 ，添加button和监听事件
            searchBtn.setName("searchBtn");
			searchBtn.setFont(font1);
			searchBtn.setBackground(color);
			searchBtn.addActionListener(new MyActionListener()); 
			//searchPanel平面有aim标题，可选择的comboBox，和搜索按钮
            searchPanel.add(AimLabel);
            searchPanel.add(Box.createHorizontalStrut(40));
            searchPanel.add(aimComboBox);     
            searchPanel.add(Box.createHorizontalStrut(20));
			searchPanel.add(searchBtn);
			searchBox.add(searchPanel);
			searchBox.add(Box.createHorizontalStrut(50));
     
			//trainer1栏目	
			//trainerPanel1声明和背景字体设置
			trainerPanel1.setFont(font1);
            trainerPanel1.setBackground(backgroundColor);
			//trainerLabel1 声明和字体设置
			trainerLabel1.setFont(font2);
			//trainerTextArea1背景字体设置
			trainerTextArea1.setFont(font1);
            trainerTextArea1.setBackground(backgroundColor);
			//trainerPanel1有trainerLabel1和trainerTextArea1
			//trainerPanel1.add(Box.createVerticalStrut(30));
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel1.add(trainerLabel1);
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel1.add(trainerTextArea1);
			//设置教练照片
			//photoTrainerLabel1.setIcon(iconBoy);
			//photoTrainerLabel1.setVisible(true);
			//photoTrainerLabel1.setBounds(50, 50, 30, 30);
			//trainerPhotoBox1.add(photoTrainerLabel1);
            trainerBox1.add(trainerPanel1);
			//trainerBox1.add(trainerPhotoBox1);
			trainerBox1.add(Box.createHorizontalStrut(50));  

			//trainer2栏目
			//trainerPanel2声明和背景字体设置
			trainerPanel2.setFont(font1);
            trainerPanel2.setBackground(backgroundColor);

			//trainerLabel2 声明和字体设置
			trainerLabel2.setFont(font2);            

			//trainerTextArea2背景字体设置
			trainerTextArea2.setFont(font1);
            trainerTextArea2.setBackground(backgroundColor);

			//trainerPanel2有trainerLabel2和trainerTextArea2
			//trainerPanel2.add(Box.createVerticalStrut(30));
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel2.add(trainerLabel2);
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel2.add(trainerTextArea2);
			trainerBox2.add(trainerPanel2);  		
			trainerBox2.add(Box.createHorizontalStrut(50));

			//trainer3栏目
			//trainerPanel3声明和背景字体设置
			trainerPanel3.setFont(font1);
            trainerPanel3.setBackground(backgroundColor);

			//trainerLabel3 声明和字体设置
			trainerLabel3.setFont(font2);

			//trainerTextArea3背景字体设置
            trainerTextArea3.setFont(font1);
            trainerTextArea3.setBackground(backgroundColor);
			
			//trainerPanel1有trainerLabel1和trainerTextArea1
			//trainerPanel3.add(Box.createVerticalStrut(30));
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel3.add(trainerLabel3);
			//trainerPanel1.add(Box.createHorizontalStrut(30));
			trainerPanel3.add(trainerTextArea3);
            trainerBox3.add(trainerPanel3);
			trainerBox3.add(Box.createHorizontalStrut(50));
			
			//Menu跳转教练和预约界面
			jm1.setFont(font1);
			//jm1.setBounds(30, 490, 400, 30);
			jm1.setName("Trainer");
			jm1.addActionListener(new ViewAction());
			jm1.setBackground(backgroundColor);			
			jm2.setFont(font1);
			jm2.setBackground(backgroundColor);
			//jm2.setBounds(230, 490, 400, 30);
			jm2.setName("Appoint");
			jm2.addActionListener(new ViewAction());
			//jmb.add(Box.createHorizontalStrut(25));			
			jmb.add(jm1);
			jmb.add(jm2);			
			menuBox.add(Box.createHorizontalStrut(50));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

            //back button栏目
			Box backBox = Box.createHorizontalBox();
			//设背景和字体，添加button和监听事件
			backBtn.setName("backBtn");
			backBtn.setFont(font1);
			backBtn.setBackground(color);
			backBtn.addActionListener(new MyActionListener());
			backBox.add(backBtn);
			backBox.add(Box.createHorizontalStrut(80));
        /*
			ImageIcon icon1 = new ImageIcon("image/boy.jpg");
			JLabel photoTrainerLabel1 = new JLabel(); // creates label
			photoTrainerLabel1.setIcon(icon1);	
			trainerPhotoBox.add(photoTrainerLabel1); // creates a panel to put button on			
			photoTrainerLabel1.setVisible(true);
			ImageIcon icon2 = new ImageIcon("image/boy.jpg");
			JLabel photoTrainerLabel2 = new JLabel(); // creates label
			photoTrainerLabel2.setIcon(icon2);	
			trainerPhotoBox.add(photoTrainerLabel2); // creates a panel to put button on			
			photoTrainerLabel2.setVisible(true);
			ImageIcon icon3 = new ImageIcon("image/girl.jpg");
			JLabel photoTrainerLabel3 = new JLabel(); // creates label
			photoTrainerLabel3.setIcon(icon3);	
			trainerPhotoBox.add(photoTrainerLabel3); // creates a panel to put button on			
			photoTrainerLabel3.setVisible(true);
		*/	

		/*	trainerWordBox.add(Box.createVerticalStrut(20));
			trainerWordBox.add(trainerBox1);
			trainerWordBox.add(Box.createVerticalStrut(20));
			trainerWordBox.add(trainerBox2);
			trainerWordBox.add(Box.createVerticalStrut(20));
			trainerWordBox.add(trainerBox3);
			trainerBox.add(trainerWordBox);
			trainerBox.add(trainerPhotoBox);
            vBox.add(Box.createVerticalStrut(20));
		
			//将组件加到总box中
            vBox.add(searchBox);
			//Box trainerWordBox = Box.createVerticalBox();//添加教练信息的部分
			//Box trainerPhotoBox = Box.createVerticalBox();//添加教练照片部分
			//Box trainerBox = Box.createHorizontalBox();//添加总tainerbox
			//vBox.add(trainerBox);
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(menuBox);                    
            vBox.add(Box.createVerticalStrut(30));
            vBox.add(backBox);
            jf.add(vBox);		
		*/
           //将组件加入容器
            vBox.add(Box.createVerticalStrut(20));
            vBox.add(searchBox);
			//vBox.add(searchPanel);			
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox1);
			//vBox.add(trainerPanel1);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox2);
			//vBox.add(trainerPanel2);
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox3);
			//vBox.add(trainerPanel3);
			//photoBox
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(menuBox);                    
            vBox.add(Box.createVerticalStrut(30));
            vBox.add(backBox);
            jf.add(vBox);

            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭程序
            jf.setVisible(true);//可见

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //可用类似方法处理intro和appoint
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
            String aimContent = (String) aimComboBox.getSelectedItem();//选择的类型名字
			String fileName = "trainer.txt";
			ArrayList<String> trainerInfoList = new ArrayList<String>();

            if (button.equals(searchBtn)) {
				if (aimContent!="aim"){
					//先用file名字获取所有的trainer信息，存在trainerList中。再select对应aimType的教练信息存入trainerSelectList
					ArrayList<Entity_Trainer> trainerSelectList = new Control_SelectTrainer(aimContent, new Control_ReadFromFile(fileName).getTrainerList()).getTrainerSelectList();
						for(Entity_Trainer i : trainerSelectList) {
							String trainerInfo =i.getTrainerName() + "\n"+ 
							i.getTrainerLicense()+ "\n"+ i.getTrainerIntro();						
							trainerInfoList.add(trainerInfo);
						}

					/*
					ImageIcon icon1 = new ImageIcon("boy.jpg");
					JLabel photoTrainerLabel1 = new JLabel(); // creates label
					photoTrainerLabel1.setIcon(icon1);	
					trainerPhotoBox.add(photoTrainerLabel1); // creates a panel to put button on			
					photoTrainerLabel1.setVisible(true);
					ImageIcon icon2 = new ImageIcon("boy.jpg");
					JLabel photoTrainerLabel2 = new JLabel(); // creates label
					photoTrainerLabel2.setIcon(icon2);	
					trainerPhotoBox.add(photoTrainerLabel2); // creates a panel to put button on			
					photoTrainerLabel2.setVisible(true);
					ImageIcon icon3 = new ImageIcon("girl.jpg");
					JLabel photoTrainerLabel3 = new JLabel(); // creates label
					photoTrainerLabel3.setIcon(icon3);	
					trainerPhotoBox.add(photoTrainerLabel3); // creates a panel to put button on			
					photoTrainerLabel3.setVisible(true);
					*/
					trainerTextArea1.setText(trainerInfoList.get(0));
					trainerTextArea2.setText(trainerInfoList.get(1));				
					trainerTextArea3.setText(trainerInfoList.get(2));	//只显示三个人的信息
				}
			
/*							
					for(int i=0;i<=selectedTrainer.size();i++){
						String trainerInfo = selectedTrainer.get(i).getTrainerName() + "\n"+ 
						selectedTrainer.get(i).getTrainerLicense()+ "\n"+ selectedTrainer.get(i).getTrainerIntro();						
						trainerInfoList.add(trainerInfo);
					}
					trainerTextArea1.setText(trainerInfoList.get(0));
					trainerTextArea2.setText(trainerInfoList.get(1));
					//trainerTextArea3.setText("Sam\nGood body\nhave licence in looing weight\n");					
					trainerTextArea3.setText(trainerInfoList.get(2));	
				}			
                 if( aimContent=="Lose weight"){
                    String loseTrainer1 = "Sam\nGood at health diet\nhave licence in looing weight\n";
					String loseTrainer2 = "Jim\nGood at health diet\nhave licence in looing weight\n";
					String loseTrainer3 = "Tom\nGood at health diet\nhave licence in looing weight\n";
                    trainerTextArea1.setText(loseTrainer1);
					trainerTextArea2.setText(loseTrainer2);
					trainerTextArea3.setText(loseTrainer3);
                }else if(aimContent=="Shape and Fitness"){
					String shapeTrainer1 = "Sam\nGood body\nhave licence in looing weight\n";
					String shapeTrainer2 = "Jim\nGood body\nhave licence in looing weight\n";
					String shapeTrainer3 = "Tom\nGood body\nhave licence in looing weight\n";
                    trainerTextArea1.setText(shapeTrainer1);
					trainerTextArea2.setText(shapeTrainer2);
					trainerTextArea3.setText(shapeTrainer3);
                }*/
				else{
                    JOptionPane.showMessageDialog(jf,"Must choose a type");
					trainerTextArea1.setText(initialTextContent);
					trainerTextArea2.setText(initialTextContent);				
					trainerTextArea3.setText(initialTextContent);	
                }	                
            }	
				if (button.equals(backBtn)) {				
				jf.setVisible(false);				 
				new Welcome();				
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
