package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年7月1日
 * @ui_openPart.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月1日
 */
@Log4j
public class ui_openPart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_openPart frame = new ui_openPart();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("开放时间窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_openPart() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_openPart.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setResizable(false);
		setTitle("\u52A8\u7269\u56ED\u5F00\u653E\u65F6\u95F4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 799);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(0, 255, 0));
		textPane.setEditable(false);
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("宋体", Font.BOLD, 16));
		textPane.setText("\r\n\u52A8\u7269\u56ED\u5F00\u653E\u65F6\u95F4\uFF1A\r\n\r\n4\u67081\u65E5----10\u670831\u65E5\uFF1A 7:30----18:00 \r\n11\u67081\u65E5----3\u670831\u65E5\uFF1A 7:30----17:00\r\n\r\n\u670D\u52A1\u76D1\u7763\u7535\u8BDD\uFF1A0000000");
		textPane.setBounds(10, 10, 735, 731);
		panel.add(textPane);
	}
}
