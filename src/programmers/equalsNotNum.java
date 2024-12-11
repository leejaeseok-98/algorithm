package programmers;

import java.util.Arrays;
import java.util.Stack;

public class equalsNotNum {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        int count = 0;
        int[] answer = new int[arr.length];
        Stack<Integer>stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < args.length;i++){
            if (stack.peek() != arr[i]){
                answer[count] = stack.pop();
                stack.push(arr[i]);
                count++;
            }
        }
        System.out.println(Arrays.toString(answer));
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");
    }
}
