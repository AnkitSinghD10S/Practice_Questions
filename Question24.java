import java.util.Scanner;

public class Question24 {
    static boolean armstrong(int n) {
        boolean flag = false;
        int temp = n;
        int pow = 0;
        while (n != 0) {
            pow++;
            n = n / 10;
        }
        n = temp;
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            int k = 1;
            for (int i = 0; i < pow; i++) {
                k = k * a;
            }

            sum = sum + k;
            n = n / 10;
        }
        if (temp == sum) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
        sc.close();
    }
}
