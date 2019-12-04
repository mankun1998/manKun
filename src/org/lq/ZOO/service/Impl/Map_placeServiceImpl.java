package org.lq.ZOO.service.Impl;

import org.lq.ZOO.Dao.Map_place_Dao;
import org.lq.ZOO.Dao.Impl.Map_place_Dao_Impl;
import org.lq.ZOO.entity.Map_place;
import org.lq.ZOO.service.Map_placeService;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:27:19
*/
public class Map_placeServiceImpl implements Map_placeService {

	Map_place_Dao dao=new Map_place_Dao_Impl();
	@Override
	public Map_place getMap_palceByID(int id) {
		return dao.getMap_palceByID(id);
	}

}
