package programmers;

import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        int answer = 0;
        int[] citations = {3,0,6,1,5};
        int index = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i< citations.length-1;i++){
            if (citations[i] == citations[i+1]){
                continue;
            }
            if (citations[i] <= citations.length-i){
                index--;
            } else if (citations[i] > citations.length-i) {
                answer = citations[i-1];
            }
        }
        System.out.println(answer);
    }
}
