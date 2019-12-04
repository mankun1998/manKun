/**
 * 
 */
package org.lq.ZOO.Dao;

import java.util.List;

import org.lq.ZOO.entity.Subject;

/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
public interface SubjectDao {

	List<Subject> findAll();
	Subject getSubjectName(int subjectId);
}


