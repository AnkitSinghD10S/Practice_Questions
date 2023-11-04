import java.util.Scanner;
public class Question33{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String  s= sc.nextLine();
            int c=0 ,prev=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    c++;
                }
                else{
                    if(prev<c){
                        prev=c;
                        c=0;
                    }
                }
            }
            System.out.println(prev);

        }
    }
}
