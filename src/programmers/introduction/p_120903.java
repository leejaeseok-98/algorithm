package programmers.introduction;

public class p_120903 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int cnt = 0;
        for (int i = 0;i< s1.length;i++){
            for (int j = 0; j<s2.length;j++){
                if (s1[i].equals(s2[j])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
