package arrays;
import java.util.Scanner;
public class findMissingElement {
   public static void main(String[] args) {
    Scanner in =new Scanner (System.in);
    System.out.println("Enter the size of the array:");
    int size=in.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter the elements of the array:");
    for(int i =0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        boolean flag=false;
        for(int j=0;j<arr.length;j++){
            if(i==arr[j]){
                flag=true;
                break;
            }           
        }
        if(flag!=true){
            System.out.println("The missing element is :" +i);
            return;
        }
            
            
        }
        System.out.println("The missing element is :" +arr.length);
    in.close();
   }
}
