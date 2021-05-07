import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

/**
 * A simple GUI for the welcome page(main page)
 * @author Xiao Zheng
 * @version 1.2.1
 * @since 4/6/2021
 */
public class Welcome extends JFrame implements ActionListener {
    private JFrame jFrame;
    private JButton gallery, searchBtn, videoBtn, liveBtn, membershipBtn;
    private JRadioButton courseBtn, trainerBtn;
    private JMenuItem accountItem, membershipItem, helpItem;
    private JTextField search;
    private final int WIDTH = 475;
	private final int HEIGHT = 625;
    private final Color BACKGROUND = new Color(242, 215, 146);
    private final Color BACKGROUND1 = new Color(250, 240, 215);

    /**
     * The constructor of Welcome.java
     */
    public Welcome() {
        //Font f = new Font("Times New Roman", Font.ITALIC+Font.BOLD, 30);
		Font btn = new Font("Georgia", Font.BOLD, 13);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
        jFrame = new JFrame("Welcome to London Fitness!");
        jFrame.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
	    jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(BACKGROUND1);
        jFrame.setLayout(new FlowLayout());
        
        Box menuBox = Box.createHorizontalBox();
        JMenuBar menuBar = new JMenuBar();
        accountItem = new JMenuItem("My Account");
        accountItem.setName("myAccount");
        accountItem.setFont(btn);
        accountItem.setBackground(BACKGROUND1);
        accountItem.addActionListener(this);
        membershipItem = new JMenuItem("Membership");
        membershipItem.setName("membership");
        membershipItem.setFont(btn);
        membershipItem.setBackground(BACKGROUND1);
        membershipItem.addActionListener(this);
        helpItem = new JMenuItem("Help");
        helpItem.setName("help");
        helpItem.setFont(btn);
        helpItem.setHorizontalAlignment(SwingConstants.RIGHT);
        helpItem.setBackground(BACKGROUND1);
        helpItem.addActionListener(this);
        menuBar.add(accountItem);
        menuBar.add(membershipItem);
        menuBox.add(menuBar);
        menuBox.add(Box.createHorizontalStrut(200));
        menuBox.add(helpItem);

        Box vBox = Box.createVerticalBox();

        JPanel galleryPanel = new JPanel();
        gallery = new JButton();
        gallery.setBounds(0, 0, 382, 170);
        gallery.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon1 = new ImageIcon("image/gallery.jpg"); 
        Image temp1 = icon1.getImage().getScaledInstance(gallery.getWidth(), gallery.getHeight(), Image.SCALE_DEFAULT); 
        icon1 = new ImageIcon(temp1);
        gallery.setIcon(icon1);
        gallery.setContentAreaFilled(false);
        gallery.setBorderPainted(false);
        gallery.addActionListener(this);
        galleryPanel.setBackground(BACKGROUND1);
        galleryPanel.add(gallery);

        JPanel searchPanel = new JPanel();
        search = new JTextField(15);
        search.setPreferredSize(new Dimension(0, 25));
        search.setFont(btn);
        searchBtn = new JButton("Search");
        searchBtn.setFont(btn);
        searchBtn.setForeground(BACKGROUND);
        searchBtn.setBackground(Color.WHITE);
        searchBtn.addActionListener(this);
        searchPanel.setBackground(BACKGROUND1);
        searchPanel.add(search);
        searchPanel.add(searchBtn);

        Box itemBox = Box.createHorizontalBox();
        courseBtn = new JRadioButton("Course");
        courseBtn.setBackground(BACKGROUND1);
        trainerBtn = new JRadioButton("Trainer");
        trainerBtn.setBackground(BACKGROUND1);
        ButtonGroup group = new ButtonGroup();
        group.add(courseBtn);
        group.add(trainerBtn);
        itemBox.add(courseBtn);
        itemBox.add(trainerBtn);

        JPanel videoPanel = new JPanel();
        videoBtn = new JButton();
        videoBtn.setBounds(0, 0, 430, 70);
        videoBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon2 = new ImageIcon("image/video.jpg"); 
        Image temp2 = icon2.getImage().getScaledInstance(videoBtn.getWidth(), videoBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon2 = new ImageIcon(temp2);
        videoBtn.setIcon(icon2);
        videoBtn.setContentAreaFilled(false);
        videoBtn.setBorderPainted(false);
        videoBtn.addActionListener(this);
        videoPanel.setBackground(BACKGROUND1);
        videoPanel.setBorder(BorderFactory.createTitledBorder("Digital Workout Video"));
        videoPanel.add(videoBtn);

        JPanel livePanel = new JPanel();
        liveBtn = new JButton();
        liveBtn.setBounds(0, 0, 430, 70);
        liveBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon3 = new ImageIcon("image/live.jpg"); 
        Image temp3 = icon3.getImage().getScaledInstance(liveBtn.getWidth(), liveBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon3 = new ImageIcon(temp3);
        liveBtn.setIcon(icon3);
        liveBtn.setContentAreaFilled(false);
        liveBtn.setBorderPainted(false);
        liveBtn.addActionListener(this);
        livePanel.setBackground(BACKGROUND1);
        livePanel.setBorder(BorderFactory.createTitledBorder("Live Personal Training"));
        livePanel.add(liveBtn);

        JPanel membershipPanel = new JPanel();
        membershipBtn = new JButton();
        membershipBtn.setBounds(0, 0, 430, 70);
        membershipBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon4 = new ImageIcon("image/membership.jpg"); 
        Image temp4 = icon4.getImage().getScaledInstance(membershipBtn.getWidth(), membershipBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon4 = new ImageIcon(temp4);
        membershipBtn.setIcon(icon4);
        membershipBtn.setContentAreaFilled(false);
        membershipBtn.setBorderPainted(false);
        membershipBtn.addActionListener(this);
        membershipPanel.setBackground(BACKGROUND1);
        membershipPanel.setBorder(BorderFactory.createTitledBorder("Membership Management"));
        membershipPanel.add(membershipBtn);

        vBox.add(menuBox);
        vBox.add(galleryPanel);
        vBox.add(searchPanel);
        vBox.add(itemBox);
        vBox.add(videoPanel);
        vBox.add(livePanel);
        vBox.add(membershipPanel);

        jFrame.add(vBox);
        
        jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Actions involved in the page.
     * @param e different actions
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == accountItem) {
            jFrame.setVisible(false);
            new IDPage().Identity();
        }

        if(e.getSource() == membershipItem) {
            jFrame.setVisible(false);
            new membershipGUI().init();
        }

        if(e.getSource() == helpItem) {
            jFrame.setVisible(false);
            new HelpPage().Help();
        }

        if(e.getSource() == gallery) {
            System.out.println("gallery");
        }

        if(e.getSource() == searchBtn) {
            String text = search.getText();
            if(text.equals("") || (!courseBtn.isSelected() && !trainerBtn.isSelected())) {
                System.out.println("No enter!");
            }
            else {
                if(courseBtn.isSelected())
                    System.out.println("cousebtn " + text);
                if(trainerBtn.isSelected())
                    System.out.println("trainbtn " + text);
            }
        }

        if(e.getSource() == videoBtn) {
            jFrame.setVisible(false);
            new digitalWorkOutVideosPage();
        }

        if(e.getSource() == liveBtn) {
            jFrame.setVisible(false);
            new LivePersonalTrainingPage();
        }

        if(e.getSource() == membershipBtn) {
            jFrame.setVisible(false);
            new membershipGUI().init();
        }
    }

    public static void main(String[] args) {
        new Welcome();
    }
}
