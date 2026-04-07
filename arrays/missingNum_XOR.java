package arrays;
import java.util.Scanner;
public  class missingNum_XOR{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int XOR1=0;
        for(int i=0;i<=arr.length;i++){
            XOR1=XOR1^i;
        }
        int XOR2=0;
        for(int i=0;i<arr.length;i++){
            XOR2=XOR2^arr[i];
        }
        int XOR3=XOR1^XOR2;
            System.out.println("The missing element is :"+XOR3);
        in.close(); 
    }
}
