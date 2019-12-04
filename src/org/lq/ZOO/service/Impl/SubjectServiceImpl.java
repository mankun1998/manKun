
/**
 * 
 */
package org.lq.ZOO.service.Impl;

import java.util.List;

import org.lq.ZOO.Dao.SubjectDao;
import org.lq.ZOO.Dao.Impl.SubjectDaoImpl;
import org.lq.ZOO.entity.Subject;
import org.lq.ZOO.service.SubjectService;

/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
public class SubjectServiceImpl implements SubjectService{

	SubjectDao SubDao = SubjectDaoImpl.builder().build();
	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.SubjectService#findAll()
	 */
	@Override
	public List<Subject> findAll() {
		
		return SubDao.findAll();
	}
	/* (non-Javadoc)
	 * @see org.lq.ZOO.service.SubjectService#getSubjectName(int)
	 */
	@Override
	public Subject getSubjectName(int subjectId) {
		
		return SubDao.getSubjectName(subjectId);
	}

}
