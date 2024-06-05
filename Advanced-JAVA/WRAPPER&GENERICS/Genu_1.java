public class Genu_1 {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("asdf123");
        Dog<String> d2 = new Dog<>("oeuir12");

        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getId());
    }
}

//class Dog<E,V>{
class Dog<E>{
    E id;
//    V name;
//    public Dog(E id,V name){
    public Dog(E id){
        this.id = id;
//        this.name = name;
    }

    E getId(){
        return id;
    }
}
