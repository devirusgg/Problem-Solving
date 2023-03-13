public class Prgrms_lv2_12909 { // 올바른 괄호

    boolean solution_2(String s) {
        char[] chs = s.toCharArray();
        int idx = 0;

        for (char c : chs) {
            idx = c == '(' ? idx + 1 : idx - 1;
            if (idx < 0) {
                return false;
            }
        }

        if (idx == 0) {
            return true;
        } else {
            return false;
        }
    }

    /***
     * 효율성 테스트만 실패.
     * split이 시간 많이 먹는듯
     */
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        int idx = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("(")) {
                idx++;
            } else {
                idx--;
            }
            if (idx < 0) {
                answer = false;
                break;
            }
        }

        if (idx == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Prgrms_lv2_12909 problem = new Prgrms_lv2_12909();
        System.out.println(problem.solution_2("()()"));
        System.out.println(problem.solution_2("(())()"));
        System.out.println(problem.solution_2(")()("));
        System.out.println(problem.solution_2("(()("));
    }

}
