import java.util.Scanner;
public class Question34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt(); 
        for(int i=0;i<k;i++) 
        { 
            int c=0; 
            String s=sc.next(); 
            for(int j=0;j<s.length();j++) 
            { 
                c=0; 
                for(int p=0;p<s.length();p++) 
                { 
                    if(s.charAt(j)==s.charAt(p)) 
                     
                    c++; 
                    // System.out.println("c"+" "+c);
                } 
                if(c==1) 
                { 
                System.out.println(s.charAt(j)); 
                break; 
                } 
                   
            } 
             if(c>1) 
 System.out.println("-1"); 
 }
    sc.close();
    }
}
