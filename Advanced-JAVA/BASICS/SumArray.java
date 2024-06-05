public class SumArray {
    public static void main(String args[]){
        int add[] = {25,15,5,10,45};
        int sum = 0;
        for(int i=0;i<add.length;i++){
            sum += add[i];
        }
        System.out.println("Addition is : "+sum);
    }
}
