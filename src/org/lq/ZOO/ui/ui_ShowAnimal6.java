/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
public class ui_ShowAnimal6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_ShowAnimal6 frame = new ui_ShowAnimal6();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("鸟类窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_ShowAnimal6() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u52A8\u7269\u77E5\u8BC6\u5E93");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(10, 10, 103, 35);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\u9E1F\u7EB2");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 28));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(305, 58, 318, 35);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 769, 193);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (1).jpg")));
		label_1.setBounds(18, 10, 169, 143);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u7EFF\u5C3E\u8679\u96C9");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(47, 168, 80, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (2).jpg")));
		label_3.setBounds(205, 10, 169, 143);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (3).jpg")));
		label_4.setBounds(392, 10, 169, 143);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (4).jpg")));
		label_5.setBounds(579, 10, 117, 143);
		panel.add(label_5);
		
		JLabel label_12 = new JLabel("\u767D\u8179\u9526\u9E21");
		label_12.setFont(new Font("宋体", Font.BOLD, 18));
		label_12.setBounds(263, 170, 80, 15);
		panel.add(label_12);
		
		JLabel label_11 = new JLabel("\u7D2B\u84DD\u91D1\u521A\u9E66\u9E49");
		label_11.setFont(new Font("宋体", Font.BOLD, 18));
		label_11.setBounds(440, 170, 121, 15);
		panel.add(label_11);
		
		JLabel label_13 = new JLabel("\u6591\u808B\u706B\u5C3E\u96C0");
		label_13.setFont(new Font("宋体", Font.BOLD, 18));
		label_13.setBounds(589, 168, 107, 15);
		panel.add(label_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 303, 769, 193);
		getContentPane().add(panel_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (5).jpg")));
		label_6.setBounds(18, 10, 169, 143);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("\u661F\u96C0");
		label_7.setFont(new Font("宋体", Font.BOLD, 18));
		label_7.setBounds(47, 168, 80, 15);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (6).jpg")));
		label_8.setBounds(205, 10, 169, 143);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (7).jpg")));
		label_9.setBounds(392, 10, 169, 143);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (8).jpg")));
		label_10.setBounds(579, 10, 169, 143);
		panel_1.add(label_10);
		
		JLabel label_14 = new JLabel("\u975E\u6D32\u7070\u9E66\u9E49");
		label_14.setFont(new Font("宋体", Font.BOLD, 18));
		label_14.setBounds(232, 170, 101, 15);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("\u52A0\u62FF\u9ED1\u96C1");
		label_15.setFont(new Font("宋体", Font.BOLD, 18));
		label_15.setBounds(451, 170, 80, 15);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("\u7070\u5195\u9E64");
		label_16.setFont(new Font("宋体", Font.BOLD, 18));
		label_16.setBounds(636, 170, 80, 15);
		panel_1.add(label_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 506, 769, 193);
		getContentPane().add(panel_2);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (9).jpg")));
		label_17.setBounds(18, 10, 169, 143);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("\u5927\u767D\u9E6D");
		label_18.setFont(new Font("宋体", Font.BOLD, 18));
		label_18.setBounds(47, 168, 80, 15);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (10).jpg")));
		label_19.setBounds(161, 10, 169, 143);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (11).jpg")));
		label_20.setBounds(340, 10, 169, 143);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(ui_ShowAnimal6.class.getResource("/org/lq/ZOO/Animal/niao (12).jpg")));
		label_21.setBounds(519, 10, 169, 143);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("\u767D\u6795\u9E64");
		label_22.setFont(new Font("宋体", Font.BOLD, 18));
		label_22.setBounds(216, 168, 80, 15);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("\u5927\u7EA2\u9E73");
		label_23.setFont(new Font("宋体", Font.BOLD, 18));
		label_23.setBounds(398, 168, 80, 15);
		panel_2.add(label_23);
		
		JLabel label_24 = new JLabel("\u7EFF\u5B54\u96C0");
		label_24.setFont(new Font("宋体", Font.BOLD, 18));
		label_24.setBounds(574, 168, 80, 15);
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
