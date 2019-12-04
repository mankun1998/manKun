/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.BingLi;
import org.lq.ZOO.service.AnimalCaseInformationService;
import org.lq.ZOO.service.Impl.AnimalCaseInformationServiceImpl;
import org.lq.ZOO.util.CastUtil;

import contrib.com.blogofbug.swing.SwingBugUtilities;
import lombok.extern.log4j.Log4j;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;




/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameSuperCRM1
 */
@Log4j
public class Case_Information_ui extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTable table;
	 AnimalCaseInformationService service =new AnimalCaseInformationServiceImpl();
	 private JScrollPane scrollPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Case_Information_ui frame = new Case_Information_ui();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("打开病例信息窗口时出现错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Case_Information_ui() {
		setResizable(false);
		setTitle("\u75C5\u4F8B\u4FE1\u606F");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 142, 483, 324);
		contentPane.add(tabbedPane);
		
		scrollPane = new JScrollPane();
		tabbedPane.addTab("数据展示", null, scrollPane, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "\u52A8\u7269\u7F16\u53F7", "\u5458\u5DE5\u7F16\u53F7", "\u836F\u54C1\u540D", "\u7528\u836F\u91CF", "\u7528\u836F\u65F6\u95F4", "\u5907\u6CE8"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = (JPanel) new AddCaseInformation_ui().getContentPane();
		tabbedPane.addTab("添加病例", null, panel_1, null);
//		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setToolTipText("");
		panel.setBounds(10, 10, 483, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtid = new JTextField();
		txtid.setText("\u8BF7\u8F93\u5165\u52A8\u7269\u7F16\u53F7");
		txtid.setToolTipText("");
		txtid.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				String temp = txtid.getText();
				if (temp.equals("请输入动物编号")) {
					txtid.setText("");
					txtid.setForeground(Color.BLACK);
				}		
			}
			@Override
			public void focusLost(FocusEvent e) {
				String temp = txtid.getText();
				if (temp.equals("")) {
					txtid.setForeground(Color.GRAY);
					txtid.setText("请输入动物编号");
				}
			}
		});
		
		
		
		
		
		
		txtid.setBounds(34, 47, 159, 21);
		panel.add(txtid);
		txtid.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2\u5168\u90E8");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
				List<BingLi> list = service.findAll();
			
				initTable(list);
				
			}
		});
		button.setIcon(new ImageIcon(Case_Information_ui.class.getResource("/org/lq/ZOO/icon/query.png")));
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.setBackground(new Color(250, 235, 215));
		button.setBounds(331, 22, 125, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u6DFB\u52A0\u75C5\u4F8B");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				AddCaseInformation_ui addCaseInformation = new AddCaseInformation_ui();
//				scrollPane.removeAll();
//				scrollPane.setViewportView(addCaseInformation.getContentPane());
//				SwingUtilities.updateComponentTreeUI(scrollPane);
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		button_1.setIcon(new ImageIcon(Case_Information_ui.class.getResource("/org/lq/ZOO/icon/add.png")));
		button_1.setBackground(new Color(250, 235, 215));
		button_1.setFont(new Font("宋体", Font.PLAIN, 16));
		button_1.setBounds(331, 72, 125, 23);
		panel.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				int id = CastUtil.castInt(txtid.getText());
			  List<BingLi> list = service.getId(id);
				initTable(list);
				
							
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Case_Information_ui.class.getResource("/org/lq/ZOO/icon/query.png")));
		lblNewLabel_1.setBounds(202, 50, 26, 15);
		panel.add(lblNewLabel_1);
	}
	
	
	private void initTable(List<BingLi> lists) {
		
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
}
