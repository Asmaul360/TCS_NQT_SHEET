package arrays;

import java.util.*;

/*
Question:
Write a program to find all "Leaders" in an array.

An element is called a Leader if it is greater than all elements to its right.
The last element is always a leader because there are no elements to its right.

Example:
Input:
Array = [16, 17, 4, 3, 5, 2]

Explanation:
- 2 → last element → leader
- 5 > 2 → leader
- 3 < 5 → not leader
- 4 < 5 → not leader
- 17 > 5 → leader
- 16 < 17 → not leader

Output:
[17, 5, 2]
*/

public class leadersInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size=in.nextInt();
        int arr[]=new int[size];
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter "+size+" elements for the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();  
        }    

        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                list.add(arr[i]);
            }
            else{
                int max = Integer.MIN_VALUE;

                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] > max){
                        max = arr[j];
                    }
                }

                if(arr[i]>max){
                    list.add(arr[i]);
                }
            }
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}