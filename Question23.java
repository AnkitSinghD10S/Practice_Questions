import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        while(t>0) 
        { 
            int a=sc.nextInt(); 
            int even=0,odd=0,r; 
            while(a>0) 
            { 
                r=a%10; 
                if(r%2==0) 
                even=even+r; 
                else 
                odd=odd+r; 
                a=a/10; 
                 
            } 
            if(even%4==0 || odd%3==0) 
            System.out.println("Yes"); 
            else 
               System.out.println("No"); 
               t--; 
               
        } 
37 
 
         
           } 
} 
