import java.util.Scanner;
public class Question27
 {
    static int discount(int p,int q)
    {
        int d=0;
        if(p>=1000)
        {
           d = ((p*q)*10)/100;
        }
        return d;
    }
   public static void main(String [] args)
   {
    Scanner sc = new Scanner(System.in);
    int prize = sc.nextInt();
    int quantity = sc.nextInt();
    int total_cost = (prize * quantity )-discount(prize,quantity);
    System.out.println(total_cost);
    sc.close();
   }
}
