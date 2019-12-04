/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.EventQueue;


import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * @author 第四组 王威
 *@data 2019年6月29日
*@project_nameZOO
 */
@Log4j
public class UI_Main2 extends JFrame {

	private JPanel contentPane;
	
	
    int index;
    ImageIcon[] imgs = {
            new ImageIcon("src/org/lq/ZOO/icon/one.jpg"),
            new ImageIcon("src/images/2.jpg"),
            new ImageIcon("src/images/3.jpg"),
            
        };
    private JLabel oneimg;
    private JLabel twoimg;
    private JLabel threeimg;
    private JPanel panel;
    private JLabel four;
    private JPanel panel_2;
    private JLabel lblNewLabel;
    private JLabel label;
    private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Main2 frame = new UI_Main2();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("动物园备用主窗体窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI_Main2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Main2.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		addWindowListener(new WindowAdapter() {
			
			
		});
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("\u52A8\u7269\u56ED\u5907\u7528\u4E3B\u7A97\u4F53");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 796);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 980, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 927, 192);
		panel_1.add(panel);
		panel.setLayout(null);
		
		oneimg = new JLabel("");
		oneimg.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/one.jpg")));
		oneimg.setBounds(8, 0, 224, 190);
		
		
		panel.add(oneimg);
		
		twoimg = new JLabel("");
		twoimg.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/two.jpg")));
		twoimg.setBounds(242, 0, 234, 190);
		panel.add(twoimg);
		
		threeimg = new JLabel("");
		threeimg.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/three.jpg")));
		threeimg.setBounds(485, 0, 224, 190);
		panel.add(threeimg);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/bo4.jpg")));
		lblNewLabel.setBounds(723, 0, 195, 190);
		panel.add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel_2.setBounds(927, 10, 939, 192);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		four = new JLabel("");
		four.setBounds(17, 0, 224, 190);
		panel_2.add(four);
		four.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/one.jpg")));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(258, 0, 224, 190);
		panel_2.add(label_2);
		label_2.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/two.jpg")));
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(499, 0, 224, 190);
		panel_2.add(label_3);
		label_3.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/three.jpg")));
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/bo4.jpg")));
		label.setBounds(733, 0, 196, 192);
		panel_2.add(label);
		
		label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ui_map map = new ui_map();
				map.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/ZooMap.png")));
		label_1.setBounds(10, 222, 934, 546);
		contentPane.add(label_1);
		
		
		
		new Thread() {
			public void run() {
				while(true) {
					int x = panel.getX();
					int x2 = panel_2.getX();
					if(x<=-927) {
						x2 = 0;
						x=927;					
					}else if (x2<=-927) {
						x=0;
						x2=927;
					}
					
					panel.setBounds(x-7, panel.getY(), panel.getWidth(), panel.getHeight());
					panel_2.setBounds(x2-7, panel_2.getY(), panel_2.getWidth(), panel_2.getHeight());
					try {
						sleep(100);
					} catch (InterruptedException e) {
						log.error("轮播错误",e);
					}
				}
			};
		}.start();
	}
}
