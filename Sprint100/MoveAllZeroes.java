package Sprint100;

import java.util.Arrays;

public class MoveAllZeroes {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,0,8,9,0,0};
        movieall(nums);
        System.out.println(Arrays.toString(nums));
    }
    //move all zeroes to the end of the array
    static void movieall(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i]; // not zeros are stored in nums[count]
                count++;
            }
        }
        //all zeroes add to end of the array
        while(count<nums.length){
            nums[count] = 0; // count just a variable you can take any variable like j
            count++;
        }
       
    
    }
}
    
