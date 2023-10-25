import java.util.Scanner;
public class Question21
{
    static void funlist(int n,int m)
    {
        int a=1;
        while(n!=0)
        {
            int temp = 3*a+2;
            if(temp%m!=0)
            {
                System.out.println(temp);
                n=n-1;
                a+=1;
            }
            else
            {
                a+=1;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        funlist(N1,N2);
        sc.close();
    }
}


// Alternate soln


// import java.util.*; 
// public class Question21{ 
//     public static void main(String args[]) { 
//         Scanner sc=new Scanner(System.in); 
//     int n1=sc.nextInt(); 
//     int n2=sc.nextInt(); 
//     int c=0; 
//     for(int i=1;c<n1;i++) 
//     { 
//         int k=3*i+2; 
//         if(k%n2==0) 
//         continue; 
//         else 
//         { 
//             System.out.println(k); 
//             c++;  
//         } 
//     } 
//     sc.close();
//     } 
// }