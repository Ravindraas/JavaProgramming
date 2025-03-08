public class MaximumSubProduct{
    // day - 31 -2question
    public static void main(String[] args) {
        int[] arr = {2,3,-2,3,7};
        int ans = maxsubproduct(arr);
        System.out.println(ans);
    }
    static int maxsubproduct(int[] arr){
        int prefix = 1;
        int suffix = 1;
       // int n= arr.length;
        int maxproduct = Integer.MIN_VALUE; 
        for(int i = 0; i<arr.length; i++){
            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length-i-1];
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            maxproduct = Math.max(maxproduct, Math.max(prefix, suffix));
        }
        return maxproduct;
    }
}