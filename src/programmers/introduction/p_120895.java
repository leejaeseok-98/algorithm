package programmers.introduction;

public class p_120895 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        String answer = "";
        char[] a = my_string.toCharArray();
        char temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }
}
