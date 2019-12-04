package org.lq.ZOO.entity;



import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Breeder {
	int id;
	String name;
	//动物的种类
	int animalId;
	//喂食量
	String breederCount;
	//喂食名
	String breederName;
	//喂食时间
	Date breederTime;
	//备注
	String content;
}
