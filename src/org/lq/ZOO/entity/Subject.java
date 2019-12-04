package org.lq.ZOO.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Subject {
	int subjectId;
	String subjectName;
	
	
	public String toString() {
		return subjectName;
	}
}
