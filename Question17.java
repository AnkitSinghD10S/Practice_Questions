import java.util.Scanner;
public class Question17 
{
    static int Reversenum(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Reversenum(num));
        sc.close();
    }
    
}
