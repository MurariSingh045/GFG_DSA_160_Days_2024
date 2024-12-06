import java.util.HashMap;
import java.util.Map;
public class Majority_Element_Better {

    public static int getMajority(int arr[] , int n){


        // create a HashMAp
        HashMap<Integer , Integer> mp = new HashMap<>();

        //storing the elements with its occurnce:
        for(int i = 0; i<n; i++){
            int value = mp.getOrDefault(arr[i] , 0);
            mp.put(arr[i] , value+1);
        }
          //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;

        }
    
    public static void main(String args[]){
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int ans = getMajority(arr, n);
        System.out.println("The majority element is :" +ans);
    }
    
}
