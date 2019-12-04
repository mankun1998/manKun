package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * @author许浩
 * @2019年7月3日
 * @ui_OrganizationalStructure.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月3日
 */
@Log4j
public class ui_OrganizationalStructure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_OrganizationalStructure frame = new ui_OrganizationalStructure();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("组织结构窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_OrganizationalStructure() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(16, 5, 712, 576);
		label.setIcon(new ImageIcon(ui_OrganizationalStructure.class.getResource("/org/lq/ZOO/icon/mapPlace/gl.gif")));
		panel.add(label);
	}

}
