package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.Subject;
import org.lq.ZOO.service.SubjectService;
import org.lq.ZOO.service.animalService;
import org.lq.ZOO.service.Impl.SubjectServiceImpl;
import org.lq.ZOO.service.Impl.animalServiceimpl;
import org.lq.ZOO.util.DataUtil;
import org.lq.ZOO.util.DateUtils;
import org.lq.ZOO.util.HanYuPinYinUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import com.eltima.components.ui.DatePicker;

import lombok.extern.log4j.Log4j;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.swing.JRadioButton;
import org.lq.ZOO.communal.AnimalStatusType;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

@Log4j
public class ui_addanimal extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private JTextField txt_age;
	private JEditorPane jp_commet;
	private JComboBox cb_subject;
	private JButton bt_save;
	private JButton bt_cancel;
	private JLabel lb_icon;
	private File selectedFile;
	private DatePicker dp_cometime;
	private DatePicker dp_birthday;
	private JComboBox cb_status;
	private JRadioButton rb_c;
	private JRadioButton rb_x;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private SubjectService subjectService = new SubjectServiceImpl();
	private animalService animalService = new animalServiceimpl();
	private int age;
	Date birthday;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_addanimal frame = new ui_addanimal();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("添加动物时报错",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_addanimal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_addanimal.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u52A8\u7269\u6DFB\u52A0");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 693);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 10, 169, 219);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lb_icon = new JLabel("");
		lb_icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { 
				String desk = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();
				JFileChooser chooser = new JFileChooser(".");
				chooser.showOpenDialog(null);
				selectedFile = chooser.getSelectedFile();
				lb_icon.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
			}
		});
		lb_icon.setIcon(new ImageIcon(ui_addanimal.class.getResource("/org/lq/ZOO/icon/add_icon.png")));
		lb_icon.setBounds(0, 0, 169, 219);
		panel.add(lb_icon);
		
		txt_name = new JTextField();
//		txt_name.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusLost(FocusEvent e) {
//				String py = HanYuPinYinUtil.getPYFirst(txt_name.getText());
//				txt_pinyin.setText(py);
//			}
//		});
		txt_name.setBounds(365, 117, 191, 21);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6027\u522B\uFF1A");
		label_2.setBounds(21, 293, 44, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u5E74\u9F84\uFF1A");
		label_3.setBounds(21, 414, 44, 15);
		contentPane.add(label_3);
		
		txt_age = new JTextField();
		txt_age.setEditable(false);
		txt_age.setBounds(65, 411, 127, 21);
		contentPane.add(txt_age);
		txt_age.setColumns(10);
		
		JLabel label_4 = new JLabel("\u5165\u56ED\u65F6\u95F4\uFF1A");
		label_4.setBounds(22, 474, 94, 15);
		contentPane.add(label_4);
		
		dp_cometime = new DatePicker();
		dp_cometime.setBounds(76, 468, 160, 21);
		contentPane.add(dp_cometime);
		
		JLabel label_5 = new JLabel("\u6240\u5C5E\u79D1\u76EE\uFF1A");
		label_5.setBounds(323, 54, 79, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u79CD\u7C7B\uFF1A");
		label_6.setBounds(323, 120, 54, 15);
		contentPane.add(label_6);
		
		cb_subject = new JComboBox();
		cb_subject.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9\u8BE5\u52A8\u7269\u7684\u79D1\u76EE"}));
		
		DefaultComboBoxModel<Subject> cbm = (DefaultComboBoxModel<Subject>) cb_subject.getModel();
		List<Subject> subjects = subjectService.findAll();		
		for (Subject subject : subjects) {		
			cbm.addElement(subject);
		}
		
		cb_subject.setBounds(396, 54, 160, 21);
		contentPane.add(cb_subject);
		
		jp_commet = new JEditorPane();
		jp_commet.setBounds(323, 333, 258, 156);
		contentPane.add(jp_commet);
		
		JLabel label_7 = new JLabel("\u5907\u6CE8\uFF1A");
		label_7.setBounds(323, 308, 54, 15);
		contentPane.add(label_7);
		
		bt_save = new JButton("\u4FDD\u5B58");
		bt_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Subject subject = (Subject) cb_subject.getSelectedItem();
					String gender = rb_x.isSelected() ? "雄" : "雌";
					
					Date cometime = DateUtils.dateParse(dp_cometime.getText());
					InputStream is = new FileInputStream(selectedFile);
					Animal animal = Animal.builder()
							.subject(subject.getSubjectId())
							.name(txt_name.getText())
							.gender(gender)
							.birthday(birthday)
							.age(age)
							.condition(cb_status.getSelectedIndex())
							.icon(is)
							.joinDate(cometime)
							.comment(jp_commet.getText())
							.build();
					boolean save = animalService.addAnimal(animal);
					if(save) {
						dispose();
					}else {
						JOptionPane.showMessageDialog(ui_addanimal.this, "添加失败..");
					}
												
				} catch (ParseException e1) {
					log.error(e1);
				} catch (Exception e1) {
					log.error(e1);
				}
				
			}
		});
		bt_save.setBounds(152, 622, 93, 23);
		contentPane.add(bt_save);
		
		bt_cancel = new JButton("\u53D6\u6D88");
		bt_cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		bt_cancel.setBounds(397, 622, 93, 23);
		contentPane.add(bt_cancel);
		
		JLabel label = new JLabel("\u751F\u65E5\uFF1A");
		label.setBounds(21, 353, 54, 15);
		contentPane.add(label);
		
		dp_birthday = new DatePicker();
		dp_birthday.getInnerTextField().addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				try {
					birthday = DateUtils.dateParse(dp_birthday.getText());
					age = DataUtil.getAgeByBirth(birthday);
				} catch (Exception e1) {
					log.error(e1);
				}
				txt_age.setText(age+"");
			}
		});
		dp_birthday.setBounds(63, 347, 172, 21);
		contentPane.add(dp_birthday);
		
		JLabel lblNewLabel = new JLabel("\u8EAB\u4F53\u72B6\u6001\uFF1A");
		lblNewLabel.setBounds(323, 190, 77, 15);
		contentPane.add(lblNewLabel);
		
		cb_status = new JComboBox();
		cb_status.setModel(new DefaultComboBoxModel(AnimalStatusType.values()));
		cb_status.setBounds(396, 187, 160, 21);
		contentPane.add(cb_status);
		DefaultComboBoxModel cbm1 = (DefaultComboBoxModel) cb_status.getModel();
		cbm1.insertElementAt("请选择动物身体状态", 0);
		cbm1.setSelectedItem("请选择动物身体状态");
		
		JLabel label_9 = new JLabel("\u8BF7\u5728\u4E0A\u65B9\u6DFB\u52A0\u52A8\u7269\u7684\u56FE\u7247");
		label_9.setBounds(21, 239, 169, 15);
		contentPane.add(label_9);
		
		rb_x = new JRadioButton("\u96C4");
		buttonGroup.add(rb_x);
		rb_x.setBounds(66, 289, 44, 23);
		contentPane.add(rb_x);
		
		rb_c = new JRadioButton("\u96CC");
		buttonGroup.add(rb_c);
		rb_c.setBounds(122, 289, 44, 23);
		contentPane.add(rb_c);
	}
}
