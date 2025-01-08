package programmers.introduction;

public class p_120585 {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        int answer = 0;
        for (int i : array) {
            if (i > height){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
