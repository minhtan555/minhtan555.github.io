package sort;
import java.util.Scanner;
public class MergeSort {
	public static void merge(int[] array, int l, int m, int r){
        int a,b,c;
        int n1 = m - l +1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] = array[l + i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = array[m + 1 + j];
        }
        a=0;
        b=0;
        c=l;
        while(a<n1 && b<n2){
            if(L[a] <= R[b]){
                array[c] = L[a];
                a++;
            } else {
                array[c] = R[b];
                b++;
            }
            c++;
        }
        while(a < n1){
            array[c] = L[a];
            a++;
            c++;
        }
        while(b < n2) {
            array[c] = R[b];
            b++;
            c++;
        }
    }
    public static void mergeSort(int[] a, int l, int r){
        if(l < r) {
            int m = l + (r-l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m ,r);
        }
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
        int[] a = {5,4,6,1,2,7,3};
        mergeSort(a, 0, a.length-1);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
