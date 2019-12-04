package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

/**
 * @author许浩
 * @2019年7月1日
 * @ui_information.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月1日
 */
public class ui_information extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_information frame = new ui_information();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_information() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setOpaque(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setEditable(false);
		textPane.setFont(new Font("宋体", Font.BOLD, 20));
		textPane.setText("\u8054\u7CFB\u4EBA    :  \u5BA2\u670D\u4E2D\u5FC3\r\n\r\n\u8054\u7CFB\u90AE\u7BB1  :  000000@163.com\r\n\r\n\u8054\u7CFB\u7535\u8BDD  :  000000000\r\n\r\n\u6280\u672F\u652F\u6301  :   (\u53EA\u5904\u7406\u6280\u672F\u95EE\u9898)\r\n\r\n\u5730\u5740      : ************");
		textPane.setBounds(232, 211, 362, 344);
		panel.add(textPane);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel.setBounds(0, 0, 733, 757);
		panel.add(lblNewLabel);
	}
}
