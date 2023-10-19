import java.util.Scanner;
public class Question15 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("");
        int a[] = new int[s.length];
        int sum1=0;
        int sum2=0;
        for(int i=0 ; i < s.length; i++)
        {
            a[i] = Integer.parseInt(s[i]);
        }
        for(int i=0 ;i<a.length;i++)
        {
            if(i%2==0)
            {
                sum1+=a[i];
            }
            else
            {
                sum2+=a[i];
            }
        }
        System.out.println(sum2);
        System.out.println(sum1);
        sc.close();
    }
}
// method to convert into integer grom String

// 1>method
// String str = "1234";
// Integer val = Integer.valueOf(str);

// 2>method
// String str = "1234";
// int val;
// try {
//     val = Integer.parseInt(str);
// } catch (NumberFormatException e) {
//     val = 0; // default value if the string is not a valid integer
// }

// 3>method
// import com.google.common.primitives.Ints;
// String str = "1234";
// int val = Optional.ofNullable(str).map(Ints::tryParse).orElse(0);
