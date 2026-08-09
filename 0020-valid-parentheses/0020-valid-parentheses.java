class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char check = stack.pop();

                if((ch == ')' && check != '(') || (ch == ']' && check != '[') || (ch == '}' && check != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}