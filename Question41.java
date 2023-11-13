import java.util.Scanner;
public class Question41{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int a=arr[i];
                    int b=arr[j];
                    int c=arr[k];
                    if((a+b)>c){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
