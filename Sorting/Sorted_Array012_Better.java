import java.util.ArrayList;
import java.util.Arrays;
public class Sorted_Array012_Better{
    public static void sortedArray(ArrayList<Integer> arr , int n){
        int cnt0 = 0 , cnt1 = 0, cnt2 = 0;
       
       for(int i = 0; i<n; i++){
        if(arr.get(i) == 0) cnt0++;
        else if(arr.get(i) == 1) cnt1++;
        else cnt2++;
       }

       // Replace the Places in Original Array

       for(int i = 0; i<cnt0; i++) arr.set(i, 0);  // replace 0'S

       for(int i = cnt0; i< cnt0+cnt1; i++)  arr.set(i , 1);  // replace 1's

       for(int i = cnt0+cnt1; i<n; i++)  arr.set(i , 2);  // replace 2's
    }

    // TC: O(2N)   // SC : O(1) coz we are not using any extra space
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 0, 1));
        int n = arr.size();
         sortedArray(arr, n);
         System.out.println("After Sorting Array is :");
         for(int i = 0; i<n; i++){
            System.out.print(arr.get(i) + " ");
         }
        System.out.println();


    }
}
