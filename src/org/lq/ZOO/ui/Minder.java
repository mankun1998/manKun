package org.lq.ZOO.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by msi on 2016/12/17
 */

@SuppressWarnings("serial")
public class Minder extends JFrame {
    private boolean thread1B = false;   //记录线程1的运行状态
    private boolean thread2B = false;   //记录线程2的运行状态
    private boolean thread3B = false;   //记录线程3的运行状态

    private boolean thread1A = false;   //记录是否存在任务1
    private boolean thread2A = false;   //记录是否存在任务2
    private boolean thread3A = false;   //记录是否存在任务3

    //以下定义JP2面板下的两个文本框
    private JTextField JP2_JTF1 = new JTextField(20);
    private JTextField JP2_JTF2 = new JTextField("5", 4);
    //以下定义JP3面板下的两个文本框
    private JTextField JP3_JTF1 = new JTextField(20);
    private JTextField JP3_JTF2 = new JTextField("5", 4);
    //以下定义JP4面板下的两个文本框
    private JTextField JP4_JTF1 = new JTextField(20);
    private JTextField JP4_JTF2 = new JTextField("5", 4);

    Minder() {
        //基本窗口的参数代码
        Container cp = getContentPane();
        //        cp.setLayout(new FlowLayout());
        cp.setLayout(new GridLayout(5, 1));
        //        setBounds(450, 250, 500, 245);
        setBounds(450, 250, 550, 300);
        setTitle("任务提醒");
       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        //创建面板
        JPanel JP1 = new JPanel();
        JPanel JP2 = new JPanel();
        JPanel JP3 = new JPanel();
        JPanel JP4 = new JPanel();
        JPanel JP5 = new JPanel();

        //将面板对组件进行布局的代码
        JLabel JP1_JL = new JLabel("请填写任务");
        JP1.add(JP1_JL);

        JLabel JP2_JL1 = new JLabel("任务1");
        JLabel JP2_JL2 = new JLabel("请在");
        JLabel JP2_JL3 = new JLabel("分钟后提醒（正整数）");
        JP2.add(JP2_JL1);
        JP2.add(JP2_JTF1);
        JP2.add(JP2_JL2);
        JP2.add(JP2_JTF2);
        JP2.add(JP2_JL3);

        JLabel JP3_JL1 = new JLabel("任务2");
        JLabel JP3_JL2 = new JLabel("请在");
        JLabel JP3_JL3 = new JLabel("分钟后提醒（正整数）");
        JP3.add(JP3_JL1);
        JP3.add(JP3_JTF1);
        JP3.add(JP3_JL2);
        JP3.add(JP3_JTF2);
        JP3.add(JP3_JL3);

        JLabel JP4_JL1 = new JLabel("任务3");
        JLabel JP4_JL2 = new JLabel("请在");
        JLabel JP4_JL3 = new JLabel("分钟后提醒（正整数）");
        JP4.add(JP4_JL1);
        JP4.add(JP4_JTF1);
        JP4.add(JP4_JL2);
        JP4.add(JP4_JTF2);
        JP4.add(JP4_JL3);

        JButton JP5_JBStart = new JButton("开始计划");
        JP5.add(JP5_JBStart);
        JButton JP5_JBReset = new JButton("重置计划");
        JP5.add(JP5_JBReset);

        //将容器对面板进行布局的代码
        cp.add(JP1);
        cp.add(JP2);
        cp.add(JP3);
        cp.add(JP4);
        cp.add(JP5);

        JP5_JBStart.addActionListener(e -> {
            //如果不存在任务1,则标记任务1为空,相反让线程运行标记为活动状态,即为true.以下同.
            if (JP2_JTF1.getText().length() == 0) {
                thread1A = false;
                thread1B = true;
            } else thread1A = true;
            //若存在任务1,让线程运行标记留给下面的程序段进行赋值,此时线程状态仍为false.以下同.
            if (JP3_JTF1.getText().length() == 0) {
                thread2A = false;
                thread2B = true;
            } else thread2A = true;
            if (JP4_JTF1.getText().length() == 0) {
                thread3A = false;
                thread3B = true;
            } else thread3A = true;

            String TimeLong1 = JP2_JTF2.getText();
            final long TimeLongNum1 = (Integer.parseInt(TimeLong1)) * 1000 * 60;
            if (thread1A) {
                //启动内部类线程1
                new Thread(() -> {
                    try {
                        //进程暂停一段时间
                        Thread.sleep(TimeLongNum1);
                    } catch (InterruptedException e13) {
                        // TODO Auto-generated catch block
                        e13.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "时间已到，请检查您的任务:\n" + JP2_JTF1.getText());
                    //若存在任务1,且当任务1完成后(即线程从sleep状态醒来),给线程运行标记赋值为true.以下同.
                    thread1B = true;
                    //调用SetClose()方法,判断任务均完成,若均完成,则退出系统.以下同.
                    SetClose();
                }).start();
            }

            String TimeLong2 = JP3_JTF2.getText();
            final long TimeLongNum2 = (Integer.parseInt(TimeLong2)) * 1000 * 60;
            if (thread2A) {
                //启动内部类线程1
                new Thread(() -> {
                    try {
                        //进程暂停一段时间
                        Thread.sleep(TimeLongNum2);
                    } catch (InterruptedException e12) {
                        // TODO Auto-generated catch block
                        e12.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "时间已到，请检查您的任务:\n" + JP3_JTF1.getText());
                    thread2B = true;
                    SetClose();
                }).start();
            }

            String TimeLong3 = JP4_JTF2.getText();
            final long TimeLongNum3 = (Integer.parseInt(TimeLong3)) * 1000 * 60;
            if (thread3A) {
                //启动内部类线程1
                new Thread(() -> {
                    try {
                        //进程暂停一段时间
                        Thread.sleep(TimeLongNum3);
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "时间已到，请检查您的任务:\n" + JP4_JTF1.getText());
                    thread3B = true;
                    SetClose();
                }).start();
            }

            //如果只要有一个任务,则单击"开始计划"后隐藏窗口
            if (thread1A || thread2A || thread3A) {
                JOptionPane.showMessageDialog(null,
                        "所有任务已在后台运行,任务窗口将关闭");
                SetHide();
            }
        });

        //对"复位计划"按钮添加触发事件
        JP5_JBReset.addActionListener(e -> {
            //复位后将三个面板中的文本框中的数据清零或设置默认值
            if (!((JP2_JTF1.getText()).equals(""))) {
                JP2_JTF1.setText(null);
                JP2_JTF2.setText("5");
            }
            if (!((JP3_JTF1.getText()).equals(""))) {
                JP3_JTF1.setText(null);
                JP3_JTF2.setText("5");
            }
            if (!((JP4_JTF1.getText()).equals(""))) {
                JP4_JTF1.setText(null);
                JP4_JTF2.setText("5");
            }
        });
    }

    //隐藏窗口,因为在此类的构造方法中的按钮内部不能使用this关键字,所以另写一方法来调用,而在成员方法中this关键字
    private void SetHide() {
        this.setVisible(false);
    }

    private void SetClose() {
        //如果有任务,且所有任务都已经提醒完成,则退出系统,这里,没有任务的在开始时就标记相应线程状态为true,
        //而有任务的,则必须在以上程序块中当线程醒来后(即任务完成)才标记相应线程状态为true,为了便于判断所有
        //任务都已提示完成.
        if (this.thread1B && this.thread2B && this.thread3B)
            System.exit(0);
    }

    public static void main(String[] args) {
        new Minder();
    }
}
