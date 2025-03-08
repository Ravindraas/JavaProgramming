package Sprint100;
//finding frequency of all elements in an array
import java.util.HashMap;
public class FrequencyOfAllElement {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,3,2,5,6};
        HashMap < Integer, Integer > map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);

            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(bubblesort(map));
    //sort the elements using bubble sor
    static void bubblesort(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }



    }
    
}
