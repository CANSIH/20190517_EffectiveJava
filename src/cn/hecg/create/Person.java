package cn.hecg.create;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 功能：测试避免创建不必要的对象
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class Person {
	private final Date birthDate;

	public static class Builder {
		private final Date birthDate;

		public Builder(Date birthDate) {
			this.birthDate = birthDate;
		}

		public Person buid() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		this.birthDate = builder.birthDate;
	}

	/**
	 * 功能：判断是否是处于高峰期出生的还在（1946-1964）
	 *
	 * @author hecg
	 * @version 2019年5月18日
	 */
	public boolean isBabyBoomer() {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}

	@Override
	public String toString() {
		return "Person [birthDate=" + birthDate + "]";
	}

}
