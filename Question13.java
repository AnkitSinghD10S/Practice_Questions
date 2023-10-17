import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String snew = "";
        if (Character.isUpperCase(s.charAt(0))) 
        {
           ;
            snew += s.charAt(0);
        } 
        else 
        {
            char a = s.charAt(0);
            a = (char) (a - 32);
            snew += a;
        }
        for (int i = 1; i < s.length(); i++) {
            snew += s.charAt(i);
        }
        System.out.println(snew);
        sc.close();
    }
}