import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

 /**
 * the GUI of payment function
 * @author Jingyuan Tang
 * @version 3.2
 * @since 5/20/2021
 */
public class paymentGUI {
	 /**
	  * Some global variables
	  */
	public int sourcePage;
	private final JFrame paymentPage = new JFrame("Payment Page");
	final int WIDTH = 475;
	final int HEIGHT = 625;
	Font myFont1 = new Font("Georgia", Font.BOLD, 15);
	Font myFont2 = new Font("Georgia", Font.BOLD, 12);
 
	/**
     * Determine where the page turn back to (the source page).
     * @param i the source page of type int
     **/
	public void init(int i) {
		sourcePage = i;
		try {
			paymentPage.getContentPane().setBackground(new Color(250,240,215));
			//Get login interface
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//Center display of setting interface
			paymentPage.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			paymentPage.setResizable(false);
			paymentPage.setLayout(new FlowLayout());
			//add component
			Box vBox = Box.createVerticalBox();
			//Title Bar
			Box reminderBox =Box.createHorizontalBox();
			JLabel note = new JLabel("Please Choose Payment Method");
			note.setFont(myFont1);

			reminderBox.add(note);
			//visa bar		
			Box visaBox = Box.createHorizontalBox();
			JRadioButton selection1 = new JRadioButton("visa");
			selection1.setBackground(new Color(250,240,215));
			selection1.setFont(myFont2);
			visaBox.add(selection1);

			//visa photo bar
			Box visaPhotoBox = Box.createHorizontalBox();
			JLabel visaPhoto = new JLabel();
	        ImageIcon visaIcon = new ImageIcon(new ImageIcon("image/visa.jpg").getImage().getScaledInstance(220, 130, Image.SCALE_SMOOTH));
	        visaPhoto.setIcon(visaIcon);

	        //paypal bar
	        Box paypalBox = Box.createHorizontalBox();
			JRadioButton selection2 = new JRadioButton("PayPal");
			selection2.setBackground(new Color(250,240,215));
			selection2.setFont(myFont2);
			paypalBox.add(selection2);
			
			//buttongroup
			ButtonGroup bg=new ButtonGroup();
			bg.add(selection1);
			bg.add(selection2);
			
			//paypal photo bar
			Box paypalPhotoBox = Box.createHorizontalBox();
			JLabel paypalPhoto = new JLabel();
	        ImageIcon paypalIcon = new ImageIcon(new ImageIcon("image/PayPal.jpeg").getImage().getScaledInstance(220, 130, Image.SCALE_SMOOTH));
	        paypalPhoto.setIcon(paypalIcon);
			//Add components to the layout and use placeholders (the same applies below)
			visaPhotoBox.add(visaPhoto);
			visaPhotoBox.add(Box.createHorizontalStrut(10));
			paypalPhotoBox.add(paypalPhoto);
			paypalPhotoBox.add(Box.createHorizontalStrut(10));
			
			
			//button栏目
			Box btnBox = Box.createHorizontalBox();
			//Add button and listen event
			JButton pay = new JButton("OK");
			pay.setBackground(new Color(242,215,146));
			pay.setForeground(Color.white);
			pay.setName("payTheBill");//The login status returns to the main interface
			pay.setFont(myFont2);
			pay.addActionListener(new newWindow());
			pay.setBorder(new EmptyBorder(5, 17, 5, 17));
			JButton backButn = new JButton("Back");
			backButn.setFont(myFont2);
			backButn.setBackground(new Color(242,215,146));
			backButn.setName("backButn");
			backButn.setForeground(Color.white);
			backButn.setBorder(new EmptyBorder(5, 17, 5, 17));
			backButn.addActionListener(new newWindow());
			btnBox.add(pay);
			btnBox.add(Box.createHorizontalStrut(60));
			btnBox.add(backButn);
			
			vBox.add(Box.createVerticalStrut(20));
			vBox.add(reminderBox);
			vBox.add(Box.createVerticalStrut(30));
			vBox.add(visaBox);
			vBox.add(Box.createVerticalStrut(5));
			vBox.add(visaPhotoBox);
			vBox.add(Box.createVerticalStrut(40));
			vBox.add(paypalBox);
			vBox.add(Box.createVerticalStrut(5));
			vBox.add(paypalPhotoBox);
			
			vBox.add(Box.createVerticalStrut(40));
			vBox.add(btnBox);
			paymentPage.add(vBox);
			paymentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			paymentPage.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	//Custom listening class
	private class newWindow implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "payTheBill":
					Object[] options = { "OK" };
							JOptionPane.showOptionDialog(null, "Successfully !", "Message",
							JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
							new backToCertainPage().backPage(sourcePage);
							paymentPage.setVisible(false);
				break;
				case "backButn":
					new backToCertainPage().backPage(sourcePage);
					paymentPage.setVisible(false);
				break;
				default:
					break;
			}
		}
	}

	 /**
	  * A simple test main method
	  * @param args nothing
	  */
	public static void main(String[] args) {
		new paymentGUI().init(4);
	}
}