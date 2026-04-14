package BinarySearch;

public class searchXInSortedArray{
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target=10;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int arr[],int target){
        if(arr.length==0){
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}