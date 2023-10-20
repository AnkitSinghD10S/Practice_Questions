import java.util.Scanner;
public class Question16 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s [] = sc.next().split("");
        int a [] = new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            a[i] = Integer.parseInt(s[i]);
        }
        int count=0;
        int k= sc.nextInt();
        for(int i:a)
        {
            if(i==k)
            count++;
        }
        System.out.println(count);
        sc.close();

    }
}
