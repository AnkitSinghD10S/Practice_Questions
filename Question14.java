import java.util.Scanner;
public class Question14 
{
    public static void main(String[] main)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(s.contains("1111111")||s.contains("0000000"))
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
