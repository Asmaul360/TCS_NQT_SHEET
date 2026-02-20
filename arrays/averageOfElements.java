// Q: Write a Java program to find the average of all elements in an array.
// Example:
// Input:
// size = 5
// elements = 10 20 30 40 50
// Output:
// Average = 30.0

package arrays;

import java.util.Scanner;

public class averageOfElements {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // Taking the size of the array
    System.out.println("Enter the size of the array: ");
    int size = in.nextInt();

    int arr[] = new int[size];
    double avg = 0.0;

    // Taking array elements
    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }

    // Calculating sum of elements
    for (int i = 0; i < size; i++) {
      avg = avg + arr[i];
    }

    // Calculating average = sum / number of elements
    avg = avg / size;

    // Output the average
    System.out.println("The average of the array is: " + avg);

    in.close();
  }
}
