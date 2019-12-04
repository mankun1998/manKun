package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Animal;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:23:44
*/
public interface animalService {
	//查询全部
		List<Animal> findAll();
		
		Animal getAnimalById(int id);
		List<Animal> getAnimalByName(String name);
		List<Animal> getAnimalBySubjectAndCondition(int subject,int condition);
		
		//根据种类查询
		List<Animal> getAnimalBysubject(int subject);
		
		//根据科目查询
//		List<Animal> getAnimalByVariety(int variety);
		
		//根据状态查询
		List<Animal> getAnimalByCondition(int condition);
		
		//修改
		boolean updateAnimal(Animal animal);
		
		//添加
		boolean addAnimal(Animal animal);
}
