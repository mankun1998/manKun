package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Message_Board;

/**
 * @author Administrator
 *
 */
public interface Message_BoardService {
	//查看全部留言板
		List<Message_Board> findAll();
		//添加留言
		boolean addMessage(Message_Board message_Board);
}
