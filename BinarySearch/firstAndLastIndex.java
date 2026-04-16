// package BinarySearch;
public class firstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7,7, 8, 8, 10};
        int target = 7;
        int arr1[]=new int[2];

        int first = search(arr, target);
        int last=search1(arr,target);
        System.out.println(first);
        System.out.println(last);
    }

    static int search(int arr[], int target) {
        
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
               ans=mid;
               end=mid-1;
            } 
            
        }
     
  return ans;
    }
    static int search1(int arr[], int target) {
        
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
               ans=mid;
               start=mid+1;
            } 
            
        }
     
  return ans;
    }
}