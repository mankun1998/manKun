
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

/**
 * @author许浩
 * @2019年7月3日
 * @ui_active.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月3日
 */
@Log4j
public class ui_animalVideo extends JFrame {

	private JPanel contentPane;
	private JLabel video1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_animalVideo frame = new ui_animalVideo();
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
	public ui_animalVideo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_animalVideo.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u52A8\u7269\u89C6\u9891");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(124, 252, 0));
//		panel.setBackgm , klopround(new Color(124, 252, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		video1 = new JLabel("");
		video1.addMouseListener(new MouseAdapter() {
			//熊猫视频
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain playMain = new PlayMain();
				playMain.player("video/Panda.mp4");
			}
		});
		video1.setIcon(new ImageIcon(ui_animalVideo.class.getResource("/org/lq/ZOO/icon/video/1.png")));
		video1.setBounds(65, 42, 252, 257);
		panel.add(video1);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			//北极熊视频
			@Override
			public void mousePressed(MouseEvent arg0) {
				PlayMain playMain = new PlayMain();
				playMain.player("video/Polarbear.mp4");
			}
			
		});
		label.setIcon(new ImageIcon(ui_animalVideo.class.getResource("/org/lq/ZOO/icon/video/2.png")));
		label.setBounds(436, 42, 252, 257);
		panel.add(label);
		JLabel lblNewLabe2 = new JLabel("New label");
		lblNewLabe2.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/timg.jpg")));
		lblNewLabe2.setBounds(0, 335, 781, 402);
		panel.add(lblNewLabe2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel.setBounds(0, 0, 781, 757);
		panel.add(lblNewLabel);
	}
}
