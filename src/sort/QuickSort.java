package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 9, 23, 45, 78, 90, 23, 1, 6, 5 };
		// int[] a = {0, 2, 5, 4, 1, 3, 8, 6};
		System.out.println("Mang ban dau:");
		in(a);
		System.out.println("Quick Sort:");
		QuickSort(a, 0, a.length - 1);

		in(a);
	}

	public static void in(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	public static void QuickSort(int[] a, int left, int right) {
		int low = left;
		int high = right;
		int mid = (left + right) / 2;
		int key = a[mid]; // moc de ss

		while (low <= high) {
			while (a[low] < key) {// tim vtri cua ptu > key
				low++;
			}
			while (a[high] > key) { // tim vtri cua ptu < key
				high--;
			}
			if (low <= high) {
				swap(a, low, high);
				// doi cho xog, tang index de xet ptu ke tiep
				low++;
				high--;
			}
		}
		// duyet day ben trai
		if (left < high) { // hight luc nay giam con = vtri cuoi cua day con ben
							// trai
			QuickSort(a, left, high);
		}
		// duyet day ben phai
		if (low < right) { // right bay h da tang = vtri dau cua day con ben fai
			QuickSort(a, low, right);
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
