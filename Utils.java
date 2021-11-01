package execution_order;

public class Utils {
	
	private static int count = 0;
	
	private static String getPre() {
		count += 1;
		return count + ". ";
	}
	
	public static void print(String message) {
		System.out.println(getPre() + message);
	}

}
