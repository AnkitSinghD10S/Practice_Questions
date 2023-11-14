import java.util.Scanner;
public class Question46{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int i=(a>b)?a:b;
        while(true){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
