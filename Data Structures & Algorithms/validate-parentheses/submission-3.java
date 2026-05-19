class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] charS = s.toCharArray();
        for(int i = 0; i< charS.length;i++){
            if(charS[i] != ')' && charS[i] != ']' && charS[i] != '}'){
                stack.push(charS[i]);    
            }else{
                if(stack.empty()){
                    return false;
                }
                char tmp = stack.pop();
                if(tmp == '(' && charS[i] != ')' ){
                    return false;
                }else if(tmp == '[' && charS[i] != ']' ){
                    return false;
                }else if(tmp == '{' && charS[i] != '}' ){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
