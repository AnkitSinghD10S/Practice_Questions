// import java.util.Scanner;
// public  class Question20 
// {
//     static int replace0(int n)
//     {
//         int temp=0;
//         while(n!=0)
//         {
//             int a = n%10;
//             if(a==0)
//             {
//                 temp=temp*10+(a+5);
//             }
//             else
//             {
//                 temp=temp*10+a;
//             }
//             n=n/10;
//         }
//         n=temp;
//         return n;
//     }
//     static int rev(int n)
//     {
//         int temp=0;
//         while(n!=0)
//         {
//             int a = n%10;
//             temp=temp*10+a;
//             n=n/10;
//         }
//         return temp;
//     }

//     public static void main(String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         n=replace0(n);
//         System.out.println(rev(n));
//         sc.close();
//     }
// }


// alternate solution 


import java.util.*; 
public class Question20 { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s[]=sc.next().split(""); 
        int a[]=new int[s.length]; 
        for(int i=0;i<s.length;i++) 
        a[i]=Integer.parseInt(s[i]); 
            for(int i=0;i<a.length;i++) 
            { 
               if(a[i]==0) 
               a[i]=5; 
            } 
    for(int i=0;i<a.length;i++) 
    System.out.print(a[i]); 
    } 
}
