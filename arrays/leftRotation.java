package arrays;

import maths.sumOfDigits;

/*
📘 QUESTION:

Given an array of integers and a number d,
perform LEFT ROTATION of the array by d positions.

Left rotation means shifting elements to the left,
and moving the first element to the end.

------------------------------------------------------------

🔍 EXAMPLE:

arr = [1, 2, 3, 4, 5]
d = 2

After 1st rotation:
[2, 3, 4, 5, 1]

After 2nd rotation:
[3, 4, 5, 1, 2]

Final Output:
[3, 4, 5, 1, 2]

------------------------------------------------------------

🧠 KEY IDEA:

- Repeat rotation d times
- Each time:
    1. Store first element
    2. Shift all elements left
    3. Put stored element at the end
*/

public class leftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;

        int[] ans = rotation(arr, d);
        System.out.println(java.util.Arrays.toString(ans));
    }

    static int[] rotation(int arr[], int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[0];

            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j]; 
            }

            arr[arr.length - 1] = temp; 
        }
        return arr; 
    }
}