package sorting;

public class MergeSortedArrays {
	
	int[] merge(int arr1[],int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;
		int result[] = new int[m+n];
		int i=0,j=0;
		int k=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				result[k]= arr1[i];
				i++;
			}else {
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<m) {
			result[k]=arr1[i];
			i++;k++;
		}
		while(j<n) {
			result[k]=arr2[j];
			j++;k++;
		}		
		return result;
	}
	
	void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	
	public static void main(String args[]) {
		MergeSortedArrays msa =new MergeSortedArrays();
		int arr1[] = {4,5,6,9};
		int arr2[] = {1,3,7,10,13};
		msa.printarray(msa.merge(arr1, arr2));
	}
}
