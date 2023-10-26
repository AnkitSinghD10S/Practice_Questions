import java.util.Scanner;
public class Question22
{
    static int Moneyreq(int k,int n, int w)
    {
        int sum=0;
        for(int i=1;i<=w;i++)
        {
            sum=sum+(k*i);
        }
        return sum-n;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int W = sc.nextInt();
        System.out.println(Moneyreq(k,n,W));
        sc.close();
    }
}
