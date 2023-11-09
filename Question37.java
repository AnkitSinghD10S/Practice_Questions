// import java.util.Scanner;
// public class Question37
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
        
//         sc.close();
//     }
// }

// alter nate
import java.util.*; 
public class Question37 { 
    public static void main(String args[]) { 
        // Your Code Here 
        Scanner sc=new Scanner(System.in); 
        String s=sc.next(); 
        int a[]=new int[26]; 
        for(int i=0;i<s.length();i++) 
        a[s.charAt(i)-97]++; 
        int max=a[0],index=0; 
        for(int j=0;j<26;j++) 
        { 
            if(a[j]>max) 
            { 
                max=a[j]; 
                index=j; 
            } 
        } 
 
        System.out.print((char)(index+97)); 
        sc.close();
    } 
}