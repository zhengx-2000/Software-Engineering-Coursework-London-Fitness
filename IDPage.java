import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * A GUI for the ID page
 * @author Taowu Zhang
 * @version 2.0.1
 * @since 4/22/2021
 */

public class IDPage{
	
	private final JFrame jf = new JFrame("IDPage");
	final int WIDTH = 475;
	final int HEIGHT = 625;

	//String 	ID;
	String id;
	String iden;
	String pw;
	String gen;
	String phone;
	String em;
	String vip;


public void Identity(){
	try {

		/**
		 *  Read the personal information in SignUpLog.txt
		 *  Including ID, gender, password, cell phone, email, VIP status
		 *  Store the matching information in the corresponding String
		 */
		BufferedReader reader = new BufferedReader(new FileReader("SignUpLog.txt"));
		String line = reader.readLine();
		//To read a line of personal information, separated by space into different parts
		String[] dataParts = line.split(" ");
		id = dataParts[0];
		//The transfer id is in the first line.
		if (id.equals("aaa")) {
			iden = dataParts[0];
			gen = dataParts[1];
			pw = dataParts[2];
			phone = dataParts[3];
			em = dataParts[4];
			vip = dataParts[6];
		}else{
			while (line != null) {
                line = reader.readLine();
                dataParts = line.split(" "); 
                id = dataParts[0];
        //The transfer id is in the other line
                if(id.equals("bbb")) {
                	iden = dataParts[0];
                	gen = dataParts[1];
                	pw = dataParts[2];
                	phone = dataParts[3];
                	em = dataParts[4];
                	vip = dataParts[6];
                	break;
            	}
            }
		}
		reader.close();

		/**
		 * Set the base of the page
		 */

		//Background Color Settings
		jf.getContentPane().setBackground(new Color(250,240,215));
		//Gets the page size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
		//Center the page
		jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
		jf.setResizable(false);
		//Change the layout to FlowLayout, otherwise the components in the window will resize according to the window size
		jf.setLayout(new FlowLayout());
		

		/**
		 * Put the Box in the Page
		 */

		//Add an IDentityBox that holds all boxes
		Box identityBox = Box.createVerticalBox();	
		
		//Add Identity box
		Box identityMostBox = Box.createHorizontalBox();
		//Add Identity image box
		Box identityImageBox = Box.createVerticalBox();
		switch(gen){
			case "0":{
				ImageIcon imageIcon =new ImageIcon("image/photo.png");
				JLabel imageGender =new JLabel();
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
			case "1":{
				ImageIcon imageIcon =new ImageIcon("image/boy.jpeg");
				JLabel imageGender =new JLabel();
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
			case "2":{
				ImageIcon imageIcon =new ImageIcon("image/girl.jpeg");
				JLabel imageGender =new JLabel();
				imageGender.setIcon(imageIcon);
				identityImageBox.add(imageGender);
				identityImageBox.add(Box.createHorizontalStrut(10));
				break;
			}
		}	
		//Add Identity info box
		Box identityInfoBox = Box.createVerticalBox();
		JLabel identityLabel = new JLabel("ID:"+iden);
		JLabel passwordLabel = new JLabel("PassWord:"+pw);
		JLabel phoneLabel = new JLabel("Phone:"+phone);
		JLabel e_mailLabel = new JLabel("E-mail:"+em);
		JLabel vipLabel = new JLabel("VIP:"+vip);
		identityInfoBox.add(identityLabel);
		identityInfoBox.add(Box.createVerticalStrut(10));
		identityInfoBox.add(passwordLabel);
		identityInfoBox.add(Box.createVerticalStrut(10));
		switch(gen){
			case "0":{
				JLabel genderLabel = new JLabel("Gender: Unknown");
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(10));
				break;
			}
			case "1":{
				JLabel genderLabel = new JLabel("Gender: Male");
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(10));
				break;
			}
			case "2":{
				JLabel genderLabel = new JLabel("Gender: Female");
				identityInfoBox.add(genderLabel);
				identityInfoBox.add(Box.createVerticalStrut(10));
				break;
			}
		}
		identityInfoBox.add(phoneLabel);
		identityInfoBox.add(Box.createVerticalStrut(10));
		identityInfoBox.add(e_mailLabel);
		identityInfoBox.add(Box.createVerticalStrut(10));
		identityInfoBox.add(vipLabel);
		identityInfoBox.add(Box.createVerticalStrut(10));	
		identityMostBox.add(identityImageBox);
		identityInfoBox.add(Box.createHorizontalStrut(15));
		identityMostBox.add(identityInfoBox);
		identityInfoBox.add(Box.createHorizontalStrut(15));
			
		//Add Physical State box
		Box physicalStateBox = Box.createHorizontalBox();
		physicalState ps = new physicalState(" ","170","80","23");
		JLabel physicalStateLabel = new JLabel("Physical States                "+ps);
		physicalStateBox.add(physicalStateLabel);
		physicalStateBox.add(Box.createHorizontalStrut(10));

		//Add My Appointment box
		Box myAppointmentBox = Box.createHorizontalBox();
		JLabel myAppointmentLabel = new JLabel("Live Course                                     ");
		JButton goToLiveButton = new JButton("Go to live course");
		goToLiveButton.setName("goToLiveButton");
		goToLiveButton.addActionListener(new MyActionListener());
		myAppointmentBox.add(myAppointmentLabel);
		myAppointmentBox.add(goToLiveButton);
		myAppointmentBox.add(Box.createHorizontalStrut(10));

		//Add Live Course box
		Box liveCourseBox = Box.createHorizontalBox();
		JLabel liveCourseLabel = new JLabel("My Appointment                                                                    ");
		liveCourseBox.add(liveCourseLabel);
		liveCourseBox.add(Box.createHorizontalStrut(10));

		//Add My Consumption box
		Box myConsumptionBox = Box.createHorizontalBox();
		JLabel myConsumptionLabel = new JLabel("My Consumption                                                                  ");
		myConsumptionBox.add(myConsumptionLabel);
		myConsumptionBox.add(Box.createHorizontalStrut(10));

		//Add Back Button box
		Box buttonBox = Box.createHorizontalBox();
		JButton backButton = new JButton("Back");
		backButton.setName("backButton");
		backButton.addActionListener(new MyActionListener());
		buttonBox.add(backButton);
		buttonBox.add(Box.createHorizontalStrut(35));

		//Add all boxes into identitybox
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(identityMostBox);
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(physicalStateBox);
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(myAppointmentBox);
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(liveCourseBox);
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(myConsumptionBox);
		identityBox.add(Box.createVerticalStrut(35));
		identityBox.add(buttonBox);

		//Add identitybox into ID page
		jf.add(identityBox);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
}

/*public void getId(String id){
 		this.ID=id;
}*/
 
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
			default:
					break;
		}
	}
}
 
public static void main(String[] args) {
	new IDPage().Identity();
}

}

