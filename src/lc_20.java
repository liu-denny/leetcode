import java.util.Stack;

/**
 * @author yudong
 * @create 2019-05-07 15:38
 */
public class lc_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 1) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && (stack.pop() != '(' || stack.empty())) {
                return false;
            } else if (c == ']' && (stack.pop() != '[' || stack.empty())) {
                return false;
            } else if (c == '}' && (stack.pop() != '{' || stack.empty())) {
                return false;
            }
        }
        return true;
    }

    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(char c:s.toCharArray()){
            if(c =='('){
                stack.push(')');
            }
            else if(c =='['){
                stack.push(']');
            }
            else if(c =='{'){
                stack.push('}');
            }
            else if(stack.isEmpty()||stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }


}
