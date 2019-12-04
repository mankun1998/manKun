package org.lq.ZOO.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Variety {
	int varietyId;
	int subjectId;
	String varietyName;
}
