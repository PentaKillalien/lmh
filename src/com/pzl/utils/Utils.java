package com.pzl.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	/**
	 * 验证email
	 * @param email
	 * @return
	 */
	public static boolean CheckRegEx(String email) {
		// 邮箱验证规则
		String regEx = "[a-zA-Z_]{0,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
		// 编译正则表达式
		Pattern pattern = Pattern.compile(regEx);
		// 忽略大小写的写法
		// Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		// 字符串是否与正则表达式相匹配
		boolean rs = matcher.matches(); 
		return rs;
	}

}
