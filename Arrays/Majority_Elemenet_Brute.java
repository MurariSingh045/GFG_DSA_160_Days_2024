public class Majority_Elemenet_Brute {
    public static int getMajority(int arr[] , int n){
        for(int i = 0; i<n; i++){
            // select element is arr[i]
            int cnt = 0; 
            for(int j = 0; j<n; j++){

                // if arr[i] == arr[j] then we have to increase cnt
                if( arr[j] == arr[i]){
                    cnt++;
                }
                }

                // check if the cnt is greater than n/2
                // if it is greater then return element of array 
                if(cnt > n/2) {
                    return arr[i];
            }

        }
        // if there is no majority element then return -1
        return -1;
    }  // TC:O(N*N)  // SC:O(1)
    public static void main(String args[]){
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int ans = getMajority(arr, n);
        System.out.println("The majority element is :" +ans);
        

    }
    
}
