package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
public class ui_interestingKnowledge extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_interestingKnowledge frame = new ui_interestingKnowledge();
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
	public ui_interestingKnowledge() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 842);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(124, 252, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setOpaque(false);
		textPane.setFont(new Font("宋体", Font.PLAIN, 12));
		textPane.setText("\t\t\t\u732B\u79D1\u52A8\u7269\u4E0E\u72AC\u79D1\u52A8\u7269\u7684\u533A\u522B\r\n\r\n\u732B\u79D1\u52A8\u7269\u4E0E\u72AC\u79D1\u52A8\u7269\u540C\u5C5E\u4E8E\u98DF\u8089\u76EE\u7684\u52A8\u7269\u3002\r\n\u732B\u732B\u548C\u72D7\u72D7\u60F3\u5FC5\u5927\u5BB6\u5E76\u4E0D\u964C\u751F\uFF0C\u5F88\u591A\u4EBA\u5BB6\u91CC\u90FD\u517B\u7740\u8FD9\u4E9B\u4F34\u4FA3\u52A8\u7269\u3002\u5B83\u4EEC\u8DDF\u4EBA\u7C7B\u7684\u5173\u7CFB\u975E\u5E38\u4EB2\u5BC6\u3002\u4F46\u60A8\u77E5\u9053\u72AC\u79D1\u548C\u732B\u79D1\u52A8\u7269\u4E4B\u95F4\uFF0C\u6709\u54EA\u4E9B\u533A\u522B\u5417\uFF1F\r\n\r\n\u4E00\u3001\u5916\u8C8C\uFF1A\r\n\u732B\u79D1\u52A8\u7269\u6BDB\u8272\u5927\u591A\u6570\u6709\u82B1\u7EB9\uFF1B\u72AC\u79D1\u52A8\u7269\u6BDB\u8272\u5355\u4E00\u3002\r\n\u732B\u79D1\u52A8\u7269\u722A\u53EF\u4EE5\u4F38\u7F29\uFF0C\u9700\u8981\u7684\u65F6\u5019\u653E\u51FA\uFF1B\u72AC\u79D1\u52A8\u7269\u7684\u722A\u4E0D\u80FD\u591F\u4F38\u7F29\u3002\r\n\r\n\u4E8C\u3001\u5934\u9AA8\uFF1A\r\n\u732B\u79D1\u52A8\u7269\u7684\u5934\u9AA8\u8F83\u77ED\uFF0C\u7259\u9F7F\u8F83\u5C11\uFF0C\u81FC\u9F7F\u4E0D\u53D1\u8FBE\uFF0C\u4E0D\u80FD\u5403\u9AA8\u5934\u3002\r\n\u72AC\u79D1\u52A8\u7269\u7684\u5934\u9AA8\u8F83\u957F\uFF0C\u543B\u90E8\u66F4\u957F\uFF0C\u7259\u9F7F\u66F4\u591A\uFF0C\u53D1\u8FBE\u7684\u81FC\u9F7F\u53EF\u4EE5\u5C06\u730E\u7269\u8FDE\u76AE\u5E26\u9AA8\u5934\u6495\u626F\u5403\u6389\u3002\r\n\r\n\u4E09\u3001\u98DF\u6027\u548C\u5C45\u4F4F\u73AF\u5883\uFF1A\r\n\u732B\u79D1\u52A8\u7269\u57FA\u672C\u90FD\u662F\u72EC\u5C45\uFF08\u975E\u6D32\u72EE\u662F\u7FA4\u5C45\uFF09\uFF0C\u5927\u591A\u5C45\u4F4F\u5728\u68EE\u6797\u4E2D\uFF0C\u591C\u884C\u6027\uFF0C\u4E25\u683C\u7684\u8089\u98DF\u52A8\u7269\u3002\r\n\u72AC\u79D1\u52A8\u7269\u6816\u606F\u5728\u5F00\u9614\u5730\u5E26\uFF0C\u5927\u591A\u6570\u7FA4\u5C45\uFF0C\u663C\u884C\u6027\uFF0C\u4E0D\u4E25\u683C\u7684\u98DF\u8089\u52A8\u7269\uFF0C\u5373\u53EF\u4EE5\u8089\u98DF\u4E5F\u53EF\u4EE5\u6742\u98DF\u3002\r\n\r\n\u8FD8\u6709\u4E00\u4E2A\u7279\u5F81\u662F\uFF0C\u732B\u79D1\u52A8\u7269\u7684\u820C\u5934\u4E0A\u6709\u5C16\u5C16\u7684\u5012\u523A\uFF0C\u80FD\u591F\u5C06\u9644\u7740\u5728\u9AA8\u9ABC\u4E0A\u7684\u8089\u8214\u4E0B\u6765\u3002\u72AC\u79D1\u52A8\u7269\u7684\u820C\u5934\u4E0A\u6CA1\u6709\u3002\r\n\u867D\u7136\u76F4\u89C2\u4ECE\u8089\u773C\u80FD\u591F\u533A\u5206\u732B\u732B\u548C\u72D7\u72D7\uFF0C\u4F46\u5B9E\u9645\u4E0A\u4ED6\u4EEC\u6709\u8FD9\u4E48\u591A\u7684\u533A\u522B\u5462\u3002\u73B0\u5728\u60A8\u77E5\u9053\u72AC\u79D1\u52A8\u7269\u548C\u732B\u79D1\u52A8\u7269\u6709\u54EA\u4E9B\u533A\u522B\u4E86\u5417\uFF1F");
		textPane.setEditable(false);
		textPane.setBackground(new Color(124, 252, 0));
		textPane.setBounds(10, 10, 761, 316);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setOpaque(false);
		textPane_1.setBackground(new Color(124, 252, 0));
		textPane_1.setEditable(false);
		textPane_1.setText("\t\t\t\u4E0D\u670D\u5C31\u5E72\r\n\r\n\u975E\u6D32\u5927\u8349\u539F\uFF0C\u662F\u73B0\u4EE3\u4EBA\u7C7B\u8D77\u6E90\u7684\u5730\u65B9\uFF0C\u81F3\u4ECA\u4ECD\u4FDD\u7559\u7740\u539F\u59CB\u7684\u9762\u8C8C\u3002\u201C\u5730\u7403\u4E0A\u6709\u4E00\u4E2A\u5730\u65B9\uFF0C\u4ECD\u7136\u5904\u4E8E\u751F\u547D\u7684\u6700\u521D\u9636\u6BB5\uFF0C\u5E9E\u5927\u7684\u517D\u7FA4\u4ECD\u7136\u5728\u90A3\u91CC\u81EA\u7531\u5954\u9A70\u201D\u7F51\u4E0A\u6709\u8FD9\u6837\u7684\u8BDD\u5F62\u5BB9\u975E\u6D32\u5927\u8349\u539F\u3002\u540C\u65F6\u4E5F\u662F\u5F88\u591A\u4EBA\u5411\u5F80\u7684\u81EA\u7136\u5929\u5802\u3002\r\n\r\n\u975E\u6D32\u8349\u539F\u4E0A\u6709\u5F88\u591A\u5927\u5BB6\u719F\u77E5\u7684\u52A8\u7269\u3002\u6BD4\u5982\u72EE\u5B50\u3001\u5927\u6C34\u725B\u3001\u9B23\u72D7\u3001\u730E\u8C79\u3001\u957F\u9888\u9E7F\u3001\u6CB3\u9A6C\u3001\u5927\u8C61.......\u7B49\u7B49\u7B49\u7B49\u3002\u800C\u4ECA\u5929\u6211\u4EEC\u8981\u8BF4\u7684\u662F\u975E\u6D32\u4E0A\u7684\u201C\u5E73\u5934\u54E5\u201D\u2014\u2014\u871C\u737E\r\n\u5176\u5B9E\u5355\u5355\u4ECE\u957F\u76F8\u6765\u8BF4\uFF0C\u4ED6\u4EEC\u5176\u5B9E\u633A\u840C\u7684\uFF0C\u4E5F\u86EE\u53EF\u7231\u7684\u3002\r\n\r\n\u4F46\u60A8\u80FD\u60F3\u8C61\u5417\uFF1F\u8FD9\u79CD\u53EF\u7231\u7684\u52A8\u7269\u5B97\u65E8\u5C31\u662F\u201C\u4E0D\u670D\u5C31\u662F\u5E72\uFF01\u201D\u5C06\u6253\u67B6\u8FDB\u884C\u5230\u5E95\u3002\u4E00\u822C\u5728\u52A8\u7269\u7684\u4E16\u754C\u91CC\uFF0C\u8EAB\u5F62\u51B3\u5B9A\u4E86\u5F88\u591A\u4E8B\u60C5\uFF0C\u5728\u4E00\u822C\u7684\u60C5\u51B5\u4E0B\uFF08\u80B2\u513F\u671F\u9664\u5916\uFF09\uFF0C\u770B\u5230\u6BD4\u81EA\u5DF1\u8EAB\u5F62\u5927\u7684\u90FD\u4F1A\u8DD1\u5F00\u7684\u3002\u4F46\u871C\u737E\u4E0D\u4E00\u6837\uFF0C\u4ED6\u4EEC\u4E5F\u4F1A\u8BC4\u6D4B\u4E00\u4E0B\u6218\u529B\uFF0C\u4F46\u5728\u4ED6\u4EEC\u773C\u91CC\uFF0C\u6240\u6709\u7269\u4F53\u90FD\u4F1A\u88AB\u7F29\u5C0F\uFF08\u56E0\u4E3A\u5B83\u4EEC\u7684\u773C\u7751\uFF09\uFF0C\u5916\u52A0\u4ED6\u4EEC\u7684\u8FF7\u4E4B\u81EA\u4FE1\uFF0C\u9020\u6210\u51B2\u52A8\u7ECF\u5E38\u4F1A\u5347\u7EA7\u3002\u6BD4\u5982\u4ED6\u770B\u89C1\u72EE\u5B50\uFF0C\u4F1A\u5148\u5413\u552C\u5BF9\u65B9\uFF0C\u201C\u4F60\u543C\u6211\u662F\u5427\uFF1F\u6211\u543C\u7684\u6BD4\u4F60\u8FD8\u51F6\uFF01\u201D\u60A8\u53EF\u4EE5\u60F3\u8C61\u4E00\u4E0B \u4E00\u53EA\u8428\u6469\u8FFD\u7740\u72EE\u5B50\u5230\u5904\u8DD1\u662F\u4E2A\u4EC0\u4E48\u6837\u7684\u573A\u9762\uFF08\u5E73\u5934\u54E5\u7684\u8EAB\u957F\u53EA\u670915\u5398\u7C73\uFF09\u3002\u662F\u7684\uFF0C\u60A8\u6CA1\u770B\u9519\uFF0C\u5C31\u662F\u8FFD\u7740\u72EE\u5B50\u5230\u5904\u8DD1\uFF0C\u751A\u81F3\u8FD8\u4E0D\u662F\u4E00\u53EA\u72EE\u5B50\u3002\u5C31\u8FDE\u975E\u6D32\u8349\u539F\u4E0A\u81ED\u540D\u662D\u8457\u7684\u9B23\u72D7\uFF0C\u89C1\u5230\u5E73\u5934\u54E5\u4E5F\u53EA\u80FD\u9000\u907F\u4E09\u820D\u3002\u773C\u955C\u738B\u86C7\u53EF\u4EE5\u8BF4\u5267\u6BD2\u7684\u4EE3\u540D\u8BCD\uFF0C\u4E00\u822C\u52A8\u7269\u88AB\u773C\u955C\u738B\u86C7\u54AC\u5230\u4F1A\u600E\u4E48\u6837\uFF1F\u7ED3\u5C40\u4E0D\u8A00\u800C\u55BB\u3002\u800C\u6211\u4EEC\u5E73\u5934\u54E5\u88AB\u54AC\u5230\uFF1F\u53EA\u662F\u660F\u77612\u4E2A\u5C0F\u65F6\uFF0C\u6BD2\u7D20\u5C31\u4F1A\u81EA\u52A8\u89E3\u9664\u3002\u4ED6\u4EEC\u4E5F\u662F\u4E3A\u6570\u5F88\u5C11\u7684\u514D\u75AB\u6BD2\u7D20\u7684\u52A8\u7269\u3002\r\n\r\n\u4E16\u754C\u4E0A\u6CA1\u6709\u54EA\u5BB6\u52A8\u7269\u56ED\u9972\u517B\u8FC7\u871C\u737E\uFF0C\u4ED6\u4EEC\u5C31\u662F\u6D3B\u8131\u8131\u7684\u8D8A\u72F1\u4E13\u5BB6\uFF0C\u60F3\u5C3D\u5404\u79CD\u65B9\u6CD5\u8D8A\u72F1\u3002\u4F5C\u8005\u5F88\u6B23\u8D4F\u4ED6\u4EEC\u7684\u7CBE\u795E\uFF0C\u90A3\u79CD\u4E0D\u5C48\u4E0D\u6320\uFF0C\u594B\u529B\u62FC\u640F\u7684\u7CBE\u795E\u3002");
		textPane_1.setBounds(10, 336, 761, 348);
		panel.add(textPane_1);
		JLabel lblNewLabe2 = new JLabel("New label");
		lblNewLabe2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabe2.setBounds(0, 0, 813, 796);
		panel.add(lblNewLabe2);
		
		
	}
}
