import java.util.Scanner;
public class Question30
{
    static void tprime(int n,int [] arr)
    {
        int count =  0;
        int i=0;
       while(i<n)
       {
            count = 0;            
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==3)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            i++;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        tprime(n,arr);
        sc.close();
    }
}
