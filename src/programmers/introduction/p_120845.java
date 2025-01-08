package programmers.introduction;

public class p_120845 {
    public static void main(String[] args) {
        int answer = 1;
        int[] box = {10, 8, 6};
        int n = 3;
        for (int i = 0; i< box.length;i++){
            answer *= (box[i]/n);
        }
        System.out.println(answer);
    }
}
