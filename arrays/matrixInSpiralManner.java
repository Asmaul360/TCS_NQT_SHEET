package arrays;
import java.util.Scanner;
public class matrixInSpiralManner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the row :");
        int rows = in.nextInt();
        System.out.println("Enter the size of the column :");
        int cols = in.nextInt();
        int arr[][]=new int [rows][cols];
        System.out.println("Enter the elements for the Array :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix is :");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int top=0;
        for(int i=0;i<top;i++){

        }
    }
}
  