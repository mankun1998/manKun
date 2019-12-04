/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;

import lombok.extern.log4j.Log4j;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JTextPane;


/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
@Log4j
public class ui_publicActive extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tab_main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_publicActive frame = new ui_publicActive();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("历史窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_publicActive() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 837);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 779, 789);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ui_publicActive.class.getResource("/org/lq/ZOO/icon/mapPlace/history_flash_temp.jpg")));
		label.setBounds(10, 10, 750, 339);
		panel_3.add(label);
		
		JTextPane txtpna = new JTextPane();
		txtpna.setFont(new Font("宋体", Font.BOLD, 18));
		txtpna.setEditable(false);
		txtpna.setBackground(new Color(124, 252, 0));
		txtpna.setText("\u7B80\u53F2\u6982\u8FF0\r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u59CB\u5EFA\u4E8E1906\u5E74\uFF0C\u5728\u897F\u76F4\u95E8\u5916\u4E50\u5584\u56ED\u3001\u7EE7\u56ED\u548C\u5E7F\u5584\u5BFA\u3001\u60E0\u5B89\u5BFA\u201C\u4E24\u56ED\u3001\u4E24\u5BFA\u201D\u65E7\u5740\u4E0A\u7684\u6E05\u201C\u519C\u4E8B\u8BD5\u9A8C\u573A\u201D\u5185\uFF0C\u7531\u5546\u90E8\u5949\u65E8\u7B79\u5EFA\u3002\u56ED\u5185\u7531\u52A8\u7269\u56ED\u3001\u690D\u7269\u56ED\u3001\u519C\u4E8B\u8BD5\u9A8C\u4E09\u90E8\u5206\u7EC4\u6210\u3002\u6700\u65E9\u7684\u52A8\u7269\u56ED\u4F4D\u4E8E\u56ED\u5185\u4E1C\u4FA7\uFF0C\u5360\u57301.5\u516C\u9877\uFF0C\u662F\u4E2D\u56FD\u5BF9\u516C\u4F17\u5F00\u653E\u6700\u65E9\u7684\u52A8\u7269\u56ED\u548C\u534E\u5317\u5730\u533A\u5BF9\u516C\u4F17\u5F00\u653E\u6700\u65E9\u7684\u516C\u56ED\u3002\u636E\u8003\u6B64\u5730\u4E5F\u662F\u4E2D\u56FD\u73B0\u4EE3\u52A8\u7269\u56ED\u3001\u690D\u7269\u56ED\u3001\u535A\u7269\u9986\u7684\u53D1\u7965\u5730\u3002\r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u4E8E1955\u5E74\u6B63\u5F0F\u5B9A\u540D\uFF0C\u76EE\u524D\u5360\u5730\u9762\u79EF\u7EA690\u516C\u9877\uFF0C\u5C55\u51FA\u73CD\u7A00\u91CE\u751F\u52A8\u7269\u7EA6500\u79CD\uFF0C5000\u4F59\u53EA\uFF0C\u5E74\u63A5\u5F85\u56FD\u5185\u5916\u6E38\u5BA2500\u4E07\u4EBA\u6B21\uFF0C\u53D1\u6325\u7740\u56FD\u5BB6\u52A8\u7269\u56ED\u529F\u80FD\u3002\u5317\u4EAC\u52A8\u7269\u56ED\u79C9\u627F\u201C\u6559\u80B2\u4FDD\u62A4\u5E76\u4E3E\uFF0C\u5B89\u5168\u670D\u52A1\u5E76\u91CD\u201D\u7684\u5DE5\u4F5C\u7406\u5FF5\uFF0C\u56F4\u7ED5\u5317\u4EAC\u5EFA\u8BBE\u4E16\u754C\u57CE\u5E02\u76EE\u6807\uFF0C\u52AA\u529B\u6253\u9020\u6210\u4E3A\u9762\u5411\u56FD\u5185\u6E38\u5BA2\u5C55\u793A\u9996\u90FD\u98CE\u91C7\uFF0C\u9762\u5411\u56FD\u5916\u6E38\u5BA2\u5C55\u793A\u4E2D\u56FD\u5F62\u8C61\u7684\u5317\u4EAC\u540D\u7247\u3002\u5317\u4EAC\u52A8\u7269\u56ED\u662F\u56FD\u5BB6\u91CD\u70B9\u516C\u56ED\u3001\u56FD\u5BB6\u91CD\u70B9\u6587\u7269\u4FDD\u62A4\u5355\u4F4D\u3001\u5168\u56FD\u79D1\u666E\u6559\u80B2\u57FA\u5730\u3001\u5168\u56FD4A\u7EA7\u666F\u533A\u3002\r\n\r\n\u6597\u8F6C\u661F\u79FB\uFF0C\u7269\u6362\u666F\u8FC1\uFF0C\u5F80\u6614\u8BD5\u9A8C\u573A\uFF0C\u4ECA\u65E5\u52A8\u7269\u56ED\u3002\u5C71\u77F3\u53E4\u5EFA\uFF0C\u5ECA\u6865\u4EAD\u69AD\uFF0C\u6CB3\u6CC9\u9642\u6C60\uFF0C\u82B1\u8349\u85E4\u6811\uFF0C\u722C\u866B\u6E38\u9C7C\uFF0C\u8D70\u517D\u98DE\u79BD\uFF0C\u6D4E\u6D4E\u4E00\u5802\uFF0C\u76F8\u5F97\u76CA\u5F70\u3002\u79D1\u5B66\u7814\u7A76\u3001\u4FDD\u62A4\u6559\u80B2\u3001\u6587\u5316\u4EA4\u6D41\u3001\u77E5\u8BC6\u4F20\u64AD\u3001\u6587\u7269\u835F\u8403\uFF0C\u529F\u80FD\u9F50\u5168\u3002\u5C11\u513F\u53D1\u5176\u5929\u771F\uFF0C\u6210\u4EBA\u89C5\u5176\u7AE5\u8DA3\u3002\u6625\u82B1\u79CB\u6708\uFF0C\u590F\u98CE\u51AC\u96EA\uFF0C\u6276\u8001\u643A\u5E7C\uFF0C\u7EDC\u7ECE\u4E0D\u7EDD\uFF0C\u5929\u4F26\u540C\u4EAB\uFF0C\u53E4\u56ED\u65B0\u6656\u3002");
		txtpna.setBounds(20, 363, 732, 426);
		panel_3.add(txtpna);

	}
}
