public class Str_1 {
    public static void main(String args[]){
        String name = "Mayur";
        String sameName = "Mayur";
        String newName = new String("Mayur");
        System.out.println(name);
        System.out.println(sameName);
        System.out.println(newName);

        if(name == sameName){
            System.out.println("Both are same");
        }

        if(newName == sameName){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are Not same");
        }
        if(name.equals(newName)){  // equals method check value of two strings ----->
            System.out.println("name and newName have same values");
        }
    }
}
