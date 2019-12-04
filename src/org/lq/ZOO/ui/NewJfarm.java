package org.lq.ZOO.ui;


import javax.swing.*;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by msi on 2016/12/15
 */

@SuppressWarnings("unchecked")
public class NewJfarm extends JFrame {
    private JDesktopPane jDesktopPane1;
    private JDesktopPane jDesktopPane2;

    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;

    private JComboBox jComboBox1;

    private JTextField jTextField1;

    private JTextArea jTextArea1;

    //构造器
    NewJfarm() {
        super();
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(NewJfarm.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
        initGUI();
    }

    //获取系统日期
    private int[] getdate() {
        int[] date_array = new int[3];
        Calendar ca = new GregorianCalendar();
        date_array[0] = ca.get(Calendar.YEAR);//年
        date_array[1] = ca.get(Calendar.MONTH) + 1;//月
        date_array[2] = ca.get(Calendar.DAY_OF_MONTH);//日
        return date_array;
    }

    //重新产生日期
    private void new_btn() {
        //清空记事
        jTextArea1.setText("");
        int year, month;

        //设定为已选择的年
        year = Integer.parseInt(jLabel5.getText().substring(0, 4));

        //设定为已选择的月
        month = Integer.parseInt(jLabel5.getText().substring(7, 9));

        //调用生成日期函数
        date_btn_create(year, month);
    }

    //生成日期函数
    @SuppressWarnings({"ConstantConditions", "SpellCheckingInspection"})
    private void date_btn_create(int year, int month) {
        int y = 0, x = 0, x_add = 0, y_add = 0, week_add = 0, date_acc = 0, week_of_day = 0;
        String syear, smonth, sday, filename;
        syear = String.valueOf(year);
        smonth = String.valueOf(month);

        //月数为个位数（小于10月）在前面加“0”
        if (smonth.length() == 1)
            smonth = "0" + smonth;

        //删除桌面2（删除日期按钮）
        jDesktopPane1.remove(jDesktopPane2);

        //生成新桌面
        jDesktopPane2 = new JDesktopPane();
        jDesktopPane1.add(jDesktopPane2);

        //大小
        jDesktopPane2.setBounds(0, 30, 252, 196);

        //颜色
        jDesktopPane2.setBackground(new java.awt.Color(148, 205, 176));

        //设定月份天数
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                date_acc = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                date_acc = 30;
                break;

            case 2:
                if (leap_year(year))
                    date_acc = 29;
                else
                    date_acc = 28;
        }

        //调用星期函数
        week_of_day = dow(year, month, 1);

        //设定每月第一天的位置（px）
        switch (week_of_day) {
            case 0:
                week_add = 0;
                break;
            case 1:
                week_add = 34;
                break;
            case 2:
                week_add = 68;
                break;
            case 3:
                week_add = 102;
                break;
            case 4:
                week_add = 136;
                break;
            case 5:
                week_add = 170;
                break;
            case 6:
                week_add = 204;
                break;
        }

        //日期按钮数组
        JButton btn[] = new JButton[date_acc];
        for (int i = 0; i < date_acc; i++) {
            btn[i] = new JButton();
            jDesktopPane2.add(btn[i]);
            //设定按钮文字为日期
            btn[i].setText(String.valueOf(i + 1));
            if ((i - week_of_day > 0 && (i + week_of_day) % 7 == 0) || ((i + week_of_day) % 7 == 0 && i != 0)) {//設定當月第一天日期按鈕位置
                //x轴坐标
                x = 0;
                //下一个按钮增量
                x_add = 0;
                //y轴坐标
                y++;
                //下一个按钮增量
                y_add += 10;
                //每月第一天按钮位置增量
                week_add = 0;
            }

            //按钮大小和增量
            btn[i].setBounds(10 + x * 25 + x_add + week_add, y * 20 + y_add, 25, 20);

            //设置字体
            btn[i].setFont(new java.awt.Font("Arial", 1, 12));

            //按钮字体不自动调整大小
            btn[i].setBorder(BorderFactory.createTitledBorder(""));

            int[] now = new int[3];

            //获取当日日期
            now = getdate();
            if (year == now[0] && month == now[1] && i + 1 == now[2])
                //当天为黄色
                btn[i].setBackground(new java.awt.Color(233, 238, 164));
            else
                //其余绿色
                btn[i].setBackground(new java.awt.Color(148, 205, 176));

            sday = String.valueOf(i + 1);

            //记事名称：年+月+日.txt
            filename = syear + smonth + sday;

            //创建记事
            File file = new File(filename + ".txt");

            //如果当天有记事则显示为蓝色
            if (file.exists())
                btn[i].setForeground(new java.awt.Color(0, 0, 255));

            btn[i].addActionListener(this::btnActionPerformed);
            x++;
            x_add += 9;
        }
    }

