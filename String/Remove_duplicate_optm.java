public class Remove_duplicate_optm {
        public static int remove(int arr[] , int n){
            int i=0; 
            for(int j =0; j<n; j++){
               if(arr[i] != arr[j]){
                    i++;
                   arr[i] = arr[j];
               }
            }
            return i+1;
        }
        public static void main(String args[]){
            int arr[] = {1,1,2,2,2,3,3,4,4};
            int n = arr.length;
            int k = remove(arr , n);
            System.out.println("after removing duplicate element");
            for(int i=0; i<k; i++){
                System.out.print(arr[i] + " ");
            }
            
        }
    }
