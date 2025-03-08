public class ArrayMadeBeEqual {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        System.out.println(isequal(arr));

    }
    static boolean isequal(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] !=arr[j-1]){
                return false;
            }
            i++;
        

        }
        return true;
        
    }
    
}
