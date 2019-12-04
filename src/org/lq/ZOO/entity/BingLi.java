package org.lq.ZOO.entity;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BingLi {
	//病例编号
	int id;
	//员工编号
	int staffId;
	//动物编号
	int animalId;
	
	//用药名
	String medicineName;
	//用药量
	String medicineCount;
	//看病时间
	Date medicineTime;
	//备注
	String content;
}
