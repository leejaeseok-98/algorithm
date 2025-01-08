package programmers.introduction;

public class p_120862 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,4,-5};
        int answer  = Integer.MIN_VALUE;
        for (int i = 0;i<numbers.length-1;i++){
            for (int j = i+1;j<numbers.length;j++){
                if (numbers[i]*numbers[j] > answer){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        System.out.println(answer);
    }
}
