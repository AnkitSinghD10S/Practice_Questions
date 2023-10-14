import java.util.Scanner;
public class Question10 {
    static int countVowel(String s)
    {
    String v ="aeiou";
    int i=0;
    int count=0;
    while(i<s.length())
    {
        int j=0;
        while(j<v.length())
        {
            if(s.charAt(i)==v.charAt(j))
            {
                count ++;
            }
            j++;
        }
        i++;
    }
    return count;
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(countVowel(s));
    sc.close();
    }
}
