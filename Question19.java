import java.util.Scanner;
public class Question19
{
    static void minimumpair(int N, int [] arr,int M)
    {
        int temp;
        for(int i=0;i<N;i++)
        {
            temp=arr[i];
            for(int j=i;j<N;j++)
            {
                if(arr[j]==(M-temp))
                {
                    System.out.println("Deepak should buy roses whose prices are "+temp+"and"+arr[j] );
                    break;
                }
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] =new int [N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int M = sc.nextInt();
        minimumpair(N,arr,M);
        sc.close();
    }
}