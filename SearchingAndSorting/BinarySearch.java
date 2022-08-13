
public class BinarySearch {
	
	public int Search(int arr[], int x) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(x < arr[mid]) {
				high = mid-1;
			}else {
				low =mid+1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = {10,20,5,3,6,4,52,11,85};
		System.out.println(bs.Search(arr,10));
	}

}