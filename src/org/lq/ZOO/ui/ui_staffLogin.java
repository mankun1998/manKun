package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年7月2日
 * @ui_login.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月2日
 */
@Log4j
public class ui_staffLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_staffLogin frame = new ui_staffLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("员工登录窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_staffLogin() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_staffLogin.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 404, 198);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(124, 252, 0));
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\u5458\u5DE5\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(54, 152, 108, 23);
		panel_1.add(btnNewButton);
		
		JButton button_2 = new JButton("\u5FD8\u8BB0\u5BC6\u7801");
		button_2.setBounds(216, 152, 93, 23);
		panel_1.add(button_2);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8D26\u53F7 : ");
		label.setFont(new Font("宋体", Font.BOLD, 14));
		label.setBounds(54, 30, 108, 23);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801 :");
		label_1.setFont(new Font("宋体", Font.BOLD, 14));
		label_1.setBounds(54, 76, 108, 30);
		panel_1.add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(168, 30, 141, 23);
		panel_1.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(168, 76, 141, 23);
		panel_1.add(textField_1);
	}
}
