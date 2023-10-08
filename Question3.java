import java.util.Scanner;
public class Question3
{
    static boolean Stringequal(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    return false;
                }
            }
        }
        return true;
    }
 public static void main(String[] main)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first string");
    String s1 = sc.nextLine();
    System.out.println("enter the second string");
    String s2 = sc.nextLine();
    System.out.println(Stringequal(s1,s2));
    sc.close();
 }
}
