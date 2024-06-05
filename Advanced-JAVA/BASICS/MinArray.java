public class MinArray {
    public static void main(String args[]){
        int arr[] = {62,25,14,45,58,61,70,75,80};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("MINIMUM VALUE : "+min);
    }
}
