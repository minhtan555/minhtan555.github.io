
public class TowerOfHaNoi {
	static int count = 0;
	public static void change(int n, char a, char b) {
		System.out.println("Chuyen dia " + n +  " tu " + a + " den " + b);
		//System.out.println(++count);
	}
	public static void towerHaNoi(int n, char a, char b, char c) {
		if(n==1) {
			change(n, a, c);
		} else {
			towerHaNoi(n-1, a, c, b);
			change(n, a, c);
			towerHaNoi(n-1, b, a, c);
		}
	}
	public static void main(String[] args) {
		char a = 'A', b = 'B',c = 'C';
		towerHaNoi(3, a, b, c);
	}
}
