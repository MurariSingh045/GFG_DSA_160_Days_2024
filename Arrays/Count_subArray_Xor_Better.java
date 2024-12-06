public class Count_subArray_Xor_Better {

    public static int countXor(int arr[] , int k){
        int n = arr.length; // size of  an Array
        int cnt = 0;  // store count of xor
        for(int i = 0; i<n; i++){
            int xor =  0;
            for(int j = i; j<n; j++){


                xor =  xor^arr[j];
                
                // check if xor == target or not
                if(xor == k){
                    cnt++;
                }
            }
        }
        return cnt;  // TC :O(n^2) // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("The coun of xor is :" +countXor(arr, k));
    }
    
}
