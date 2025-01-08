
public class Main {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        int answer = 0;
        answer = factorial(balls) / (factorial(balls-share)*factorial(share));
        System.out.println(answer);
    }
    static int factorial(int a){
        if (a == 1){
            return 1;
        }
        return a*factorial(a-1);
    }
}
