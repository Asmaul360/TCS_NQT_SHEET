import java.util.Scanner;
public class upperBound {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements : ");
    for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
    System.out.println("Enter the target : ");
    int target=in.nextInt();
   int ans= binarySearch(arr,target);
   System.out.println("The upperBound is : "+ans);

}
static int binarySearch(int nums[],int x){
      int start=0;
        int end=nums.length-1;
        int index=nums.length;
         while(start<=end){
        int mid=start+(end-start)/2;
        if(nums.length==0){
            return 1;
        }
        if(nums[mid]>x){
            end=mid-1;
            index=mid;
        }
        else if (nums[mid]<=x){
            start=mid+1;
        }        
       }
       return index;  
}
    
}
