
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

/**
 * Title : LivePersonalTrainingPage.java 
 * Description : This class is the GUI of the introduction of trainer page.
 * 
 * @author : Mengqi Chen
 * @since : 29/5/2021
 */

public class LivePersonalTrainingPage {
    
	/* Set the basic parameters of the interface. */
	private static final int LEFT = 0;
	private final JFrame jf = new JFrame("Live Personal Training Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	
	Font font1 = new Font("Georgia", Font.BOLD, 13);					//character format
	Font font2 = new Font("Georgia", Font.BOLD+ Font.ITALIC, 15);		//character format
	Color color = new Color(242,215,146);								//character color
	Color backgroundColor = new Color(250,240,215);						//background color
    String initialTextContent = "Please choose your aim first... ";		//original word in textArea

	Box vBox = Box.createVerticalBox();	
	
	JComboBox<String> aimComboBox = new JComboBox<String>();			//creates aim comboBox		
	
	/* ssearch trainer botton. */
    Box searchBox = Box.createHorizontalBox();
	JPanel searchPanel = new JPanel();
	JLabel AimLabel = new JLabel("Aim:  ");
	JButton searchBtn = new JButton("Search");							

	/* Related components of trainer1 section. */
	Box trainerBox1 = Box.createHorizontalBox();
	JPanel trainerPanel1 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel1 = new JLabel("Trainer1:    "+ "\n");       
	JTextArea trainerTextArea1 = new JTextArea(initialTextContent,6,30);

	Box trainerPhotoBox1 = Box.createVerticalBox();	

	/* Related components of trainer2 section. */
	Box trainerBox2 = Box.createHorizontalBox();
	JPanel trainerPanel2 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel2 = new JLabel("Trainer2:    "+ "\n");
    JTextArea trainerTextArea2 = new JTextArea(initialTextContent,6,30);	
	
	/* Related components of trainer3 section. */
	Box trainerBox3 = Box.createHorizontalBox();
	JPanel trainerPanel3 = new JPanel(new FlowLayout(LEFT,20,20));
	JLabel trainerLabel3 = new JLabel("Trainer3:    "+ "\n");
	JTextArea trainerTextArea3 = new JTextArea(initialTextContent,6,30);
	
	/* Related components of menuBox section. */
	Box menuBox = Box.createHorizontalBox();
	JMenuBar jmb=new JMenuBar();				
	JMenuItem jm1=new JMenuItem("Introduction for Trainer 	 |");
	JMenuItem jm2=new JMenuItem(" Appoint a Course");
	
	/* Related components of button section. */
	Box backBox = Box.createHorizontalBox();
	JButton backBtn = new JButton("Back");

	/**
	 * Build the GUI interface for the introduction of trainer page.
	 */
	public LivePersonalTrainingPage(){
        try{
			/* Set the size of the window interface. */
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//Sets the entire window interface to be centered
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setLayout(new GridLayout());
			jf.getContentPane().setBackground(backgroundColor);
                       
			/* Related components of searching training aim section. */
			searchPanel.setFont(font1);
            searchPanel.setBackground(backgroundColor);			
			AimLabel.setFont(font1);			
            aimComboBox.addItem("aim");    
            aimComboBox.addItem("Lose weight");
            aimComboBox.addItem("Shape and Fitness");					            
            searchBtn.setName("searchBtn");
			searchBtn.setFont(font1);
			searchBtn.setBackground(color);
			searchBtn.addActionListener(new MyActionListener()); 
			searchBtn.setBorder(new EmptyBorder(5, 17, 5, 17));
            searchPanel.add(AimLabel);
            searchPanel.add(Box.createHorizontalStrut(20));
            searchPanel.add(aimComboBox);     
            searchPanel.add(Box.createHorizontalStrut(20));
			searchPanel.add(searchBtn);
			searchBox.add(searchPanel);
			searchBox.add(Box.createHorizontalStrut(20));
     
			/* Related components of trainer1 section. */	
			trainerPanel1.setFont(font1);
            trainerPanel1.setBackground(backgroundColor);
			trainerLabel1.setFont(font2);
			trainerTextArea1.setFont(font1);
            trainerTextArea1.setBackground(backgroundColor);
			trainerPanel1.add(trainerLabel1);
			trainerPanel1.add(trainerTextArea1);

            trainerBox1.add(trainerPanel1);
			trainerBox1.add(Box.createHorizontalStrut(50));  

			/* Related components of trainer2 section. */
			trainerPanel2.setFont(font1);
            trainerPanel2.setBackground(backgroundColor);
			trainerLabel2.setFont(font2);            
			trainerTextArea2.setFont(font1);
            trainerTextArea2.setBackground(backgroundColor);
			trainerPanel2.add(trainerLabel2);
			trainerPanel2.add(trainerTextArea2);
			trainerBox2.add(trainerPanel2);  		
			trainerBox2.add(Box.createHorizontalStrut(50));

			/* Related components of trainer3 section. */
			trainerPanel3.setFont(font1);
            trainerPanel3.setBackground(backgroundColor);
			trainerLabel3.setFont(font2);
            trainerTextArea3.setFont(font1);
            trainerTextArea3.setBackground(backgroundColor);
			trainerPanel3.add(trainerLabel3);
			trainerPanel3.add(trainerTextArea3);
            trainerBox3.add(trainerPanel3);
			trainerBox3.add(Box.createHorizontalStrut(50));
			
			/* Related components of menuBox section. */
			jm1.setFont(font1);
			jm1.setName("Trainer");
			jm1.addActionListener(new ViewAction());
			jm1.setBackground(backgroundColor);		
	
			jm2.setFont(font1);
			jm2.setBackground(backgroundColor);
			jm2.setName("Appoint");
			jm2.addActionListener(new ViewAction());
			
			jmb.add(jm1);
			jmb.add(jm2);			
			menuBox.add(Box.createHorizontalStrut(50));
			menuBox.add(jmb);
			menuBox.add(Box.createHorizontalStrut(20));

			/* Related components of button section. */
			backBtn.setName("backBtn");
			backBtn.setFont(font1);
			backBtn.setBackground(color);
			backBtn.addActionListener(new MyActionListener());
			backBox.add(backBtn);
			backBox.add(Box.createHorizontalStrut(80));
			backBtn.setBorder(new EmptyBorder(5, 17, 5, 17));

           	/* Add each section to the Box. */  
            vBox.add(Box.createVerticalStrut(20));
            vBox.add(searchBox);			
            vBox.add(Box.createVerticalStrut(20));
			vBox.add(trainerBox1);
			vBox.add(trainerBox2);
			vBox.add(trainerBox3);
			vBox.add(menuBox);                    
            vBox.add(Box.createVerticalStrut(10));
            vBox.add(backBox);
            jf.add(vBox);

            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * Action listener
	 * You can select the training purpose in "Aim" 
	 * and click "Search" to see the corresponding trainer introduction.
	 * Click "Back" button to return the welcome page.
	 */
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
            String aimContent = (String) aimComboBox.getSelectedItem();
			String fileName = "./file/trainer.txt";
			ArrayList<String> trainerInfoList = new ArrayList<String>();
			
			/* Show the intro of trainers who have the same training aim as users' option. */ 
            if (button.equals(searchBtn)) {
				if (aimContent!="aim"){
					/**
	 				 * First get all trainer information with the name of file and store it in trainerList.
					 * Then select the coach information of the corresponding aimType and store it in trainerSelectList
	 				 */
					ArrayList<Entity_Trainer> trainerSelectList = new Control_SelectTrainer(aimContent, new Control_ReadFromFile(fileName).getTrainerList()).getTrainerSelectList();
						for(Entity_Trainer i : trainerSelectList) {
							String trainerInfo =i.getTrainerName() + "\n"+ 
							i.getTrainerLicense()+ "\n"+ i.getTrainerIntro();						
							trainerInfoList.add(trainerInfo);
						}
					trainerTextArea1.setText(trainerInfoList.get(0));
					trainerTextArea2.setText(trainerInfoList.get(1));				
					trainerTextArea3.setText(trainerInfoList.get(2));	
				}
				else{
					/* Display the default information of the page . */
                    JOptionPane.showMessageDialog(jf,"Must choose a type");
					trainerTextArea1.setText(initialTextContent);
					trainerTextArea2.setText(initialTextContent);				
					trainerTextArea3.setText(initialTextContent);	
                }	                
            }
			/* Click "Back" button to return the welcome page.. */
			if (button.equals(backBtn)) {				
				jf.setVisible(false);				 
				new Welcome();				
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

	/**
	 * A test main method.
	 * @param args nothing
	 */
    public static void main(String[] args) {
        new LivePersonalTrainingPage();
    }
}
