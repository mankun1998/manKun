package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class ui_main extends JFrame {

	private JPanel contentPane;
	MYJPanel mp;
	int index;
	ImageIcon[] imgs= {
			new ImageIcon("src/org/lq/ZOO/icon/mainicon/1.jpg"),
			new ImageIcon("src/org/lq/ZOO/icon/mainicon/2.jpg"),
			new ImageIcon("src/org/lq/ZOO/icon/mainicon/3.jpg")
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ui_main();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ui_main frame = new ui_main();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public ui_main() {
		mp=new MYJPanel();
		getContentPane().add(mp);
		setBounds(100, 100, 450, 300);
		//this.setExtendedState(500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ö÷´°¿Ú");
		this.setVisible(true);
		Timer timer=new Timer(2000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.repaint();
				
			}
			
		});
		timer.start();
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
	}
	
	
	
	class MYJPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(imgs[index%imgs.length].getImage(), 0, 0, this);
			index++;
		}
	}

}
