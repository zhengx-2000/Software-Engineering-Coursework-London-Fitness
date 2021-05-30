
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

/**
 * Title : AppointCoursePage.java 
 * Description : This class is the GUI of the TrainerBooking page.
 * 
 * @author : Mengqi Chen
 * @date : 29/5/2021
 */

public class AppointCoursePage {

	/* Set the basic parameters of the interface. */
	public int sourcePage = 3;
	private final JFrame jf = new JFrame("Appoint Course Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	
	/* Set the font color and background color. */
	Color color = new Color(242,215,146);
	Color backgroundColor = new Color(250,240,215);
	
	/* Set the Font format. */
	Font font1 = new Font("Georgia", Font.BOLD, 13);

	Border boxMaxBorder = new EmptyBorder(50, 10, 30, 10);
	Box vBox = Box.createVerticalBox();

	/* Related components of trainer selection section. */
	Box trainerBox = Box.createHorizontalBox();
    JLabel trainerLabel = new JLabel("Trainer: ");
	JComboBox<String> trainerComboBox = new JComboBox<String>();
	
	/* Related components of training time section. */
	Box timeBox = Box.createHorizontalBox();
	JLabel timeLabel = new JLabel("Time:    ");		
	JComboBox<String> timeComboBox = new JComboBox<String>();

    /* Related components of training aim section. */
	Box aimBox = Box.createHorizontalBox();
    JLabel aimLabel = new JLabel("Aim:       ");
	JComboBox<String> aim = new JComboBox<String>();
	
	/* Related components of user's height and weight section. */
	Box heightBox = Box.createHorizontalBox();
    JLabel heightLabel = new JLabel("Height:  ");		
	JComboBox<String> heightComboBox = new JComboBox<String>();

	Box weightBox = Box.createHorizontalBox();
	JLabel weightLabel = new JLabel("Weight:  ");            
	JComboBox<String> weightComboBox = new JComboBox<String>();

	/* Related components of user's remark section. */
	Box remarkBox = Box.createHorizontalBox();
	JLabel remarkLabel = new JLabel("Remark: ");		
	JTextField remarkField = new JTextField(30);
	
	/* Related components of menuBox section. */
	Box menuBox = Box.createHorizontalBox();
	JMenuBar jmb=new JMenuBar();;
	JMenuItem jm1=new JMenuItem("Introduction for Trainer 	 |");
	JMenuItem jm2=new JMenuItem(" Appoint a Course");

	/* Related components of button section. */
	Box btnBox = Box.createHorizontalBox();
	JButton submitBtn = new JButton("Submit");
	JButton homeBtn = new JButton("Back");
	
	/**
	 * Build the GUI interface for the TrainerBooking page.
	 */
	public AppointCoursePage(){

		try {
			/* Set the size of the window interface. */
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setSize(WIDTH, HEIGHT);
			jf.setResizable(false);
			jf.setLayout(new GridLayout(1,0));
			jf.getContentPane().setBackground(backgroundColor);
			
			vBox.setBorder(boxMaxBorder);	
			
			/* Related components of trainer selection section. */
			trainerLabel.setFont(font1);
			trainerComboBox.setFont(font1);
            trainerComboBox.addItem("Please choose...");
            trainerComboBox.addItem("trainer1");
            trainerComboBox.addItem("trainer2");
			trainerComboBox.addItem("trainer3");
			trainerBox.add(Box.createVerticalStrut(10));
			trainerBox.add(trainerLabel);
			trainerBox.add(Box.createHorizontalStrut(20));
			trainerBox.add(trainerComboBox);
			trainerBox.add(Box.createVerticalStrut(10));

			/* Related components of training time section. */
			timeLabel.setFont(font1);
			timeComboBox.setFont(font1);
			timeComboBox.addItem("Please choose a time period ...");
			timeComboBox.addItem("8-12");
			timeComboBox.addItem("13-17");
			timeComboBox.addItem("18-21");
			timeBox.add(Box.createHorizontalStrut(80));
			timeBox.add(timeLabel);
			timeBox.add(Box.createHorizontalStrut(20));
			timeBox.add(timeComboBox);
			timeBox.add(Box.createHorizontalStrut(80));

			/* Related components of training aim section. */
			aimLabel.setFont(font1);
			aim.setFont(font1);
			aim.addItem("Please choose...");
            aim.addItem("lose weight");
            aim.addItem("Shape and Fitness");
			aimBox.add(Box.createVerticalStrut(10));
			aimBox.add(aimLabel);
			aimBox.add(Box.createHorizontalStrut(20));
			aimBox.add(aim);
			aimBox.add(Box.createVerticalStrut(10));
			
			/* Related components of user's height and weight section. */
			heightLabel.setFont(font1);
			heightComboBox.setFont(font1);
			heightComboBox.addItem("Please choose...");
            heightComboBox.addItem("<1.5M");
            heightComboBox.addItem("1.5-1.6M");
			heightComboBox.addItem("1.6-1.7M");
			heightComboBox.addItem("1.7-1.8M");
			heightComboBox.addItem("1.8-1.9M");
			heightComboBox.addItem(">1.9M");
			heightBox.add(Box.createVerticalStrut(10));
			heightBox.add(heightLabel);
			heightBox.add(Box.createHorizontalStrut(20));
			heightBox.add(heightComboBox);
			heightBox.add(Box.createVerticalStrut(10));

			weightLabel.setFont(font1);
            weightComboBox.setFont(font1);
			weightComboBox.addItem("Please choose...");
			weightComboBox.addItem("<40kg");
			weightComboBox.addItem("40kg-50kg");
            weightComboBox.addItem("50kg-60kg");
            weightComboBox.addItem("60kg-70kg");
			weightComboBox.addItem("70kg-80kg");
			weightComboBox.addItem("80kg-90kg");
			weightComboBox.addItem(">90kg");
			weightBox.add(Box.createVerticalStrut(10));
            weightBox.add(weightLabel);
            weightBox.add(Box.createHorizontalStrut(20));
            weightBox.add(weightComboBox);
			weightBox.add(Box.createVerticalStrut(10));

			/* Related components of user's remark section. */
			remarkLabel.setFont(font1);
			remarkField.setFont(font1);
			remarkBox.add(Box.createHorizontalStrut(70));
			remarkBox.add(remarkLabel);
			remarkBox.add(Box.createHorizontalStrut(20));
			remarkBox.add(remarkField);
			remarkBox.add(Box.createHorizontalStrut(70));
			
			/* Related components of menuBox section. */
			jm1.setFont(font1);
			jm1.setName("Trainer");
			jm1.addActionListener(new ViewAction());
			jm1.setBackground(backgroundColor);
			jm2.setFont(font1);
			jm2.setName("Appoint");
			jm2.addActionListener(new ViewAction());
			jm2.setBackground(backgroundColor);
			jmb.add(jm1);
			jmb.add(jm2);
			menuBox.add(Box.createHorizontalStrut(50));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

			/* Related components of button section. */
			submitBtn.setBackground(color);
			submitBtn.setFont(font1);
			submitBtn.setName("submitBtn");
			submitBtn.addActionListener(new MyActionListener());	//Adding listener events
			submitBtn.setBackground(new Color(242, 215, 146));
			submitBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
			
			homeBtn.setBackground(color);
			homeBtn.setFont(font1);
			homeBtn.setName("homeBtn");
			homeBtn.addActionListener(new MyActionListener());		//Adding listener events
			homeBtn.setBackground(new Color(242,215,146));
			homeBtn.setBorder(new EmptyBorder(5,17,5,17));
			btnBox.add(submitBtn);
			btnBox.add(Box.createHorizontalStrut(80));
			btnBox.add(homeBtn);
            
            /* Add each section to the Box. */        
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
			   
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	/**
	 * Action listener
	 * Click "Back” botton to return the introduction of trainers page, 
	 * or click “submit” botton to submit your order information and to the payment page. 
	 */
	private class MyActionListener implements ActionListener {
		//@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			
			/* get the information of the appointment and write into file. */ 
			GetID CurrentID = new GetID();			
			String userId = CurrentID.getID();
			String trainerName = (String) trainerComboBox.getSelectedItem();
			String trainingTime = (String)timeComboBox.getSelectedItem();
			String aimContent = (String) aim.getSelectedItem();
			String height = (String) heightComboBox.getSelectedItem();
			String weight = (String) weightComboBox.getSelectedItem();
			String remark = (String) remarkField.getText();
			int remarkLength = remarkField.getText().length();

			ArrayList<String> AppointmentList = new ArrayList<String>();;	

			if (button.equals(submitBtn)) {
				if (userId!=""&&remarkLength!=0&&trainingTime!=""&&trainerName!="Please choose..."&&height!="Please choose..."&&weight!="Please choose...")
				{
					AppointmentList.add(userId);
					AppointmentList.add(trainingTime);
					AppointmentList.add(trainerName);
					if(aimContent=="lose weight")
					{
						AppointmentList.add("lose_weight");
					}
					if(aimContent=="Shape and Fitness")
					{
						AppointmentList.add("Shape_and_Fitness");
					}
					AppointmentList.add(height);
					AppointmentList.add(weight);
					AppointmentList.add(remark);
					new Control_WriteIntoFile(AppointmentList);
					new membershipGUI().init(3); 
					jf.setVisible(false);
				}
				else{
					/* users must fill all information. */ 
					Object[] options ={ "OK" };  
					JOptionPane.showOptionDialog(jf,"Must fill all information","Message",JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				}
			}

			if (button.equals(homeBtn)) {				
				jf.setVisible(false);				 
				new LivePersonalTrainingPage();				
			}

		}
	}
 
	/**
	 * Action listener
	 * Click "Appoint a Course" to confirm the details of trainer booking order 
	 * or Click "Introduction for Trainer" to see the introduction of trainers . 
	 */
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
