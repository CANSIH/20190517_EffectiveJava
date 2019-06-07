package cn.hecg.singleton;

/**
 * 功能：单例的第二种方式，使用公有的静态工厂方法获取对象，成员是私有的
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class Elvis_2 {
	private static final Elvis_2 INSTANCE = new Elvis_2();

	public static Elvis_2 getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
	}

	@Override
	public String toString() {
		return "Elvis_2 []：使用公有的静态工厂方法获取对象，成员是私有的";
	}
}
