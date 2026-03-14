/*
Question:
Write a Java program to insert an element into an array at a given position.
The program should:
1. Take the size of the array as input.
2. Take the array elements from the user.
3. Take an element to be inserted.
4. Take the position where the element should be inserted.
5. Create a new array of size (n + 1).
6. Insert the element at the given position and shift the remaining elements to the right.
7. Print the new array.

Example:

Input:
Size of array = 4
Array elements = 10 20 30 40
Element to insert = 25
Position = 2

Output:
New array elements are:
10
20
25
30
40
*/
package arrays;
import java.util.Scanner;
public class addingElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array :");
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();            
        }
        System.out.println("Element you want to enter in the array :");
        int num=in.nextInt();
        System.out.println("Enter the number or position where you want to enter the element :");
        int position=in.nextInt();
        size=size+1;
        int  arr1[]=new int [size];
        if(position>arr.length){
            return;
        }
        for(int i=0;i<arr1.length;i++){
           if(i<position){
            arr1[i]=arr[i];
           }
           else if(i==position){
            arr1[i]=num;
           }  
           else{
            arr1[i]=arr[i-1];
           }
        }
        System.out.println("New array elements are :");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        in.close();
    }
}
