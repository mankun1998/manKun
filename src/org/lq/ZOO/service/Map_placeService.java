package org.lq.ZOO.service;

import org.lq.ZOO.entity.Map_place;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:26:32
*/
public interface Map_placeService {
	//通过Id查询地图信息
			Map_place getMap_palceByID(int id );
}
