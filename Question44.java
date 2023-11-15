import java.util.Scanner;
public class Question44{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element of array");
        int n=sc.nextInt();;
        int [] arr = new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int k= sc.nextInt();
        int j=0,flag=0;
        int []a = new int[n];
        for (int i=0;i<n;i++){
            if(arr[i]==k){
                a[j]=i;
                j++;
                flag=1;
            }
        }
        if(flag==1){
            System.out.println(a[0]+","+a[j-1]);
        }
        else{
            System.out.println(-1+","+-1);
        }
        sc.close();
    }
}
