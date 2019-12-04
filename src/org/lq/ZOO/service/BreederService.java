/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Breeder;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
public interface BreederService {

	List<Breeder> findAll();
	List<Breeder> getanimalById(int id);

	boolean addBreeder(Breeder breeder);
}
