package cn.hecg.singleton;

/**
 * 功能：单例的第一种方式，使用公有的静态成员，且静态成员是个final域
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class Elvis_1 {
	public static final Elvis_1 INSTANCE = new Elvis_1();

	private Elvis_1() {

	}

	public void leaveTheBuilding() {
	}

	@Override
	public String toString() {
		return "Elvis_1 []：使用公有的静态成员获取单例对象";
	}
	
	
}
