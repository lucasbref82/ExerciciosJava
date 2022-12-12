package boxing_unboxing;

public class Main {
	
	
	public static void main(String[] args) {
		// Boxing
		int x = 20;
		Object object = x;
		System.out.println(object);
		
		// Unboxing
		int y = (int) object;
		System.out.println(y);
	}

}
