public class exceptHand_2 {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello world");

        try{
            System.out.println(a[8]);
        }catch(Exception e){
            System.out.println("Exception Handled");
        }finally {
            System.out.println("I will always run");
        }

        System.out.println("Bye World");
    }
}
