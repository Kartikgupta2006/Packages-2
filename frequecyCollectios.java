package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class frequecyCollectios {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,5,3,2,2);
        System.out.println(Collections.frequency(list,2));
    }
}
