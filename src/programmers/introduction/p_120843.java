package programmers.introduction;

public class p_120843 {
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {1, 2, 3};
        int k = 3;
        int index = 0;
        for (int i = 0;i<k*2-2;i++){
            if (index == (numbers.length-1)){
                index = 0;
            } else if (index < (numbers.length-1)) {
                index++;
            }
        }
        answer = numbers[index];
        System.out.println(answer);
    }
}
