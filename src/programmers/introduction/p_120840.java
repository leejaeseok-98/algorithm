package programmers.introduction;

public class p_120840 {
    public static void main(String[] args) {
        int balls = 5;
        int share = 3;

        double answer = 1;
        for (int i = balls;i>balls-share;i--){
            answer*=i;
        }
        for (int i = share;i>0;i--){
            answer/=i;
        }
        System.out.println((int)answer);
    }
}
