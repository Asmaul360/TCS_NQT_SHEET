package arrays;
import java.util.Scanner;
public class threeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size= in.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target=in.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    System.out.println("The target index is ["+i+","+j+","+k+"]");
                   flag=true;
                }
            }
            }
        }
        if(!flag){
           System.out.println("No such elements found");
        }
      
    }    
}
