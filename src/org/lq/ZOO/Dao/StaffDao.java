package org.lq.ZOO.Dao;

import java.util.List;

import org.lq.ZOO.entity.Staff;



/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月12日上午11:57:37
*/
public interface StaffDao {

	//查询全部
	List<Staff> findAll();
	
	//根据id查询
	Staff getStaffByID(int id);
	
	//根据姓名拼音模糊查询
	List<Staff> getStaffByValue(String value);
	
	//根据在职状态查询
	List<Staff> getStaffByCondition(int condition);
	
	//添加
	int addStaff(Staff staff);
	
	//修改
	int updateStaff(Staff staff);
	
	int updateStaffByIdCard(Staff staff);
	
}
