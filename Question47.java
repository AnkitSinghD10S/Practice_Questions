import java.util.Scanner;
public class Question47 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int c=0;
        if(a>b){
            for(int i=1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    c=i;
                }
            }
        }
        else if(b>a){
             for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    c=i;
                }
            }
        }
        else if(a==b){
            c=a;
        }
        System.out.println(c);
        sc.close();
    }
}
