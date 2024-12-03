package day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {

    public static void main(String[] args) {
        String input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
        String pattern = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
        System.out.println(mul(input, pattern));
    }


    private static int mul(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        int sum = 0;
        while (m.find()) {
            int a = Integer.parseInt(m.group(1));
            int b = Integer.parseInt(m.group(2));
            sum += a * b;
        }
        return sum;
    }
}
