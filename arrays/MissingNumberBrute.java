package arrays;
import java.util.Scanner;
public class MissingNumberBrute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i <= n; i++) {
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(i==nums[j]){
                    flag=true;
                    break;
                }
            }      
            if(flag==false){
                System.out.println("The missing element is :"+i);
            }

        }

    }
}