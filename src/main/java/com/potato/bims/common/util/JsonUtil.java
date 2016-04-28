package com.potato.bims.common.util;

import java.util.HashSet;
import java.util.Set;

import net.sf.json.JsonConfig;

public class JsonUtil {
	
	/**
	 * 获取排除了不要被JSON序列化属性的JsonConfig
	 * @param excludes
	 * @return JsonConfig
	 */
	public static JsonConfig getExcludesJsonConfig(String...excludes){
		JsonConfig jsonConfig = new JsonConfig();  //建立配置文件
        Set<String> sets = new HashSet<String>();
        sets.add("handler");//排除hibernate代理属性
        sets.add("hibernateLazyInitializer");//排除hibernate代理属性
        for (String str : excludes) {
        	sets.add(str);
        }
        jsonConfig.setExcludes(sets.toArray(new String[sets.size()])); 
        return jsonConfig;
        
	}
}
