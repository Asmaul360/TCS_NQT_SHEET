package arrays;
import java.util.Scanner;
public class rearrageArrayElements {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter "+size+" elements for the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int m=0;
        int n=0;
        int positiveArr[]=new int[size/2];
        int negativeArr[]=new int[size/2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveArr[m]=arr[i];
                m++;
            }
            else{
                negativeArr[n]=arr[i];
                n++;
            }

        }
        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=positiveArr[j];
                j++;
            }
            else{
                arr[i]=negativeArr[k];
                k++;
            }
        }
        System.out.println("New array element is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
