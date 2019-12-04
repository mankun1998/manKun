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

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
public class ui_ShowAnimal7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_ShowAnimal7 frame = new ui_ShowAnimal7();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("爬行动物窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_ShowAnimal7() {
		setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 490, 779, 214);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(32, 25, 169, 121);
		panel_2.add(label_5);
		label_5.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (4).jpg")));
		
		JLabel label_13 = new JLabel("\u6ED1\u9F20\u86C7");
		label_13.setBounds(84, 170, 80, 15);
		panel_2.add(label_13);
		label_13.setFont(new Font("宋体", Font.BOLD, 18));
		
		JLabel label = new JLabel("\u52A8\u7269\u77E5\u8BC6\u5E93");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(10, 10, 103, 35);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("                   \u722C\u884C\u7EB2  ");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 55, 769, 35);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 769, 193);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (1).jpg")));
		label_1.setBounds(18, 10, 169, 143);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u4E09\u7EBF\u95ED\u6BDB\u9F9F");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(47, 168, 80, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (2).jpg")));
		label_3.setBounds(271, 10, 169, 143);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (3).jpg")));
		label_4.setBounds(502, 10, 169, 143);
		panel.add(label_4);
		
		JLabel label_12 = new JLabel("\u767D\u5934\u8770");
		label_12.setFont(new Font("宋体", Font.BOLD, 18));
		label_12.setBounds(347, 168, 80, 15);
		panel.add(label_12);
		
		JLabel label_11 = new JLabel("\u767E\u82B1\u9526\u86C7");
		label_11.setFont(new Font("宋体", Font.BOLD, 18));
		label_11.setBounds(552, 168, 80, 15);
		panel.add(label_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 303, 769, 193);
		getContentPane().add(panel_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (5).jpg")));
		label_6.setBounds(18, 10, 169, 143);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("\u91D1\u73AF\u86C7");
		label_7.setFont(new Font("宋体", Font.BOLD, 18));
		label_7.setBounds(47, 168, 80, 15);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (6).jpg")));
		label_8.setBounds(277, 10, 169, 143);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ui_ShowAnimal7.class.getResource("/org/lq/ZOO/Animal/pa (7).jpg")));
		label_9.setBounds(508, 10, 169, 143);
		panel_1.add(label_9);
		
		JLabel label_14 = new JLabel("\u773C\u955C\u86C7");
		label_14.setFont(new Font("宋体", Font.BOLD, 18));
		label_14.setBounds(338, 168, 80, 15);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("\u87D2");
		label_15.setFont(new Font("宋体", Font.BOLD, 18));
		label_15.setBounds(585, 168, 80, 15);
		panel_1.add(label_15);

		JLabel lblNewLabel2 = new JLabel();
		lblNewLabel2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel2.setBounds(0, 0,742, 743);
		contentPane.add(lblNewLabel2);
		panel.setOpaque(false);
		panel_1.setOpaque(false);
		panel_2.setOpaque(false);
	}

}
