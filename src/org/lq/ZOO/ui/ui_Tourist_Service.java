package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

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
public class ui_Tourist_Service extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JPanel panel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_Tourist_Service frame = new ui_Tourist_Service();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("游客服务窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_Tourist_Service() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 799);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 10, 980, 757);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		panel_3.add(splitPane, BorderLayout.CENTER);
		splitPane.setResizeWeight(0.2);
		panel = new JPanel();
		panel.setBackground(new Color(107, 142, 35));
		splitPane.setLeftComponent(panel);
		
		
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(194, 0, 776, 755);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel label_5 = new JLabel("\u5F00 \u653E \u65F6 \u95F4");
		label_5.setForeground(new Color(240, 255, 255));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_openPart openPart= new ui_openPart();
				splitPane.setRightComponent(panel_1.add(openPart.getContentPane()));
			}
		});
		label_5.setFont(new Font("宋体", Font.BOLD, 14));
		label_5.setBounds(10, 53, 122, 23);
		panel.add(label_5);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(107, 142, 35));
		label.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label.setBounds(-16, 53, 200, 23);
		panel.add(label);
		
		JLabel lbll = new JLabel("\u505C\u8F66\u573A\u7BA1\u7406\u89C4\u5B9A");
		lbll.setForeground(new Color(240, 255, 240));
		lbll.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_touristPartCar touristPartCar = new ui_touristPartCar();
				splitPane.setRightComponent(panel_1.add(touristPartCar.getContentPane()));
			}
		});
		lbll.setFont(new Font("宋体", Font.BOLD, 14));
		lbll.setBounds(10, 86, 122, 27);
		panel.add(lbll);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/mapPlace/service_heading.jpg")));
		label_1.setBounds(0, 0, 184, 60);
		panel.add(label_1);
		
		JLabel label_7 = new JLabel("\u8054 \u7CFB \u65B9 \u5F0F");
		label_7.setForeground(new Color(240, 255, 240));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_information information = new ui_information();
				splitPane.setRightComponent(panel_1.add(information.getContentPane()));
			}
		});
		label_7.setFont(new Font("宋体", Font.BOLD, 14));
		label_7.setBounds(10, 147, 122, 23);
		panel.add(label_7);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_2.setBounds(-16, 147, 200, 23);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_3.setBounds(-16, 84, 200, 29);
		panel.add(label_3);
		
		JLabel label_6 = new JLabel("\u7968 \u4EF7 \u67E5 \u8BE2");
		label_6.setForeground(new Color(240, 255, 240));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_touristCheck touristCheck=new ui_touristCheck();
				splitPane.setRightComponent(panel_1.add(touristCheck.getContentPane()));
			}
		});
		label_6.setFont(new Font("宋体", Font.BOLD, 14));
		label_6.setBounds(10, 114, 122, 24);
		panel.add(label_6);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_4.setBounds(-16, 114, 200, 23);
		panel.add(label_4);
		
		JPanel panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\r\n\u52A8\u7269\u56ED\u5F00\u653E\u65F6\u95F4\uFF1A\r\n\r\n4\u67081\u65E5----10\u670831\u65E5\uFF1A 7:30----18:00 \r\n11\u67081\u65E5----3\u670831\u65E5\uFF1A 7:30----17:00\r\n\r\n\u670D\u52A1\u76D1\u7763\u7535\u8BDD\uFF1A0000000");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("宋体", Font.BOLD, 16));
		textPane.setEditable(false);
		textPane.setBackground(new Color(124, 252, 0));
		textPane.setBounds(0, 0, 768, 745);
		panel_2.add(textPane);
	}
}
