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

import org.lq.ZOO.entity.BingLi;
import org.lq.ZOO.service.AnimalCaseInformationService;
import org.lq.ZOO.service.Impl.AnimalCaseInformationServiceImpl;
import org.lq.ZOO.util.CastUtil;
import org.lq.ZOO.util.DateUtils;


import com.eltima.components.ui.DatePicker;
import com.mysql.fabric.xmlrpc.base.Data;

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
import java.text.ParseException;
import java.util.Date;


/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameZOO
 */
@Log4j
public class AddCaseInformation_ui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea caseInformation;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCaseInformation_ui frame = new AddCaseInformation_ui();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("打开病例窗口时错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddCaseInformation_ui() {
		setResizable(false);
		setTitle("\u6DFB\u52A0\u75C5\u4F8B");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u75C5\u4F8B\u7F16\u53F7");
		label.setBounds(10, 20, 68, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(70, 17, 220, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u52A8\u7269\u7F16\u53F7:");
		label_1.setBounds(10, 76, 68, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u7F16\u53F7:");
		label_2.setBounds(10, 134, 68, 15);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("\u7528\u836F\u540D :");
		label_4.setBounds(262, 76, 68, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u7528\u836F\u91CF :");
		label_5.setBounds(262, 134, 68, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u7528\u836F\u65F6\u95F4 :");
		label_6.setBounds(262, 197, 68, 15);
		contentPane.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setText("\u8BF7\u8F93\u5165...");
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String temp = textField_1.getText();
				if (temp.equals("")) {
					textField_1.setForeground(Color.GRAY);
					textField_1.setText("请输入...");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				String temp = textField_1.getText();
				if (temp.equals("请输入...")) {
					textField_1.setText("");
					textField_1.setForeground(Color.BLACK);
				}
			}
		});
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
				if (temp.equals("请输入病例描述")) {
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
		
		DatePicker dp_Time = new DatePicker();
		dp_Time.getInnerTextField().setLocation(89, 2);
		dp_Time.setBounds(330, 191, 121, 21);
		contentPane.add(dp_Time);
		
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				AnimalCaseInformationService service = new AnimalCaseInformationServiceImpl();
				 
				
				
				
				try {
					Date time = DateUtils.dateParse(dp_Time.getText());
					BingLi bingLi = BingLi.builder()
							//.id(CastUtil.castInt(textField_1.getText()))
							.animalId(CastUtil.castInt(textField_1.getText()))
							.staffId(CastUtil.castInt(textField_1.getText()))
							
							.medicineName(textField_5.getText())
							.medicineCount(textField_5.getText())
							.medicineTime(time)
							.content(caseInformation.getText())
							.build();
					int num = service.addBingliInformation(bingLi);				
					if (num >0) {
						JOptionPane.showMessageDialog(AddCaseInformation_ui.this, "添加成功..");
						dispose();
					}else {
						JOptionPane.showMessageDialog(AddCaseInformation_ui.this, "添加失败..");
					}
				} catch (ParseException e1) {
					log.error("添加病例时错误",e1);
				}
				
				
			}
		});
		button.setIcon(new ImageIcon(AddCaseInformation_ui.class.getResource("/org/lq/ZOO/icon/add.png")));
		button.setBounds(346, 16, 93, 23);
		contentPane.add(button);
	}
}
