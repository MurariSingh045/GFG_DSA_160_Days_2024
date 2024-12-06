import  java.util.*;
public class MajorityElement2_Better {

    public static List<Integer> majorityElement(int arr[]){
        int n = arr.length; // length of array

        // create a list to store  majority element
        List<Integer> ans  = new  ArrayList<>();

        // Declear a map
        Map<Integer , Integer> mpp = new  HashMap<>();

        // least occurrence of the majority element:
        int mini = (int)(n/3) +1;

       //storing the elements with its occurnce:
       for(int i = 0; i< n ; i++){
        int value = mpp.getOrDefault(arr[i], 0);
        mpp.put(arr[i], value + 1);

        //checking if v[i] is
        // the majority element:
        if (mpp.get(arr[i]) == mini) {
            ans.add(arr[i]);
        }
        if (ans.size() == 2) break;
    }

    return ans;  // TC :O(N*logN)  // SC : O(N)
       }

    
    public static void main(String args[] ){
        int arr[] = {1, 1,1, 3, 3, 2, 2, 2};

        List<Integer> ans =  majorityElement(arr);
        System.out.print(" Majority Element is  :");
        for(int i = 0;  i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }System.out.println();
    }
}