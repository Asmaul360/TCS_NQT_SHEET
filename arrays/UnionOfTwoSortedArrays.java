package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array 1 :");
        int size1=in.nextInt();
        int arr1[]=new int [size1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
         System.out.println("Enter the size of array 1 :");
        int size2=in.nextInt();
        int arr2[]=new int [size2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }
        int size3=arr1.length+arr2.length;
        int arr3[]=new int [size3];
       int j=0;
        for(int i=0;i<arr1.length;i++){
            arr3[j]=arr1[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            arr3[j]=arr2[i];
            j++;
        }
System.out.println("The new array element is :");
        for(int i =0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        Arrays.sort(arr3);
      int uniqueIndex=0;
        for(int i=1;i<arr3.length;i++){
            if(arr3[i]!=arr3[uniqueIndex]){
                uniqueIndex++;
            arr3[uniqueIndex] =arr3[i];
            }
            
        }
        System.out.println("Array after union");
        for(int i =0;i<=uniqueIndex;i++){
            System.out.println(arr3[i]);
        }
    }
}
