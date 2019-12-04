/**
 * 
 */
package org.lq.ZOO.ui;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.lq.ZOO.entity.Breeder;
import org.lq.ZOO.service.BreederService;
import org.lq.ZOO.service.Impl.BreederServiceImpl;
import org.lq.ZOO.util.CastUtil;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Toolkit;



/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameZOO
 */
@Log4j
public class ui_breedereat extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea caseInformation;
	private BreederService service = new BreederServiceImpl();
	private ui_animalSearch animalSearch = new ui_animalSearch();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_breedereat frame = new ui_breedereat();
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
	public ui_breedereat(int i) {
		this();
		this.textField_1.setText(i+"");
		
	}
	public ui_breedereat() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_breedereat.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u6295\u5582\u98DF\u7269");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("\u52A8\u7269\u7F16\u53F7:");
		label_1.setBounds(10, 76, 68, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u59D3\u540D :");
		label_2.setBounds(10, 134, 68, 15);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("\u98DF\u7269\u540D\u79F0 :");
		label_4.setBounds(262, 76, 68, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u98DF\u7269\u91CF :");
		label_5.setBounds(262, 134, 68, 15);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
//		textField_1.setText(animalSearch.getId()+"");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(88, 73, 121, 21);
		
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\u8BF7\u8F93\u5165...");
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String temp = textField_2.getText();
				if (temp.equals("")) {
					textField_2.setForeground(Color.GRAY);
					textField_2.setText("请输入...");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				String temp = textField_2.getText();
				if (temp.equals("请输入...")) {
					textField_2.setText("");
					textField_2.setForeground(Color.BLACK);
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(88, 131, 121, 21);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setText("\u8BF7\u8F93\u5165...");
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String temp = textField_4.getText();
				if (temp.equals("")) {
					textField_4.setForeground(Color.GRAY);
					textField_4.setText("请输入...");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				String temp = textField_4.getText();
				if (temp.equals("请输入...")) {
					textField_4.setText("");
					textField_4.setForeground(Color.BLACK);
				}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(330, 73, 121, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("\u8BF7\u8F93\u5165...");
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String temp = textField_5.getText();
				if (temp.equals("")) {
					textField_5.setForeground(Color.GRAY);
					textField_5.setText("请输入...");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				String temp = textField_5.getText();
				if (temp.equals("请输入...")) {
					textField_5.setText("");
					textField_5.setForeground(Color.BLACK);
				}
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(330, 131, 121, 21);
		contentPane.add(textField_5);
		
		caseInformation = new JTextArea();
		caseInformation.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				String temp = caseInformation.getText();
				if (temp.equals("请输入食物描述")) {
					caseInformation.setText("");
					caseInformation.setForeground(Color.BLACK);
				}			
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				String temp = caseInformation.getText();
				if (temp.equals("")) {
					caseInformation.setForeground(Color.GRAY);
					caseInformation.setText("请输入病例描述");
				}
			}
		});
		caseInformation.setText("\u8BF7\u8F93\u5165\u75C5\u4F8B\u63CF\u8FF0");
		caseInformation.setBounds(10, 229, 455, 116);
		contentPane.add(caseInformation);
		
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				Breeder breeder = Breeder.builder()
						.name(textField_2.getText())
						.animalId(CastUtil.castInt(textField_1.getText()))
						.breederName(textField_4.getText())
						.breederCount(textField_5.getText())
						.breederTime(new Date())
						.content(caseInformation.getText())
						.build();
				boolean num = service.addBreeder(breeder);				
				if (num) {
					JOptionPane.showMessageDialog(ui_breedereat.this, "添加成功..");
					dispose();
				}else {
					JOptionPane.showMessageDialog(ui_breedereat.this, "添加失败..");
				}
				
				
			}
		});
		button.setIcon(new ImageIcon(ui_breedereat.class.getResource("/org/lq/ZOO/icon/add.png")));
		button.setBounds(153, 21, 93, 23);
		contentPane.add(button);
//		System.out.println(animalSearch.getId());
	}
}
