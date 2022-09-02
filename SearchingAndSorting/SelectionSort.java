package sorting;

public class SelectionSort {
		public void sort(int arr[]) {
			int n = arr.length;
			for(int i=0;i<n-1;i++) {
				int min = i;
				for(int j= i+1;j<n;j++) {
					if(arr[j]<arr[min]) {
						min = j;
					}
				}
				
				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		
		
		void printarray(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	
	
	public static void main(String[] args) {
		int arr[] = {10,3,2,6,5,8,7,9};
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		ss.printarray(arr);
		
	}
}
