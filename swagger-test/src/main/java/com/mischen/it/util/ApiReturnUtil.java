package com.mischen.it.util;

import java.util.Map;

import com.mischen.it.entity.ApiReturnObject;

public class ApiReturnUtil {

	public static ApiReturnObject success(Map<String, String> map) {		
		return (ApiReturnObject) map;
	}

}
