package Searching;

public class MatrixSearch {	
	
	public void search(int matrix[][], int n, int x) {
		int i =0;
		int j= n-1;
		while(i < n && j>=0) {
			if(matrix[i][j] == x) {
				System.out.println(x+"   Found at: " +i +" ," +j);
				return;
			}
			if(matrix[i][j] > x) {
				j--;
			}else {
				i++;
			}
		}
		
		System.out.println("Not Found");
	}
	
	
	public static void main(String args[]) {
		int matrix[][] = {
							{10,20,30,40},
							{15,25,35,45},
							{27,29,37,48},
							{32,33,39,51},
						 };
		
		MatrixSearch ms = new MatrixSearch();
		ms.search(matrix, 4, 32);
		
	}


}