public class oops_2 {    // class contain properties and behaviours --->
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "Tommy";
        d1.bark();

        dog d2 = new dog();
        d2.name = "Leo";
        d2.walk();
    }
}

class dog{                  // No other class can have public other than main class ---->
    String name;            //This are properties ------->
    int age;
    String color;

    void walk(){            // This is behaviours---> As behaviours are methods--->
        System.out.println(name+" is walking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }

}

class cat{

}
