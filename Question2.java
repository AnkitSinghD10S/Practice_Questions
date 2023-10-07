import java.util.Scanner;
public class Question2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        for(int i=0;i< s.length();i++)
        {
            System.out.print(s.charAt(i));
            System.out.println();
        }
        sc.close();
    }
}
