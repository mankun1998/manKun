/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Subject;

/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
public interface SubjectService {

	List<Subject> findAll();
	Subject getSubjectName(int subjectId);
}