    //判断闰年
    private boolean leap_year(int year) {
        boolean leap_year;
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0)
                    leap_year = true;
                else
                    leap_year = false;
            else
                leap_year = true;
        else
            leap_year = false;
        return leap_year;
    }

    //判断星期
    @SuppressWarnings("SameParameterValue")
    private int dow(int y, int m, int d) {
        int[] ww = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int w;
        //闰年
        w = ww[m - 1] + y + (y / 4) - (y / 100) + (y / 400);
        if (((y % 4) == 0) && (m < 3)) {
            w--;
            if ((y % 100) == 0) w++;
            if ((y % 400) == 0) w--;
        }
        return (w + d) % 7;
    }

    private void initGUI() {
        try {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            {
                //标题
                this.setTitle("日程表");
                jDesktopPane1 = new JDesktopPane();
                getContentPane().add(jDesktopPane1, BorderLayout.CENTER);

                //大小
                jDesktopPane1.setPreferredSize(new java.awt.Dimension(464, 267));

                //颜色
                jDesktopPane1.setBackground(new java.awt.Color(148, 205, 176));
                {
                    jDesktopPane2 = new JDesktopPane();
                    jDesktopPane1.add(jDesktopPane2);
                    jDesktopPane2.setBounds(0, 30, 252, 196);
                    jDesktopPane2.setBackground(new java.awt.Color(148, 205, 176));
                }

                {
                    JLabel jLabel1 = new JLabel();
                    jDesktopPane1.add(jLabel1);
                    jLabel1.setText("Sun");
                    jLabel1.setBounds(14, 7, 21, 21);
                    jLabel1.setFont(new java.awt.Font("Arial", 0, 11));
                    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
                }

                {
                    jTextArea1 = new JTextArea(252, 35);
                    jDesktopPane1.add(jTextArea1);

                    //清空预设内容
                    jTextArea1.setText("");

                    //大小
                    jTextArea1.setBounds(252, 42, 175, 182);

                    //字体
                    jTextArea1.setFont(new java.awt.Font("微软雅黑", 0, 11));

                    //自动换行
                    jTextArea1.setLineWrap(true);
                    jTextArea1.setWrapStyleWord(true);

                    JScrollPane scrollPane = new JScrollPane(jTextArea1,
                            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                    jDesktopPane1.add(scrollPane);
                    scrollPane.setBounds(252, 42, 175, 182);
                }

                {
                    JButton jButton1 = new JButton();
                    jDesktopPane1.add(jButton1);
                    jButton1.setText("清除");
                    jButton1.setBounds(252, 231, 63, 21);
                    jButton1.setFont(new java.awt.Font("微软雅黑", 0, 11));
                    jButton1.setBorder(BorderFactory.createTitledBorder(""));
                    jButton1.addActionListener(this::jButton1ActionPerformed);
                }

                {
                    JButton jButton4 = new JButton();
                    jDesktopPane1.add(jButton4);
                    jButton4.setText("提醒");
                    jButton4.setBounds(320, 231, 40, 21);
                    jButton4.setFont(new java.awt.Font("微软雅黑", 0, 11));
                    jButton4.setBorder(BorderFactory.createTitledBorder(""));
                    jButton4.addActionListener(this::jButton4ActionPerformed);
                }

                {
                    JButton jButton2 = new JButton();
                    jDesktopPane1.add(jButton2);
                    jButton2.setText("储存");
                    jButton2.setBounds(364, 231, 63, 21);
                    jButton2.setFont(new java.awt.Font("微软雅黑", 0, 11));
                    jButton2.setBorder(BorderFactory.createTitledBorder(""));
                    jButton2.addActionListener(this::jButton2ActionPerformed);
                }

                {
                    JLabel jLabel2 = new JLabel();
                    jDesktopPane1.add(jLabel2);
                    jLabel2.setText("Mon    Tue     Wed     Thu      Fri      Sat");
                    jLabel2.setBounds(49, 7, 189, 21);
                    jLabel2.setFont(new java.awt.Font("Arial", 0, 11));
                }

                {
                    jTextField1 = new JTextField();
                    jDesktopPane1.add(jTextField1);
                    jTextField1.setText("");
                    jTextField1.setBounds(14, 231, 63, 21);
                    jTextField1.setFont(new java.awt.Font("Arial", 0, 12));
                }

                {
                    jLabel6 = new JLabel();
                    jDesktopPane1.add(jLabel6);
                    jLabel6.setText("TEST");
                    jLabel6.setBounds(357, 7, 70, 21);
                    jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 11));
                    jLabel6.setForeground(new java.awt.Color(0, 0, 255));
                }

                {
                    jLabel7 = new JLabel();
                    jDesktopPane1.add(jLabel7);
                    jLabel7.setText("");
                    jLabel7.setBounds(0, 0, 0, 0);
                }

                {
                    jLabel8 = new JLabel();
                    jDesktopPane1.add(jLabel8);
                    jLabel8.setText("目前无选择日期");
                    jLabel8.setBounds(252, 28, 175, 14);
                    jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 11));
                }

                {
                    ComboBoxModel jComboBox1Model = new DefaultComboBoxModel
                            (new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
                    jComboBox1 = new JComboBox();
                    jDesktopPane1.add(jComboBox1);
                    jComboBox1.setModel(jComboBox1Model);
                    jComboBox1.setBounds(105, 231, 50, 21);
                    jComboBox1.setFont(new java.awt.Font("Arial", 0, 11));
                }

                {
                    JLabel jLabel3 = new JLabel();
                    jDesktopPane1.add(jLabel3);
                    jLabel3.setText("月");
                    jLabel3.setBounds(155, 231, 14, 21);
                    jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 12));
                }

                {
                    JLabel jLabel4 = new JLabel();
                    jDesktopPane1.add(jLabel4);
                    jLabel4.setText("年");
                    jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 12));
                    jLabel4.setBounds(84, 231, 14, 21);
                }

                {
                    JButton jButton3 = new JButton();
                    jDesktopPane1.add(jButton3);
                    jButton3.setText("查询");
                    jButton3.setBounds(180, 231, 35, 21);
                    jButton3.setBorder(BorderFactory.createTitledBorder(""));
                    jButton3.setFont(new java.awt.Font("微软雅黑", 0, 11));
                    jButton3.addActionListener(this::jButton3ActionPerformed);
                }

                {
                    int[] now = new int[3];
                    //预设至本年本月
                    now = getdate();
                    String year5, smonth;
                    year5 = String.valueOf(now[0]);
                    smonth = String.valueOf(now[1]);
                    if (smonth.length() == 1)
                        smonth = "0" + smonth;

                    jLabel5 = new JLabel();
                    jDesktopPane1.add(jLabel5);
                    jLabel5.setText(year5 + " 年 " + smonth + " 月");
                    jLabel5.setBounds(252, 7, 120, 21);
                    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                }

                {
                    int[] now = new int[3];
                    now = getdate();
                    date_btn_create(now[0], now[1]);
                }
            }
            pack();
            this.setSize(627, 656);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void jButton1ActionPerformed(ActionEvent evt) {
        jTextArea1.setText("");
        String year, month, day, filename, insert_str;
        year = jLabel5.getText().substring(0, 4);
        month = jLabel5.getText().substring(7, 9);
        day = jLabel7.getText();
        filename = year + month + day;
        File file = new File(filename + ".txt");
        file.delete();
        new_btn();
        jLabel6.setText("日程已删除");
        jLabel7.setText("");
        jLabel8.setText("目前无选择日期");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        String year, month, day, filename, insert_str;
        year = jLabel5.getText().substring(0, 4);
        month = jLabel5.getText().substring(7, 9);
        day = jLabel7.getText();
        filename = year + month + day;
        insert_str = jTextArea1.getText();

        //如果文本框内有文字并选择了日期，才储存记录
        if (insert_str.length() != 0 && day.length() != 0) {
            try {
                FileWriter fw = new FileWriter(filename + ".txt");
                BufferedWriter bfw = new BufferedWriter(fw);
                bfw.write(insert_str);
                bfw.flush();
                fw.close();
                jLabel6.setText("日程已记录");
                jLabel7.setText("");
                jLabel8.setText("目前无选择日期");
                new_btn();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //无记事内容或没选择日期
        } else {
            if (day.length() == 0)
                jLabel6.setText("日期未选择");
            else
                jLabel6.setText("记事内容未填写");
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        new Minder();
//        new DateFrame();
    }

    @SuppressWarnings("SpellCheckingInspection")
    private void jButton3ActionPerformed(ActionEvent evt) {
        String syear, smonth;
        try {
            jTextArea1.setText("");
            jLabel6.setText("查询日期");
            syear = jTextField1.getText();
            smonth = String.valueOf(jComboBox1.getSelectedIndex() + 1);
            if (smonth.length() == 1)
                smonth = "0" + smonth;
            if (Objects.equals(syear, "") || Integer.parseInt(syear) < 1582) {
                int[] now = new int[3];
                now = getdate();
                syear = String.valueOf(now[0]);
                jLabel6.setText("请选择1582以上");
            }
            jLabel5.setText(syear + " 年 " + smonth + " 月");
            date_btn_create(Integer.parseInt(syear), Integer.parseInt(smonth));
            jLabel7.setText("");
            jLabel8.setText("目前无选择日期");
        } catch (NumberFormatException e) {
            int[] now = new int[3];
            now = getdate();
            syear = String.valueOf(now[0]);
            smonth = String.valueOf(jComboBox1.getSelectedIndex() + 1);
            if (smonth.length() == 1)
                smonth = "0" + smonth;
            jLabel5.setText(syear + " 年 " + smonth + " 月");
            jLabel6.setText("请选择1582以上");
            date_btn_create(Integer.parseInt(syear), Integer.parseInt(smonth));
            jLabel7.setText("");
            jLabel8.setText("目前无选择日期");
        }
    }

    private void btnActionPerformed(ActionEvent evt) {
        jTextArea1.setText("");
        String year, month, btn_date, filename, read_str;
        year = jLabel5.getText().substring(0, 4);
        month = jLabel5.getText().substring(7, 9);
        btn_date = evt.getActionCommand();
        filename = year + month + btn_date;
        jLabel7.setText(btn_date);
        try {
            FileReader fr = new FileReader(filename + ".txt");
            BufferedReader bfr = new BufferedReader(fr);
            boolean flag = false;
            while ((read_str = bfr.readLine()) != null) {
                if (flag)
                    jTextArea1.append("\n");
                jTextArea1.append(read_str);
                flag = true;
            }
            jLabel6.setText("当天记事");
            jLabel8.setText("已选择" + year + "年" + month + "月" + btn_date + "日");
            fr.close();
        } catch (FileNotFoundException e) {
            jLabel6.setText("当日无日程");
            jLabel8.setText("已选择" + year + "年" + month + "月" + btn_date + "日");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //默认字体
    private static String[] DEFAULT_FONT = new String[]{
            "Table.font", "TableHeader.font", "CheckBox.font"
            , "Tree.font", "Viewport.font", "ProgressBar.font"
            , "RadioButtonMenuItem.font", "ToolBar.font"
            , "ColorChooser.font", "ToggleButton.font"
            , "Panel.font", "TextArea.font", "Menu.font"
            , "TableHeader.font", "OptionPane.font"
            // ,"TextField.font"
            , "MenuBar.font", "Button.font", "Label.font"
            , "PasswordField.font", "ScrollPane.font"
            , "MenuItem.font", "ToolTip.font", "List.font"
            , "EditorPane.font", "Table.font", "TabbedPane.font"
            , "RadioButton.font", "CheckBoxMenuItem.font"
            , "TextPane.font", "PopupMenu.font"
            , "TitledBorder.font", "ComboBox.font"
    };

    //main(String[] args)
//    public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					 for (String aDEFAULT_FONT : DEFAULT_FONT)
//			                UIManager.put(aDEFAULT_FONT, new Font("微软雅黑", Font.PLAIN, 15));
//			            //自定义窗口样式
//			            
//			            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
//			            //隐藏“设置”选项
//			            UIManager.put("RootPane.setupButtonVisible", false);
//			            //导入BeautyEye
//			            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//		});
//	}
    public static void main(String[] args) throws IOException {
        try {
            //自定义字体
            for (String aDEFAULT_FONT : DEFAULT_FONT)
                UIManager.put(aDEFAULT_FONT, new Font("微软雅黑", Font.PLAIN, 15));
            //自定义窗口样式
            
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
            //隐藏“设置”选项
            UIManager.put("RootPane.setupButtonVisible", false);
            //导入BeautyEye
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            //TODO exception
        }
        NewJfarm inst = new NewJfarm();
        inst.pack();
        inst.setResizable(false);
        inst.setLocationRelativeTo(null);
        inst.setVisible(true);
    }
}
