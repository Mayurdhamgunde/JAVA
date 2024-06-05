import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // ArrayList have dynamic size in nature which overcome problem of array fixed size length -->
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
    }
}
