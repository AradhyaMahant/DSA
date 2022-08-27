package sorting;

public class QuickSort {
	
	void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	
	int partition(int arr[],int low,int high) {
		int i = low;
		int j = low;
		int pivot = arr[high];
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	
	void sort(int arr[],int low,int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
	}
	
	
		public static void main(String args[]) {
			int arr[] = {5,6,2,3,10,4};
			QuickSort QS = new QuickSort();
			QS.sort(arr, 0, arr.length-1);
			QS.printarray(arr);
		}
}
