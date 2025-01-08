package programmers.introduction;

public class p_120848 {
    public static void main(String[] args) {
        int n = 3628800;
        int answer = 0;
        for (int i =1;i<12;i++){
            if (factorial(i)>n){
                answer = i-1;
                break;
            }
        }
        System.out.println(answer);
    }
    static int factorial(int i){
        if (i == 1){
            return 1;
        }
        return i*factorial(i-1);
    }
}
