package org.lq.ZOO.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.swing.ImageIcon;

import org.lq.ZOO.entity.Animal.AnimalBuilder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:17:26
*/
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Map_place {
	int id;
	//园林图片
	InputStream icon;
	//园林名称
	String name;
	//园林介绍
	String introduction;
	
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
