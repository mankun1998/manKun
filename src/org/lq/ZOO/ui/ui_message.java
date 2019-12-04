package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import org.lq.ZOO.entity.Message_Board;
import org.lq.ZOO.service.Message_BoardService;
import org.lq.ZOO.service.Impl.Message_BoardServiceimpl;

import lombok.extern.log4j.Log4j;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年6月29日
 * @ui_message.java
 * @ZOO
 */
@Log4j
public class ui_message extends JFrame {

	private JPanel contentPane;
	private JTextField txt_phone;
	private JTable tab_cont;
	private Message_BoardService messageService = new Message_BoardServiceimpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_message frame = new ui_message();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("留言窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_message() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_message.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setResizable(false);
		setTitle("\u7559\u8A00\u677F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 637, 579);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 627, 126);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JTextPane txt_content = new JTextPane();
		txt_content.setBounds(160, 10, 462, 62);
		panel.add(txt_content);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u7559\u4E0B\u60A8\u7684\u5B9D\u8D35\u610F\u89C1 : ");
		lblNewLabel.setBounds(10, 26, 140, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u7559\u4E0B\u60A8\u7684\u8054\u7CFB\u65B9\u5F0F : ");
		lblNewLabel_1.setBounds(10, 85, 140, 15);
		panel.add(lblNewLabel_1);
		
		txt_phone = new JTextField();
		txt_phone.setBounds(160, 83, 198, 18);
		panel.add(txt_phone);
		txt_phone.setColumns(10);
		
		JButton btnNewButton = new JButton("\u7559  \u8A00");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if (!txt_phone.getText().trim().isEmpty() &&!txt_content.getText().trim().isEmpty()) {
					Message_Board message = Message_Board.builder()
						.contact(txt_phone.getText())
						.textContent(txt_content.getText())
						.messageTime(new Date())
						.build();
					boolean save = messageService.addMessage(message);
					if (save) {
						JOptionPane.showMessageDialog(null, "留言成功");
						initTable(messageService.findAll());
					}else {
						JOptionPane.showMessageDialog(null, "留言失败");
					}
				}else {
					JOptionPane.showMessageDialog(null, "不可以为空");
				}	
			}
		});
		btnNewButton.setBounds(529, 82, 93, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 141, 627, 428);
		panel_2.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.NORTH);
		
		tab_cont = new JTable();
		tab_cont.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7559\u8A00\u677F", "\u8054\u7CFB\u65B9\u5F0F", "\u65F6\u95F4"
			}
		));
		scrollPane.setViewportView(tab_cont);
		initTable(messageService.findAll());
	}
	
	public void  initTable(List<Message_Board> list) {
		DefaultTableModel dem= (DefaultTableModel) tab_cont.getModel();
		int count = dem.getRowCount();
		
		for (int i = 0; i < count; i++) {
			dem.removeRow(0);
		}
		for (Message_Board ms: list) {
			int sum = ms.getContact().length();
			if (sum<4) {
				sum=4;
			}
			dem.addRow(new Object[] {
					ms.getTextContent(),
					ms.getContact().substring(0, sum-4)+"****",
					ms.getMessageTime()
			});
		}
	}
	
	
	
}
