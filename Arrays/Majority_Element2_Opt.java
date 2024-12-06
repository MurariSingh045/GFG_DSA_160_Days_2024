import java.util.*;
public class Majority_Element2_Opt {

    public static List<Integer> majorityElement(int arr[] , int n){

        int cnt1 = 0 ,cnt2 = 0; // track count
        int ele1 = Integer.MIN_VALUE; // to store majority element
        int  ele2 = Integer.MIN_VALUE; // to store majority element
         
        // applying the Extended Boyer Moore's Voting Algorithm:
        for(int i= 0; i < n; i++ ){

            // check condition

            if(cnt1 == 0  && ele2 != arr[i]){
                cnt1 = 1;
                ele1 = arr[i];
            }
            else if(cnt2 == 0 && ele1 != arr[i]){
                cnt2 = 1;
                ele2 = arr[i];
            }
            else if(ele1 == arr[i]) cnt1++;
            else if(ele2 == arr[i] ) cnt2++;

            else{
                cnt1--; cnt2--;
            }
        }

        //  Check manually the ele1 & ele2 is maority element or not

        // create a list because we have to add majority element into  the list

        List<Integer> ans = new ArrayList<>();  // List of answer

           // el1 and el2 are the majority elements:
           cnt1 = 0 ; cnt2 = 0;

        for(int i = 0; i<n; i++ ){
            if(ele1 == arr[i] ) cnt1++;
            if(ele2 == arr[i]) cnt2++;
        }

        // Mjaority element should be greatet tha n/3
        int mini = (int)(n/3) +1;

        //  check  if ele1 & ele2 is majority or not

        if(cnt1 >= mini) ans.add(ele1);
        if(cnt2 >= mini) ans.add(ele2);
 
           // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ans;
        // O(N) + O(N), where N = size of the given array
      //  SC : O(1)
    }


    public static void main(String args[]){
        int arr[] = {1, 1, 1, 3, 3, 2, 2, 2};
        int n = arr.length;

        List<Integer> ans = majorityElement(arr, n);

        System.out.print("Majority element is : ");

        for(int i  = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
    
}
