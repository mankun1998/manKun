package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

@Log4j
public class ui_forget_password extends JFrame {

	private JPanel contentPane;
	private JTextField admin;
	private JTextField IDcard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_forget_password frame = new ui_forget_password();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_forget_password() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_forget_password.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u5FD8\u8BB0\u5BC6\u7801");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		admin = new JTextField();
		admin.setBounds(54, 37, 145, 21);
		panel.add(admin);
		admin.setColumns(10);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8D26\u53F7");
		label.setBounds(223, 40, 94, 15);
		panel.add(label);
		
		IDcard = new JTextField();
		IDcard.setBounds(54, 93, 145, 21);
		panel.add(IDcard);
		IDcard.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u8EAB\u4EFD\u8BC1\u53F7");
		label_1.setBounds(223, 96, 131, 15);
		panel.add(label_1);
		
		JButton affirm = new JButton("\u786E\u8BA4");
		affirm.addMouseListener(new MouseAdapter() {
			String admin_txt=admin.getText();
			String IDcard_txt=IDcard.getText();
			
			//确认键 根据输入结果进行查询
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}
		});
		affirm.setBounds(73, 172, 93, 23);
		panel.add(affirm);
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.setBounds(223, 172, 93, 23);
		panel.add(cancel);
	}
}
