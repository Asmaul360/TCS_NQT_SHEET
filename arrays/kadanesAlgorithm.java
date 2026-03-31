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
