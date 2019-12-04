package org.lq.ZOO.service.Impl;

import java.io.DataOutput;
import java.util.List;

import org.lq.ZOO.Dao.Message_BoardDao;
import org.lq.ZOO.Dao.Impl.Message_BoardDaoimpl;
import org.lq.ZOO.entity.Message_Board;
import org.lq.ZOO.service.Message_BoardService;



/**
 * @author ÐíºÆ
 */
public class Message_BoardServiceimpl implements Message_BoardService{
	Message_BoardDao dao = new Message_BoardDaoimpl();
	/* 
	 * @see org.lq.ZOO.service.Message_BoardService#findAll()
	 */
	@Override
	public List<Message_Board> findAll() {
		return dao.findAll();
	}

	/* 
	 * @see org.lq.ZOO.service.Message_BoardService#addMessage(org.lq.ZOO.entity.Message_Board)
	 */
	@Override
	public boolean addMessage(Message_Board message_Board) {
		return dao.addMessage(message_Board)>0;
	}

}
