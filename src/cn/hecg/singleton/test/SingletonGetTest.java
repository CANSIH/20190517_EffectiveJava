package cn.hecg.singleton.test;

import cn.hecg.singleton.Elvis_1;
import cn.hecg.singleton.Elvis_2;
import cn.hecg.singleton.Elvis_3;

/**
 * 功能：測試获取单例对象的
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class SingletonGetTest {
	public static void main(String[] args) {
		/**
		 * 1.获取单例对象，使用公有的静态成员
		 */
		Elvis_1 elvis = Elvis_1.INSTANCE;
		System.out.println(elvis);
		
		/**
		 * 2.使用公有的静态工厂方法获取单例对象，成员是私有的
		 */
		Elvis_2 elvis_2 = Elvis_2.getInstance();
		System.out.println(elvis_2);
		/**
		 * 3.单例的第三种方式，编写一个包含单个元素的枚举类型
		 */
		Elvis_3 elvis_3 = Elvis_3.INSTANCE;
		System.out.println(elvis_3);
		System.out.println(elvis_3 instanceof Elvis_3);
	}
	
}
