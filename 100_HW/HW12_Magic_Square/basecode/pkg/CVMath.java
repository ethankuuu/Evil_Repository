package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three) {
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int x) {
		int sum = 0;
		int i = 1;
		
		while (sum < x) {
				sum += i;
				i++;
		}
		
		if (sum == x) {
			System.out.println(x + ": special square");
		}
		
		else {
			System.out.println(x + ": not a special square");
		}
	}
}
