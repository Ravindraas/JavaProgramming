import java.util.HashSet;
public class DisjointArrayORNot {
    public static void main(String[] args) {
        int[] arr1 ={1,2,4,5};
        int[] arr2  = {7,8,9};
        System.out.println(isdisjoint(arr1, arr2));
    }
    //disjoint or not
    static boolean isdisjoint(int[] arr1, int[] arr2){
        //create a hashset to store the elements of arr1
        HashSet < Integer> set = new HashSet<>();
        for(int value1 : arr1){
            set.add(value1);
        }
        for(int value2 : arr2){
            if(!set.contains(value2)){
                return true;
            }
        }
        return false;

    }
}
