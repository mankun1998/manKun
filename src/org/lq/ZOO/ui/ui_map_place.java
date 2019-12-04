package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.lq.ZOO.entity.Map_place;
import org.lq.ZOO.service.Map_placeService;
import org.lq.ZOO.service.Impl.Map_placeServiceImpl;

import lombok.extern.log4j.Log4j;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Toolkit;


/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午10:56:38
*/
@Log4j
public class ui_map_place extends JDialog {

	private JPanel contentPane;
	private JLabel lb_icon;
	private JLabel lb_name;
	Map_placeService service=new Map_placeServiceImpl();
	private JTextPane textPane;
	private static ui_map_place place=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_map_place frame = new ui_map_place();
					frame.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("动物介绍窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_map_place() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_map_place.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setResizable(false);
		setTitle("\u8BE6\u7EC6\u4FE1\u606F");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lb_icon = new JLabel("");
		lb_icon.setIcon(new ImageIcon(ui_map_place.class.getResource("/org/lq/ZOO/icon/mapPlace/deer.png")));
		
		
		lb_icon.setForeground(Color.BLACK);
		lb_icon.setBounds(35, 26, 400, 230);
		panel.add(lb_icon);
		
		lb_name = new JLabel("");
		lb_name.setBackground(Color.BLACK);
		lb_name.setFont(new Font("华文隶书", Font.BOLD | Font.ITALIC, 25));
		lb_name.setBounds(18, 253, 440, 41);
		panel.add(lb_name);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 12));
		textPane.setForeground(Color.DARK_GRAY);
		textPane.setBackground(Color.WHITE);
		textPane.setToolTipText("");
		//JScrollPane scrollPane=new JScrollPane(textPane);
		textPane.setBounds(8, 318, 450, 306);
		panel.add(textPane);
	}
	
	
//	public ui_map_place(int id) {
//		this();
//		Map_place map_place= service.getMap_palceByID(id);
//		lb_name.setText(map_place.getName());
//		if(map_place.getIcon()!=null) {
//			lb_icon.setIcon(new ImageIcon(map_place.getIconBytes()));
//			//lb_icon.setIcon(new ImageIcon(getimageicon(map_place.getIcon()).getIconBytes()));
//			
//		}
//		if (map_place.getIntroduction()!=null) {
//			textPane.setText(map_place.getIntroduction());
//		}
//	}
	
	public ui_map_place(int id,String path) {
		this();
		//System.out.println(path);
		Map_place map_place= service.getMap_palceByID(id);
		lb_name.setText(map_place.getName());
//		URL url=ui_map_place.class.getClassLoader().getResource(path);
//		ImageIcon icon=new ImageIcon(url);
		ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource(path));
		icon.setImage(icon.getImage().getScaledInstance(400, 230, Image.SCALE_DEFAULT));
		lb_icon.setIcon(icon);
		if (map_place.getIntroduction()!=null) {
			textPane.setText(map_place.getIntroduction());
		}
	}
}
