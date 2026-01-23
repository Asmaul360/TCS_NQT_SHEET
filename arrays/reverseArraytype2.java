// Reverse an array

// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
// [inplace meaning -> Original data structure (array) ko wahi par modify karna, bina koi extra array / extra memory use kiye.]

// Example 1

// Input: n=5, arr = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]

package arrays;
import java.util.Scanner;

public class reverseArraytype2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    if (in.hasNextInt()) {
      int n=in.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i]=in.nextInt();
      }
      // int []array=a;
      int []b=new int [n];
      for(int i=0;i<n;i++){
        b[i]=a[n-1-i];

      }
      for (int i = 0; i < n; i++) {
    System.out.print(b[i] + " ");
}

      
    } else {
      
    }
  }
}
