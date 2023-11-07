import java.util.Scanner;
public class Question35{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            if(i%2!=0){
                char a=s.charAt(i);
                a--;
                System.out.print(a);
            }
            else{
                char b =s.charAt(i);
                b++;
                System.out.print(b);
            }
        }
    }
}
