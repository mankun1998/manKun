/**
 * 
 */
package org.lq.ZOO.service.Impl;

import java.util.List;

import org.lq.ZOO.Dao.AnimalCaseInformationDao;
import org.lq.ZOO.Dao.animalDao;
import org.lq.ZOO.Dao.Impl.AnimalCaseInformationDaoImpl;
import org.lq.ZOO.entity.BingLi;
import org.lq.ZOO.service.AnimalCaseInformationService;

import lombok.Builder;

/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameZOO
 */
public class AnimalCaseInformationServiceImpl implements AnimalCaseInformationService{

	AnimalCaseInformationDao BingliDao = new AnimalCaseInformationDaoImpl();
	
	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.AnimalCaseInformationService#findAll()
	 */
	@Override
	public List<BingLi> findAll() {
		
		return BingliDao.findAll();
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.AnimalCaseInformationService#getId(int)
	 */
	@Override
	public List<BingLi> getId(int id) {
		return BingliDao.getId(id);
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.AnimalCaseInformationService#addBingliInformation(org.lq.ZOO.entity.BingLi)
	 */
	@Override
	public int addBingliInformation(BingLi bingLi) {
		return BingliDao.addBingliInformation(bingLi);
	}

}
