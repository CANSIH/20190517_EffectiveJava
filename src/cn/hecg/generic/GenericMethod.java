package cn.hecg.generic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 功能：测试泛型方法
 *
 * @author hecg
 * @version 2019年5月23日
 */
public class GenericMethod {
	/**
	 * 功能：泛型方法定义
	 *
	 * @author hecg
	 * @version 2019年5月23日
	 */
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
	
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>(Arrays.asList("a","b","c"));
		Set<String> s2 = new HashSet<>(Arrays.asList("d","e","f"));
		Set<String> set = GenericMethod.union(s1, s2);
		System.out.println(set);
		
		Map<String, List<String>> map = new HashMap<>();	
	}
}
