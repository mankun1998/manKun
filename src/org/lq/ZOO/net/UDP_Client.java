package org.lq.ZOO.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class UDP_Client {
	public static void getNetMsg() {
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket(9696);
			while(true) {
				byte []buf = new byte[1];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				datagramSocket.receive(packet);//线程阻塞
				String s = new String(buf);
				switch (s) {
				case "u":
					int num = JOptionPane.showConfirmDialog(null, "软件更新提示","是否更新?",JOptionPane.OK_CANCEL_OPTION);
					if (num == 0) {
						System.out.println("软件更新......");
					}
					break;

				default:
					JOptionPane.showMessageDialog(null, "这是一个广告....");
					break;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
