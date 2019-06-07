package cn.hecg.create.test;

import java.util.Date;

import cn.hecg.create.Person;
import cn.hecg.create.Person2;

/**
 * 功能：测试避免创建不必要的对象
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person.Builder(new Date()).buid();
		System.out.println(person);
		System.out.println(person.isBabyBoomer());
		System.out.println("===========================");
		
		Person2 person2 = new Person2.Builder(new Date()).buid();
		System.out.println(person2);
		System.out.println(person2.isBabyBoomer());
	}
}
