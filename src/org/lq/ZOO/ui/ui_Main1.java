package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.border.LineBorder;

import lombok.extern.log4j.Log4j;

/**
 * @author许浩
 * @2019年6月29日
 * @ui_Tourist_Service.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年6月29日
 */
@Log4j
public class ui_Main1 extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tab_main;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_Main1 frame = new ui_Main1();
					frame.setVisible(true);
					
				} catch (Exception e) {
//					e.printStackTrace();
					log.error("主窗体错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 944);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 149, 980, 757);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
//		panel.setBorder(new LineBorder(Color.RED));
		panel_3.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 927, 192);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("/video/Squirrel.mp4");
				
			}
		});
		label.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/one.jpg")));
		label.setBounds(8, 0, 224, 190);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("/video/Panda.mp4");
			}
		});
		label_1.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/two.jpg")));
		label_1.setBounds(242, 0, 234, 190);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("/video/Chrysolophuspictus.mp4");
			}
		});
		label_2.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/three.jpg")));
		label_2.setBounds(485, 0, 224, 190);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("/video/CrestedIbis.mp4");
			}
		});
		label_3.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/bo4.jpg")));
		label_3.setBounds(723, 0, 195, 190);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(927, 10, 939, 192);
		panel.add(panel_2);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("video/Squirrel.mp4");
			}
		});
		label_4.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/one.jpg")));
		label_4.setBounds(17, 0, 224, 190);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("video/Panda.mp4");
				
			}
		});
		label_5.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/two.jpg")));
		label_5.setBounds(258, 0, 224, 190);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("video/Chrysolophuspictus.mp4");
				
			}
		});
		label_6.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/three.jpg")));
		label_6.setBounds(499, 0, 224, 190);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain main=new PlayMain();
				main.player("video/CrestedIbis.mp4");
				
			}
		});
		label_7.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/bo4.jpg")));
		label_7.setBounds(733, 0, 196, 192);
		panel_2.add(label_7);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_map place = new ui_map();
				place.setVisible(true);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/ZooMap.png")));
		lblNewLabel_5.setBounds(0, 212, 970, 545);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("\u9996\u9875");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UI_Main2 nMain2 =new UI_Main2();
				panel_3.removeAll();
				panel_3.add(nMain2.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		
		JLabel label_8 = new JLabel("\u6E38\u5BA2\u670D\u52A1");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_Tourist_Service service= new ui_Tourist_Service();
				panel_3.removeAll();
				panel_3.add(service.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		label_8.setFont(new Font("宋体", Font.BOLD, 14));
		label_8.setBounds(516, 72, 69, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\u516C\u76CA\u6D3B\u52A8");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_animalVolunteer animalVolunteer = new ui_animalVolunteer();
				panel_3.removeAll();
				panel_3.add(animalVolunteer.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		label_9.setFont(new Font("宋体", Font.BOLD, 14));
		label_9.setBounds(435, 72, 71, 15);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u4FDD\u62A4\u6559\u80B2");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ui_protectionEducation education = new ui_protectionEducation();
				panel_3.removeAll();
				panel_3.add(education.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		label_10.setFont(new Font("宋体", Font.BOLD, 14));
		label_10.setBounds(356, 72, 69, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u6D3B\u52A8\u65B0\u95FB");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_activeNew activeNew = new ui_activeNew();
				panel_3.removeAll();
				panel_3.add(activeNew.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		label_11.setFont(new Font("宋体", Font.BOLD, 14));
		label_11.setBounds(259, 72, 66, 15);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u8D70\u8FDB\u52A8\u7269\u56ED");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ui_gotoZoo gotoZoo = new ui_gotoZoo();
				panel_3.removeAll();
				panel_3.add(gotoZoo.getContentPane());
				SwingUtilities.updateComponentTreeUI(panel_3);
			}
		});
		label_12.setFont(new Font("宋体", Font.BOLD, 14));
		label_12.setBounds(138, 72, 90, 15);
		contentPane.add(label_12);
		lblNewLabel_3.setBounds(49, 66, 79, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("[\u5458\u5DE5\u5165\u53E3]");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_login login = new ui_login();
				login.setVisible(true);
			}
		});
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_4.setBounds(294, 119, 79, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("\u6B22 \u8FCE \u8D70 \u8FDB \u5317 \u4EAC \u52A8 \u7269 \u56ED . . .");
		lblNewLabel_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_2.setBounds(65, 113, 219, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, -2, 980, 106);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/header.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ui_Main1.class.getResource("/org/lq/ZOO/icon/bar.jpg")));
		lblNewLabel_1.setBounds(5, 105, 980, 41);
		contentPane.add(lblNewLabel_1);
		
		new Thread() {
			public void run() {
				while(true) {
					int x = panel_1.getX();
					int x2 = panel_2.getX();
					if(x<=-927) {
						x2 = 0;
						x=927;					
					}else if (x2<=-927) {
						x=0;
						x2=927;
					}
					
					panel_1.setBounds(x-7, panel_1.getY(), panel_1.getWidth(), panel_1.getHeight());
					panel_2.setBounds(x2-7, panel_2.getY(), panel_2.getWidth(), panel_2.getHeight());
					try {
						sleep(100);
					} catch (InterruptedException e) {
						log.error("主窗口轮播错误",e);
					}
				}
			};
		}.start();
	}
}
