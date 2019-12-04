package org.lq.ZOO.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

//¶¯Îï×´Ì¬
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AnimalStatus {
	int id;
	String type;
}
