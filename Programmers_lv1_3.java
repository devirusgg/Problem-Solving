public class Programmers_lv1_3 {    // 평균 구하기

    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        answer = (double) sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Programmers_lv1_3 prgrms = new Programmers_lv1_3();
        int[] arr = {1, 2, 3, 4};
        System.out.println(prgrms.solution(arr));
        arr = new int[]{5, 5};
        System.out.println(prgrms.solution(arr));
    }

}
