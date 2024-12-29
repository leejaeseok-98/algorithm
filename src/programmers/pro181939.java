package programmers;

public class pro181939 {
    public static void main(String[] args) {
        int a =9;
        int b = 91;
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(sb.append(a).append(b).toString());
        sb = new StringBuilder();
        int d = Integer.parseInt(sb.append(b).append(a).toString());
        if (c >= d){
            answer = c;
        }
        else {
            answer = d;
        }
        System.out.println(answer);
    }
}
