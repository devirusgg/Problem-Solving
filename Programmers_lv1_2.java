import java.util.HashSet;
import java.util.Set;

public class Programmers_lv1_2 {    // 약수의 합

    public int solution(int n) {
        int len = n / 2;
        int sum = 0;
        Set<Integer> nums = new HashSet<>();

        if (n == 1) {
            return 1;
        }

        for (int i = 1; i < len; i++) {
            if (n % i == 0) {
                nums.add(i);
                nums.add(n / i);
            }
        }

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Programmers_lv1_2 prgrms = new Programmers_lv1_2();
        System.out.println(prgrms.solution(1));
    }

}
