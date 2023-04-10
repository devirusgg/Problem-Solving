import java.util.Stack;

public class Prgrms_lv2_12973 {    // Prgrms_lv2_12973_짝지어 제거하기

    public static void main(String[] args) {
        System.out.println(new Solution().solution("baabaa"));
        System.out.println(new Solution().solution("cdcd"));
    }

}

class Solution {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

}
