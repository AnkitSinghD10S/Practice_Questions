import java.util.Scanner;
public class Question11 
{
    static void dupRemove(String s)
    {
    char prechar = s.charAt(0);
    String s1="";
    s1 = s1 + prechar;
    int i=1;
    while(i<s.length())
    { 
        char a = s.charAt(i);
        if(a!=prechar)
        {
            s1 = s1+a;
            prechar=a;
        }
        i++;
    }
    System.out.println(s1);
    }
 public static void main(String[] args)
 {
    Scanner sc = new Scanner (System.in);
    String s= sc.nextLine();
    dupRemove(s);
    sc.close();
 } 
}
