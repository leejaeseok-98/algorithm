package programmers;

import java.util.Arrays;
import java.util.Stack;

public class equalsNotNum2 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        Stack<Integer> st = new Stack<>();
        for (int a : arr) {
            if (st.isEmpty()){
                st.push(a);
            }else {
                if (st.peek() != a){
                    st.push(a);
                }
            }
        }














    }
}
