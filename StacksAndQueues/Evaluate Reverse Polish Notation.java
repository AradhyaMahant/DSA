class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String t: tokens){
            if("+-/*".contains(t))
                stack.push(eval(stack.pop(),stack.pop(),t));
            else
                stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
    
    public int eval(int b, int a, String op){
        if("+".equals(op))
            return a+b;
        else if("-".equals(op))
            return a-b;
        else if("*".equals(op))
            return a*b;
        else 
            return a/b;
    }
}