package org.lq.ZOO.entity;

import java.util.Date;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * @author许浩
 * @2019年6月28日
 * @Message_Board.java
 * @ZOO
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Message_Board {

	int id;
	//联系方式
	String contact;
	//留言内容
	String textContent;
	//留言时间
	Date messageTime;
}
