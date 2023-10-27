import java.util.Scanner;
public class Question25
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        while(true)
        {
            int r = sc.nextInt();
            n=n+r;
            if(n<0)
            {
                break;
            }
            else
            {
                System.out.println(r);
            }
        }
        sc.close();
    }
}
