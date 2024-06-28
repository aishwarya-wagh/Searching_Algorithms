import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int arr[]={1,2,3,4,5,6,7};
        int target=4;
        int target_index= binarySearchForSortedArray(arr,target);
        System.out.println("binarySearchForSortedArray  "+target_index);

        int arr2[]={9,10,11,12,13,1,2,3,4,5,6,7,8};
        target=7;
        target_index=binarySearchForRotatedSortedArray(arr2,target);
        System.out.println("binarySearchForRotatedSortedArray  "+target_index);


        int[] abc={1,2,3,4,0,6,7,8};
        int missing=abc.length;
        for(int i=0;i<abc.length;i++) {
            missing = missing ^ i ^ abc[i];
            System.out.println("missing is :" +missing+"  i is: "+i+"  abc[i] is: "+abc[i]);
        }
    }
    public static int binarySearchForRotatedSortedArray(int[]arr,int target){
       int low=0;
       int high=arr.length-1;
       while(low<high) {
           int mid = low + (high - low) / 2;

           if(arr[mid]==target){
               return mid;
           }

           if(arr[mid]< arr[high]){
               if(arr[mid]<=target && target<=arr[high]){
                   low=mid+1;
               }else{
                   high=mid-1;
               }
           }else{
               if(arr[low]< target && target < arr[mid]){
                   high=mid-1;
               }else{
                   low=mid+1;
               }
           }

       }

        return -1;
    }
    public static int binarySearchForSortedArray(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
    }
}