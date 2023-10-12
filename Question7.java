import java.util.Scanner;
public class Question7 {
    static int searchCharacter(char ch,int n,char arr[])
    {
        for(int i=0;i<n;i++)
        {
            if(ch==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        char [] arr= new char [n];
        System.out.println("enter the character in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println(searchCharacter(ch , n ,arr));
        sc.close();
    }
    
}
