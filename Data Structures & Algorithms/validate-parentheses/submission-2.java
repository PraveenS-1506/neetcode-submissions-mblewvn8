
class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            }

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{return false;}
            }
            if(s.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
                else{return false;}
            }
                if(s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{return false;}
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        else {return true;}
    }
}
