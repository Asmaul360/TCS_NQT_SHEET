/*
Question:
Write a Java program to count the frequency of each element in an array.

The program should:
1. Take the size of the array as input.
2. Take the array elements from the user.
3. Count how many times each element appears in the array.
4. Print each element along with its frequency.

Example:

Input:
Enter the size of array :
7
Enter the elements for the array :
1 2 2 3 4 4 4

Output:
The frequency of 1 is:1
The frequency of 2 is:2
The frequency of 3 is:1
The frequency of 4 is:3
*/
package arrays;
import java.util.Scanner;

public class frequencyOfEachElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements for the array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){

            int flag = 0;

            for(int k = 0; k < i; k++){
                if(arr[k] == arr[i]){
                    flag = 1;
                    break;
                }
            }

            if(flag == 1){
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println("The frequency of " + arr[i] + " is:" + count);
        }

        in.close();
    }
}