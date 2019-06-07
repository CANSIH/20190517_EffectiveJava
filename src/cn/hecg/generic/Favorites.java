package cn.hecg.generic;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	private Map<Class<?>, Object> favoritesMap = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		if (type == null) {
			throw new NullPointerException();
		}
		favoritesMap.put(type, instance);
	}

	public <T> T getFavorites(Class<T> type) {
		// cast,底层将对象强转为对应的类型
		return type.cast(favoritesMap.get(type));
	}

	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "Hello");
//		f.putFavorite(String.class, "World");

		f.putFavorite(Integer.class, 123);
		f.putFavorite(Integer.class, 456);

		f.putFavorite(Class.class, Favorites.class);

		String fString = f.getFavorites(String.class);
		System.out.println(fString);
		
		Integer fInteger = f.getFavorites(Integer.class);
		System.out.println(fInteger);
		
		Class<?> fClass = f.getFavorites(Class.class);
		System.out.println(fClass);
		
		assert fClass != null;
	}

}
