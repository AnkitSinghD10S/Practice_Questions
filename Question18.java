import java.util.Scanner;
public class Question18
{
    static void Celsiuscalcualator(int minF, int maxF, int step)
    {
        while(minF<=maxF)
        {
            int c=(int)((5/9.0)*(minF-32));
            System.out.println(minF+"\t"+c);
            minF=minF+step; 
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int minF= sc.nextInt();
        int maxF = sc.nextInt();
        int step= sc.nextInt();
        Celsiuscalcualator(minF,maxF,step);
        sc.close();
    }
}
