package arrays;

import java.util.Scanner;

public class OptimalMissingNumberHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int hash[] = new int[n + 1];

        // mark present elements
        for(int i = 0; i < n; i++){
            hash[arr[i]] = 1;
        }

        // find missing
        for(int i = 0; i <= n; i++){
            if(hash[i] == 0){
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }
}