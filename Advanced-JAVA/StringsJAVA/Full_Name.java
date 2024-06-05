import java.util.Scanner;
public class Full_Name {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String firstName = sc.next();
//        System.out.println("Enter your last name");
//        String lastName = sc.next(); // nextLine()
//        System.out.println("Your Full Name is "+firstName+" "+lastName);

        System.out.println("Carpet".charAt(2));
        char temp = "carpet".charAt(3);
        System.out.println(temp);

        int age = 21;
//        String strAge = age;       This is not allowed as storing Integer in String ;
        String strAge = String.valueOf(age);
        System.out.println(age);
        System.out.println(strAge);
    }
}

