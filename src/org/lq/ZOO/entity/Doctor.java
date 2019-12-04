package org.lq.ZOO.entity;

import java.io.InputStream;
import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {
	int id;
	//姓名
	String name;
	//拼音
	String pinyin;
	//年龄
	String age;
	//性别
	String gender;
	//照片
	InputStream icon;
	//电话
	String phone;
	//状态
	int condition;
	//入职时间
	Date entryDate;
	//备注
	String comment;
}
