public class RBS{
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        //if you didn't find a pivot the array is not rotated
        if(pivot==-1){
            return binarySearch(nums, target, 0, nums.length-1);
         } //just do normal binary search        }
         //if pivot is found, you have found 2 asc sorted arrays
         if(nums[pivot]==target){
            return pivot;
         }
         if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
         }

         return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases here
            //case-1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case-2
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case-3
            if(arr[mid]<=arr[start]){
                end=mid-1;
            } else{
                start=mid+1;
            }

        
        }
        return -1;
    }
}