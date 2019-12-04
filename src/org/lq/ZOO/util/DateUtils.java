package org.lq.ZOO.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static final String DATE_TIME_PATTERN="yyyy-MM-dd HH:mm:ss";
	public static final String MINUTE_PATTERN="yyyy-MM-dd HH:mm";
	public static final String HOUR_PATTERN="yyyy-MM-dd HH";
	public static final String DATE_PATTERN="yyyy-MM-dd";
	public static final String MONTH_PATTERN="yyyy-MM";
	public static final String YEAR_PATTERN="yyyy";
	public static final String HOUR_ONLY_PATTERN="HH";
	
	/**
	 * 将时间对象格式化成字符串
	 * @param date 时间对象
	 * @param pattern DateUtils.格式字符串 || 为空 默认使用 yyyy-MM-dd
	 * @return
	 */
	public static String dateFormat(Date date,String...pattern) {
		if(pattern.length==0) {
			pattern = new String[1];
			pattern[0] = DateUtils.DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern[0]);
		return sdf.format(date);
	}
	/**
	 * 将字符串转换成时间对象
	 * @param dateTimeString
	 * @param pattern DateUtils.格式字符串 || 为空 默认使用 yyyy-MM-dd
	 * @return
	 * @throws ParseException
	 */
	public static Date dateParse(String dateTimeString,String...pattern) throws ParseException {
		if(pattern.length==0) {
			pattern = new String[1];
			pattern[0] = DateUtils.DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern[0]);
		
		return sdf.parse(dateTimeString);
	}

	/**
	 * 将utilDate转换成SQLDate
	 * @param date
	 * @return
	 */
	public static java.sql.Date utilDateTOSqlDate(Date date){
		return new java.sql.Date(date.getTime());
	}
	
	
}




