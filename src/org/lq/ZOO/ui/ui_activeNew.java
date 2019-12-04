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
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JTree;
import java.awt.Toolkit;


/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
@Log4j
public class ui_activeNew extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTabbedPane tab_main;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_activeNew frame = new ui_activeNew();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("活动与新闻窗口打开错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_activeNew() {
		setResizable(false);
		setTitle("\u6D3B\u52A8\u4E0E\u65B0\u95FB");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_activeNew.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 861);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 10, 980, 813);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		panel_3.add(splitPane, BorderLayout.CENTER);
		splitPane.setResizeWeight(0.2);
		panel = new JPanel();
		panel.setBackground(new Color(107, 142, 35));
		splitPane.setLeftComponent(panel);
		
		panel.setLayout(null);
		

		JLabel label_5 = new JLabel("\u8FD1\u671F\u6D3B\u52A8");
		label_5.setBackground(new Color(124, 252, 0));
		label_5.setForeground(new Color(240, 255, 240));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_pubNotice active = new ui_pubNotice();
				splitPane.setRightComponent(panel_1.add(active.getContentPane()));
			}
		});
		label_5.setFont(new Font("宋体", Font.BOLD, 14));
		label_5.setBounds(10, 63, 122, 23);
		panel.add(label_5);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(107, 142, 35));
		label.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label.setBounds(-16, 63, 200, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_activeNew.class.getResource("/org/lq/ZOO/icon/mapPlace/news_heading.jpg")));
		label_1.setBounds(0, 0, 184, 60);
		panel.add(label_1);

		JLabel label_7 = new JLabel("\u52A8\u7269\u56ED\u65E5\u5386");
		label_7.setForeground(new Color(240, 255, 240));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_OrganizationalStructure structure = new ui_OrganizationalStructure();
				splitPane.setRightComponent(panel_3.add(structure.getContentPane()));
			}
		});
		label_7.setFont(new Font("宋体", Font.BOLD, 14));
		label_7.setBounds(10, 170, 122, 23);
		panel.add(label_7);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_2.setBounds(-16, 170, 200, 23);
		panel.add(label_2);
		
		JLabel label_8 = new JLabel("\u56ED\u5185\u516C\u544A");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ui_active act = new ui_active();
				splitPane.setRightComponent(panel_3.add(act.getContentPane()));
			}
		});
		label_8.setFont(new Font("宋体", Font.BOLD, 14));
		label_8.setForeground(new Color(240, 255, 240));
		label_8.setBackground(new Color(124, 252, 0));
		label_8.setBounds(10, 100, 122, 23);
		panel.add(label_8);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_3.setBounds(-16, 96, 200, 29);
		panel.add(label_3);

		JLabel label_6 = new JLabel("\u52A8\u7269\u56ED\u89C6\u9891");
		label_6.setForeground(new Color(240, 255, 240));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
