import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,1,2,5,9};
        System.out.println(longestSequence(nums));

    }
    static int longestSequence(int[] nums){
        //create a hashmap
        int longestlength = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num : nums){
            map.put(num, Boolean.FALSE);
        }
        for(int num : nums){
            int currentlength = 1;
            //check for farward direction
            int nextnum = num +1;
            while(map.containsKey(nextnum) && map.get(nextnum) == false){
                map.put(nextnum , Boolean.TRUE);
                currentlength++;
                nextnum++;

            }
            //check for backward direction
            int prenum = num -1;
            while(map.containsKey(prenum) && map.get(prenum) == false){
                map.put(prenum, Boolean.TRUE);
                currentlength++;
                prenum--;
            }
            longestlength = Math.max(longestlength, currentlength);
        }
        return longestlength;
    }
    
}
