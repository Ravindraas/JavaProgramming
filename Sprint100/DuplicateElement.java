import java.util.*;
public class DuplicateElement{
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,8,8,6};
        isduplicate(arr);
    }
    static void isduplicate(int[] arr){

    
        //create a hashset 
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){// if element already in the set then it find the duplicate no.
                System.out.println(num);

            }
        }

    }
}
