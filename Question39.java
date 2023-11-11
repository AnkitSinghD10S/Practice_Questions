import java.util.Scanner;
public class Question39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int j=1;j<=k;j++){
            int temp = arr[n-1];
            int c=n-1;
            while(c!=0){
                arr[c]=arr[c-1];
                c--;
            }
            arr[0]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
