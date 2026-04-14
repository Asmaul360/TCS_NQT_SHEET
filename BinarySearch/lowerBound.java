package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }    

    static int search(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // default if not found

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] >= target){
                ans = mid;        // store possible answer
                end = mid - 1;    // go left
            } else {
                start = mid + 1;  // go right
            }
        }
        return ans;
    }
}