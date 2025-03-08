import java.util.*;

public class SymmetricPairs {
    public static void findSymmetricPairs(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] nums : arr){
            int first = nums[0];
            int second = nums[1];
            if(map.containsKey(second) && map.get(second) == first){
                System.out.println("("+ first +" ,  " + second +")");
            }else{
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2}, {3, 4}, {5, 6}, {2, 1}, {4, 3} };
        System.out.println("Symmetric Pairs:");
        findSymmetricPairs(arr);
    }
}
