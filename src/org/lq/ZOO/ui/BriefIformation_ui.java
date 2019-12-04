/**
 * 
 */
package org.lq.ZOO.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
public class BriefIformation_ui extends JPanel {

	/**
	 * Create the panel.
	 */
	public BriefIformation_ui() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u56ED\u5185\u4FE1\u606F\u516C\u544A");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 10, 430, 64);
		add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u6E38\u5BA2\u60A8\u597D\uFF1A\r\n     \u5317\u4EAC\u52A8\u7269\u56ED\u94F6\u68C0\u4FEE\uFF0C\u5C06\u4E8E\u5373\u65E5\u8D77\u6682\u505C\u5F00\u653E\u3002\u516C\u56ED\u5C06\u5C3D\u5FEB\u5B8C\u5584\u7CFB\u7EDF\u8BBE\u5907\uFF0C\u91CD\u65B0\u5F00\u653E\u3002\r\n\u6682\u505C\u671F\u95F4\u7ED9\u60A8\u5E26\u6765\u7684\u4E0D\u4FBF\u6211\u56ED\u6DF1\u8868\u6B49\u610F\uFF0C\u611F\u8C22\u60A8\u7684\u7406\u89E3\u548C\u652F\u6301\u3002\r\n     \u7279\u6B64\u516C\u544A\u3002\r\n\t\r\n    \u5317\u4EAC\u52A8\u7269\u56ED\r\n\t2019/7/1\r\n");
		textArea.setBounds(10, 65, 430, 207);
		add(textArea);

	}

}
