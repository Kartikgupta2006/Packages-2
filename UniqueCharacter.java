package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacter {
     public static void main(String[] args) {
         Set<Character> unique = new HashSet<>();
         System.out.print("please enter the String:");
         Scanner sc = new Scanner(System.in);
         String User = sc.next();
         for (char c : User.toCharArray()) {
             unique.add(c);

         }
         System.out.printf("unique character %d", unique.size());

     }
}
