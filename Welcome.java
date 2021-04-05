import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements ActionListener {
    private JFrame jFrame;
    private JLabel videoLabel, liveLabel, membershipLabel;
    private JButton gallery, videoBtn, liveBtn, membershipBtn;
    final int WIDTH = 475;
	final int HEIGHT = 625;
    private JMenuItem accountItem, membershipItem, helpItem;

    public Welcome() {
        //Font f = new Font("Times New Roman", Font.ITALIC+Font.BOLD, 30);
		Font btn = new Font("Georgia", Font.BOLD, 13);
        Border labelBorder = new EmptyBorder(0, 30, 0, 30);
		//setTitle("Welcome to London Fitness!"); 

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = screenSize.width;
		int sh = screenSize.height;
        jFrame = new JFrame("Welcome to London Fitness!");
        jFrame.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
	    jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setResizable(false);
        jFrame.setLayout(new FlowLayout());
        
        
	    //container.setLayout(new BoxLayout());

        /*JButton loginBtn = new JButton("Login / My account");
        JButton membershipBtn = new JButton("Membership");
        JButton helpBtn = new JButton("help");*/
        Box menuBox = Box.createHorizontalBox();
        JMenuBar menuBar = new JMenuBar();
        accountItem = new JMenuItem("My Account");
        accountItem.setName("myAccount");
        accountItem.setFont(btn);
        accountItem.addActionListener(this);
        membershipItem = new JMenuItem("Membership");
        membershipItem.setName("membership");
        membershipItem.setFont(btn);
        membershipItem.addActionListener(this);
        helpItem = new JMenuItem("Help");
        helpItem.setName("help");
        helpItem.setFont(btn);
        helpItem.setHorizontalAlignment(SwingConstants.RIGHT);
        helpItem.addActionListener(this);
        menuBar.add(accountItem);
        menuBar.add(membershipItem);
        //menuBar.add(Box.createHorizontalStrut(100));
        //menuBar.add(helpItem);
        menuBox.add(menuBar);
        menuBox.add(Box.createHorizontalStrut(200));
        menuBox.add(helpItem);

        Box vBox = Box.createVerticalBox();

        JPanel galleryPanel = new JPanel();
        gallery = new JButton();
        gallery.setBounds(0, 0, 450, 100);
        gallery.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon1 = new ImageIcon("image/gallery.jpg"); 
        Image temp1 = icon1.getImage().getScaledInstance(gallery.getWidth(), gallery.getHeight(), Image.SCALE_DEFAULT); 
        icon1 = new ImageIcon(temp1);
        gallery.setIcon(icon1);
        gallery.setContentAreaFilled(false);
        gallery.setBorderPainted(false);
        gallery.addActionListener(this);
        galleryPanel.add(gallery);
        //gallery.setFocusPainted(false);
        //gallery.setIcon(new ImageIcon(getClass().getResource("cover2.jpg")));
        //gallery.setPreferredSize(new Dimension(40, 50));

        Box videoBox = Box.createHorizontalBox();
        videoLabel = new JLabel("Digital Workout Videos");
        videoLabel.setFont(btn);
        videoLabel.setBorder(labelBorder);
        videoBox.add(videoLabel);
        videoBox.add(Box.createHorizontalGlue());

        JPanel videoPanel = new JPanel();
        videoBtn = new JButton();
        videoBtn.setBounds(0, 0, 450, 100);
        videoBtn.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon2 = new ImageIcon("image/video.jpg"); 
        Image temp2 = icon2.getImage().getScaledInstance(videoBtn.getWidth(), videoBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon2 = new ImageIcon(temp2);
        videoBtn.setIcon(icon2);
        videoBtn.setContentAreaFilled(false);
        videoBtn.setBorderPainted(false);
        videoBtn.addActionListener(this);
        videoPanel.add(videoBtn);

        Box liveBox = Box.createHorizontalBox();
        liveLabel = new JLabel("Live Personal Training");
        liveLabel.setFont(btn);
        liveLabel.setBorder(labelBorder);
        liveBox.add(liveLabel);
        liveBox.add(Box.createHorizontalGlue());

        JPanel livePanel = new JPanel();
        liveBtn = new JButton();
        liveBtn.setBounds(0, 0, 450, 100);
        liveBtn.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon3 = new ImageIcon("image/live.jpg"); 
        Image temp3 = icon3.getImage().getScaledInstance(liveBtn.getWidth(), liveBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon3 = new ImageIcon(temp3);
        liveBtn.setIcon(icon3);
        liveBtn.setContentAreaFilled(false);
        liveBtn.setBorderPainted(false);
        liveBtn.addActionListener(this);
        livePanel.add(liveBtn);

        Box membershipBox = Box.createHorizontalBox();
        membershipLabel = new JLabel("Membership Management");
        membershipLabel.setFont(btn);
        membershipLabel.setBorder(labelBorder);
        membershipBox.add(membershipLabel);
        membershipBox.add(Box.createHorizontalGlue());

        JPanel membershipPanel = new JPanel();
        membershipBtn = new JButton();
        membershipBtn.setBounds(0, 0, 450, 100);
        membershipBtn.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon icon4 = new ImageIcon("image/membership.jpg"); 
        Image temp4 = icon4.getImage().getScaledInstance(membershipBtn.getWidth(), membershipBtn.getHeight(), Image.SCALE_DEFAULT); 
        icon4 = new ImageIcon(temp4);
        membershipBtn.setIcon(icon4);
        membershipBtn.setContentAreaFilled(false);
        membershipBtn.setBorderPainted(false);
        membershipBtn.addActionListener(this);
        membershipPanel.add(membershipBtn);

        vBox.add(menuBox);
        //vBox.add(Box.createVerticalStrut(10));
        vBox.add(galleryPanel);
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

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == accountItem)
        {
            //System.out.println("myAccount");
            jFrame.setVisible(false);
            new IDPage().init();
        }
        if(e.getSource() == membershipItem)
        {
            //System.out.println("membershipItem");
            jFrame.setVisible(false);
            new membershipGUI().init();
        }
        if(e.getSource() == helpItem)
        {
            //System.out.println("helpItem");
            jFrame.setVisible(false);
            new HelpPage().init();
        }
        if(e.getSource() == gallery)
            System.out.println("gallery");
        if(e.getSource() == videoBtn)
        {
            //System.out.println("videoBtn");
            jFrame.setVisible(false);
            new digitalWorkOutVideosPage();
        }
        if(e.getSource() == liveBtn)
        {
            //System.out.println("liveBtn");
            jFrame.setVisible(false);
            new LivePersonalTrainingPage();
        }
        if(e.getSource() == membershipBtn)
        {
            //System.out.println("membershipBtn");
            jFrame.setVisible(false);
            new membershipGUI().init();
        }
    }

    /*public class testbtn extends JButton {

        public testbtn(String label) {
            super(label);  //调用父类构造函数
            setContentAreaFilled(false);   //不自行绘制按钮背景
            setPreferredSize(new Dimension(50,30));
        }
    
    //绘制圆和标签
        protected void paintComponent(Graphics g) {
           if (getModel().isArmed()) {  //鼠标点击时
                g.setColor(Color.lightGray);  //颜色为灰色
            } else {
                g.setColor(getBackground());  //置按钮颜色
            }
            g.fillOval(0, 0, getSize().width, getSize().height);  //绘制圆
            super.paintComponent(g);  //调用父类函数,绘制其余部分
        }
        //绘制边框
        protected void paintBorder(Graphics g) {
        g.setColor(getForeground());  //设置边框颜色
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);  //在边界上绘制一个椭圆
        }
    }*/
    public static void main(String[] args) {
        new Welcome();
    }

}
