import java.util.Scanner;
public class Question26
{
    static double transaction(double x , double y)
    {
        if(x%5==0&&x<y)
        {
            y=(y-x+.50);
            return y;
        }
        return y;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble();
        double y =sc.nextDouble();
        System.out.println((transaction(x,y)));
        sc.close();
    }
    
}