//				ui_message message = new ui_message();
				ui_animalVideo video=new ui_animalVideo();
				splitPane.setRightComponent(panel_3.add(video.getContentPane()));
			}
		});
		label_6.setFont(new Font("宋体", Font.BOLD, 14));
		label_6.setBounds(10, 133, 122, 24);
		panel.add(label_6);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_4.setBounds(-16, 133, 200, 23);
		panel.add(label_4);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(124, 252, 0));
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setFont(new Font("宋体", Font.BOLD, 14));
		textPane.setBackground(new Color(124, 252, 0));
		textPane.setEditable(false);
		textPane.setText("\u6D3B\u52A8 1\r\n\r\n\u8F7B\u677E\u6109\u5FEB\u7684\u6691\u671F\u6765\u4E86\uFF0C\u540C\u5B66\u4EEC\u60F3\u77E5\u9053\u590F\u5929\u7684\u52A8\u7269\u56ED\u91CC\u90FD\u53D1\u751F\u4E86\u54EA\u4E9B\u6709\u8DA3\u7684\u6545\u4E8B\u5417\uFF1F\u4E3A\u4E86\u4E30\u5BCC\u540C\u5B66\u4EEC\u7684\u6691\u671F\u751F\u6D3B\uFF0C\u5317\u4EAC\u52A8\u7269\u56ED\u5C06\u4E8E2013\u5E74\u6691\u5047\u671F\u95F4\u4E3E\u529E\u4EE5\u63A2\u5BFB\u52A8\u7269\u754C\u7684\u201C\u63A0\u98DF\u8005\u201D\u4E3A\u4E3B\u9898\u7684\u6691\u671F\u590F\u4EE4\u8425\u6D3B\u52A8\u3002\u6D3B\u52A8\u4E2D\u4FDD\u62A4\u6559\u80B2\u8001\u5E08\u4EEC\u5C06\u4F1A\u901A\u8FC7\u6BCF\u671F\u4E30\u5BCC\u7684\u6D3B\u52A8\u5185\u5BB9\u5411\u540C\u5B66\u4EEC\u5021\u5BFC\u201C\u5728\u6E38\u620F\u4E2D\u5B66\u4E60\uFF0C\u5728\u77E5\u8BC6\u4E2D\u6210\u957F\u201D\u7684\u7406\u5FF5\uFF0C\u4F20\u8FBE\u7231\u62A4\u548C\u4FDD\u62A4\u5927\u81EA\u7136\uFF0C\u5C0A\u91CD\u548C\u5173\u7231\u52A8\u7269\u7684\u4FE1\u606F\uFF0C\u8BA9\u540C\u5B66\u4EEC\u4E86\u89E3\u52A8\u7269\u56ED\u4E3A\u63D0\u9AD8\u52A8\u7269\u798F\u5229\u6240\u505A\u7684\u5DE5\u4F5C\uFF0C\u589E\u5F3A\u540C\u5B66\u4EEC\u4EB2\u8FD1\u81EA\u7136\uFF0C\u4FDD\u62A4\u751F\u6001\uFF0C\u5C0A\u91CD\u751F\u547D\u7684\u610F\u8BC6\u3002");
		textPane.setBounds(49, 38, 690, 135);
		panel_1.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(124, 252, 0));
		textPane_1.setFont(new Font("宋体", Font.BOLD, 14));
		textPane_1.setText("\u6D3B\u52A8 2 :\r\n\r\n\u5C0F\u670B\u53CB\u4EEC\uFF0C\u4F60\u4EEC\u77E5\u9053\u9E1F\u4E3A\u4EC0\u4E48\u4F1A\u98DE\u5417\uFF1F\u4F60\u4EEC\u6709\u6CA1\u6709\u68A6\u60F3\u80FD\u591F\u50CF\u9E1F\u513F\u4E00\u6837\u98DE\u4E0A\u84DD\u5929\uFF0C\u81EA\u7531\u5730\u7FF1\u7FD4\u5462\uFF1F\r\n\u79D1\u6280\u53D1\u5C55\u5230\u4ECA\u5929\uFF0C\u4EBA\u7C7B\u5DF2\u7ECF\u501F\u52A9\u5404\u79CD\u98DE\u884C\u5668\u68B0\uFF0C\u5B9E\u73B0\u4E86\u8FD9\u4E00\u68A6\u60F3\u3002\u7136\u800C\uFF0C\u6BCF\u5F53\u770B\u89C1\u9E1F\u7C7B\u5C55\u7FC5\u5728\u84DD\u5929\u4E2D\u81EA\u7531\u98DE\u7FD4\u7684\u65F6\u5019\uFF0C\u6211\u4EEC\u4F9D\u7136\u4E3A\u5B83\u4EEC\u9AD8\u8D85\u7684\u98DE\u884C\u80FD\u529B\u548C\u4F18\u7F8E\u7684\u98DE\u884C\u59FF\u6001\u611F\u5230\u60CA\u53F9!\r\n\u90A3\u4E48\uFF0C\u5C31\u8BA9\u6211\u4EEC\u5E26\u7740\u6240\u6709\u7684\u7591\u95EE\uFF0C\u4E00\u540C\u8D70\u8FDB\u5317\u4EAC\u52A8\u7269\u56ED\u201C\u4E50\u601D\u79D1\u666E\u5927\u8BB2\u5802\u201D\uFF0C\u542C\u6C6A\u7237\u7237\u8BB2\u98DE\u884C\u7684\u6545\u4E8B\u5427\uFF01");
		textPane_1.setBounds(49, 211, 690, 436);
		panel_1.add(textPane_1);

	}
}
