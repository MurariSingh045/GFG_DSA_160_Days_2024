public class Count_subaaray_Xor_Brute {

    public  static int countXor(int arr[] , int d){
        int n = arr.length; // size of Array
        int cnt = 0 ; // store count of xor
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int xor = 0; // initialize xor with 0
                for(int k = i; k<=j; k++){

                    xor  = xor^arr[k];
                }
                if(xor == d){
                    cnt++;
                }
            }
        }
        return cnt; // TC :O(N^3) // SC: O(1)
    }
    public static void main(String args[]){
        int arr[] = {4, 2, 2, 6, 4 };
        int d = 6;
        System.out.println("the count of xor is :" +countXor(arr, d));
    }
    
}
