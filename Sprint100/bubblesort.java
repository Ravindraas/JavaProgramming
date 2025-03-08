import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        bubblefunction(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void bubblefunction(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]> arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
        
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
