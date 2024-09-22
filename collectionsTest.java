package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsTest {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(6);
        num.add(9);

        // add all num in the list
        Collections.addAll(num, 4,5,2,4,3);
        utility.print(num);

        // for sorting the list
        Collections.sort(num);
        utility.print(num);
        System.out.println( );

        // for searching index
        int index = Collections.binarySearch(num, 4);
        System.out.println("index 4 is num is :"+ index);

        // for reverse the list
        Collections.reverse(num);
        utility.print(num);
        System.out.println();

        // to find max and min the number in the sorted array
        int max = Collections.max(num);
        int min= Collections.min(num);
        System.out.println("max is:"+max  + "  min num is:"+ min);
        // list are unmodifiable list does not change only for read


       // List<Integer> unmodifiable = Collections.unmodifiableList(num);
       // unmodifiable.add(1);

    }
}
