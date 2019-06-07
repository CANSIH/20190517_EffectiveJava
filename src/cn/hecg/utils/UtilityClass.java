package cn.hecg.utils;

/**
 * 功能：测试通过私有构造器强化不可实例化的能力，该类是一个工具类
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class UtilityClass {
	/**
	 * 构造器私有化，防止外部访问该类，实例化该类
	 */
	private UtilityClass() {
		// throw new IllegalArgumentException();
		throw new AssertionError();
	}
	
	public static void say(String str) {
		System.out.println(str);
		new UtilityClass();
	}
	
}
