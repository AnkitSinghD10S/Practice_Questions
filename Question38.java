import java.util.Arrays; 
import java.util.Scanner; 
 
public class Tester { 
 
  public static int[] mergeArrays(int[] arr1, int[] arr2) { 
 
    int[] result = new int[arr1.length + arr2.length]; 
    int pos = 0; 
    for (int i = 0; i < arr1.length; i++) { 
      result[pos] = arr1[i]; 
      pos++; 
    } 
 
    for (int i = 0; i < arr2.length; i++) { 
      result[pos] = arr2[i]; 
      pos++; 
    } 
 
    return result; 
  } 
 
  public static void main(String[] args) { 
 
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter length of array-1 ? "); 
    int len = sc.nextInt(); 
 
    int[] arr1 = new int[len]; 
    System.out.println("Enter elements of array-1 ? "); 
    for (int i = 0; i < arr1.length; i++) { 
      arr1[i] = sc.nextInt(); 
 
    } 
 
    System.out.println("Enter length of array-2 ? "); 
    len = sc.nextInt(); 
 
    int[] arr2 = new int[len]; 
    System.out.println("Enter elements of array-2 ? "); 
    for (int i = 0; i < arr2.length; i++) { 
      arr2[i] = sc.nextInt(); 
 
    } 
    int[] re = mergeArrays(arr1, arr2); 
    Arrays.sort(re); 
    System.out.println(Arrays.toString(re)); 
    sc.close(); 
 
  } 
}
