import java.util.*;
public class Count_Subarray_xorOpt {

    public static int countXor(int arr[] , int k){

        int n = arr.length;
        int cnt =  0; // store count of xor
        int xor = 0;

        // Use HashMap 
        Map<Integer ,Integer> mpp = new HashMap<>();
        mpp.put(xor,1);

        for(int i = 0; i<n; i++){
            
            // prefix XOR till index i:
            xor = xor^arr[i];
            
            // use formula : x= xor^k
            int x = xor^k;

             // add the occurrence of xor^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xor)) {
                mpp.put(xor, mpp.get(xor) + 1);
            } else {
                mpp.put(xor, 1);
            }
        }
        return cnt;  // TC : O(N) // SC : O(N)


    }
    public static void main(String args[]){
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countXor(arr, k));
        
    }
    
}
