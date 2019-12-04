package org.lq.ZOO.Dao;

import org.lq.ZOO.entity.Staff;

/**
 * 登录
 * @author 申梦丽
 * @组名 第四组
 * 2019年7月4日
 */
public interface LoginDao {
	int isLoginUser(String value,String pwd);
}
