/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
public class ui_ShowAnimal5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_ShowAnimal5 frame = new ui_ShowAnimal5();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("哺乳类窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_ShowAnimal5() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u52A8\u7269\u77E5\u8BC6\u5E93");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(10, 10, 103, 35);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel(" \u54FA\u4E73\u7EB2  ");
		lblNewLabel.setBounds(281, 52, 162, 38);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 33));
		lblNewLabel.setForeground(Color.RED);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 769, 193);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (12).jpg")));
		label_1.setBounds(18, 10, 169, 143);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u79E6\u5CAD\u7F9A\u725B");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(47, 168, 80, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (11).jpg")));
		label_3.setBounds(205, 10, 169, 143);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (2).jpg")));
		label_4.setBounds(392, 10, 169, 143);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (4).jpg")));
		label_5.setBounds(579, 10, 169, 143);
		panel.add(label_5);
		
		JLabel label_12 = new JLabel("\u871C\u718A");
		label_12.setFont(new Font("宋体", Font.BOLD, 18));
		label_12.setBounds(263, 170, 80, 15);
		panel.add(label_12);
		
		JLabel label_11 = new JLabel("\u5CA9\u7F8A");
		label_11.setFont(new Font("宋体", Font.BOLD, 18));
		label_11.setBounds(440, 170, 80, 15);
		panel.add(label_11);
		
		JLabel label_13 = new JLabel("\u975E\u6D32\u72EE");
		label_13.setFont(new Font("宋体", Font.BOLD, 18));
		label_13.setBounds(630, 170, 80, 15);
		panel.add(label_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 303, 769, 193);
		getContentPane().add(panel_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (3).jpg")));
		label_6.setBounds(18, 10, 169, 143);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("\u91D1\u4E1D\u7334");
		label_7.setFont(new Font("宋体", Font.BOLD, 18));
		label_7.setBounds(47, 168, 80, 15);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (5).jpg")));
		label_8.setBounds(205, 10, 169, 143);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (8).jpg")));
		label_9.setBounds(392, 10, 169, 143);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/ThumbGen (0).jpg")));
		label_10.setBounds(579, 10, 169, 143);
		panel_1.add(label_10);
		
		JLabel label_14 = new JLabel("\u4E9A\u6D32\u8C61");
		label_14.setFont(new Font("宋体", Font.BOLD, 18));
		label_14.setBounds(232, 170, 80, 15);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("\u9E45\u5589\u7F9A");
		label_15.setFont(new Font("宋体", Font.BOLD, 18));
		label_15.setBounds(451, 170, 80, 15);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("\u9EC4\u9F2C");
		label_16.setFont(new Font("宋体", Font.BOLD, 18));
		label_16.setBounds(636, 170, 80, 15);
		panel_1.add(label_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 506, 769, 193);
		getContentPane().add(panel_2);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (1).jpg")));
		label_17.setBounds(18, 10, 169, 143);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("\u85CF\u539F\u7F8A");
		label_18.setFont(new Font("宋体", Font.BOLD, 18));
		label_18.setBounds(47, 168, 80, 15);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (10).jpg")));
		label_19.setBounds(205, 10, 169, 143);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (6).jpg")));
		label_20.setBounds(392, 10, 169, 143);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(ui_ShowAnimal5.class.getResource("/org/lq/ZOO/Animal/1 (7).jpg")));
		label_21.setBounds(579, 10, 169, 143);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("\u767D\u864E");
		label_22.setFont(new Font("宋体", Font.BOLD, 18));
		label_22.setBounds(263, 170, 80, 15);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("\u975E\u6D32\u8C61");
		label_23.setFont(new Font("宋体", Font.BOLD, 18));
		label_23.setBounds(440, 170, 80, 15);
		panel_2.add(label_23);
		
		JLabel label_24 = new JLabel("\u9ED1\u7334");
		label_24.setFont(new Font("宋体", Font.BOLD, 18));
		label_24.setBounds(630, 170, 80, 15);
		panel_2.add(label_24);
		
		JLabel lblNewLabel2 = new JLabel();
		lblNewLabel2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel2.setBounds(0, 0, 733, 757);
		contentPane.add(lblNewLabel2);
		panel.setOpaque(false);
		panel_1.setOpaque(false);
		panel_2.setOpaque(false);
		
		

	}
}
