package org.lq.ZOO.entity;
/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月12日上午10:54:22
*/

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.lq.ZOO.communal.StaffConditionType;
import org.lq.ZOO.communal.StaffProfessionType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Staff {
	int id;
	//姓名
	String name;
	//拼音
	String pinyin;
	//生日
	Date birthday;
	//年龄
	int age;
	//性别
	String gender;
	//照片
	InputStream icon;
	//电话
	String phone;
	//密码
	String password;
	//职位
	int professtion;
	//状态
	int condition;
	//身份证号
	String idCard;
	//入职时间
	Date entryDate;
	//备注
	String comment;
	//职位枚举
	StaffProfessionType staffProfession;
	//状态枚举
	StaffConditionType staffCondition;
	
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
	
	public StaffProfessionType getStaffProfession() {
		switch(professtion) {
		case 1:
			staffProfession = StaffProfessionType.STAFF_DOCTOR;
			break;
		case 2:
			staffProfession = StaffProfessionType.STAFF_FEED;
			break;
		}
		return staffProfession;
	}
	
	public StaffConditionType getStaffCondition() {
		switch (condition) {
		case 1:
			staffCondition = StaffConditionType.STAFF_AT;
			break;
		case 2:
			staffCondition = StaffConditionType.STAFF_LEAVE;
			break;
		}
		return staffCondition;
	}
	
	
	
	
	
	
	
	
	
	
	
}
