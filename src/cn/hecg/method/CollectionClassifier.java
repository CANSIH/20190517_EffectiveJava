package cn.hecg.method;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 功能：测试重载，重载是方法名相同，方法参数类型或者参数个数不同的方法。 具体调用哪个方法是在编译时就决定的，不是在运行时决定的，要区分重载和覆盖。
 * 覆盖是：子类重写了父类的方法
 *
 * @author hecg
 * @version 2019年5月26日
 */
public class CollectionClassifier {
	public static String classify(Set<?> set) {
		return "Set";
	}

	public static String classify(List<?> list) {
		return "List";
	}

	public static String classify(Collection<?> c) {
		return "Unknown Collection";
	}

	public static void main(String[] args) {
		Collection<?>[] collections = { new HashSet<String>(), new ArrayList<BigInteger>(),
				new HashMap<String, String>().values() };
		for (Collection<?> collection : collections) {
			// 编译的时候做出决定的，编译时的类型都是Collection<?>,因此要慎用重载
			System.out.println(classify(collection));
		}
	}
}
