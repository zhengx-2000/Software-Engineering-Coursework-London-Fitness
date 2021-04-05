//package zyjGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class digitalWorkOutVideosPage extends JFrame implements ActionListener{

	JLabel label1 = new JLabel("Videos");	//creates label
//	JLabel label2 = new JLabel("Test URL");
//	JLabel label3 = new JLabel("No. of probes");
//	JLabel label4 = new JLabel("Histogram");
//	JLabel label5 = new JLabel("X");
	JButton button = new JButton("Back");				//creates button
//	JTextField textField = new JTextField(23);				//creates textField
//	JTextField textField1 = new JTextField();
//	JTextField textField2 = new JTextField();
//	JTextField textField3 = new JTextField();
	JTextArea textArea1 = new JTextArea("Video Name:");		//creates textArea
	JTextArea textArea2 = new JTextArea("Video Name:");
	JTextArea textArea3 = new JTextArea("Video Name:");
	
	JComboBox type=new JComboBox();							//creates comboBox
	JComboBox complexity=new JComboBox();
//	ArrayList<String> middleOutput = new ArrayList<String>();					//creates a container to put strings in
//	ArrayList<Integer> RTT = new ArrayList<Integer>();							//creates a container for integers
	
	/**
	 * This method defines many panels
	 * and adds all the components
	 * to the framework.
	 * 
	 * @return Nothing.
	 */
	
		digitalWorkOutVideosPage() {										//constructor
		this.setLayout(null);	
		
		
		JPanel panel1 = new JPanel();						
		panel1.add(label1);									//creates a panel to put label1 on
		panel1.setBounds(250 , 0 , 100 , 100);					//sets the location of the panel
		
	
		
		
		JPanel panel2 = new JPanel();
//		panel3.add(label3);
		type.addItem("Type");    //�������б�������һ��
		type.addItem("HIIT");
		type.addItem("Yoga");
		type.addItem("Run");
		panel2.add(type);									//creates a panel to put label3 and comboBox on
		panel2.setBounds(50 , 100 , 200 , 100);				//sets the location of the pane3
		
	
		
		JPanel panel3 = new JPanel();						
		complexity.addItem("Complexity");    //�������б�������һ��
		complexity.addItem("Easy");
		complexity.addItem("moderate");
		complexity.addItem("Difficulty");
		panel3.add(complexity);									//creates a panel to put label3 and comboBox on
		panel3.setBounds(400 , 100 , 100 , 100);
	
		
		JPanel panel4 = new JPanel();
		button.addActionListener(this);						//adds an actionListener to the button
		panel4.add(button);									//creates a panel to put button on
		panel4.setBounds(250 , 800 , 100 , 100);				//sets the location of the pane4
		
		
		JPanel panel5 = new JPanel();
		panel5.add(textArea1);								//creates a panel to put textArea on
		panel5.setBounds(350 , 200 , 200 , 200);				//sets the location of the pane5
		
		JPanel panel6 = new JPanel();
		panel6.add(textArea2);								//creates a panel to put textArea on
		panel6.setBounds(350 , 400 , 200 , 200);
		
		JPanel panel7 = new JPanel();
		panel7.add(textArea3);								//creates a panel to put textArea on
		panel7.setBounds(350 , 600 , 200 , 200);
		
		
//		
//		JPanel panel6 = new JPanel();						//creates a panel
//		panel6.setLayout(new FlowLayout(FlowLayout.LEFT));	//sets the layout of the panel to be left-aligned
//		panel6.add(label4);									//puts label4 on panel6
//		panel6.setBounds(850 , 30 , 300 , 70);				//sets the location of the pane6
		
		
		this.add(panel1);									//add components to the frame
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		this.add(panel7);
//		this.add(textField1);
//		this.add(textField2);
//		this.add(textField3);
		this.setTitle("Digital WorkOut Videos Page");					//sets the title of the frame
		
		setLocation(500,100);								//sets the location of the frame
        setSize(600, 900);									//sets the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//sets default close operation
        setVisible(true);									//sets the visible
     
        
	}
		
		
		 public void actionPerformed(ActionEvent e){		//actionPerformed
	 			
			 String typeContent;																
			 typeContent = (String) type.getSelectedItem();		//gets the item selected in the comboBox
			 
			 String complexityContent;																
			 complexityContent = (String) complexity.getSelectedItem();	
			 
			 this.setVisible(false);

			 new Welcome();
			 
			 
			 
			 
			 
			 
			 
			 
			 
//			 ע�� �ڴ˴� ��Ҫ����֣���welcome ����ͬһ��class����
//			 ���滻�� ���波�Ե� test123
			 
			 
			 
			 
			 
			 
			 
//			 String inputAddress;
//			 inputAddress = textField.getText();			//gets the input address
		
//			
//			 try {
//				 
//				 
////				 getPing(inputAddress , number);			//calling method getPing()
//				
////				 welcome();							//calling method getHistogram()
//				 
////				 test123.changshiyixia();
//				 
//				 
////			} catch (IOException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			} catch (InterruptedException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			}
			 
		 }
		
		
		
		
		
		
		public static void main(String[] args) {
			new digitalWorkOutVideosPage();								//create a new object
			
		}

		
		
  }













































