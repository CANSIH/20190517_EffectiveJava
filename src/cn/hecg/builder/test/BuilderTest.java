package cn.hecg.builder.test;

import cn.hecg.builder.NutritionFacts;

/**
 * 功能：测试构建器
 *
 * @author hecg
 * @version 2019年5月17日
 */
public class BuilderTest {
	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(100).sodium(38).carohydrate(27)
				.build();
		System.out.println(nutritionFacts.toString());
	}
}
