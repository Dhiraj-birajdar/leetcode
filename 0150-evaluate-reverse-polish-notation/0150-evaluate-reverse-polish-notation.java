class Solution {
    public int evalRPN(String[] tokens) {
        int i=0;
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(token.equals("-")){
                i = stack.pop();
                stack.push(stack.pop()-i);
            }else if(token.equals("/")){
                i = stack.pop();
                stack.push(stack.pop()/i);
            }else if(token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}