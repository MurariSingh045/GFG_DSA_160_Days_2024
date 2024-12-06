public class copying_array {
    public static void copying(int A[] , int B[]){
        for(int z:A){
            System.out.print(z + " ");
        }
        System.out.println();
       for(int i = 0; i<A.length; i++){
        B[i]= A[i];
       }
       System.out.println("After copying array");
       for(int x:B){
        System.out.print(x+ " ");
       }

    }
    public static void main(String args[]){
        int A[] = {2,4,6,7,5,9,8};
        int B[] = new int[7];
        copying(A, B);
    }
    
}
