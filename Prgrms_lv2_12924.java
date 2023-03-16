public class Prgrms_lv2_12924 { // 숫자의 표현

    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    cnt++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Prgrms_lv2_12924 problem = new Prgrms_lv2_12924();
        System.out.println(problem.solution(15));
    }

}
