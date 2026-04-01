package arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the target value :");
        int target=in.nextInt();
        System.out.println("Enter the value for the array :");        
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        boolean flag=false;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                flag=true;
                break;
            }
        }   
        if(flag==true){
          System.out.println("The target element is shown in "+index+" position.");
        }
        else{
            System.out.println("The target element is not found :-1");
        }       
    }    
}
