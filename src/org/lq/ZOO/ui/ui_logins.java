package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTabbedPane;

/**
 * @author许浩
 * @2019年7月2日
 * @ui_logins.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月2日
 */
@Log4j
public class ui_logins extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_logins frame = new ui_logins();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("组织结构窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_logins() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(124, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u7BA1\u7406\u5458\u5165\u53E3");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_login login = new ui_login();
				panel.removeAll();
				
				panel.add(login.getContentPane());
				panel.updateUI();
				SwingUtilities.updateComponentTreeUI(panel);
//				System.out.println(8);
//				panel.setLayout(getLayout());
			}
			
		});
		button.setBounds(76, 10, 99, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u5458\u5DE5\u5165\u53E3");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_staffLogin staffLogin =new ui_staffLogin();
				panel.removeAll();
				panel.add(staffLogin.getContentPane());
				panel.updateUI();
				SwingUtilities.updateComponentTreeUI(panel);
//				System.out.println(staffLogin);
//				panel.setLayout(getLayout());
			}
		});
		btnNewButton.setBounds(248, 10, 93, 23);
		contentPane.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(10, 43, 429, 228);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(127, 255, 0));
		textPane.setFont(new Font("宋体", Font.PLAIN, 22));
		textPane.setEditable(false);
		textPane.setText("\u672C\u7A97\u53E3\u4E3A\u5458\u5DE5\u7A97\u53E3\r\n\u8BF7\u6E38\u5BA2\u670B\u53CB\u9000\u51FA\r\n  \u8C22\u8C22\u5408\u4F5C");
		panel.add(textPane);
		
	}
}
