package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextPane;
import java.awt.Font;

/**
 * @author许浩
 * @2019年7月4日
 * @ui_interestingKnowledge.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月4日
 */
@Log4j
public class ui_educationalDynamics extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_educationalDynamics frame = new ui_educationalDynamics();
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
	public ui_educationalDynamics() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(124, 252, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ui_educationalDynamics.class.getResource("/org/lq/ZOO/icon/mapPlace/pat.jpg")));
		label.setBounds(457, 525, 324, 248);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_educationalDynamics.class.getResource("/org/lq/ZOO/icon/mapPlace/pat2.jpg")));
		label_1.setBounds(471, 54, 300, 248);
		panel.add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setOpaque(false);
		textPane.setBackground(new Color(124, 252, 0));
		textPane.setEditable(false);
		textPane.setText("\t\t\t\u4E09\u6708\u5468\u672B\u52A8\u7269\u8BFE\u5802\u2014\u2014\u957F\u5F97\u50CF\u201C\u732A\u201D\u7684\u52A8\u7269\r\n \r\n2019\u5E74\u662F\u519C\u5386\u5DF1\u4EA5\u732A\u5E74\r\n\r\n\u52A8\u7269\u56ED\u91CC\u6709\u4E2A\u957F\u5F97\u50CF\u201C\u732A\u201D\u7684\u840C\u5BA0\uFF0C\r\n\u7260\u53EF\u7231\u53C8\u5584\u826F\uFF0C\u80C6\u5C0F\u53C8\u5446\u840C\r\n\u7260\u662F\u6700\u539F\u59CB\u7684\u5947\u8E44\u7C7B\u52A8\u7269\uFF0C \r\n\u7260\u6709\u53EF\u4EE5\u4F38\u7F29\u7684\u9F3B\u5B50\uFF0C\u548C\u5706\u6EDA\u6EDA\u7684\u8EAB\u4F53\r\n \r\n\u559C\u6B22\u6C34\uFF0C\u5584\u4E8E\u6E38\u6CF3\u548C\u6F5C\u6C34\uFF0C\r\n\u5728\u5D0E\u5C96\u7684\u5C71\u5730\u4E5F\u80FD\u5954\u8D70\u81EA\u5982\r\n\u7260\u662F\u690D\u7269\u7684\u6563\u64AD\u8005\uFF0C\u5927\u81EA\u7136\u7684\u6069\u4EBA\u3002\r\n\r\n\u7260\u662F\u8C01\u5462\uFF1F\r\n\u7260\u7231\u5403\u4EC0\u4E48\u5462\uFF1F\r\n\u7260\u5C0F\u65F6\u5019\u957F\u4EC0\u4E48\u6837\u5B50\u5462\uFF1F\r\n\u8FD8\u6709\u8BB8\u591A\u9C9C\u4E3A\u4EBA\u77E5\u7684\u4E8B\u60C5\u7B49\u5F85\u4F60\u6765\u63A2\u7D22\uFF0C\r\n\u60F3\u4E86\u89E3\u66F4\u591A\u7684\u7260\u5417\uFF1F\u90A3\u5C31\u67653\u6708\u52A8\u7269\u8BFE\u5802\u4E3A\u60A8\u63ED\u6653\u7B54\u6848\uFF01\r\n \r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u79D1\u666E\u9986\u4F1A\u4E0D\u5B9A\u671F\u63A8\u51FA\u9002\u5408\u5C11\u5E74\u513F\u7AE5\u5404\u4E2A\u5E74\u9F84\u6BB5\u7684\u6D3B\u52A8\uFF0C\u8BF7\u60A8\u968F\u65F6\u5173\u6CE8\u5317\u4EAC\u52A8\u7269\u56ED\u7F51\u7AD9\u548C\u5317\u4EAC\u52A8\u7269\u56ED\u4FDD\u62A4\u6559\u80B2\u4E2D\u5FC3\u5FAE\u4FE1\u3002\r\n  1.\u4E0A\u8BFE\u65F6\u95F4\uFF1A\u6BCF\u5468\u516D\u3001\u65E5\u4E0A\u4E0B\u5348\u5404\u4E24\u573A 10\uFF1A00\u300114\uFF1A00 \uFF08\u6BCF\u8282\u8BFE40\u5206\u949F\u5DE6\u53F3\uFF09\r\n  2.\u62A5\u540D\u65B9\u5F0F\uFF1A\u9884\u7EA6\u62A5\u540D\u2014\u2014\u5173\u6CE8\u201C\u5317\u4EAC\u52A8\u7269\u56ED\u4FDD\u62A4\u6559\u80B2\u201D\u5FAE\u4FE1\uFF0C\u70B9\u51FB\u201C\u7EA6\u6211\u5440\u201D\u7EA6\u8BFE\u5802\u6309\u8981\u6C42\u62A5\u540D\u5373\u53EF\u3002\uFF08\u514D\u8D39\u4E0A\u8BFE\u54E6\uFF09\r\n  3.\u96C6\u5408\u5730\u70B9\uFF1A\u5317\u4EAC\u52A8\u7269\u56ED\u79D1\u666E\u9986\u8D1F\u4E00\u5C42\u751F\u6001\u6559\u5BA4\r\n  4.\u4E0A\u8BFE\u5730\u70B9\uFF1A\u6839\u636E\u6388\u8BFE\u5185\u5BB9\u8FDB\u884C\u8C03\u6574\r\n  5.\u9002\u5408\u5E74\u9F84\uFF1A4\u5C81\u20146\u5C81\r\n  6.\u6D3B\u52A8\u987B\u77E5\uFF1A\r\n   \uFF081\uFF09\u5165\u573A\u540E\u8BF7\u5BB6\u957F\u96C6\u4E2D\u5728\u5BB6\u957F\u4F11\u606F\u533A\u4F11\u606F\uFF0C\u7ED9\u5B69\u5B50\u4E00\u4E2A\u5C55\u73B0\u81EA\u5DF1\u7684\u673A\u4F1A\uFF0C\u9F13\u52B1\u5B69\u5B50\u72EC\u7ACB\u5B8C\u6210\u5404\u9879\u6D3B\u52A8\u3002\r\n   \uFF082\uFF09\u4E0E\u9879\u76EE\u52A8\u7269\u63A5\u89E6\u5FC5\u987B\u5728\u6559\u5E08\u6307\u5BFC\u4E0B\u8FDB\u884C\uFF0C\u8BF7\u52FF\u9AD8\u58F0\u55A7\u54D7\uFF0C\u4EE5\u514D\u60CA\u6270\u52A8\u7269\u3002\r\n   \uFF083\uFF09\u6D3B\u52A8\u4E0D\u6536\u53D6\u4EFB\u4F55\u8D39\u7528\uFF08\u5BB6\u957F\u53EF\u8FDB\u5165\uFF09\r\n   \uFF084\uFF09\u6BCF\u8282\u8BFE\u4E0A\u8BFE\u5C0F\u670B\u53CB\u6700\u591A\u4E3A10\u4EBA\r\n  7.\u6CE8\u610F\u4E8B\u9879\uFF1A\u5982\u5B69\u5B50\u5728\u6559\u5E08\u7684\u6307\u5BFC\u4E0B\u4E0D\u80FD\u5B8C\r\n\u6210\u8BFE\u5802\u5185\u5BB9\uFF0C\u6216\u51FA\u73B0\u60C5\u7EEA\u4E0D\u597D\u7B49\u6270\u4E71\u8BFE\u5802\u79E9\u5E8F\r\n\u7684\u60C5\u51B5\uFF0C\u6559\u5E08\u5C06\u8BF7\u5B69\u5B50\u548C\u5BB6\u957F\u4E2D\u9014\u9000\u51FA\u8BFE\u5802\uFF0C\r\n\u8BF7\u5404\u4F4D\u5BB6\u957F\u8C05\u89E3\uFF01");
		textPane.setBounds(10, 10, 577, 654);
		panel.add(textPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel.setBounds(0, 0, 781, 787);
		panel.add(lblNewLabel);
	}
}
