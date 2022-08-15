package sorting;

public class InsertionSort {

	void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
	void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = {10,5,11,16,2,3};
		is.sort(arr);
		is.printarray(arr);
	}
}
