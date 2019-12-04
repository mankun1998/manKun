/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.BingLi;
import org.lq.ZOO.service.AnimalCaseInformationService;
import org.lq.ZOO.service.SubjectService;
import org.lq.ZOO.service.animalService;
import org.lq.ZOO.service.Impl.AnimalCaseInformationServiceImpl;
import org.lq.ZOO.service.Impl.SubjectServiceImpl;
import org.lq.ZOO.service.Impl.animalServiceimpl;

import lombok.extern.log4j.Log4j;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Toolkit;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
public class ui_EmployeeRight extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private SubjectService subjectService = new SubjectServiceImpl();
	private animalService service = new animalServiceimpl();
	AnimalCaseInformationService service1 =new AnimalCaseInformationServiceImpl();
	private JButton btn_findAnimal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_EmployeeRight frame = new ui_EmployeeRight();
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
	public ui_EmployeeRight() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_EmployeeRight.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u5458\u5DE5\u6743\u9650");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 424, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\u67E5\u75C5\u4F8B");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				Case_Information_ui Case = new Case_Information_ui();
//				Case.setVisible(true);
				List<BingLi> list = service1.findAll();
				initTable1(list);
			}
		});
		button.setBounds(0, 36, 93, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u8BE6\u7EC6\u67E5\u8BE2\u52A8\u7269");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ui_animalSearch search = new ui_animalSearch();
				search.setVisible(true);
				
			}
		});
		button_1.setBounds(192, 36, 118, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u6DFB\u52A0\u52A8\u7269");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ui_addanimal addanimal = new ui_addanimal();
				addanimal.setVisible(true);
				
			}
		});
		button_2.setBounds(331, 36, 93, 23);
		panel.add(button_2);
		
		btn_findAnimal = new JButton("\u67E5\u52A8\u7269");
		btn_findAnimal.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				initTable(service.findAll());
			}
		});
		btn_findAnimal.setBounds(98, 36, 84, 23);
		panel.add(btn_findAnimal);
		
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 120, 414, 313);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u6635\u79F0", "\u6027\u522B", "\u5E74\u9F84", "\u79D1\u76EE", "\u72B6\u6001", "\u8FDB\u56ED\u65F6\u95F4"
			}
		));
		scrollPane.setViewportView(table);
		initTable(service.findAll());
	}
	private void initTable1(List<BingLi> lists) {
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"id", "动物编号", "员工编号", "药品名", "用药量", "用药时间", "备注"
				}
			));
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int count = dtm.getRowCount();
		
		for (int i = 0; i < count; i++) {
			dtm.removeRow(0);
		}
		
		for (BingLi bl : lists) {
			
			dtm.addRow(new Object[] {
					bl.getId(),
					bl.getAnimalId(),
					bl.getStaffId(),
					bl.getMedicineName(),
					bl.getMedicineCount(),
					bl.getMedicineTime(),
					bl.getContent()
			});
		}
	}
	private void initTable(List<Animal> lists) {
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"\u7F16\u53F7", "\u6635\u79F0", "\u6027\u522B", "\u5E74\u9F84", "\u79D1\u76EE", "\u72B6\u6001", "\u8FDB\u56ED\u65F6\u95F4"
				}
			));
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
 		
		int index = table.getRowCount();
		for (int i = 0; i < index; i++) {
				dtm.removeRow(0);
		}
		
		for (Animal list : lists) {
			dtm.addRow(new Object[] {
					list.getId(),
					list.getName(),
					list.getGender(),
					list.getAge(),
					subjectService.getSubjectName(list.getSubject()),
					list.getAnimalStatus(),
					list.getJoinDate()
					
			});
		}
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
}
