import java.util.StringTokenizer;

public class Prgrms_lv2_12951 { // JadenCase 문자열 만들기

    public String solution_3(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            sb.append(flag ? c.toUpperCase() : c);
            flag = c.equals(" ") ? true : false;
        }

        return sb.toString();
    }

    public String solution_2(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            if (i == 0) {
                c = c.toUpperCase();
            }

            if (flag && !c.equals(" ")) {
                flag = false;
                c = c.toUpperCase();
            } else if (c.equals(" ")) {
                flag = true;
            }
            sb.append(c);
        }

        return String.valueOf(sb);
    }

    /**
     * 미해결.
     * 44.4 / 100
     * StringTokenizer 쓰면 연속된 공백문자 처리가 어려움.
     * split("") 쓰면 enhanced for 문으로 2번, 3번 방법처럼 풀 수 있을듯.
     */
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuilder sb = new StringBuilder();
        int n = st.countTokens();

        for (int i = 0; i < n; i++) {
            String str = st.nextToken();
            if (str.equals(" ")) {
                sb.append(' ');
                break;
            }
            String front = str.substring(0, 1).toUpperCase();
            String back = str.substring(1).toLowerCase();

            sb.append(front).append(back);
            if (i != n - 1) {
                sb.append(' ');
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        Prgrms_lv2_12951 problem = new Prgrms_lv2_12951();
        System.out.println(problem.solution_2("3people  unFollowed  me"));
        System.out.println(problem.solution_3(" for the last week "));
    }

}
