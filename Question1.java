import java.util.*;
public class Question1{
     
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"  "  );
            }
    }
    public static int special(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr.length%(i+1)==0){
                sum=sum+(arr[i]*arr[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args){
            Scanner vr = new Scanner(System.in);
            System.out.println("enter the no of element ");
            int n= vr.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++){
                arr[i]=vr.nextInt();
            }
            System.out.println(special(arr));
            vr.close();
    }
}