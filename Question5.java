import java.util.Scanner;
public class Question5 {
    static void Vowelcheck(String s)
    {
      String s1 = "aeiouAEIOU";
        int i=0;
        while(i!=s.length())
        {
            int j=0;
            while(j!=s1.length())
            {
                if(s.charAt(i)==s1.charAt(j))
                {
                    System.out.print(i+"  ");
                    break;
                }
                j++;
            }
            i++;
        }   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        Vowelcheck(s);
        sc.close();
    }
}
