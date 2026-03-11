package arrays;
import java.util.*;

public class medianOfArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    /*
     Question:
     Write a Java program to find the median of an array.
     First sort the array, then:
       - If the size is odd → median is the middle element
       - If the size is even → median is the average of the two middle elements

     Example:
       Input array: {40, 10, 30, 50, 20}
       After sorting: {10, 20, 30, 40, 50}
       Size = 5 (odd)
       Middle index = 5/2 = 2
       Median = arr[2] = 30

     Formula:
       Odd size → median = arr[size/2]
       Even size → median = (arr[size/2] + arr[(size/2) - 1]) / 2

     Logic:
       1. Take input from user
       2. Sort the array using Arrays.sort()
       3. Check odd/even size
       4. Calculate median accordingly
       5. Print the result
    */

    System.out.println("Enter the size of the array");
    int size = in.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter " + size + " elements :");
    for(int i = 0; i < size; i++){
      arr[i] = in.nextInt();
    }

    // Step 1: Sort the array
    Arrays.sort(arr);

    // Step 2: Find median
    if(size % 2 == 0){
      // Even number of elements
      int median = (arr[size/2] + arr[(size/2) - 1]) / 2;
      System.out.println("As the size is even, the median is: " + median);
    } else {
      // Odd number of elements
      int median = arr[size/2];
      System.out.println("As the size is odd, the median is: " + median);
    }

    in.close();
  }
}