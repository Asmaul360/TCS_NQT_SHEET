/*
Question:
Write a Java program to find the median of elements in an array.

The program should:
1. Take the size of the array as input.
2. Take the array elements from the user.
3. Sort the array in ascending order.
4. If the number of elements is odd, print the middle element.
5. If the number of elements is even, print the average of the two middle elements.

Example 1 (Odd number of elements):

Input:
Size = 5
Elements = 7 2 10 5 1

Sorted array:
1 2 5 7 10

Output:
Median = 5


Example 2 (Even number of elements):

Input:
Size = 4
Elements = 4 2 8 10

Sorted array:
2 4 8 10

Output:
Median = 6
*/
package arrays;
import java.util.Scanner;
public class medianOfGivenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements for the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        if(arr.length%2!=0){
            int middle=(arr.length/2)+1;
            System.out.println("The median of even array is :"+arr[middle]);
        }
        else{
            int middle1=arr.length/2;
            System.out.println("The middle 1 is :"+arr[middle1]);
            int middle2=(arr.length/2)-1;
            System.out.println("The middle 2 is :"+arr[middle2]);

            System.out.println("The median of even array is :"+(arr[middle1]+arr[middle2])/2);
        }
        in.close();
    }
}
