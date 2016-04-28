package com.potato.bims.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.potato.bims.common.constant.AppConstants;

public class AppUtils {
	
	/**
	 * 获取当前系统时间
	 * @return 时间(yyyy-MM-dd HH:mm:ss)
	 */
	public static String getSysDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat(AppConstants.FULLTIME_FORMAT);
		return dateFormat.format(new Date());
	}
	
	/**
	 * 获取当前系统时间
	 * @param type
	 * @return
	 */
	public static String getSysDate(String type){
		SimpleDateFormat dateFormat = new SimpleDateFormat(type);
		return dateFormat.format(new Date());
	}
}
