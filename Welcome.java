import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

/**
 * A simple GUI for the welcome page(main page)
 * @author Xiao Zheng
 * @version 1.2
 * @since 4/6/2021
 */
public class Welcome extends JFrame implements ActionListener {
    private JFrame jFrame;
    private JLabel videoLabel, liveLabel, membershipLabel;
    private JButton gallery, searchBtn, videoBtn, liveBtn, membershipBtn;
    private JMenuItem accountItem, membershipItem, helpItem;
    private JTextField search;
    private final int WIDTH = 475;
	private final int HEIGHT = 625;

    /**
     * The constructor of Welcome.java
     */
    public Welcome() {
        //Font f = new Font("Times New Roman", Font.ITALIC+Font.BOLD, 30);
		Font btn = new Font("Georgia", Font.BOLD, 13);
        Border labelBorder = new EmptyBorder(0, 30, 0, 30);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
        jFrame = new JFrame("Welcome to London Fitness!");
        jFrame.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
	    jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(Color.WHITE);
        jFrame.setLayout(new FlowLayout());
        
        Box menuBox = Box.createHorizontalBox();
        JMenuBar menuBar = new JMenuBar();
        accountItem = new JMenuItem("My Account");
        accountItem.setName("myAccount");
        accountItem.setFont(btn);
        accountItem.setBackground(Color.WHITE);
        accountItem.addActionListener(this);
        membershipItem = new JMenuItem("Membership");
        membershipItem.setName("membership");
        membershipItem.setFont(btn);
        membershipItem.setBackground(Color.WHITE);
        membershipItem.addActionListener(this);
        helpItem = new JMenuItem("Help");
        helpItem.setName("help");
        helpItem.setFont(btn);
        helpItem.setHorizontalAlignment(SwingConstants.RIGHT);
        helpItem.setBackground(Color.WHITE);
        helpItem.addActionListener(this);
        menuBar.add(accountItem);
        menuBar.add(membershipItem);
        menuBox.add(menuBar);
        menuBox.add(Box.createHorizontalStrut(200));
        menuBox.add(helpItem);

        Box vBox = Box.createVerticalBox();

        JPanel galleryPanel = new JPanel();
        gallery = new JButton();
        gallery.setBounds(0, 0, 450, 200);
        gallery.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon1 = new ImageIcon("image/gallery.jpg"); 
        Image temp1 = icon1.getImage().getScaledInstance(gallery.getWidth(), gallery.getHeight(), Image.SCALE_DEFAULT); 
        icon1 = new ImageIcon(temp1);
        gallery.setIcon(icon1);
        gallery.setContentAreaFilled(false);
        gallery.setBorderPainted(false);
        gallery.addActionListener(this);
        galleryPanel.setBackground(Color.WHITE);
        galleryPanel.add(gallery);

        JPanel searchPanel = new JPanel();
        search = new JTextField(15);
        search.setPreferredSize(new Dimension(0, 25));
        search.setFont(btn);
        searchBtn = new JButton("Search");
        searchBtn.setFont(btn);
        //searchBtn.setContentAreaFilled(false);
        searchBtn.setBackground(new Color(242, 215, 146));
        searchBtn.setForeground(Color.WHITE);
        searchBtn.addActionListener(this);
        searchPanel.setBackground(Color.WHITE);
        searchPanel.add(search);
        searchPanel.add(searchBtn);

        Box videoBox = Box.createHorizontalBox();
        videoLabel = new JLabel("Digital Workout Video");
        videoLabel.setFont(btn);
        videoLabel.setBorder(labelBorder);
        videoBox.add(videoLabel);
        videoBox.add(Box.createHorizontalGlue());

        JPanel videoPanel = new JPanel();
        videoBtn = new JButton();
        //videoBtn.setBounds(0, 0, 450, 85);
        videoBtn.setBounds(0, 0, 450, 70);
        videoBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon2 = new ImageIcon("image/video.jpg"); 
        Image temp2 = icon2.getImage().getScaledInstance(videoBtn.getWidth(), videoBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon2 = new ImageIcon(temp2);
        videoBtn.setIcon(icon2);
        videoBtn.setContentAreaFilled(false);
        videoBtn.setBorderPainted(false);
        videoBtn.addActionListener(this);
        videoPanel.setBackground(Color.WHITE);
        videoPanel.add(videoBtn);

        Box liveBox = Box.createHorizontalBox();
        liveLabel = new JLabel("Live Personal Training");
        liveLabel.setFont(btn);
        liveLabel.setBorder(labelBorder);
        liveBox.add(liveLabel);
        liveBox.add(Box.createHorizontalGlue());

        JPanel livePanel = new JPanel();
        liveBtn = new JButton();
        //liveBtn.setBounds(0, 0, 450, 85);
        liveBtn.setBounds(0, 0, 450, 70);
        liveBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon3 = new ImageIcon("image/live.jpg"); 
        Image temp3 = icon3.getImage().getScaledInstance(liveBtn.getWidth(), liveBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon3 = new ImageIcon(temp3);
        liveBtn.setIcon(icon3);
        liveBtn.setContentAreaFilled(false);
        liveBtn.setBorderPainted(false);
        liveBtn.addActionListener(this);
        livePanel.setBackground(Color.WHITE);
        livePanel.add(liveBtn);

        Box membershipBox = Box.createHorizontalBox();
        membershipLabel = new JLabel("Membership Management");
        membershipLabel.setFont(btn);
        membershipLabel.setBorder(labelBorder);
        membershipBox.add(membershipLabel);
        membershipBox.add(Box.createHorizontalGlue());

        JPanel membershipPanel = new JPanel();
        membershipBtn = new JButton();
        //membershipBtn.setBounds(0, 0, 450, 85);
        membershipBtn.setBounds(0, 0, 450, 70);
        membershipBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
        ImageIcon icon4 = new ImageIcon("image/membership.jpg"); 
        Image temp4 = icon4.getImage().getScaledInstance(membershipBtn.getWidth(), membershipBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon4 = new ImageIcon(temp4);
        membershipBtn.setIcon(icon4);
        membershipBtn.setContentAreaFilled(false);
        membershipBtn.setBorderPainted(false);
        membershipBtn.addActionListener(this);
        membershipPanel.setBackground(Color.WHITE);
        membershipPanel.add(membershipBtn);

        vBox.add(menuBox);
        vBox.add(galleryPanel);
        vBox.add(Box.createVerticalStrut(5));
        vBox.add(searchPanel);
        vBox.add(Box.createVerticalStrut(5));
        vBox.add(videoBox);
        vBox.add(videoPanel);
        vBox.add(Box.createVerticalStrut(5));
        vBox.add(liveBox);
        vBox.add(livePanel);
        vBox.add(Box.createVerticalStrut(5));
        vBox.add(membershipBox);
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
            //System.out.println("myAccount");
            jFrame.setVisible(false);
            new IDPage().init();
        }

        if(e.getSource() == membershipItem) {
            //System.out.println("membershipItem");
            jFrame.setVisible(false);
            new membershipGUI().init();
        }

        if(e.getSource() == helpItem) {
            //System.out.println("helpItem");
            jFrame.setVisible(false);
            new HelpPage().init();
        }

        if(e.getSource() == gallery) {
            System.out.println("gallery");
        }

        if(e.getSource() == searchBtn) {
            String text = search.getText();
            if(text.equals("")) {
                System.out.println("No enter!");
            }
            else {
                System.out.println(text);
            }
        }

        if(e.getSource() == videoBtn) {
            //System.out.println("videoBtn");
            jFrame.setVisible(false);
            new digitalWorkOutVideosPage();
        }

        if(e.getSource() == liveBtn) {
            //System.out.println("liveBtn");
            jFrame.setVisible(false);
            new LivePersonalTrainingPage();
        }

        if(e.getSource() == membershipBtn) {
            //System.out.println("membershipBtn");
            jFrame.setVisible(false);
            new membershipGUI().init();
        }
    }

    public static void main(String[] args) {
        new Welcome();
    }
}
