import java.util.Scanner;
public class Question4 {
   static boolean isPallindrome(String s)
    {   boolean flag=true;
        int i=0;
        int lastchar = s.length() - 1;
        while(i<lastchar)
        {
            if(s.charAt(i)!=s.charAt(lastchar))
            {
                flag=false;
            }
            i++;
            lastchar--;
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPallindrome(s))
        {
            System.out.println("YES");
        }
        else
        {
           System.out.println("NO");
        }
        sc.close();
    }
    
}
