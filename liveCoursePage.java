//package zyjGui;



	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;


	public class liveCoursePage extends JFrame implements ActionListener{

		JLabel label1 = new JLabel("Course Name");	//creates label
//		JLabel label2 = new JLabel("Test URL");
//		JLabel label3 = new JLabel("No. of probes");
//		JLabel label4 = new JLabel("Histogram");
//		JLabel label5 = new JLabel("X");
		JButton button1 = new JButton("Good");
		JButton button2 = new JButton("Back");				//creates button
//		JTextField textField = new JTextField(23);				//creates textField
//		JTextField textField1 = new JTextField();
//		JTextField textField2 = new JTextField();
//		JTextField textField3 = new JTextField();
		JTextArea textArea = new JTextArea("Live Window");		//creates textArea
		
//		JComboBox type=new JComboBox();							//creates comboBox
//		JComboBox complexity=new JComboBox();
//		ArrayList<String> middleOutput = new ArrayList<String>();					//creates a container to put strings in
//		ArrayList<Integer> RTT = new ArrayList<Integer>();							//creates a container for integers
		
		/**
		 * This method defines many panels
		 * and adds all the components
		 * to the framework.
		 * 
		 * @return Nothing.
		 */
		
		liveCoursePage() {										//constructor
			this.setLayout(null);	
			
			
			JPanel panel1 = new JPanel();						
			panel1.add(label1);									//creates a panel to put label1 on
			panel1.setBounds(100 , 0 , 400 , 200);					//sets the location of the panel
			
		
			
			
//			JPanel panel2 = new JPanel();
////			panel3.add(label3);
//			type.addItem("Type");    //�������б�������һ��
//			type.addItem("HIIT");
//			type.addItem("Yoga");
//			type.addItem("Run");
//			panel2.add(type);									//creates a panel to put label3 and comboBox on
//			panel2.setBounds(50 , 100 , 200 , 100);				//sets the location of the pane3
//			
//		
//			
//			JPanel panel3 = new JPanel();						
//			complexity.addItem("Complexity");    //�������б�������һ��
//			complexity.addItem("Easy");
//			complexity.addItem("moderate");
//			complexity.addItem("Difficulty");
//			panel3.add(complexity);									//creates a panel to put label3 and comboBox on
//			panel3.setBounds(400 , 100 , 100 , 100);
		
			
			JPanel panel2 = new JPanel();
//			button.addActionListener(this);						//adds an actionListener to the button
			panel2.add(button1);									//creates a panel to put button on
			panel2.setBounds(150 , 700 , 100 , 50);				//sets the location of the pane4
			
			JPanel panel3 = new JPanel();
			button2.addActionListener(this);						//adds an actionListener to the button
			panel3.add(button2);									//creates a panel to put button on
			panel3.setBounds(350 , 700 , 100 , 50);	
			
			
			
			JPanel panel4 = new JPanel();
			panel4.add(textArea);								//creates a panel to put textArea on
			panel4.setBounds(0 , 200 , 600 , 500);				//sets the location of the pane5
			
//			JPanel panel6 = new JPanel();
//			panel6.add(textArea2);								//creates a panel to put textArea on
//			panel6.setBounds(350 , 400 , 200 , 200);
//			
//			JPanel panel7 = new JPanel();
//			panel7.add(textArea3);								//creates a panel to put textArea on
//			panel7.setBounds(350 , 600 , 200 , 200);
			
			
//			
//			JPanel panel6 = new JPanel();						//creates a panel
//			panel6.setLayout(new FlowLayout(FlowLayout.LEFT));	//sets the layout of the panel to be left-aligned
//			panel6.add(label4);									//puts label4 on panel6
//			panel6.setBounds(850 , 30 , 300 , 70);				//sets the location of the pane6
			
			
			this.add(panel1);									//add components to the frame
			this.add(panel2);
			this.add(panel3);
			this.add(panel4);
//			this.add(panel5);
//			this.add(panel6);
//			this.add(panel7);
//			this.add(textField1);
//			this.add(textField2);
//			this.add(textField3);
			this.setTitle("Live Course Page");					//sets the title of the frame
			
			setLocation(500,100);								//sets the location of the frame
	        setSize(600, 900);									//sets the size of the frame
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//sets default close operation
	        setVisible(true);									//sets the visible
	     
	        
		}
		
		
		 public void actionPerformed(ActionEvent e){		//actionPerformed
	 			
//			 Integer number;																
//			 number = (Integer) cmb.getSelectedItem();		//gets the item selected in the comboBox
//			 String inputAddress;
//			 inputAddress = textField.getText();			//gets the input address
		
			 
		this.setVisible(false);	
		new Welcome();
			 
			 
			
			 
			 
			 
			 
//			 ע�� �ڴ˴� ��Ҫ����֣���welcome ����ͬһ��class����
//			 ���滻�� ���波�Ե� test123
			 
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
//			 try {
////				 
////				 
//////				 getPing(inputAddress , number);			//calling method getPing()
////				
//				 welcome();							//calling method getHistogram()
//
//				
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			 
		 }
		 
		//  public void changshiyixia()
		//  {
		// 	 System.out.println("hello");
		//  }
		
		
		
			
			public static void main(String[] args) {
				new liveCoursePage();								//create a new object
				
			}

			
			
	  }