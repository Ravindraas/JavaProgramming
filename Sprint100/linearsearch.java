public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,5,7};
        int target = 4;
        int ans =linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
