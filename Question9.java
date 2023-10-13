// import java.util.Scanner;
// public class Question9
// {
//     static int countWords(String s)
//     {
//         String [] words = text.split("\\s+");
//     }
//     public  static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s= sc.nextLine();
//         int words = countWords(s);
//     }
// }
import java.util.Scanner;  
public class Question9 { 
public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);  
    String samanthaStory=sc.nextLine(); 
    int numWords = countWords(samanthaStory); 
        System.out.println(numWords); 
} 
public static int countWords(String text) { 
// Split the text into words using whitespace as the delimiter 
    String[] words = text.split("\\s+"); 
// Count the number of words return words.length; 
    return words.length;
} 
}
