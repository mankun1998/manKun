package org.lq.ZOO.ui;



import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;
import lombok.extern.log4j.Log4j;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午9:34:10
*/
@Log4j
public class ui_map extends JFrame {

	
	
	private JPanel contentPane;
	private Border emptyBorder=BorderFactory.createEmptyBorder(0, 0,0, 0);
	private JPanel panel;
	private JButton deer;
	private JButton giraffe;
	private JButton Africa;
	private JButton science;
	private JButton yemonkey;
	private JButton orangutan;
	private JButton golden_monkey;
	private JButton crane;
	private JButton hot_golden_monkey;
	private JButton bird;
	private JButton zhuguan;
	private JButton flamingo;
	private JButton amphibian;
	private JButton penguin;
	private static ui_map_place ui=null;
	
	ui_map map=null;
	private JLabel map_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				
					ui_map frame = new ui_map();
					frame.setVisible(true);
					UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
				} catch (Exception e) {
					log.error("地图窗口错误",e);
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_map() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_map.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 910);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(262, 375, 54, 15);
		panel.add(label);
		
		deer = new JButton("");
	
		deer.setOpaque(false);
		deer.setBorder(emptyBorder);
		deer.setContentAreaFilled(false);
		deer.setFocusPainted(false);
		deer.setRolloverEnabled(true);
		deer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//鹿苑
			@Override
			public void mousePressed(MouseEvent arg0) {

				try {
					ui= new ui_map_place(1,"org/lq/ZOO/icon/mapPlace/deer.png");
					ui.setVisible(true);
					ui.setLocation(500, 200);
					ui.setAlwaysOnTop(true);
					ui.setLocation(500, 200);
					map_1.setEnabled(false);
					ui.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
//						log.error("couwu");
							map_1.setEnabled(true);
						}
					});
				} catch (SecurityException e) {
					log.error(e);
				}
			}
			
		});
		
		map_1 = new JLabel("");
		map_1.setIcon(new ImageIcon(ui_map.class.getResource("/org/lq/ZOO/icon/ZooMap.png")));
		map_1.setBounds(0, 0, 1266, 878);
		getLayeredPane().add(map_1,new Integer(Integer.MIN_VALUE));
		panel.add(map_1);
		
		deer.setBounds(241, 359, 75, 47);
		panel.add(deer);
		
		JButton child = new JButton("");
		child.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//儿童动物园
			@Override
			public void mousePressed(MouseEvent arg0) {
				 ui= new ui_map_place(2,"org/lq/ZOO/icon/mapPlace/ChildZOO.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		child.setOpaque(false);
		child.setBorder(emptyBorder);
		child.setContentAreaFilled(false);
		child.setFocusPainted(false);
		child.setRolloverEnabled(true);
		child.setBounds(349, 368, 93, 38);
		panel.add(child);
		
		giraffe = new JButton("");
		giraffe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//长颈鹿馆
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(3,"org/lq/ZOO/icon/mapPlace/giraffe.jpg");
				 ui.setAlwaysOnTop(true);
				ui.setVisible(true);ui.setLocation(500, 200);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		giraffe.setOpaque(false);
		giraffe.setBorder(emptyBorder);
		giraffe.setContentAreaFilled(false);
		giraffe.setFocusPainted(false);
		giraffe.setRolloverEnabled(true);
		
		giraffe.setBounds(420, 438, 75, 38);
		panel.add(giraffe);
		
		Africa = new JButton("");
		Africa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//非洲动物
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(4,"org/lq/ZOO/icon/mapPlace/AfricaZoo.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		Africa.setOpaque(false);
		Africa.setBorder(emptyBorder);
		Africa.setContentAreaFilled(false);
		Africa.setFocusPainted(false);
		Africa.setRolloverEnabled(true);
		Africa.setBounds(523, 390, 93, 38);
		panel.add(Africa);
		
		science = new JButton("");
		science.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//科普馆
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(5,"org/lq/ZOO/icon/mapPlace/science.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		science.setOpaque(false);
		science.setBorder(emptyBorder);
		science.setContentAreaFilled(false);
		science.setFocusPainted(false);
		science.setRolloverEnabled(true);
		science.setBounds(523, 438, 93, 54);
		panel.add(science);
		
		yemonkey = new JButton("");
		yemonkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//叶猴
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(6,"org/lq/ZOO/icon/mapPlace/yemonkey.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		yemonkey.setOpaque(false);
		yemonkey.setBorder(emptyBorder);
		yemonkey.setContentAreaFilled(false);
		yemonkey.setFocusPainted(false);
		yemonkey.setRolloverEnabled(true);
		yemonkey.setBounds(241, 505, 55, 32);
		panel.add(yemonkey);
		
		orangutan = new JButton("");
		orangutan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//猩猩
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(7,"org/lq/ZOO/icon/mapPlace/orangutan.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		orangutan.setOpaque(false);
		orangutan.setBorder(emptyBorder);
		orangutan.setContentAreaFilled(false);
		orangutan.setFocusPainted(false);
		orangutan.setRolloverEnabled(true);
		orangutan.setBounds(331, 499, 65, 38);
		panel.add(orangutan);
		
		golden_monkey = new JButton("");
		golden_monkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//金丝猴
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(8,"org/lq/ZOO/icon/mapPlace/golden_monkey.png");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		golden_monkey.setOpaque(false);
		golden_monkey.setBorder(emptyBorder);
		golden_monkey.setContentAreaFilled(false);
		golden_monkey.setFocusPainted(false);
		golden_monkey.setRolloverEnabled(true);
		golden_monkey.setBounds(425, 523, 65, 32);
		panel.add(golden_monkey);
		
		crane = new JButton("");
		crane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//西鹤岛
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(9,"org/lq/ZOO/icon/mapPlace/crane.png");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		crane.setOpaque(false);
		crane.setBorder(emptyBorder);
		crane.setContentAreaFilled(false);
		crane.setFocusPainted(false);
		crane.setRolloverEnabled(true);
		crane.setBounds(119, 553, 65, 32);
		panel.add(crane);
		
		hot_golden_monkey = new JButton("");
		hot_golden_monkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//热带小猴
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(10,"org/lq/ZOO/icon/mapPlace/hot_monkey.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		hot_golden_monkey.setOpaque(false);
		hot_golden_monkey.setBorder(emptyBorder);
		hot_golden_monkey.setContentAreaFilled(false);
		hot_golden_monkey.setFocusPainted(false);
		hot_golden_monkey.setRolloverEnabled(true);
		hot_golden_monkey.setBounds(331, 562, 93, 38);
		panel.add(hot_golden_monkey);
		
		bird = new JButton("");
		bird.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//鸟苑
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(11,"org/lq/ZOO/icon/mapPlace/niaoyuan.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		bird.setOpaque(false);
		bird.setBorder(emptyBorder);
		bird.setContentAreaFilled(false);
		bird.setFocusPainted(false);
		bird.setRolloverEnabled(true);
		bird.setBounds(564, 553, 46, 32);
		panel.add(bird);
		
		zhuguan = new JButton("");
		zhuguan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//朱鹳
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(12,"org/lq/ZOO/icon/mapPlace/zhuguan.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		zhuguan.setOpaque(false);
		zhuguan.setBorder(emptyBorder);
		zhuguan.setContentAreaFilled(false);
		zhuguan.setFocusPainted(false);
		zhuguan.setRolloverEnabled(true);
		zhuguan.setBounds(497, 607, 54, 38);
		panel.add(zhuguan);
		
		flamingo = new JButton("");
		flamingo.addMouseListener(new MouseAdapter() {
			//火烈鸟
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(13,"org/lq/ZOO/icon/mapPlace/flamingo.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		flamingo.setOpaque(false);
		flamingo.setBorder(emptyBorder);
		flamingo.setContentAreaFilled(false);
		flamingo.setFocusPainted(false);
		flamingo.setRolloverEnabled(true);
		flamingo.setBounds(555, 607, 61, 38);
		panel.add(flamingo);
		
		amphibian = new JButton("");
		amphibian.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//两栖动物
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(14,"org/lq/ZOO/icon/mapPlace/amphibian.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		amphibian.setOpaque(false);
		amphibian.setBorder(emptyBorder);
		amphibian.setContentAreaFilled(false);
		amphibian.setFocusPainted(false);
		amphibian.setRolloverEnabled(true);
		amphibian.setBounds(331, 669, 93, 47);
		panel.add(amphibian);
		
		penguin = new JButton("");
		penguin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getDefaultCursor());
			}
			//企鹅 水濑
			@Override
			public void mousePressed(MouseEvent e) {
				 ui= new ui_map_place(15,"org/lq/ZOO/icon/mapPlace/penguin.jpg");
				ui.setVisible(true);ui.setLocation(500, 200);
				ui.setAlwaysOnTop(true);
				
				map_1.setEnabled(false);
				ui.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						map_1.setEnabled(true);
					}
				});
			}
		});
		penguin.setOpaque(false);
		penguin.setBorder(emptyBorder);
		penguin.setContentAreaFilled(false);
		penguin.setFocusPainted(false);
		penguin.setRolloverEnabled(true);
		penguin.setBounds(247, 669, 75, 66);
		panel.add(penguin);	
	}
}
