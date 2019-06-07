package cn.hecg.extend.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import cn.hecg.extend.InstrumentedHashSet;
import cn.hecg.extend.InstrumentedSet;

public class InstrumentedHashSetTest {
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
		s.addAll(Arrays.asList("a","b","c"));
		System.out.println(s.size());
		System.out.println(s.getAddCount());
		System.out.println("==================================");
		
		InstrumentedSet<String> ss = new InstrumentedSet<>(new TreeSet<String>());
		ss.addAll(Arrays.asList("A", "B", "C"));
		System.out.println(ss.size());
		System.out.println(ss.getAddCount());
		System.out.println("==================================");
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "hecg");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
}
