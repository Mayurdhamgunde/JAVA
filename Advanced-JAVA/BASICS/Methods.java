public class Methods {
    public static void main(String args[]){
        greet();
        int avg = avgTwo(6,4);
        System.out.println(avg);
        System.out.println(random());
    }
    static void greet(){
        System.out.println("Hello World!");
    }
    public static int avgTwo(int a,int b){
        return  (a+b)/2;
    }
    public static int random(){
        return (int)(Math.random()*6)+1;
    }
}
