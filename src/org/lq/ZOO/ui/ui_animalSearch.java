package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.Subject;
import org.lq.ZOO.service.SubjectService;
import org.lq.ZOO.service.animalService;
import org.lq.ZOO.service.Impl.SubjectServiceImpl;
import org.lq.ZOO.service.Impl.animalServiceimpl;
import org.lq.ZOO.util.CastUtil;
import org.lq.ZOO.util.DateUtils;

import lombok.extern.log4j.Log4j;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import org.lq.ZOO.communal.AnimalStatusType;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
/**
 * 
 * @author 申梦丽
 * @组名 第四组
 * 2019年7月3日
 */

@Log4j
public class ui_animalSearch extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField text_value;
	private JComboBox com_subject;
	private JComboBox com_status;
	private Animal selecltAnimal;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_2;
	private animalService animalService = new animalServiceimpl();
	private SubjectService subjectService = new SubjectServiceImpl();
	private JButton btn_show;
	private JButton btn_find;
	private JButton btn_select;
	private int id;
	public int getId() {
		return id;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_animalSearch frame = new ui_animalSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("查询动物窗口出现错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_animalSearch() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setResizable(false);
		setTitle("\u52A8\u7269\u67E5\u8BE2\u7A97\u53E3");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(10, 10, 939, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 939, 134);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/animalicon/2.png")));
		label_4.setBounds(10, 10, 183, 114);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/animalicon/3.png")));
		label_5.setBounds(243, 10, 183, 114);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/animalicon/4.png")));
		label_6.setBounds(485, 10, 183, 114);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/animalicon/5.png")));
		label_7.setBounds(713, 10, 183, 114);
		panel_3.add(label_7);
		
		panel_2 = new JPanel();
		panel_2.setBounds(939, 0, 939, 134);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/animalicon/1.png")));
		lblNewLabel.setBounds(41, 10, 183, 114);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/one.jpg")));
		lblNewLabel_1.setBounds(265, 10, 183, 114);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/three.jpg")));
		lblNewLabel_2.setBounds(489, 10, 183, 114);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(ui_animalSearch.class.getResource("/org/lq/ZOO/icon/two.jpg")));
		lblNewLabel_3.setBounds(713, 10, 183, 114);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 177, 939, 56);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u7F16\u53F7\u6216\u59D3\u540D:");
		label.setBounds(10, 31, 112, 15);
		panel_1.add(label);
		
		text_value = new JTextField();
		text_value.setBounds(115, 28, 77, 21);
		panel_1.add(text_value);
		text_value.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u79D1\u76EE:");
		label_2.setBounds(202, 31, 78, 15);
		panel_1.add(label_2);
		
		com_subject = new JComboBox();
		com_subject.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9\u79D1\u76EE"}));
		DefaultComboBoxModel<Subject> cbm = (DefaultComboBoxModel<Subject>) com_subject.getModel(); 
		List<Subject> subjects = subjectService.findAll();
		
		for (Subject subject : subjects) {
			
			
			cbm.addElement(subject);
		}
		
		com_subject.setBounds(276, 28, 133, 21);
		panel_1.add(com_subject);
		
		JLabel label_3 = new JLabel("\u8BF7\u9009\u62E9\u72B6\u6001:");
		label_3.setBounds(437, 31, 78, 15);
		panel_1.add(label_3);
		
		com_status = new JComboBox();
		com_status.setModel(new DefaultComboBoxModel(AnimalStatusType.values()));
		DefaultComboBoxModel cbm1=  (DefaultComboBoxModel) com_status.getModel();
		
		cbm1.insertElementAt("请选择动物状态", 0);
		cbm1.setSelectedItem("请选择动物状态");
		com_status.setBounds(525, 28, 71, 21);
		panel_1.add(com_status);
		
		btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				String value = text_value.getText();
				Object subject = com_subject.getSelectedItem();
				Object animalStatus = com_status.getSelectedItem();
				boolean isnum = Pattern.matches("\\d", value);
				List<Animal> list = new ArrayList<Animal>();
				if (!value.equals("")&&(subject.equals("请选择科目"))&&(CastUtil.castString(animalStatus).equals("请选择动物状态"))) {
					if (isnum) {
						int id = CastUtil.castInt(value);
						Animal animal =animalService.getAnimalById(id);
						if (animal !=null) {
							list.add(animal);
							initTable(list);
						}
						
					}else {
						list = animalService.getAnimalByName(value);
						initTable(list);
					}
				}else if (value.equals("")&&!(subject.equals("请选择科目"))&&(CastUtil.castString(animalStatus).equals("请选择动物状态"))) {
					if (subject instanceof Subject) {
						initTable(animalService.getAnimalBysubject(((Subject) subject).getSubjectId()));
					}
				}else if (value.equals("")&&(subject.equals("请选择科目"))&&(!(CastUtil.castString(animalStatus).equals("请选择动物状态")))) {
					//if (animalStatus instanceof Animal) {
//						System.out.println("*********");
//						
//						System.out.println(((AnimalStatusType)animalStatus).getId());
						initTable(animalService.getAnimalByCondition((int)((AnimalStatusType)animalStatus).getId()));
					//}
				}else if (value.equals("")&&!(subject.equals("请选择科目"))&&!(CastUtil.castString(animalStatus).equals("请选择动物状态"))) {
					if (subject instanceof Subject) {
						
						initTable(animalService.getAnimalBySubjectAndCondition(((Subject) subject).getSubjectId(), ((AnimalStatusType)animalStatus).getId()));
					}
				}
			}
		});
		btn_select.setBounds(624, 27, 57, 23);
		panel_1.add(btn_select);
		
		btn_show = new JButton("\u663E\u793A\u52A8\u7269\u8BE6\u7EC6\u4FE1\u606F");
		btn_show.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				int index = 0;
				if ((index = table.getSelectedRow())> -1) {
					Object value = dtm.getValueAt(index, 0);
					int id = CastUtil.castInt(value);
					ui_showAnimalInfo showAnimalInfo = new ui_showAnimalInfo(id);
					showAnimalInfo.setVisible(true);
					showAnimalInfo.addWindowListener(new WindowAdapter() {
						public void windowClosed(java.awt.event.WindowEvent arg0) {
							initTable(animalService.findAll());
						};
					});
				}else {
					JOptionPane.showMessageDialog(ui_animalSearch.this, "请右键选择要查看的动物资料卡");
				}
			}
		});
		btn_show.setBounds(794, 27, 133, 23);
		panel_1.add(btn_show);
		
		btn_find = new JButton("\u67E5\u8BE2\u5168\u90E8");
		btn_find.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				initTable(animalService.findAll());
			}
		});
		btn_find.setBounds(691, 27, 93, 23);
		panel_1.add(btn_find);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 257, 939, 393);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7F16\u53F7", "\u79D1\u76EE", "\u6635\u79F0", "\u6027\u522B", "\u51FA\u751F\u65E5\u671F", "\u5E74\u9F84", "\u72B6\u6001", "\u56FE\u7247", "\u5165\u56ED\u65F6\u95F4", "\u5907\u6CE8"
			}
		));
		scrollPane.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenuItem menuItem = new JMenuItem("\u9009\u62E9");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int index = table.getSelectedRow();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				Object value = dtm.getValueAt(index, 0);
				selecltAnimal = animalService.getAnimalById(CastUtil.castInt(value));
			}
		});
		popupMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u6295\u5582\u98DF\u7269");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int index = table.getSelectedRow();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				Object value = dtm.getValueAt(index, 0);
				id = CastUtil.castInt(value);
				ui_breedereat breedereat = new ui_breedereat(id);
				breedereat.setVisible(true);
			}
		});
		popupMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u67E5\u770B\u6295\u5582\u98DF\u7269");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int index = table.getSelectedRow();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				Object value = dtm.getValueAt(index, 0);
				id = CastUtil.castInt(value);
