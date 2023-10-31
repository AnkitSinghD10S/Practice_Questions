// import java.util.Scanner;
// public class Question29
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s =sc.next.split("");
//         sc.close();
//     }
// }
import java.util.*; 
public class Question29{ 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String b=sc.next(); 
        System.out.print(b.charAt(0)); 
 
        for(int i=1;i<b.length();i++) 
        { 
            char j=b.charAt(i); 
            if(Character. isLowerCase(j)) 
        System.out.print(j); 
        else{ 
         System.out.println(); 
          System.out.print(j); 
        }
        }
        sc.close();
    }
    }