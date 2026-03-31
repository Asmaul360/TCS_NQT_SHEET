
// Question : Find the maximum sum of a contiguous subarray (can be solved by using Kadanes Algorithmm)

// Example:
// Input: [2, -1, 3, -2, 4]
// Output: 6


// Logic of Kadane’s Algorithm:

// Step 1: Take two variables
// currentSum → to store running sum
// maxSum → to store maximum result

// Step 2: Traverse the array

// Step 3: Add each element to currentSum

// Step 4: Update maxSum if currentSum is greater

// Step 5: If currentSum becomes negative,
// reset it to 0 because negative sum will reduce future sum

// Step 6: At the end, maxSum will contain the answer


// Pattern to remember:
// Add → Compare → Reset (if negative)


// When to use Kadane:
// If question contains:
// - contiguous subarray
// - maximum sum / largest sum
// - continuous elements


// Time Complexity: O(n)
// Space Complexity: O(1)


// Final idea in one line:
// Drop negative prefix and keep the best running sum

package arrays;
import java.util.Scanner;
public class kadanesAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int i=0;
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        while(i<arr.length){
            currentSum=currentSum+arr[i];
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
            i++;
        }
        System.out.println("Maximum sum is :"+maxSum);
        in.close();
    }
}