//				System.out.println(id);
				ui_eatFoot eatFoot = new ui_eatFoot(id);
				eatFoot.setVisible(true);
			}
		});
		popupMenu.add(menuItem_2);
		new Thread() {
			public void run() {
				while(true) {
					int x = panel_3.getX();
					int x2 = panel_2.getX();
					if (x<=-939) {
						x2 = 0;
						x = 939;
					}else if (x2<=-939) {
						x = 0;
						x2 = 939;
					}
					panel_3.setBounds(x-10, panel_3.getY(), panel_3.getWidth(), panel_3.getHeight());
					panel_2.setBounds(x2-10, panel_2.getY(), panel_2.getWidth(), panel_2.getHeight());
					try {
						sleep(100);
					} catch (InterruptedException e) {
						
						log.error(e);
					}
				}
			};
		}.start();
		initTable(animalService.findAll());
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
	 * 初始化表
	 * @param list
	 */
	public void initTable(List<Animal> list) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int count = dtm.getRowCount();
		for (int i = 0; i < count; i++) {
			dtm.removeRow(0);
		}
		
		for (Animal animal : list) {
//			System.out.println(subjectService.getSubjectName(animal.getSubject()));
		//System.out.println(animal.getBirthday());
			dtm.addRow(new Object[] {
					animal.getId(),
					subjectService.getSubjectName(animal.getSubject()),
//					animalService.
					animal.getName(),
					animal.getGender(),
					animal.getBirthday(),
					
					animal.getAge(),
					animal.getAnimalStatus(),
					animal.getIcon(),
					animal.getJoinDate(),
					animal.getComment()
					
			});
		}
	}
}
