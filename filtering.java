package LamdaFunction;

import java.util.List;
import java.util.function.Consumer;

public class filtering {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "dates", "orange");
        System.out.println(fruits.size());
        System.out.println("printing frits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//        System.out.println("printing fruits streams");
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });
        System.out.println("printing fruits using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));
     }
}
