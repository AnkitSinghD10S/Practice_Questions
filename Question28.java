import java.util.Scanner;
public class Question28
{
    static void sortarray(int n, int [] arr)
    {
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==1)
            {
                temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        { 
            arr[i]=sc.nextInt(); 
        } 
        sortarray(n,arr);
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]);
        // }
        sc.close();
    }
    
}
