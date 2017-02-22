public class Enumexample {
	public enum Season{
		spring,fall
	}

	public static void main(String[] args) {
		for(Season s : Season.values())
			System.out.println(s);

	}

}