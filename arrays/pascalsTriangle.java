package arrays;
import java.util.*;
public class pascalsTriangle {
    public static void main(String[] args) {

        int row = 4;
        int[][] arr = new int[row][row];
        for(int i = 0; i < row; i++) {
               System.out.print("[");
            
            for(int j = 0; j <= i; j++) {

                // first & last element
                if(j == 0 || j == i) {
                    arr[i][j] = 1;
                } 
                // middle elements
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];                   
                }

                System.out.print(arr[i][j]);
                  if(j < i) System.out.print(", ");
                   
   
            
            }
            System.out.print("]");
        if(i<row-1){
            System.out.print(",");
        }
          
        }
    }
}