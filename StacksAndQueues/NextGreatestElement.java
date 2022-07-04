package StacksBasic;
import java.util.Stack;

public class NextGreaterElement {
	
		public static int[] greatestelement(int arr[]) {
			int result[]=new int[arr.length];
			Stack<Integer> stack = new Stack<>();
			for(int i = arr.length-1;i>=0;i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty() && stack.peek() <= arr[i]) {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
			stack.push(arr[i]);
			}
		return result;
		}
		
		public static void main(String[] args) {
			int array[] = {4,7,3,4,8,1};
			System.out.println("Original array = "+array);
			System.out.println("Next greatest element array = "+greatestelement(array));
		}
}