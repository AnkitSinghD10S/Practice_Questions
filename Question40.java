import java.util.Scanner;
public class Question40{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String s1 ="";
        int len = s.length()-1;
        while(len!=-1){
            s1=s1+s.charAt(len);
            len--;
        }
        double num=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                num =(int)(num + Math.pow(2,i));
            }
        }
        System.out.println(num);
        sc.close();
    }
}
