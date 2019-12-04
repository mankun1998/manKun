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
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JTree;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.MenuListener;

import lombok.extern.log4j.Log4j;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.event.MenuDragMouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Toolkit;


/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
@Log4j
public class ui_gotoZoo extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTabbedPane tab_main;
	private JPanel panel_1;
	private JMenu menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_gotoZoo frame = new ui_gotoZoo();
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
	public ui_gotoZoo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_gotoZoo.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
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
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.getPopupMenu().setVisible(false);
			}
		});
		panel.setBackground(new Color(107, 142, 35));
		splitPane.setLeftComponent(panel);
		
		panel.setLayout(null);
		

		JLabel label_5 = new JLabel("\u767E\u5E74\u5386\u53F2");
		label_5.setForeground(new Color(240, 255, 240));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_publicActive publicActive = new ui_publicActive();
				splitPane.setRightComponent(panel_1.add(publicActive.getContentPane()));
			}
		});
		
		menu = new JMenu("\u516C\u56ED\u89C4\u5B9A");
		menu.addMenuDragMouseListener(new MenuDragMouseListener() {
			public void menuDragMouseDragged(MenuDragMouseEvent e) {
			}
			public void menuDragMouseEntered(MenuDragMouseEvent e) {
			}
			public void menuDragMouseExited(MenuDragMouseEvent e) {
				menu.getPopupMenu().setVisible(false);
			}
			public void menuDragMouseReleased(MenuDragMouseEvent e) {
			}
		});
		
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				menu.getPopupMenu().show(menu, menu.getX()+menu.getWidth(), menu.getHeight());
				ui_ruleOne ruleOne = new ui_ruleOne();
				splitPane.setRightComponent(panel_1.add(ruleOne.getContentPane()));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.getPopupMenu().setVisible(false);
			}
		});
		menu.setBounds(10, 96, 95, 23);
		panel.add(menu);
		menu.setHorizontalAlignment(SwingConstants.TRAILING);
		menu.setFont(new Font("宋体", Font.BOLD, 14));
		menu.setForeground(new Color(240, 255, 240));
		
		JMenuItem menuItem = new JMenuItem("\u7B2C\u4E00\u7AE0");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_ruleOne ruleOne = new ui_ruleOne();
				splitPane.setRightComponent(panel_1.add(ruleOne.getContentPane()));
			}
			
		});
		menuItem.setFont(new Font("宋体", Font.BOLD, 14));
		menuItem.setForeground(new Color(0, 0, 0));
		menuItem.setBackground(new Color(124, 252, 0));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u7B2C\u4E8C\u7AE0");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_ruleTwo ruleTwo = new ui_ruleTwo();
				splitPane.setRightComponent(panel_1.add(ruleTwo.getContentPane()));
			}
		});
		menuItem_1.setFont(new Font("宋体", Font.BOLD, 14));
		menuItem_1.setHorizontalAlignment(SwingConstants.RIGHT);
		menuItem_1.setForeground(new Color(0, 0, 0));
		menuItem_1.setBackground(new Color(124, 252, 0));
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u7B2C\u4E09\u7AE0");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_ruleThree ruleThree = new ui_ruleThree();
				splitPane.setRightComponent(panel_1.add(ruleThree.getContentPane()));
			}
		});
		menuItem_2.setBackground(new Color(124, 252, 0));
		menuItem_2.setForeground(new Color(0, 0, 0));
		menuItem_2.setFont(new Font("宋体", Font.BOLD, 14));
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u7B2C\u56DB\u7AE0");
		menuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_ruleFour ruleFour = new ui_ruleFour();
				splitPane.setRightComponent(panel_1.add(ruleFour.getContentPane()));
			}
		});
		menuItem_3.setFont(new Font("宋体", Font.BOLD, 14));
		menuItem_3.setBackground(new Color(124, 252, 0));
		menuItem_3.setForeground(new Color(0, 0, 0));
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u7B2C\u4E94\u7AE0");
		menuItem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_ruleFive ruleFive = new ui_ruleFive();
				splitPane.setRightComponent(panel_1.add(ruleFive.getContentPane()));
			}
		});
		menuItem_4.setBackground(new Color(124, 252, 0));
		menuItem_4.setForeground(new Color(0, 0, 0));
		menuItem_4.setFont(new Font("宋体", Font.BOLD, 14));
		menu.add(menuItem_4);
		label_5.setFont(new Font("宋体", Font.BOLD, 14));
		label_5.setBounds(10, 63, 122, 23);
		panel.add(label_5);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(107, 142, 35));
		label.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label.setBounds(-16, 63, 200, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/intozoo_heading.jpg")));
		label_1.setBounds(0, 0, 184, 60);
		panel.add(label_1);

		JLabel label_7 = new JLabel("\u7EC4\u7EC7\u673A\u6784");
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

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ui_Tourist_Service.class.getResource("/org/lq/ZOO/icon/left_menu_hover.gif")));
		label_3.setBounds(-6, 96, 200, 29);
		panel.add(label_3);

		JLabel label_6 = new JLabel("\u8BE2\u95EE\u4E0E\u5EFA\u8BAE");
		label_6.setForeground(new Color(240, 255, 240));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_message message = new ui_message();
				splitPane.setRightComponent(panel_3.add(message.getContentPane()));
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
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ui_gotoZoo.class.getResource("/org/lq/ZOO/icon/mapPlace/history_flash_temp.jpg")));
		lblNewLabel.setBounds(10, 0, 746, 363);
		panel_1.add(lblNewLabel);
		
		JTextPane txtpna = new JTextPane();
		txtpna.setBackground(new Color(124, 252, 0));
		txtpna.setEditable(false);
		txtpna.setFont(new Font("宋体", Font.BOLD, 18));
		txtpna.setText("\u7B80\u53F2\u6982\u8FF0\r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u59CB\u5EFA\u4E8E1906\u5E74\uFF0C\u5728\u897F\u76F4\u95E8\u5916\u4E50\u5584\u56ED\u3001\u7EE7\u56ED\u548C\u5E7F\u5584\u5BFA\u3001\u60E0\u5B89\u5BFA\u201C\u4E24\u56ED\u3001\u4E24\u5BFA\u201D\u65E7\u5740\u4E0A\u7684\u6E05\u201C\u519C\u4E8B\u8BD5\u9A8C\u573A\u201D\u5185\uFF0C\u7531\u5546\u90E8\u5949\u65E8\u7B79\u5EFA\u3002\u56ED\u5185\u7531\u52A8\u7269\u56ED\u3001\u690D\u7269\u56ED\u3001\u519C\u4E8B\u8BD5\u9A8C\u4E09\u90E8\u5206\u7EC4\u6210\u3002\u6700\u65E9\u7684\u52A8\u7269\u56ED\u4F4D\u4E8E\u56ED\u5185\u4E1C\u4FA7\uFF0C\u5360\u57301.5\u516C\u9877\uFF0C\u662F\u4E2D\u56FD\u5BF9\u516C\u4F17\u5F00\u653E\u6700\u65E9\u7684\u52A8\u7269\u56ED\u548C\u534E\u5317\u5730\u533A\u5BF9\u516C\u4F17\u5F00\u653E\u6700\u65E9\u7684\u516C\u56ED\u3002\u636E\u8003\u6B64\u5730\u4E5F\u662F\u4E2D\u56FD\u73B0\u4EE3\u52A8\u7269\u56ED\u3001\u690D\u7269\u56ED\u3001\u535A\u7269\u9986\u7684\u53D1\u7965\u5730\u3002\r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u4E8E1955\u5E74\u6B63\u5F0F\u5B9A\u540D\uFF0C\u76EE\u524D\u5360\u5730\u9762\u79EF\u7EA690\u516C\u9877\uFF0C\u5C55\u51FA\u73CD\u7A00\u91CE\u751F\u52A8\u7269\u7EA6500\u79CD\uFF0C5000\u4F59\u53EA\uFF0C\u5E74\u63A5\u5F85\u56FD\u5185\u5916\u6E38\u5BA2500\u4E07\u4EBA\u6B21\uFF0C\u53D1\u6325\u7740\u56FD\u5BB6\u52A8\u7269\u56ED\u529F\u80FD\u3002\u5317\u4EAC\u52A8\u7269\u56ED\u79C9\u627F\u201C\u6559\u80B2\u4FDD\u62A4\u5E76\u4E3E\uFF0C\u5B89\u5168\u670D\u52A1\u5E76\u91CD\u201D\u7684\u5DE5\u4F5C\u7406\u5FF5\uFF0C\u56F4\u7ED5\u5317\u4EAC\u5EFA\u8BBE\u4E16\u754C\u57CE\u5E02\u76EE\u6807\uFF0C\u52AA\u529B\u6253\u9020\u6210\u4E3A\u9762\u5411\u56FD\u5185\u6E38\u5BA2\u5C55\u793A\u9996\u90FD\u98CE\u91C7\uFF0C\u9762\u5411\u56FD\u5916\u6E38\u5BA2\u5C55\u793A\u4E2D\u56FD\u5F62\u8C61\u7684\u5317\u4EAC\u540D\u7247\u3002\u5317\u4EAC\u52A8\u7269\u56ED\u662F\u56FD\u5BB6\u91CD\u70B9\u516C\u56ED\u3001\u56FD\u5BB6\u91CD\u70B9\u6587\u7269\u4FDD\u62A4\u5355\u4F4D\u3001\u5168\u56FD\u79D1\u666E\u6559\u80B2\u57FA\u5730\u3001\u5168\u56FD4A\u7EA7\u666F\u533A\u3002\r\n\r\n\u6597\u8F6C\u661F\u79FB\uFF0C\u7269\u6362\u666F\u8FC1\uFF0C\u5F80\u6614\u8BD5\u9A8C\u573A\uFF0C\u4ECA\u65E5\u52A8\u7269\u56ED\u3002\u5C71\u77F3\u53E4\u5EFA\uFF0C\u5ECA\u6865\u4EAD\u69AD\uFF0C\u6CB3\u6CC9\u9642\u6C60\uFF0C\u82B1\u8349\u85E4\u6811\uFF0C\u722C\u866B\u6E38\u9C7C\uFF0C\u8D70\u517D\u98DE\u79BD\uFF0C\u6D4E\u6D4E\u4E00\u5802\uFF0C\u76F8\u5F97\u76CA\u5F70\u3002\u79D1\u5B66\u7814\u7A76\u3001\u4FDD\u62A4\u6559\u80B2\u3001\u6587\u5316\u4EA4\u6D41\u3001\u77E5\u8BC6\u4F20\u64AD\u3001\u6587\u7269\u835F\u8403\uFF0C\u529F\u80FD\u9F50\u5168\u3002\u5C11\u513F\u53D1\u5176\u5929\u771F\uFF0C\u6210\u4EBA\u89C5\u5176\u7AE5\u8DA3\u3002\u6625\u82B1\u79CB\u6708\uFF0C\u590F\u98CE\u51AC\u96EA\uFF0C\u6276\u8001\u643A\u5E7C\uFF0C\u7EDC\u7ECE\u4E0D\u7EDD\uFF0C\u5929\u4F26\u540C\u4EAB\uFF0C\u53E4\u56ED\u65B0\u6656\u3002");
		txtpna.setBounds(20, 381, 736, 420);
		panel_1.add(txtpna);

	}
}
