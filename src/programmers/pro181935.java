package programmers;

public class pro181935 {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;

        for (int i = n; i>=0 ; i -= 2){
            answer += (n%2==0) ? i*i : i;
        }
        System.out.println(answer);
    }
}
