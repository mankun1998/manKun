package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年7月3日
 * @ui_active.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月3日
 */
@Log4j
public class ui_parkCalendar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_parkCalendar frame = new ui_parkCalendar();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("公园日历窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_parkCalendar() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_parkCalendar.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		NewJfarm inst = new NewJfarm();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(124, 252, 0));
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
