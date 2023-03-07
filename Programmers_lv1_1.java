class Programmers_lv1_1 {   // 숫자 문자열과 영단어

    public int advancedSolution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i], numbers[i]);
        }

        return Integer.parseInt(s);
    }

    public int firstSolution(String s) {
        StringBuilder sb = new StringBuilder();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((int) c < 65) {
                sb.append(c);
                continue;
            }

            str += c;

            switch (str) {
                case "zero": sb.append(0); str = ""; continue;
                case "one": sb.append(1); str = ""; continue;
                case "two": sb.append(2); str = ""; continue;
                case "three": sb.append(3); str = ""; continue;
                case "four": sb.append(4); str = ""; continue;
                case "five": sb.append(5); str = ""; continue;
                case "six": sb.append(6); str = ""; continue;
                case "seven": sb.append(7); str = ""; continue;
                case "eight": sb.append(8); str = ""; continue;
                case "nine": sb.append(9); str = ""; continue;
            }
        }

        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Programmers_lv1_1 prgrms = new Programmers_lv1_1();

        int result = prgrms.advancedSolution("one4seveneight");
        sb.append(result).append('\n');
        result = prgrms.advancedSolution("23four5six7");
        sb.append(result).append('\n');
        result = prgrms.advancedSolution("2three45sixseven");
        sb.append(result).append('\n');
        result = prgrms.advancedSolution("123");
        sb.append(result);

        System.out.println(sb);
    }

}
