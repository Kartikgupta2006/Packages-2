package LamdaFunction;

import java.util.List;
import java.util.function.BinaryOperator;

public class reduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        int sum = 0;
//        for (Integer number : numbers) {
//           sum += number;
//        }
//        System.out.println("normal sum: "+sum);
        int newSum= numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2 ;
                    }
                });
        System.out.printf("\n sum using reduce is %d",newSum);
        int newsum2 = numbers.stream()
                        .reduce(0,(a,b)->a+b);
        System.out.printf("\n sum using reduce is %d",newsum2);
        
    }
}
