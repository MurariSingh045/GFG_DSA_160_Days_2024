import java.util.*;
public class MajorityElement2_Brute {

    public static  List<Integer> majorityElement(int arr[]){
        int n = arr.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        for (int i = 0; i < n; i++) {
            //selected element is v[i]:
            // Checking if v[i] is not already
            // a part of the answer:
            if (ls.size() == 0 || ls.get(0) != arr[i]) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    // counting the frequency of v[i]
                    if (arr[j] == arr[i]) {
                        cnt++;
                    }
                }

                // check if frquency is greater than n/3:
                if (cnt > (n / 3))
                    ls.add(arr[i]);
            }

            if (ls.size() == 2) break;
        }

        return ls;  // TC : O(N*N)  // SC  : O(1)

    }
    public static void main(String  args[]){
        int arr[] = {1, 1, 1, 3, 3, 2, 2,2};

        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    
}
