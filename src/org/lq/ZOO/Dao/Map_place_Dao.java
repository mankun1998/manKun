package org.lq.ZOO.Dao;
/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:19:53
*/

import org.lq.ZOO.entity.Map_place;

public interface Map_place_Dao {

	//通过Id查询地图信息
		Map_place getMap_palceByID(int id);
		
	//修改地图信息
		int update_place(int id,String path);
		
		
}
