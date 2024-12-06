
// Using Moore's Voting Algorithm
public class Majority_Element_Opt {
    public static int getMajority(int arr[]){
        int n = arr.length; // length of an array
        int cnt = 0 ;  // intialize count
        int element = 0;  // initialize elements of array

        // applying algo
        for(int i = 0; i<n; i++){
            if(cnt == 0){
                cnt = 1;
                element = arr[i];
            }
            else if( element == arr[i]){
                cnt ++;
            }
            else cnt --;
        }
       //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == element) {
                cnt1++;
            }
        }
        if(cnt1 > n/2){
            return element;
        }
        return-1;

    }
    public static void main(String args[]){
        int arr[] = { 2, 2, 1, 1, 1, 2, 2};
        int ans = getMajority(arr);
        System.out.println("The majority element is :" +ans);
       
    }
    
}
