package Sprint100;
// code sprint100 - day- 17
public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2};
        int element = 1;
        int ans = frequency(arr, element);
        System.out.println(ans);


        
    }
    //finding frequency of element
    static int frequency(int[] arr , int element){
        int count = 0; // initially count will be zero
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){ // if arr[i] = element then modify count = count + 1
                count += 1;
            }

        }
        return count; // finally return the count
    }

    
}
