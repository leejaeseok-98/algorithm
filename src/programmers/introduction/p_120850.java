package programmers.introduction;

import java.util.Arrays;

public class p_120850 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        my_string = my_string.replaceAll("[^0-9]","");
        int cnt = 0;
        int[] answer = new int[my_string.length()];
        for (char c : my_string.toCharArray()) {
            answer[cnt++] = Integer.parseInt(String.valueOf(c));
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
