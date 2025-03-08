
// day 16
public class SecondSmallestelement {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,7,9,8};
        System.out.println(secondsmallest(arr));
    }
    static int secondsmallest(int[] arr){
        if(arr.length==0 || arr.length < 2){
            return 0;
        }
        int min = arr[0];
        int second_smallest = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] < min){
                second_smallest = min;
                min = arr[i];
            }
            else if(second_smallest < arr[i] && arr[i] < min){
                second_smallest = arr[i];
            }
        }
        return second_smallest;
    }
    
}
