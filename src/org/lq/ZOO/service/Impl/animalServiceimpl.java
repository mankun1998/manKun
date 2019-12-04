package org.lq.ZOO.service.Impl;

import java.util.List;

import org.lq.ZOO.Dao.animalDao;
import org.lq.ZOO.Dao.Impl.animalDaoImpl;
import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.service.animalService;

import lombok.Builder;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:24:51
*/

public class animalServiceimpl implements animalService {

	private animalDao dao = animalDaoImpl.builder().build();
	@Override
	public List<Animal> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Animal> getAnimalBysubject(int subject) {
		return dao.getAnimalBysubject(subject);
	}
//
//	@Override
//	public List<Animal> getAnimalByVariety(int variety) {
//		return dao.getAnimalByVariety(variety);
//	}

	@Override
	public List<Animal> getAnimalByCondition(int condition) {
		return dao.getAnimalByCondition(condition);
	}

	@Override
	public boolean updateAnimal(Animal animal) {
		return dao.updateAnimal(animal)>0;
	}

	@Override
	public boolean addAnimal(Animal animal) {
		return dao.addAnimal(animal)>0;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.animalService#getAnimalById(int)
	 */
	@Override
	public Animal getAnimalById(int id) {
		return dao.getAnimalById(id);
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.animalService#getAnimalByName(java.lang.String)
	 */
	@Override
	public List<Animal> getAnimalByName(String name) {
		// TODO Auto-generated method stub
		return dao.getAnimalByName(name);
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.animalService#getAnimalByVarietyAndCondition(int, int)
	 */
	@Override
	public List<Animal> getAnimalBySubjectAndCondition(int variety, int condition) {
		return dao.getAnimalBySubjectAndCondition(variety, condition);
	}

}
