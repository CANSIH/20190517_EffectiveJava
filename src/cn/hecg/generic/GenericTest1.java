package cn.hecg.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能：泛型测试1
 *
 * @author hecg
 * @version 2019年5月21日
 */
public class GenericTest1 {
	
	public static void main(String[] args) {
		List<String> s1 = new ArrayList<>();
		List<Object> s2 = new ArrayList<>();
		// s1 = s2;
		// s2 = s1;
		
		Map<String, String> map1 = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map map3 = new HashMap();
//		map1 = map2;
//		map2 = map1;
		
		map3 = map1;
		@SuppressWarnings("unused")
		Map<String, Object> map4 = map3;
		
		// List<Object> list = new ArrayList<Long>();
	}

}
