import java.util.Scanner;
public class Question31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char j =s.charAt(i);
            if(Character.isLowerCase(j))
            {
                System.out.print(j);
            }
            else
            {
                System.out.println();
                System.out.print(j);
            }
        }
        sc.close();   
    }
}
