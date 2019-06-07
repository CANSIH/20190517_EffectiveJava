package cn.hecg.create;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 功能：测试避免创建不必要的对象，使用static，创建一个静态初始化器
 *
 * @author hecg
 * @version 2019年5月18日
 */
public class Person2 {
	private final Date birthDate;

	private static final Date BOOM_START;
	private static final Date BOOM_END;

	public static class Builder {
		private final Date birthDate;

		public Builder(Date birthDate) {
			this.birthDate = birthDate;
		}

		public Person2 buid() {
			return new Person2(this);
		}
	}

	private Person2(Builder builder) {
		this.birthDate = builder.birthDate;
	}

	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	/**
	 * 功能：判断是否是处于高峰期出生的还在（1946-1964）
	 *
	 * @author hecg
	 * @version 2019年5月18日
	 */
	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

	@Override
	public String toString() {
		return "Person2 [birthDate=" + birthDate + "]";
	}

}
