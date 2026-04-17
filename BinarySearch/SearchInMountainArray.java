import java.lang.reflect.Array;

public class SearchInMountainArray {
     public static void main(String[] args) {
        int arr[]={0,7,8,2,1};
        int target=2;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;    

        // 🔹 Step 1: find peak
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid + 1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }

        int peak = start;

        // 🔹 Step 2: search left (ascending)
        int start1=0;
        int end1=peak;

        while(start1<=end1){
            int mid=start1+(end1-start1)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end1=mid-1;
            }
            else{
                start1=mid+1;
            }
        }

        // 🔹 Step 3: search right (descending)
        start1=peak+1;
        end1=arr.length-1;

        while(start1<=end1){
            int mid=start1+(end1-start1)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                start1=mid+1;   // reversed
            }
            else{
                end1=mid-1;
            }
        }

        return -1;
    }
}