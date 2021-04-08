import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

public class HelpPage {
	private final JFrame jf = new JFrame("HelpPage");
	final int WIDTH = 475;
	final int HEIGHT = 625;
 
	public void init() {
		try {
			jf.getContentPane().setBackground(new Color(250,240,215));
			//跳转帮助界面
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int sw = screenSize.width;
			int sh = screenSize.height;
			//设置界面居中显示
			jf.setBounds((sw - WIDTH) / 2, (sh - HEIGHT) / 2, WIDTH, HEIGHT);
			jf.setResizable(false);
			//修改为FlowLayout布局，否则窗口中的组件会根据窗口大小变化尺寸
			jf.setLayout(new FlowLayout());
			//添加大组件
			Box hBox = Box.createVerticalBox();
			
			//Question栏目
			Box cqBox = Box.createHorizontalBox();
			JLabel cqLabel = new JLabel("Common Questions");
			cqBox.add(cqLabel);
			cqBox.add(Box.createHorizontalStrut(10));
			//Q1栏目
			Box q1Box = Box.createHorizontalBox();
			JLabel q1Label = new JLabel("Q1：                                       A paragraph of...");
			q1Box.add(q1Label);
			q1Box.add(Box.createHorizontalStrut(10));

			Box a1Box = Box.createHorizontalBox();
			JLabel a1Label = new JLabel("A1：                                       A paragraph of...");
			a1Box.add(a1Label);
			a1Box.add(Box.createHorizontalStrut(10));

			//Q2栏目
			Box q2Box = Box.createHorizontalBox();
			JLabel q2Label = new JLabel("Q2：                                       A paragraph of...");
			q2Box.add(q2Label);
			q2Box.add(Box.createHorizontalStrut(10));

			Box a2Box = Box.createHorizontalBox();
			JLabel a2Label = new JLabel("A2：                                       A paragraph of...");
			a2Box.add(a2Label);
			a2Box.add(Box.createHorizontalStrut(10));

			//Q3栏目
			Box q3Box = Box.createHorizontalBox();
			JLabel q3Label = new JLabel("Q3：                                       A paragraph of...");
			q3Box.add(q3Label);
			q3Box.add(Box.createHorizontalStrut(10));

			Box a3Box = Box.createHorizontalBox();
			JLabel a3Label = new JLabel("A3：                                       A paragraph of...");
			a3Box.add(a3Label);
			a3Box.add(Box.createHorizontalStrut(10));

			//Other Question栏目
			Box oqBox = Box.createHorizontalBox();
			JLabel oqLabel = new JLabel("Other Questions:    ");
			JTextArea oqArea = new JTextArea(10,20);
			JScrollPane scrollPane = new JScrollPane(oqArea);
			oqArea.setColumns(20); 
			oqBox.add(oqLabel);
			oqBox.add(scrollPane);
			oqBox.add(Box.createHorizontalStrut(60));
			//Submit栏目
			Box subBox = Box.createHorizontalBox();
			JLabel subLabel = new JLabel("                                                     ");
			JButton submitbtn = new JButton("Submit");
			submitbtn.setName("submitbtn");
			submitbtn.addActionListener(new MyActionListener());
			subBox.add(subLabel);
			subBox.add(submitbtn);
			subBox.add(Box.createHorizontalStrut(60));
			//Back Button栏目
			Box btnBox = Box.createHorizontalBox();
			JButton backbtn = new JButton("Back");
			backbtn.setName("backbtn");
			backbtn.addActionListener(new MyActionListener());
			btnBox.add(backbtn);
			btnBox.add(Box.createHorizontalStrut(80));

			//添加小组件到大组件
			hBox.add(Box.createVerticalStrut(50));
			hBox.add(cqBox);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(q1Box);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(a1Box);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(q2Box);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(a2Box);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(q3Box);
			hBox.add(Box.createVerticalStrut(25));
			hBox.add(a3Box);
			hBox.add(Box.createVerticalStrut(40));
			hBox.add(oqBox);
			hBox.add(Box.createVerticalStrut(10));
			hBox.add(subBox);
			hBox.add(Box.createVerticalStrut(50));
			hBox.add(btnBox);

			jf.add(hBox);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	//自定义监听类
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getName();
			switch (name) {
				case "submitbtn":
					JOptionPane.showMessageDialog(jf,"Submit Sucessfully!");
					break;
				case "backbtn":
				{
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
		new HelpPage().init();
	}
}

