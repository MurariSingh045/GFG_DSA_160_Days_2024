public class Sorted_Array_012_opt {
    public static void sortedArray(int arr[] , int n){
        // Using Dutch National Flag Algo
       // we are creating three pointers
        int low = 0, mid = 0 , high = n-1;

           while(mid <= high)

           // if arr[mid] == 0 then swap mid & low and also increment both by 1
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }

            // if arr[mid] == 1 then we will do nothing just increment nid by 1
            else if(arr[mid] == 1){
                mid++;
            }

            // if arr[mid] == 2 then swap mid & high and decrement high by 1
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        // TC : O(N)  // SC: O(1)

    
    public static void main(String args[]){
        int arr[] = {0, 2, 1, 2, 0, 1};
        int n = arr.length;
        sortedArray(arr, n);
        System.out.println("After Sorting Array is ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
} 
