package arrays;
import java.util.Scanner;
public class twoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements for the array : ");
        for(int i =0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target=in.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The target index is ["+i+","+j+"]");
                    
                    return;
                }
              
            }
        }
        System.out.println("No such elements found");
    }
}
