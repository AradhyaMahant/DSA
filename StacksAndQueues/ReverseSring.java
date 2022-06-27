package StacksBasic;
import java.util.Stack;

public class ReverseString {
	public static String reverse(String str) {
		Stack<Character> stack = new Stack<>();
		char ch[] = str.toCharArray();
		for(int i=0;i< ch.length;i++) {
			stack.push(ch[i]);
		}
		
		for(int i=0;i< ch.length;i++) {
			ch[i]=stack.pop();
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String a = "ABCDEF";
		System.out.println("Original String = "+a);
		System.out.println("Reversed String = "+reverse(a));
	}
}
