/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.BingLi;

/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameZOO
 */
public interface AnimalCaseInformationService {
	
	
	List<BingLi> findAll();
	List<BingLi> getId(int id);
	  int addBingliInformation(BingLi bingLi);
}
