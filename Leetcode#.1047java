class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && stack.peek() == s.charAt(i)) { 
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());    
        }
        return sb.toString();
    }
}
