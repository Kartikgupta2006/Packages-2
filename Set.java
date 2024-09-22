package collection;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> names = new HashSet<>();
        System.out.println(names.add("kartik"));
        System.out.println(names.add("gupta"));
        System.out.println(names.add("Hustler"));
           utility.print(names);
       // System.out.println(names.add("kartik"));
        System.out.println(names.size());
        utility.print(names);
        System.out.println(names.remove("kartik"));
        System.out.println(names.remove("kartik"));
        utility.print(names);
    }
}
