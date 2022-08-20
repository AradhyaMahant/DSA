package sorting;
import java.util.*;
public class MergeSort {

	public void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public void sort(int arr[],int temp[], int low,int high) {
		if(low<high) {
		int mid = low + (high - low)/2;
		sort(arr,temp,low,mid);
		sort(arr,temp,mid+1,high);
		merge(arr,temp,low,mid,high);
		}
	}
	
	public void merge(int arr[],int temp[], int low,int mid,int high) {
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		int i= low , j = mid+1, k = low;
		while(i <= mid && j <= high) {
			if(temp[i] >= temp[j]) {
				arr[k]=temp[j];
				j++;
			}else {
				arr[k]=temp[i];
				i++;
			}
			
			k++;
		}
		
		while(i <= mid) {
			arr[k] = temp[i];
			i++;
			k++;
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];	
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		MergeSort ms = new MergeSort();
		ms.sort(arr, new int[arr.length], 0, arr.length-1);
		ms.printarray(arr);
	}
}
