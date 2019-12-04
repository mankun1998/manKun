package org.lq.ZOO.util;

import lombok.extern.java.Log;

/**
 * 类型转换工具类
 * @author 无语
 * @PROJECT SuperCRM
 * @时间 2019年5月25日-下午3:54:49
 *
 */
public class CastUtil {

	/**
	 * 转为String类型（提供默认值）
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj,String defaultValue) {
		return obj!=null ? String.valueOf(obj) : defaultValue;
	}
	/**
	 * 转为String类型
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj) {
		return CastUtil.castString(obj, "");
	}
	/**
	 * 转为double类型(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static double castDouble(Object obj,double defaultValue) {
		double doubleValue = defaultValue;

		if(obj!=null) {
			String strValue = castString(obj);
			if(!strValue.trim().isEmpty()) {
				try {
					doubleValue = Double.parseDouble(strValue);
				} catch (NumberFormatException e) {
					//					e.printStackTrace();
					doubleValue = defaultValue;
				}
			}
		}
		return doubleValue;
	}
	/**
	 * 转为double类型
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj) {
		return CastUtil.castDouble(obj, 0);
	}
	
	public static int castInt(Object obj,int defaultValue) {

		int intValue = defaultValue;

		if(obj!=null) {
			String strValue = castString(obj);
			if(strValue.indexOf(".")!=-1) {
				strValue = strValue.substring(0,strValue.indexOf("."));
			}
			if(!strValue.trim().isEmpty()) {
				try {
					intValue = Integer.parseInt(strValue);
				} catch (NumberFormatException e) {
					intValue = defaultValue;
				}
			}
		}

		return intValue;
	}
	/**
	 * 转换成int类型
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj) {
		return CastUtil.castInt(obj, 0);
	}
	

}
