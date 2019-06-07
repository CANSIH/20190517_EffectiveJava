package cn.hecg.builder;

/**
 * 功能：表示营养成分的实体类，使用构建器，NutritionFacts：营养成分，这种方式可以改造JavaBean了
 *
 * @author hecg
 * @version 2019年5月17日
 */
public class NutritionFacts {
	private final int servingSize; // 容量（ml）
	private final int servings; // 份
	private final int calories; // 卡路里
	private final int fat; // 脂肪（g）
	private final int sodium; // 钠（mg）
	private final int carohydrate; // 糖 (g)

	/**
	 * 功能：內部构建器
	 *
	 * @author hecg
	 * @version 2019年5月17日
	 */
	public static class Builder {
		private final int servingSize; // 容量（ml），必输
		private final int servings; // 份，必输
		private int calories = 0; // 卡路里，必输
		private int fat = 0; // 脂肪（g），非必输
		private int sodium = 0; // 钠（mg），非必输
		private int carohydrate = 0; // 糖 (g)，非必输
		
		/**
		 * 内部构建器的构造器
		 * @param servingSize
		 * @param servings
		 */
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			this.calories = val;
			return this;
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}

		public Builder carohydrate(int val) {
			this.carohydrate = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	/**
	 * 私有构造方法，供构内部建器使用
	 * @param builder
	 */
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carohydrate = builder.carohydrate;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carohydrate=" + carohydrate + "]";
	}
}
