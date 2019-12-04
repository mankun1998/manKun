package org.lq.ZOO.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.lq.ZOO.communal.AnimalStatusType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;


/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月11日下午10:05:00
*/
//动物
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Animal {
	private int ANIMAIL_EXIST = 1;
	private int ANIMAL_DIE = 2;
	int id;
	//科目
	int subject;
	
	//昵称
	String name;
	//性别
	String gender;
	//出生日期
	Date birthday;
	//年龄
	int age;
	//状态
	int condition;
	//图片
	InputStream icon;
	//入园时间
	Date joinDate;
	//备注
	String comment;
	//动物状态
	AnimalStatusType animalStatus;
	
//	public StatusType getStatusType() {
//		switch (status) {
//		case 1:
//			statusType = StatusType.STATUS_TYPE_ONJOB;
//			break;
//		case 2:
//			statusType = StatusType.STATUS_TYPE_LEAVE;
//			break;
//		case 3:
//			statusType = StatusType.STATUS_TYPE_FALSE;
//			break;
//		default:
//			break;
//		}
//		return statusType;
//	}
	public AnimalStatusType getAnimalStatus() {
		switch(condition) {
		case 1:
			animalStatus = AnimalStatusType.ANIMAIL_EXIST;
			break;
		case 2:
			animalStatus = AnimalStatusType.ANIMAL_DIE;
			break;
			
		}
		return animalStatus;
	}
	
	
	public byte[] getIconBytes() {
		byte[] bytes = null;
		try {
			bytes = new byte[icon.available()];
			icon.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
}












