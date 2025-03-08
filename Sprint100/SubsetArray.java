import java.util.HashSet;
public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3};
        System.out.println(issubset(arr1,arr2));
    }
    //check arr2 is subset of arr1
    static boolean issubset(int[] arr1, int[] arr2){
        //create the hash set
        HashSet < Integer > set= new HashSet<>();
        for(int value : arr1){
            set.add(value);
        }
        for(int value2 : arr2){
            if(!set.contains(value2)){
                return false;
            }
        }
        return true;


    }
}
