import java.util.Scanner;
public class Question32
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int c=1,i;
            for(i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                }
                else{
                    System.out.print(s.charAt(i)+""+c);
                    c=1;
                }
            }
            System.out.print(s.charAt(i)+""+c);
        }
    }
}
