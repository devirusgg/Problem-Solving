public class Prgrms_lv1_12944 {    // 평균 구하기

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
        Prgrms_lv1_12944 prgrms = new Prgrms_lv1_12944();
        int[] arr = {1, 2, 3, 4};
        System.out.println(prgrms.solution(arr));
        arr = new int[]{5, 5};
        System.out.println(prgrms.solution(arr));
    }

}
