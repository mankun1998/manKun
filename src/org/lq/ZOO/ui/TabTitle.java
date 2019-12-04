package org.lq.ZOO.ui;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


/**
 * 修改tab选项卡的标题
 * @author 无语
 * @PROJECT SuperCRM1
 * @时间 2019年6月1日-上午10:00:37
 *
 */
public class TabTitle extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabTitle(JTabbedPane tab_main) {
		int index = tab_main.getTabCount()-1;
		//获取最新添加选项卡的文本
		String text = tab_main.getTitleAt(index);
		JLabel txt = new JLabel(text);//创建标题
		//将标题文本添加到panel中
		add(txt);
		//创建关闭按钮
		JButton btn = new JButton();
		//设置鼠标的手势
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//鼠标进入的图片
		btn.setRolloverIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_over.net.png")));
		//鼠标按下的图片
		btn.setPressedIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_active.net.png")));
		//设置默认图片
		btn.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_out.net.png")));
		//去掉按钮边框
		btn.setBorder(null);
		//设置透明按钮
		btn.setContentAreaFilled(false);
		add(btn);
		//去掉panel的背景
		setOpaque(false);
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int index = tab_main.indexOfTabComponent(TabTitle.this);
				tab_main.remove(index);
			}
		});
		
	}

}
