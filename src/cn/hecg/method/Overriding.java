package cn.hecg.method;

class Wine {
	public String name() {
		return "Wine";
	}
}

class SparklingWine extends Wine {
	@Override
	public String name() {
		return "SparklingWine";
	}
}

class Champagne extends SparklingWine {
	@Override
	public String name() {
		return "Champagne";
	}
}

public class Overriding {
	public static void main(String[] args) {
		Wine[] wines = { new Wine(), new SparklingWine(), new Champagne() };
		for (Wine wine : wines) {
			System.out.println(wine.name());
		}
	}
}


