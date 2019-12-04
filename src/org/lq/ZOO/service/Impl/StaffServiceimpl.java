package org.lq.ZOO.service.Impl;

import java.util.List;

import org.lq.ZOO.Dao.StaffDao;
import org.lq.ZOO.Dao.Impl.StaffDaoImpl;
import org.lq.ZOO.entity.Staff;
import org.lq.ZOO.service.StaffService;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:25:49
*/
public class StaffServiceimpl implements StaffService{

	StaffDao dao=new StaffDaoImpl();
	@Override
	public List<Staff> findAll() {
		return dao.findAll();
	}

	@Override
	public Staff getStaffByID(int id) {
		return dao.getStaffByID(id);
	}

	@Override
	public List<Staff> getStaffByValue(String value) {
		return dao.getStaffByValue(value);
	}

	@Override
	public List<Staff> getStaffByCondition(int condition) {
		return dao.getStaffByCondition(condition);
	}

	@Override
	public boolean addStaff(Staff staff) {
		return dao.addStaff(staff)>0;
	}

	@Override
	public boolean updateStaff(Staff staff) {
		return dao.updateStaff(staff)>0;
	}

	/**
	 *@overriding
	 **/
	@Override
	public boolean updateStaffByIdCard(Staff staff) {
		
		return dao.updateStaffByIdCard(staff)>0;
	}

}
