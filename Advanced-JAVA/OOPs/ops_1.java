public class ops_1 {    // class contain properties and behaviours --->
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
    }
}

class Dog{                  // No other class can have public other than main class ---->
    String name;            //This are properties ------->
    int age;
    String color;

    void walk(){            // This is behaviours---> As behaviours are methods--->
        System.out.println("Dog is walking");
    }
    void bark(){
        System.out.println("Dog is barking");
    }

}

class Cat{

}
