
public class SearchAlgorithm {
	public static boolean bai1(int[] arr, int target) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==target) return true;
		}
		return false;
	}
	public static boolean binarySearch(int[] arr, int target, int low, int high){
		boolean result = false;
		int mid = (low + high)/2;
		if((target == arr[mid])&&(low == high)){
			result = true;
		}else{
			if((target != arr[mid])&&(low == high)){
				result = false;
			}else{
			if(target > arr[mid]){
			return 	binarySearch(arr, target, mid + 1, high);
			}else{
			return	binarySearch(arr, target, low, mid -1);
			}}
		
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int target = 2;
//		System.out.println(SearchAlgorithm.bai1(arr, target));
		System.out.println(SearchAlgorithm.binarySearch(arr, 2, 0, 4));
		
	}

}
