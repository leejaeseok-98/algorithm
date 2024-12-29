package programmers;

import java.util.Arrays;
//5개씩 배열자르는 코드

public class Pro_181886 {
    public static void main(String[] args) {
        String[] name = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] answer = new String[name.length/5+1];
        for (int i =0;i<name.length;i+=5){
            answer[i/5] = name[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
