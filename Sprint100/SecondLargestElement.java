
// sprint day 16
public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {3,5,7,2,8,9,10};
        System.out.println(secondlargest(arr));

    }
    static int secondlargest(int[] arr){
        int max = arr[0];
        int second_largest = 0;
        if(arr.length==0 || arr.length <2){
            return 0;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                second_largest = max;
                max = arr[i];
            }
            else if(second_largest < arr[i] && arr[i] < max){
                second_largest = arr[i];
            }
        }
        return second_largest ;
        /*if(second_largest < max){
            return second_largest;
        }
        return -1; */
    }

    
}
