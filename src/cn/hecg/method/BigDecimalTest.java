package cn.hecg.method;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		final BigDecimal TEN_CENTS = new BigDecimal("0.10");
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for(BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
			itemsBought++;
			funds = funds.subtract(price);
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);
	}
}
