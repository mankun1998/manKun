/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.Breeder;
import org.lq.ZOO.service.BreederService;
import org.lq.ZOO.service.Impl.BreederServiceImpl;
import org.lq.ZOO.util.CastUtil;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
public class ui_eatFoot extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private BreederService service= new BreederServiceImpl();
	private ui_animalSearch animalSearch = new ui_animalSearch();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_eatFoot frame = new ui_eatFoot();
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
	public ui_eatFoot(int i) {
		this();
		this.initTable(service.getanimalById(i));
	}
	public ui_eatFoot() {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_eatFoot.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u5582\u98DF");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 688, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 53, 688, 347);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u52A8\u7269\u79CD\u7C7B\u7F16\u53F7", "\u6295\u5582\u5458\u5DE5\u540D", "\u98DF\u7269\u540D\u79F0", "\u5B9E\u7269\u91CF", "\u6295\u5582\u65F6\u95F4", "\u5907\u6CE8"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 648, 43);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String temp = textField.getText();
				if (temp.equals("")) {
					textField.setForeground(Color.GRAY);
					textField.setText("请输入...");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				String temp = textField.getText();
				if (temp.equals("请输入...")) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}
		});
		
		textField.setBounds(28, 10, 121, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("\u67E5  \u8BE2");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if (textField.getText().equals("")||textField.getText().equals("请输入...")) {
					initTable(service.findAll());
					System.out.println(2);
				}else {
					System.out.println(1);
					String valu = textField.getText();
					int animalid = CastUtil.castInt(valu);
					initTable(service.getanimalById(animalid));
				}
				
			}
		});
		btnNewButton.setBounds(159, 9, 93, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6DFB\u52A0\u884C\u7A0B");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NewJfarm inst = new NewJfarm();
				 inst.pack();
				 inst.setResizable(false);
			     inst.setLocationRelativeTo(null);
			     inst.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(298, 9, 93, 23);
		panel_1.add(btnNewButton_1);

		initTable(service.findAll());
	}
	public void initTable(List<Breeder> list) {
		
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int count = dtm.getRowCount();
		for (int i = 0; i < count; i++) {
			dtm.removeRow(0);
		}
		for (Breeder breeder : list) {
			dtm.addRow(new Object[] {
					breeder.getAnimalId(),
					breeder.getName(),
					breeder.getBreederName(),
					breeder.getBreederCount(),
					breeder.getBreederTime(),
					breeder.getContent()
			});
		}
	}
}
