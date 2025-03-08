import java.util.HashMap;

public class SamePairs {

    //same pairs in an array -  day- 31 - 1stquestion
    public static void main(String[] args) {
        int[][] arr= {{1,2}, {2,1},{4,5},{5,7},{5,4}};
        findSymmetricPairs(arr);

    }
    static void findSymmetricPairs(int[][] arr){
        //create a hashmap
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int first = arr[i][0];  // first element
            int second = arr[i][1];  // second element
            //check
            if(map.containsKey(second) && map.get(second) == first){
                System.out.println("(" + second + ", " + first + ") and (" + first + ", " + second + ")");

            }
            else{
                map.put(first, second);
            }
        }
    }
}
