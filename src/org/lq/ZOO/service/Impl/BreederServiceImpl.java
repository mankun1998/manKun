/**
 * 
 */
package org.lq.ZOO.service.Impl;

import java.util.List;

import org.lq.ZOO.Dao.BreederDao;
import org.lq.ZOO.Dao.Impl.BreederDaoImpl;
import org.lq.ZOO.entity.Breeder;
import org.lq.ZOO.service.BreederService;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
public class BreederServiceImpl implements BreederService{

	private BreederDao dao= BreederDaoImpl.builder().build();
	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.BreederService#findAll()
	 */
	@Override
	public List<Breeder> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.BreederService#getanimalById(int)
	 */
	@Override
	public List<Breeder> getanimalById(int id) {
		// TODO Auto-generated method stub
		return dao.getanimalById(id);
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.BreederService#addBreeder(org.lq.ZOO.entity.Breeder)
	 */
	@Override
	public boolean addBreeder(Breeder breeder) {
		// TODO Auto-generated method stub
		return dao.addBreeder(breeder)>0;
	}

}
