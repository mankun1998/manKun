package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.lq.ZOO.Dao.LoginDao;
import org.lq.ZOO.Dao.Impl.LoginDaoImpl;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author许浩
 * @2019年7月2日
 * @ui_login.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月2日
 */
@Log4j
public class ui_login extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private LoginDao loginDao = new LoginDaoImpl();
	private TextField text_id;
	private TextField text_pwd;
	private JButton btn_login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_login frame = new ui_login();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("登录窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_login() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 10, 404, 198);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(124, 252, 0));
		panel_1.setLayout(null);
		
		btn_login = new JButton("\u767B\u5F55");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				System.out.println(text_pwd.getText());
				if (loginDao.isLoginUser(text_id.getText(),text_pwd.getText())==1) {
					
					dispose();
					ui_Admin ui_Admin = new ui_Admin();
					ui_Admin.setVisible(true);
				}else if (loginDao.isLoginUser(text_id.getText(),text_pwd.getText())==3) {
					dispose();
					ui_EmployeeRight employeeRight = new ui_EmployeeRight();
					employeeRight.setVisible(true);
				}else if (loginDao.isLoginUser(text_id.getText(),text_pwd.getText())==2) {
					dispose();
					Case_Information_ui Case = new Case_Information_ui();
					Case.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(ui_login.this, "输入密码或用户名不正确");
				} 
			}
		});
	
		btn_login.setBounds(54, 152, 108, 23);
		panel_1.add(btn_login);
		
		JButton button_2 = new JButton("\u5FD8\u8BB0\u5BC6\u7801");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_forget_password forget_password = new ui_forget_password();
				forget_password.setVisible(true);
			}
		});
		button_2.setBounds(216, 152, 93, 23);
		panel_1.add(button_2);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8D26\u53F7 : ");
		label.setFont(new Font("宋体", Font.BOLD, 14));
		label.setBounds(54, 30, 108, 23);
		panel_1.add(label);
		
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801 :");
		label_1.setFont(new Font("宋体", Font.BOLD, 14));
		label_1.setBounds(54, 76, 108, 30);
		panel_1.add(label_1);
		
		text_id = new TextField();
		text_id.setBounds(168, 30, 141, 23);
		panel_1.add(text_id);
		
		text_pwd = new TextField();
		text_pwd.setBounds(168, 76, 141, 23);
		panel_1.add(text_pwd);
		
		JLabel lblNewLabel2 = new JLabel();
		lblNewLabel2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg3.jpg")));
		lblNewLabel2.setBounds(0, 0, 422, 217);
		contentPane.add(lblNewLabel2);
		
	}
}
