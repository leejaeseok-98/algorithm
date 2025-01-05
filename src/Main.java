import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = {1,2-3,4,-5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< numbers.length;i++){
            for (int j = i+1;j< numbers.length-1;j++){
                if (!((numbers[i] <0 && numbers[j]>0)&&(numbers[i] >0 && numbers[j]<0))){
                    if (numbers[i]*numbers[j] > max){
                        max = numbers[i]*numbers[j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
