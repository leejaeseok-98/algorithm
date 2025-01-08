package programmers.introduction;

public class p_120909 {
    public static void main(String[] args) {
        int n = 144;
        int answer = 0;
        for (int i =1;i<n/2;i++){
            if ((i*i)==n){
                answer = 1;
                break;
            }else {
                answer=2;
            }
        }
        System.out.println(answer);
    }
}
