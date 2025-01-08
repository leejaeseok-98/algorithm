package programmers.introduction;

public class p_120846 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for (int i =1; i<=n;i++){
            int count = 0;
            for (int j = 1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count>2){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
