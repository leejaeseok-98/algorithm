package programmers.introduction;

import java.util.Arrays;

public class p_120844 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String direction = "right";
        int[] answer = new int[numbers.length];
        if (direction.equals("left")){
            int temp = numbers[0];
            for (int i = 0; i< numbers.length-1;i++){
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = temp;
        } else if (direction.equals("right")) {
            int temp = numbers[numbers.length-1];
            for (int i = numbers.length-2; i >=0;i--){
                answer[i+1] = numbers[i];
            }
            answer[0] = temp;
        }
        System.out.println(Arrays.toString(answer));
    }
}
