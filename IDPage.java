import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.EmptyBorder;

/**
 * A GUI for the ID page
 * @author Taowu Zhang
 * @version 5.0
 * @since 5/25/2021
 */

public class IDPage{
	
	private final JFrame jf = new JFrame("ID Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;

	String identity;
	String id;
	String iden1;
	String pw;
	String gen;
	String phone;
	String em;
	String vip;

	String iden2;
	String hei;
	String wei;
	String age;

	String userId;
	String trainingTime;
	String trainerName;
	String trainingAim;
	String height;
	String weight;
	String remark;

	/**
	 * Basic initialization method.
	 */
	public void Identity(){
	try {
		/* Get user's ID */
		GetID getid = new GetID();
		identity=getid.getID();

		/* Font used in the GUI */
		Font font1 = new Font("Georgia", Font.BOLD, 13);

		/**
		 *  Read the personal information in SignUpLog.txt
		 *  Including ID, gender, password, cell phone, email, VIP status
		 *  Store the matching information in the corresponding String
		 */
		BufferedReader reader1 = new BufferedReader(new FileReader("file/SignUpLog.txt"));
		String line1 = reader1.readLine();
		/* To read a line of personal information, separated by space into different parts */
		String[] dataParts1 = line1.split(" ");
		id = dataParts1[0];
		/* The transfer id is in the first line. */
		if (id.equals(identity)) {
			iden1 = dataParts1[0];
			gen = dataParts1[1];
			pw = dataParts1[2];
			phone = dataParts1[3];
			em = dataParts1[4];
			vip = dataParts1[5];
		}else{
			while (line1 != null) {
                line1 = reader1.readLine();
                dataParts1 = line1.split(" "); 
                id = dataParts1[0];
        /* The transfer id is in the other line */
                if(id.equals(identity)) {
                	iden1 = dataParts1[0];
                	gen = dataParts1[1];
                	pw = dataParts1[2];
                	phone = dataParts1[3];
                	em = dataParts1[4];
                	vip = dataParts1[5];
                	break;
            	}
            }
		}

		BufferedReader reader2 = new BufferedReader(new FileReader("file/PhysicalStates.txt"));
		String line2 = reader2.readLine();
		/* To read a line of physical states information, separated by space into different parts */
		String[] dataParts2 = line2.split(" ");
		hei = dataParts2[0];
		wei = dataParts2[1];
		age = dataParts2[2];


		CountLine countline = new CountLine();
		long index = countline.readLine("file/appointment.txt");

		BufferedReader reader3 = new BufferedReader(new FileReader("file/appointment.txt"));
		String line3 = reader3.readLine();
		/* To read a line of live course information, separated by space into different parts */
		String[] dataParts3 = line3.split(" ");
		id = dataParts3[0];
		/* The transfer id is in the first line. */
		if (id.equals(identity)) {
			userId = dataParts3[0];
			trainingTime = dataParts3[1];
			trainerName = dataParts3[2];
			trainingAim = dataParts3[3];
			height = dataParts3[4];
			weight = dataParts3[5];
			remark = dataParts3[6];
		}else{
			int count=1;
			for (;count<=(int)index-1; count++) {
				line3 = reader3.readLine();
                dataParts3 = line3.split(" "); 
                id = dataParts3[0];
        /* The transfer id is in the other line */
                if(id.equals(identity)) {
                	userId = dataParts3[0];
                	trainingTime = dataParts3[1];
                	trainerName = dataParts3[2];
                	trainingAim = dataParts3[3];
                	height = dataParts3[4];
					weight = dataParts3[5];
					remark = dataParts3[6];
                	break;
            	}
			}
			if (userId==null) {
				userId = "";
                trainingTime = "You haven't";
              	trainerName = "made an appointment.";
                trainingAim = "";
                height = "";
				weight = "";
				remark = "";
			}

		}

		/**
		 * Set the base of the page
		 */

		/* Background Color Settings */
		jf.getContentPane().setBackground(new Color(250,240,215));
		/* Gets the page size */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		/* Center the page */
		jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		jf.setResizable(false);
		/* Change the layout to FlowLayout, otherwise the components in the window will resize according to the window size */
		jf.setLayout(new FlowLayout());
		

		/**
		 * Put the Box in the Page
		 */

		/* Add an IDentityBox that holds all boxes */
		Box identityBox = Box.createVerticalBox();	
		
		/* Add Identity box */
		Box identityMostBox = Box.createHorizontalBox();
		/* Add Identity image box */
		Box identityImageBox = Box.createVerticalBox();
		switch(gen){
			case "0":{
				ImageIcon imageIcon =new ImageIcon("image/unknown.jpg");
				JLabel imageGender =new JLabel("  ");
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
			case "1":{
				ImageIcon imageIcon =new ImageIcon("image/boy.jpeg");
				JLabel imageGender =new JLabel("  ");
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
			case "2":{
				ImageIcon imageIcon =new ImageIcon("image/girl.jpeg");
				JLabel imageGender =new JLabel("  ");
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
		}	
		/* Add Identity info box */
		Box identityInfoBox = Box.createVerticalBox();
		JLabel identityLabel = new JLabel("ID: "+iden1);
		identityLabel.setFont(font1);
		JLabel passwordLabel = new JLabel("Password: "+pw.substring(0,1)+"***"+pw.substring(pw.length()-1,pw.length()));
		passwordLabel.setFont(font1);
		JLabel phoneLabel = new JLabel("Phone: "+phone);
		phoneLabel.setFont(font1);
		JLabel e_mailLabel = new JLabel("E-mail: "+em);
		e_mailLabel.setFont(font1);
		
		identityInfoBox.add(identityLabel);
		identityInfoBox.add(Box.createVerticalStrut(8));
		identityInfoBox.add(passwordLabel);
		identityInfoBox.add(Box.createVerticalStrut(8));
		switch(gen){
			case "0":{
				JLabel genderLabel = new JLabel("Gender: Unknown");
				genderLabel.setFont(font1);
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "1":{
				JLabel genderLabel = new JLabel("Gender: Male");
				genderLabel.setFont(font1);
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "2":{
				JLabel genderLabel = new JLabel("Gender: Female");
				genderLabel.setFont(font1);
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
		}
		identityInfoBox.add(phoneLabel);
		identityInfoBox.add(Box.createVerticalStrut(8));
		identityInfoBox.add(e_mailLabel);
		identityInfoBox.add(Box.createVerticalStrut(8));
		switch(vip){
			case "0":{
				JLabel vipLabel = new JLabel("VIP: Not upgraded to a member");
				vipLabel.setFont(font1);
				identityInfoBox.add(vipLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "1":{
				JLabel vipLabel = new JLabel("VIP: Not upgraded to a member");
				vipLabel.setFont(font1);
				identityInfoBox.add(vipLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "2":{
				JLabel vipLabel = new JLabel("VIP: Monthly Membership");
				vipLabel.setFont(font1);
				identityInfoBox.add(vipLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "3":{
				JLabel vipLabel = new JLabel("VIP: Quarterly Membership");
				vipLabel.setFont(font1);
				identityInfoBox.add(vipLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
			case "4":{
				JLabel vipLabel = new JLabel("VIP: Yearly Membership");
				vipLabel.setFont(font1);
				identityInfoBox.add(vipLabel);
				identityInfoBox.add(Box.createVerticalStrut(8));
				break;
			}
		}
		identityMostBox.add(identityImageBox);
		identityMostBox.add(identityInfoBox);
		
		identityImageBox.add(Box.createVerticalStrut(30));
		identityMostBox.add(Box.createHorizontalStrut(1));
			
		/* Add Physical State box 1 */
		Box physicalStateBox1 = Box.createVerticalBox();
		Box physicalStateMainBox = Box.createHorizontalBox();

		JLabel physicalStateLabel = new JLabel("Physical States                                                                  ");
		physicalStateLabel.setFont(font1);
		JButton alterPhysicalStates = new JButton("Change");
		alterPhysicalStates.setFont(font1);
		alterPhysicalStates.setName("alterPhysicalStates");
		alterPhysicalStates.addActionListener(new MyActionListener());
		alterPhysicalStates.setBackground(new Color(242,215,146));
		alterPhysicalStates.setBorder(new EmptyBorder(5,17,5,17));

		physicalStateMainBox.add(physicalStateLabel);
		physicalStateMainBox.add(alterPhysicalStates);
		physicalStateBox1.add(physicalStateMainBox);

		physicalStateMainBox.add(Box.createHorizontalStrut(1));
		physicalStateBox1.add(Box.createVerticalStrut(10));

		/* Add Physical State box 2 */
		Box physicalStateBox2 = Box.createHorizontalBox();
		Box physicalStateBlankBox = Box.createVerticalBox();
		Box physicalStateInfoBox = Box.createVerticalBox();

		JLabel physicalStateBlankLabel = new JLabel("                                  ");
		JLabel physicalStateInfoHeightLabel = new JLabel("Height: "+hei+"cm");
		physicalStateInfoHeightLabel.setFont(font1);
		JLabel physicalStateInfoWeightLabel = new JLabel("Weight: "+wei+"kg");
		physicalStateInfoWeightLabel.setFont(font1);
		JLabel physicalStateInfoAgeLabel = new JLabel("Age: "+age+" years old");
		physicalStateInfoAgeLabel.setFont(font1);

		physicalStateBlankBox.add(physicalStateBlankLabel);
		physicalStateInfoBox.add(physicalStateInfoHeightLabel);
		physicalStateInfoBox.add(Box.createVerticalStrut(8));
		physicalStateInfoBox.add(physicalStateInfoWeightLabel);
		physicalStateInfoBox.add(Box.createVerticalStrut(8));
		physicalStateInfoBox.add(physicalStateInfoAgeLabel);
		physicalStateInfoBox.add(Box.createVerticalStrut(8));
		physicalStateBox2.add(physicalStateBlankBox);
		physicalStateBox2.add(physicalStateInfoBox);

		physicalStateInfoBox.add(Box.createVerticalStrut(20));
		physicalStateBlankBox.add(Box.createVerticalStrut(20));
		physicalStateBox2.add(Box.createHorizontalStrut(1));


		/* Add Live Course box */
		Box liveCourseBox = Box.createVerticalBox();
		Box liveCourseMainBox = Box.createHorizontalBox();

		JLabel liveCourseLabel = new JLabel("Live Course                                                     ");
		liveCourseLabel.setFont(font1);
		JButton goToLiveButton = new JButton("Go to live course");
		goToLiveButton.setFont(font1);
		goToLiveButton.setName("goToLiveButton");
		goToLiveButton.addActionListener(new MyActionListener());
		goToLiveButton.setBackground(new Color(242,215,146));
		goToLiveButton.setBorder(new EmptyBorder(5,17,5,17));

		liveCourseMainBox.add(liveCourseLabel);
		liveCourseMainBox.add(goToLiveButton);
		liveCourseBox.add(liveCourseMainBox);

		liveCourseMainBox.add(Box.createHorizontalStrut(1));
		liveCourseBox.add(Box.createVerticalStrut(20));


		/* Add My Appointment box */
		Box myAppointmentBox = Box.createHorizontalBox();
		Box myAppointmentMainBox = Box.createVerticalBox();
		Box myAppointmentInfoBox = Box.createVerticalBox();
		JLabel myAppointmentLabel = new JLabel("My Appointment                    ");
		myAppointmentLabel.setFont(font1);

		if (trainingTime == "You haven't") {
			JLabel trainingTimeLabel = new JLabel(trainingTime);
			trainingTimeLabel.setFont(font1);
			JLabel trainingNameLabel = new JLabel(trainerName);
			trainingNameLabel.setFont(font1);

			myAppointmentMainBox.add(myAppointmentLabel);
			myAppointmentInfoBox.add(trainingTimeLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(trainingNameLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(40));
			myAppointmentBox.add(myAppointmentMainBox);
			myAppointmentBox.add(myAppointmentInfoBox);
		}else{
			JLabel trainingTimeLabel = new JLabel("Training Time: "+trainingTime);
			trainingTimeLabel.setFont(font1);
			JLabel trainingNameLabel = new JLabel("Trainning Name: "+trainerName);
			trainingNameLabel.setFont(font1);
			JLabel trainningAimLabel = new JLabel("Trainning Aim: "+trainingAim);
			trainningAimLabel.setFont(font1);
			JLabel heightAimLabel = new JLabel("Height Aim: "+height);
			heightAimLabel.setFont(font1);
			JLabel weightAimLabel = new JLabel("Weight Aim: "+weight);
			weightAimLabel.setFont(font1);
			JLabel remarkLabel = new JLabel("Remark: "+remark);
			remarkLabel.setFont(font1);

			myAppointmentMainBox.add(myAppointmentLabel);
			myAppointmentInfoBox.add(trainingTimeLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(trainingNameLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(trainningAimLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(heightAimLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(weightAimLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentInfoBox.add(remarkLabel);
			myAppointmentInfoBox.add(Box.createVerticalStrut(8));
			myAppointmentBox.add(myAppointmentMainBox);
			myAppointmentBox.add(myAppointmentInfoBox);
		}

		
		myAppointmentMainBox.add(Box.createVerticalStrut(170));
		myAppointmentInfoBox.add(Box.createVerticalStrut(40));
		myAppointmentBox.add(Box.createHorizontalStrut(1));


		/* Add Back Button box */
		Box buttonBox = Box.createHorizontalBox();
		JButton backButton = new JButton("Back");
		backButton.setFont(font1);
		backButton.setName("backButton");
		backButton.addActionListener(new MyActionListener());
		backButton.setBackground(new Color(242,215,146));
		backButton.setBorder(new EmptyBorder(5,17,5,17));
		buttonBox.add(backButton);
		buttonBox.add(Box.createHorizontalStrut(1));

		/* Add all boxes into identitybox */
		identityBox.add(identityMostBox);
		identityBox.add(physicalStateBox1);
		identityBox.add(physicalStateBox2);
		identityBox.add(liveCourseBox);
		identityBox.add(myAppointmentBox);
		identityBox.add(buttonBox);
		identityBox.add(Box.createVerticalStrut(20));

		/* Add identitybox into ID page */
		jf.add(identityBox);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
}


 
/**
 * Actions involved in the page.
 * @param e different actions
 */
private class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String name = button.getName();
		switch (name) {
			case "goToLiveButton":{
				jf.setVisible(false);
				new liveCoursePage();
				break;
			}
			case "backButton":{
				jf.setVisible(false);
				new Welcome();
				break;
			}
			case "alterPhysicalStates":{
				jf.setVisible(false);
				new PhysicalStatesPage();
				break;
			}
			default:
					break;
		}
	}
}
	/**
	 * A test main method.
	 * @param args nothing
	 */
	public static void main(String[] args) {
	new IDPage().Identity();
}

}

