package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import org.lq.ZOO.entity.Staff;
import org.lq.ZOO.service.StaffService;
import org.lq.ZOO.service.Impl.StaffServiceimpl;
import org.lq.ZOO.util.DataUtil;
import org.lq.ZOO.util.DateUtils;
import org.lq.ZOO.util.HanYuPinYinUtil;


import com.eltima.components.ui.DatePicker;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import org.lq.ZOO.communal.StaffProfessionType;
import org.lq.ZOO.communal.StaffConditionType;
import java.awt.Toolkit;

@Log4j
public class ui_addstaff extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private JTextField txt_pinyin;
	private JTextField txt_age;
	private JTextField txt_phone;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel txt_icon;
	private File selectedFile;
	private JTextArea txt_comment;
	private JRadioButton rb_nan;
	private JRadioButton rb_nv;
	private JTextField textField_2;
	private JComboBox cb_condition;
	private JComboBox cb_profession;
	private JLabel phone_error;
	private  StaffService service = new StaffServiceimpl();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int age;
	private JButton bt_save;
	private JButton bt_cancel;
	private JLabel label;
	private JTextField txt_pw;
	private JTextField txt_idcard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_addstaff frame = new ui_addstaff();
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
	public ui_addstaff() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_addstaff.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u6DFB\u52A0\u5458\u5DE5\u8D44\u6599\u5361");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_icon = new JLabel("");
		txt_icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String desk = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();
				JFileChooser chooser = new JFileChooser(".");
				chooser.showOpenDialog(null);
				selectedFile = chooser.getSelectedFile();
				txt_icon.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
				
			}
		});
		txt_icon.setIcon(new ImageIcon(ui_addstaff.class.getResource("/org/lq/ZOO/icon/\u5458\u5DE5.png")));
		txt_icon.setBounds(66, 22, 128, 134);
		contentPane.add(txt_icon);
		
		JLabel label_1 = new JLabel("\u5458\u5DE5\u59D3\u540D :");
		label_1.setBounds(331, 82, 70, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u62FC  \u97F3 :");
		label_2.setBounds(332, 128, 70, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u5E74  \u9F84 :");
		label_3.setBounds(39, 235, 70, 15);
		contentPane.add(label_3);
		
		txt_name = new JTextField();
		txt_name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!txt_name.getText().isEmpty()) {
					String py = HanYuPinYinUtil.getPYFirst(txt_name.getText());
					txt_pinyin.setText(py);
				}
				
			}
		});
		txt_name.setColumns(10);
		txt_name.setBounds(401, 79, 126, 21);
		contentPane.add(txt_name);
		
		txt_pinyin = new JTextField();
		txt_pinyin.setEditable(false);
		txt_pinyin.setColumns(10);
		txt_pinyin.setBounds(401, 125, 126, 21);
		contentPane.add(txt_pinyin);
		
		txt_age = new JTextField();
		txt_age.setEditable(false);
		txt_age.setColumns(10);
		txt_age.setBounds(100, 232, 126, 21);
		contentPane.add(txt_age);
		
		JLabel label_4 = new JLabel("\u6027  \u522B :");
		label_4.setBounds(39, 272, 70, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u7535\u8BDD :");
		label_5.setBounds(331, 169, 70, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u804C  \u4F4D :");
		label_6.setBounds(39, 310, 70, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u72B6  \u6001 :");
		label_7.setBounds(39, 349, 70, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u5165\u804C\u65F6\u95F4 :");
		label_8.setBounds(39, 396, 70, 15);
		contentPane.add(label_8);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(392, 166, 126, 21);
		contentPane.add(txt_phone);
		
		JLabel label_9 = new JLabel("\u5907  \u6CE8 :");
		label_9.setBounds(331, 263, 54, 15);
		contentPane.add(label_9);
		
		txt_comment = new JTextArea();
		txt_comment.setBounds(394, 263, 217, 148);
		contentPane.add(txt_comment);
		
		DatePicker dp_entryTime = new DatePicker();
		dp_entryTime.getInnerTextField().setSize(126, 17);
		dp_entryTime.getInnerTextField().setLocation(89, 2);
		dp_entryTime.setBounds(100, 393, 159, 21);
		contentPane.add(dp_entryTime);
		
		bt_save = new JButton("\u4FDD  \u5B58");
		bt_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("123");
				try {
					String phone = txt_phone.getText();
					String reg = "1[3|5|7|8]\\d{9}";
					boolean bool = Pattern.matches(reg, phone);
					if(bool) {
						Date entryTime = DateUtils.dateParse(dp_entryTime.getText());
						InputStream is = new FileInputStream(selectedFile);
						String gender = rb_nan.isSelected() ? "男" :"女";
						Staff staff = Staff.builder()
								.name(txt_name.getText())
								.pinyin(txt_pinyin.getText())
								.age(age)
								.gender(gender)
								.icon(is)
								.phone(phone)
								.password(txt_pw.getText())
								.professtion(cb_profession.getSelectedIndex())
								.condition(cb_condition.getSelectedIndex())
								.entryDate(entryTime)
								.comment(txt_comment.getText())
								.idCard(txt_idcard.getText())
								.build();
					
						boolean save = service.addStaff(staff);
						if(save) {
							dispose();
						}else {
							JOptionPane.showMessageDialog(ui_addstaff.this, "添加失败..");
						}
					}else {
						phone_error.setVisible(true);
					}
				} catch (ParseException e1) {
					log.error(e1);
				} catch (FileNotFoundException e1) {
					log.error(e1);
				}
			}
		});
		bt_save.setBounds(152, 491, 93, 23);
		contentPane.add(bt_save);
		
		bt_cancel = new JButton("\u53D6 \u6D88");
		bt_cancel.setBounds(397, 491, 93, 23);
		contentPane.add(bt_cancel);
		
		rb_nan = new JRadioButton("\u7537");
		rb_nan.setSelected(true);
		buttonGroup.add(rb_nan);
		rb_nan.setBounds(100, 268, 46, 23);
		contentPane.add(rb_nan);
		
		rb_nv = new JRadioButton("\u5973");
		buttonGroup.add(rb_nv);
		rb_nv.setBounds(148, 268, 54, 23);
		contentPane.add(rb_nv);
		
		JLabel lblNewLabel = new JLabel("\u51FA\u751F\u65E5\u671F :");
		lblNewLabel.setBounds(39, 190, 70, 15);
		contentPane.add(lblNewLabel);
				
		
		DatePicker dp_birthday = new DatePicker();
		dp_birthday.getInnerTextField().addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				try {
					Date birthday = DateUtils.dateParse(dp_birthday.getText());
					age = DataUtil.getAgeByBirth(birthday);
					txt_age.setText(age+"");
				} catch (ParseException e1) {
					log.error(e1);
				} catch (Exception e1) {
					log.error(e1);
				}
			}
		});
		dp_birthday.getInnerTextField().setSize(126, 17);
		dp_birthday.getInnerTextField().setLocation(89, 2);
		dp_birthday.setBounds(100, 187, 126, 21);
		contentPane.add(dp_birthday);
		
		cb_condition = new JComboBox();
		cb_condition.setModel(new DefaultComboBoxModel(StaffConditionType.values()));
		cb_condition.setBounds(100, 346, 159, 21);
		contentPane.add(cb_condition);
		DefaultComboBoxModel cmd = (DefaultComboBoxModel) cb_condition.getModel();
		cmd.insertElementAt("该员工在职状态", 0);
		cmd.setSelectedItem("该员工在职状态");
		
		cb_profession = new JComboBox();
		cb_profession.setModel(new DefaultComboBoxModel(StaffProfessionType.values()));
		cb_profession.setBounds(100, 307, 159, 21);
		contentPane.add(cb_profession);
		DefaultComboBoxModel cmd1 = (DefaultComboBoxModel) cb_profession.getModel();
		cmd1.insertElementAt("请选择该员工的职位", 0);
		cmd1.setSelectedItem("请选择该员工的职位");
		
		phone_error = new JLabel("*电话号码错误!");
		phone_error.setVisible(false);
		phone_error.setForeground(Color.RED);
		phone_error.setBounds(524, 169, 107, 15);
		contentPane.add(phone_error);
		
		label = new JLabel(" \u5BC6 \u7801\uFF1A");
		label.setBounds(331, 213, 54, 15);
		contentPane.add(label);
		
		txt_pw = new JTextField();
		txt_pw.setBounds(401, 210, 126, 21);
		contentPane.add(txt_pw);
		txt_pw.setColumns(10);
		
		JLabel label_10 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
		label_10.setBounds(331, 46, 70, 15);
		contentPane.add(label_10);
		
		txt_idcard = new JTextField();
		txt_idcard.setBounds(401, 43, 126, 21);
		contentPane.add(txt_idcard);
		txt_idcard.setColumns(10);
	
		
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
