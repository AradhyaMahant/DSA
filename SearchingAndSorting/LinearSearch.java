package Searching;

public class LinearSearch {
	
	public void Search(int arr[],int x) {
		for(int i=0; i<arr.length ;i++) {
			if(arr[i]==x) {
				System.out.println("Found at :"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,8,22,99,3};
		LinearSearch ls = new LinearSearch();
		ls.Search(arr, 5);
	}
}
