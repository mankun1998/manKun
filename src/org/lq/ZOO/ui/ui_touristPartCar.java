package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年7月1日
 * @ui_touristPartCar.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月1日
 */
@Log4j
public class ui_touristPartCar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_touristPartCar frame = new ui_touristPartCar();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("停车场管理窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_touristPartCar() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_touristPartCar.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u505C\u8F66\u573A\u7BA1\u7406\u89C4\u5B9A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 830);
		contentPane = new JPanel();
		contentPane.setBounds(194, 0, 776, 755);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 10, 678, 772);
		textPane.setBackground(new Color(0, 255, 0));
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setFont(new Font("宋体", Font.BOLD, 20));
		textPane.setText("\u52A8\u7269\u56ED\u505C\u8F66\u573A\u7BA1\u7406\u89C4\u5B9A\r\n\r\n\u8F66\u4E3B\u5E94\u9075\u5B88\u5E02\u8F66\u8F86\u7BA1\u7406\u90E8\u95E8\u5236\u5B9A\u7684\u6709\u5173\u89C4\u5B9A\u548C\u52A8\u7269\u56ED\u505C\u8F66\u573A\u7BA1\u7406\u89C4\u5B9A\u3002\r\n\r\n1. \u8FDB\u5165\u516C\u56ED\u505C\u8F66\u573A\u7684\u8F66\u8F86\uFF0C\u9700\u4E25\u683C\u6309\u4EA4\u901A\u6807\u5FD7\u884C\u9A76\uFF0C\u5728\u8FDB\u5165\u505C\u8F66\u4F4D\u7F6E\u7684\u884C\u9A76\u8DEF\u6BB5\u671F\u95F4\uFF0C\u8981\u6CE8\u610F\u907F\u8BA9\u6E38\u5BA2\u3002\u8F66\u901F\u4E0D\u5F97\u8D85\u8FC75\u516C\u91CC/\u5C0F\u65F6\uFF0C\u8FDB\u5165\u516C\u56ED\u5927\u95E8\u540E\u4E25\u7981\u9E23\u7B1B\u3002\r\n\r\n2. \u51E1\u8FDB\u5165\u516C\u56ED\u505C\u8F66\u573A\u7684\u6E38\u5BA2\u8F66\u8F86\uFF0C\u5FC5\u987B\u670D\u4ECE\u516C\u56ED\u8F66\u8F86\u7BA1\u7406\u5458\u7684\u7BA1\u7406\uFF0C\u6309\u6307\u5B9A\u4F4D\u7F6E\u505C\u653E\u3002\u4E0D\u5F97\u5835\u585E\u6E38\u5BA2\u6B65\u884C\u901A\u9053\uFF0C\u4E0D\u5F97\u5F71\u54CD\u516C\u56ED\u5176\u5B83\u516C\u5171\u8BBE\u65BD\u7684\u4F7F\u7528\u3002\r\n\r\n3. \u516C\u56ED\u505C\u8F66\u573A\u5185\u4E25\u7981\u5438\u70DF\u3001\u4F7F\u7528\u660E\u706B\uFF0C\u4E25\u7981\u5C06\u6613\u71C3\u3001\u6613\u7206\u548C\u5176\u5B83\u5371\u9669\u54C1\u5E26\u5165\u516C\u56ED\u505C\u8F66\u573A\uFF0C\u4E25\u7981\u5C06\u4E2A\u4EBA\u5BA0\u7269\u5E26\u5165\u516C\u56ED\uFF0C\u4E25\u7981\u5C06\u8F66\u8F86\u9A76\u5165\u8349\u576A\u548C\u7EFF\u5730\u3002\r\n\r\n4. \u4E25\u7981\u5728\u505C\u8F66\u573A\u5185\u52A0\u6CB9\u3001\u4FEE\u8F66\u3001\u6D17\u8F66\u3001\u8BD5\u5239\u8F66\u548C\u7EC3\u4E60\u9A7E\u9A76\u8F66\u8F86\u7B49\u3002\u8981\u81EA\u89C9\u7231\u62A4\u516C\u56ED\u548C\u505C\u8F66\u573A\u5185\u7684\u8BBE\u65BD\u3001\u8BBE\u5907\uFF0C\u81EA\u89C9\u4FDD\u6301\u516C\u56ED\u548C\u505C\u8F66\u573A\u5185\u7684\u6E05\u6D01\u3002\r\n\r\n5. \u8BF7\u8F66\u4E3B\u5C06\u8F66\u8F86\u505C\u597D\u540E\uFF0C\u8981\u968F\u8EAB\u643A\u5E26\u8F66\u5185\u7684\u8D35\u91CD\u7269\u54C1\uFF0C\u786E\u8BA4\u9501\u597D\u8F66\u95E8\u3001\u7A97\u540E\u65B9\u53EF\u79BB\u53BB\uFF0C\u540C\u65F6\u6253\u5F00\u9632\u76D7\u7CFB\u7EDF\uFF0C\u5982\u53D1\u751F\u8F66\u5185\u7269\u54C1\u88AB\u76D7\uFF0C\u7531\u8F66\u4E3B\u672C\u4EBA\u8D1F\u8D23\u3002\r\n ");
		textPane.setBounds(10, 10, 709, 772);
		panel.add(textPane);
	}

}
