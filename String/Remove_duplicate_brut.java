import java.util.HashSet;
public class Remove_duplicate_brut {
    public static int removeDuplicate(int arr[] , int n){
      HashSet <Integer> st = new HashSet<>(); // create Hashset
       for(int i=0; i<n; i++){ // traversing the array
         st.add(arr[i]);    // storing elements of array in Hashset coz hashSet remove duplicate elements
       }
      int k = st.size();  // k determine the unique elements present on the Hashset
       int j = 0;      // intialize j to start storing unique elements to original array
       for(int x : st){  // traversing the set and store back into original array
        arr[j++] = x;
       }
       return k;  // return the size of k
       
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3,4,5};
        int n = arr.length;
        int k =  removeDuplicate(arr ,n);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
    

