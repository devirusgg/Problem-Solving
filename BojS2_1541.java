import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojS2_1541 {   // 잃어버린 괄호

    public static void main(String[] args) throws IOException {
        new BojS2_1541().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split("\\+|\\-");
        String[] operators = input.split("[0-9]+");

        System.out.println(calculate(numbers, operators));
    }

    private int calculate(String[] numbers, String[] operators) {
        int sum = 0;
        int minusSum = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (i < operators.length && flag && operators[i].equals("-")) {
                sum -= minusSum;
                minusSum = 0;
            } else if (i < operators.length && operators[i].equals("-")) {
                flag = true;
            }

            if (flag) {
                minusSum += Integer.parseInt(numbers[i]);
            } else {
                sum += Integer.parseInt(numbers[i]);
            }
        }

        return sum - minusSum;
    }

}

/*
ChatGPT:
이 코드에서 런타임 에러(ArrayIndexOutOfBounds)가 발생하는 이유는, 배열 operators의 길이가 numbers 배열의 길이보다 1 작을 때 발생합니다.

이는 operators 배열을 input.split("[0-9]+")로 분리할 때, 숫자를 기준으로 나누어지기 때문입니다. 만약 input 문자열의 마지막이 연산자로 끝나는 경우, operators 배열의 마지막 원소는 빈 문자열이 되고, 이로 인해 calculate() 메소드에서 operators[i]가 ArrayIndexOutOfBounds 예외를 발생시키게 됩니다.

해결 방법으로는 calculate() 메소드에서 operators[i]를 사용하기 전에, operators[i]가 빈 문자열인 경우 건너뛰도록 추가적인 체크를 해주면 됩니다. 이를 위해서는 아래와 같이 수정하면 됩니다.

for (int i = 0; i < numbers.length; i++) {
    if (i < operators.length && flag && operators[i].equals("-")) {
        sum -= minusSum;
        minusSum = 0;
    } else if (i < operators.length && operators[i].equals("-")) {
        flag = true;
    }

    if (flag) {
        minusSum += Integer.parseInt(numbers[i]);
    } else {
        sum += Integer.parseInt(numbers[i]);
    }
}
위 코드에서는 i < operators.length 조건을 추가하여 operators 배열이 numbers 배열보다 짧은 경우, operators[i]를 사용하지 않도록 합니다.
*/