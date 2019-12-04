package org.lq.ZOO.ui;
 
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
 
public class Window extends JFrame{
	
	private JPanel contentPane;	//顶层容器，整个播放页面的容器
	private JMenuBar menuBar;	//菜单栏
	private JMenu mnFile,mnSetting,mnHelp;	//文件菜单
	private JMenuItem mnOpenVideo,mnExit;	//文件菜单子目录，打开视屏、退出
	private JPanel panel;	//控制区域容器
	private JProgressBar progress;	//进度条
	private JPanel progressPanel;	//进度条容器
	private JPanel controlPanel;	//控制按钮容器
	private JButton btnStop,btnPlay,btnPause;	//控制按钮，停止、播放、暂停
	private JSlider slider;		//声音控制块
	//找不到
	
	EmbeddedMediaPlayerComponent playerComponent;	//媒体播放器组件
	
	public static void main(String[] args) {
		
	}
 
	//MainWindow构造方法，创建视屏播放的主界面
	public Window(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setTitle("动物世界 by 五颜组");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,80,900,600);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		/*视频播放窗口中的菜单栏*/
		menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile=new JMenu("文件");		//设置菜单名
		menuBar.add(mnFile);
		mnSetting=new JMenu("设置");
		menuBar.add(mnSetting);
		mnHelp=new JMenu("帮助");
		menuBar.add(mnHelp);
		
		mnOpenVideo =new JMenuItem("打开文件");	//设置文件菜单子目录打开文件
		mnFile.add(mnOpenVideo);
		
		mnExit =new JMenuItem("退出");	//设置文件菜单子目录退出
		mnFile.add(mnExit);
		
		//打开文件
		mnOpenVideo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayMain.openVideo();
			}
		});
		
		//退出
		mnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayMain.exit();
			}
		});
		
		
		/*视屏窗口中播放界面部分*/
		JPanel videoPane=new JPanel();
		contentPane.add(videoPane, BorderLayout.CENTER);
		videoPane.setLayout(new BorderLayout(0,0));
		
		playerComponent=new EmbeddedMediaPlayerComponent();
		videoPane.add(playerComponent);
		
		/*视屏窗口中控制部分*/
		
		panel=new JPanel();		//实例化控制区域容器
		videoPane.add(panel,BorderLayout.SOUTH);
		
		progressPanel=new JPanel();	//实例化进度条容器
		panel.add(progressPanel, BorderLayout.NORTH);
 
		//添加进度条
		progress=new JProgressBar();	
		progressPanel.add(progress);
		//panel.add(progress,BorderLayout.NORTH);
		progress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){		//点击进度条调整视屏播放进度
				int x=e.getX();
				PlayMain.jumpTo((float)x/progress.getWidth());
			}
		});
		progress.setStringPainted(true);
		
		
		controlPanel=new JPanel();		//实例化控制按钮容器
		panel.add(controlPanel,BorderLayout.SOUTH);
		
		//添加停止按钮
		btnStop=new JButton("停止");
		btnStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.stop();
			}
		});
		controlPanel.add(btnStop);
		
		//添加播放按钮
		btnPlay=new JButton("播放");
		btnPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.play();
			}
		});
		controlPanel.add(btnPlay);
		
		//添加暂停按钮
		btnPause=new JButton("暂停");
		btnPause.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.pause();
			}
		});
		controlPanel.add(btnPause);
		
		//添加声音控制块
		slider=new JSlider();
		slider.setValue(80);
		slider.setMaximum(100);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				PlayMain.setVol(slider.getValue());
			}
		});
		controlPanel.add(slider);
	}
	
	//获取播放媒体实例（某个视频）
	public EmbeddedMediaPlayer getMediaPlayer() {
		return playerComponent.getMediaPlayer();
	}
	
	//获取进度条实例
	public JProgressBar getProgressBar() {
		return progress;
	}
	
}

