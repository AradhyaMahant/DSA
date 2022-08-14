package sorting;

public class BubbleSort {

	public void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = {10,5,6,8,11,23,17};
		BubbleSort bs = new BubbleSort();
		bs.printarray(arr);
		bs.sort(arr);
		bs.printarray(arr);
		
	}
}