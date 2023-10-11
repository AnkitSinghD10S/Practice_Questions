import java.util.Scanner;
public class Question6 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 ="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(Character.isUpperCase(s.charAt(i)))
            {
                char b = (char)(a+32);
                s1= s1+b;
            }
            else
            {
                char c= (char)(a-32);
                s1=s1+c;
            }
        }
        System.out.println(s1);
        sc.close();
    }
    
}
