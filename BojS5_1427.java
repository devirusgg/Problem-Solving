import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BojS5_1427 {   // 소트인사이드

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Arrays.stream(br.readLine().split(""))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }

}
