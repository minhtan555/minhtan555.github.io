
public class Recursive {
	public static int sum(int[] array, int n) {
		
		if(n==1) {
			return array[0];
		} else {
			return array[n-1] + sum(array,n-1) ;
		}
	}
	public static int checkSquareNumber(int n) {
		int temp = (int)Math.sqrt(n);
		if(temp*temp == n) {
			return n;
		}
		return 0;
	}
	public static int sumSquareNumber(int[] array, int n) {
		if(n==1) {
			return array[0];
		} else {
			return checkSquareNumber(array[n-1]) + sumSquareNumber(array, n-1);
		}
	}
	public static int min(int a, int n) {
		if(a > n) {
			return n; 
		}
		return a;
	}
	public static int max(int a, int n) {
		if(a > n) {
			return a; 
		}
		return n;
	}
	public static int findMin(int[] array, int n) {
		if(n==1) {
			return array[0];
		} else {
			return min(array[n-1], findMin(array, n-1));
		}
	}
	public static int findMax(int[] array, int n) {
		if(n==1) {
			return array[0];
		} else {
			return max(array[n-1], findMax(array, n-1));
		}
	}
	public static void main(String[] args) {
		int[] a = {4,-8,0,2,3,1,9,7,-5};
		int n = a.length;
		// tinh tong day bang de quy
		System.out.println("Sum of array: " + sum(a,n));
		// tinh tong cac so chinh phuong bang de quy
		System.out.println("Sum of Square Number: " + sumSquareNumber(a, n));
		// tim min bang de quy
		System.out.println("Min of array by recursive: " + findMin(a, n));
		// tim max bang de quy
		System.out.println("Max of array by recursive: " + findMax(a, n));
	}
}
