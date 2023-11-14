import java.util.Scanner;
public class Question45{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("Quadrant I");
        }
        else if(x<0 && y>0){
            System.out.println("Quadrant II");
        }
        else if(x<0 && y<0){
            System.out.println("Quadrant III");
        }
        else if(x>0 && y<0){
            System.out.println("Quadrant IV");
        }
        else if(x==0 && y==0){
            System.out.println("Origin");
        }
        else{
            System.out.println("Axes");
        }
        sc.close();
    }
}
