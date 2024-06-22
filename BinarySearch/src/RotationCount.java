public class RotationCount {
    public static void main(String[] args) {
        // int[] arr={4,5,6,7,0,1,2};
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr){
        int pivot= findPivot(arr);
        // if (pivot == -1) {
        //     //array is not rotated
        //     return 0;
            
        // }
        return pivot + 1;
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

    static int findPivotDuplicates(int[] arr){
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
          //if elements at middle, start, end are equal the just skip the duplicates
          if(arr[start]==arr[mid] && arr[end]==arr[mid]){
            //skip the duplicates
            //NOTE: what if these elements at start and end were the pivot??
            //check if start's next or end's previous is smaller
            if(start<end && arr[start]>arr[start+1]){
                return start; //pivot
            }
            if(end>start && arr[end]<arr[end-1]){
                return end-1; //pivot
            }
            start++;
            end--;
          }
          else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
            start=mid+1;
          } else{
            end=mid-1;
          }
        }
        return -1;
    }
}

