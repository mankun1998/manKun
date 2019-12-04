package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.eltima.components.ui.DatePicker;

import lombok.extern.log4j.Log4j;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.Staff;
import org.lq.ZOO.service.StaffService;
import org.lq.ZOO.service.Impl.StaffServiceimpl;
import org.lq.ZOO.util.CastUtil;

import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

@Log4j
public class ui_Admin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btn_add;
	private JButton btn_select;
	private StaffService staffService = new StaffServiceimpl();
	private JLabel label;
	private JTextField text_value;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_Admin frame = new ui_Admin();
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
	public ui_Admin() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_Admin.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u7BA1\u7406\u5458\u754C\u9762");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 914, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btn_add = new JButton("\u6DFB\u52A0\u5458\u5DE5");
		btn_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_addstaff addstaff = new ui_addstaff();
				addstaff.setVisible(true);
				addstaff.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent arg0) {
						ui_addstaff addstaff = new ui_addstaff();
						addstaff.setVisible(true);
						addstaff.addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosed(WindowEvent arg0) {
								initTable(staffService.findAll());
							}
						});
					}
				});
			}
		});
		btn_add.setBounds(131, 20, 93, 23);
		panel.add(btn_add);
		
		btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String value = text_value.getText();
				boolean isnum = Pattern.matches("\\d", value);
				List<Staff> list = new ArrayList<Staff>();
				if (isnum) {
					int id = CastUtil.castInt(value);
					Staff staff = staffService.getStaffByID(id);
					if (staff != null) {
						list.add(staff);
						initTable(list);
					}
				}else {
					initTable(staffService.findAll());
				}
//				
			}
		});
		btn_select.setBounds(450, 20, 66, 23);
		panel.add(btn_select);
		
		label = new JLabel("\u8BF7\u8F93\u5165\u7F16\u53F7:");
		label.setBounds(275, 22, 71, 21);
		panel.add(label);
		
		text_value = new JTextField();
		text_value.setBounds(366, 21, 66, 21);
		panel.add(text_value);
		text_value.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 74, 914, 404);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7F16\u53F7", "\u59D3\u540D", "\u62FC\u97F3", "\u751F\u65E5", "\u5E74\u9F84", "\u6027\u522B", "\u7167\u7247", "\u7535\u8BDD", "\u5BC6\u7801", "\u804C\u4F4D", "\u72B6\u6001", "\u5165\u804C\u65F6\u95F4", "\u5907\u6CE8"
			}
		));
		scrollPane.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenuItem menuItem = new JMenuItem("\u4FEE\u6539\u5458\u5DE5");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				int index = 0;
				if ((index = table.getSelectedRow())>-1) {
					Object value = dtm.getValueAt(index, 0);
					int id = CastUtil.castInt(value);
					ui_updatestaff updatestaff = new ui_updatestaff(id);
					updatestaff.setVisible(true);
					updatestaff.addWindowListener(new WindowAdapter() {
						public void windowClosed(WindowEvent e) {
							initTable(staffService.findAll());
						};
					});
				}
			}
		});
		popupMenu.add(menuItem);
		initTable(staffService.findAll());
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	/**
	 * 初始化
	 * @param list
	 */
	public void initTable(List<Staff> list) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int count = dtm.getRowCount();
		for (int i = 0; i < count; i++) {
			dtm.removeRow(0);
		}
		for (Staff staff : list) {
			dtm.addRow(new Object[] {
					staff.getId(),
					staff.getName(),
					staff.getPinyin(),
					staff.getBirthday(),
					staff.getAge(),
					staff.getGender(),
					staff.getIcon(),
					staff.getPhone(),
					getMD5String(staff.getPassword()),
					staff.getStaffProfession(),
					staff.getStaffCondition(),
					staff.getEntryDate(),
					staff.getComment()
			});
		}
	}
	/**
	 * 	加密用户密码
	 * @param str
	 * @return
	 */
	public String getMD5String(String str) {
		MessageDigest md =null;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
		} catch (NoSuchAlgorithmException e) {
			
			log.error("加密用户密码出现错误",e);
		}
		return new BigInteger(1,md.digest()).toString();
	}
}
