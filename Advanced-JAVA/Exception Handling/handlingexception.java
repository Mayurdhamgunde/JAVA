public class handlingexception {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello guys");
        try{
            int result = 5/10;

            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException |ArithmeticException|NullPointerException e){
            System.out.println("Handling the exception");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e);
        }
    }
}
