
public class TestCTDL {
	public static int solveEx1(int n) {
		if (n == 1) {
			return -1;
		} else {
			return (int) (solveEx1(n-1) + Math.pow(-1, n) * (2 * n - 1));
		}
	}

	public static String reverse_1(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			return reverse_1(s.substring(1)) + s.charAt(0);
		}
	}

	public static double getAverage(int[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static void main(String[] args) {
		System.out.println(solveEx1(3));
		String s = "happy",a="";
		System.out.println(a.length());
		System.out.println(reverse_1(s));
		int[] test3 = {1,2,3,4,5};
		System.out.println(getAverage(test3));
	}
}
