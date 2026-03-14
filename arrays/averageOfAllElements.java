
/*
Question:
Write a Java program to find the average of all elements in an array.

The program should:
1. Take the size of the array from the user.
2. Take the elements of the array.
3. Calculate the sum of all elements.
4. Divide the sum by the number of elements.
5. Print the average.

Example:

Input:
Size of array = 5
Elements = 10 20 30 40 50

Output:
The average of all the elements in the array is: 30
*/
package arrays;
import java.util.Scanner;
public class averageOfAllElements {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size  of the array :");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array :");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
System.out.println("The average of all the elements in the array is :"+sum/arr.length);

    }
}
