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
public class ui_ShowAnimal8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_ShowAnimal8 frame = new ui_ShowAnimal8();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("两栖动物窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_ShowAnimal8() {
		setEnabled(false);
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
		
		JLabel lblNewLabel = new JLabel("  \u4E24\u6816\u7EB2  ");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 32));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(281, 55, 389, 35);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 769, 193);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_ShowAnimal8.class.getResource("/org/lq/ZOO/Animal/xi (1).jpg")));
		label_1.setBounds(18, 10, 169, 143);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u4E2D\u56FD\u6797\u86D9");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(47, 168, 80, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_ShowAnimal8.class.getResource("/org/lq/ZOO/Animal/xi (2).jpg")));
		label_3.setBounds(205, 10, 169, 143);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_ShowAnimal8.class.getResource("/org/lq/ZOO/Animal/xi (3).jpg")));
		label_4.setBounds(392, 10, 169, 143);
		panel.add(label_4);
		
		JLabel label_12 = new JLabel("\u7EC6\u75E3\u75A3\u8788");
		label_12.setFont(new Font("宋体", Font.BOLD, 18));
		label_12.setBounds(263, 170, 80, 15);
		panel.add(label_12);
		
		JLabel label_11 = new JLabel("\u864E\u7EB9\u86D9");
		label_11.setFont(new Font("宋体", Font.BOLD, 18));
		label_11.setBounds(440, 170, 80, 15);
		panel.add(label_11);
		
		
		JLabel lblNewLabel2 = new JLabel();
		lblNewLabel2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel2.setBounds(0, 0, 733, 757);
		contentPane.add(lblNewLabel2);
		panel.setOpaque(false);
		

	}

}