//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.InputStream;
//
//public class digitalWorkOutVideosPage {
//	
//	
//	private final JFrame jf = new JFrame("Digital WorkOut Videos Page");
//	final int WIDTH = 475;
//	final int HEIGHT = 525;
// 
//	public void init() {
//		try {
//			//��ȡ��¼����
//			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//			int sw = screenSize.width;
//			int sh = screenSize.height;
//			//���ý��������ʾ
//			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
//			jf.setResizable(false);
//			//��ȡresources·���µ��ļ�
////			InputStream stream = Resources.class.getResourceAsStream("/img/login.png");
//			//JFrame����icon
////			jf.setIconImage(ImageIO.read(stream));
//			//�޸�ΪFlowLayout���֣����򴰿��е��������ݴ��ڴ�С�仯�ߴ�
//			jf.setLayout(new FlowLayout());
//			//�������
//			Box vBox = Box.createVerticalBox();
//			
//			//photo��Ŀ
//			
//			Box photoBox = Box.createHorizontalBox();
//			JLabel photo = new JLabel();
//	        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/a.png").getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH));
//	        photo.setIcon(logoIcon);
//	
//			
//			JTextField uField1 = new JTextField(15);
//			//�ڲ����������������ʹ��ռλ��������ͬ����
//			photoBox.add(photo);
//			photoBox.add(Box.createHorizontalStrut(20));
//			
//			
//			//ID��Ŀ
//			Box uBox = Box.createHorizontalBox();
//			JLabel uLabel = new JLabel("ID��              ");
//			JTextField uField = new JTextField(15);
//			//�ڲ����������������ʹ��ռλ��������ͬ����
//			uBox.add(uLabel);
//			uBox.add(Box.createHorizontalStrut(20));
//			uBox.add(uField);
//			
//			//PassWord��Ŀ
//			Box pBox = Box.createHorizontalBox();
//			JLabel pLabel = new JLabel("PassWord��");
//			JTextField pField = new JTextField(15);
//			pBox.add(pLabel);
//			pBox.add(Box.createHorizontalStrut(20));
//			pBox.add(pField);
//			
//			//button��Ŀ
//			Box btnBox = Box.createHorizontalBox();
//			//����button�ͼ����¼�
//			JButton loginBtn = new JButton("OK");
//			loginBtn.setName("loginBtn");//��¼״̬����������
//			loginBtn.addActionListener(new MyActionListener());
//			JButton homeBtn = new JButton("Back");//�ο�״̬����������
//			homeBtn.setName("homeBtn");
//			homeBtn.addActionListener(new MyActionListener());
//			btnBox.add(loginBtn);
//			btnBox.add(Box.createHorizontalStrut(80));
//			btnBox.add(homeBtn);
// 
//			vBox.add(Box.createVerticalStrut(80));
//			vBox.add(photoBox);
//			vBox.add(Box.createVerticalStrut(50));
//			vBox.add(uBox);
//			vBox.add(Box.createVerticalStrut(12));
//			vBox.add(pBox);
//			vBox.add(Box.createVerticalStrut(50));
//			vBox.add(btnBox);
//			jf.add(vBox);
//			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			jf.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
// 
//	//�Զ��������
//	private class MyActionListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton button = (JButton) e.getSource();
//			String name = button.getName();
//			switch (name) {
//				case "loginBtn":
//					//ʹ����Ϣ�Ի���
//					//JOptionPane.showMessageDialog(jf, "������");
//					//�Ե�¼״̬ȥ������
//					break;
//				case "homeBtn":
//					//JOptionPane.showMessageDialog(jf, "������");
//					//���ο�״̬ȥ������
//					break;
//				default:
//					break;
//			}
//		}
//	}
// 
//	public static void main(String[] args) {
//		new digitalWorkOutVideosPage().init();
//	
//	
//	
//	
//	
//	
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
