package in.KGcoding.challange.gemotry.equals;

public class equalAndHashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Kartik", 18, 1684470);
        Person person2 = new Person("Kartik", 18, 1684470);
       int x = person2.hashCode();
        int y = person2.hashCode();
        System.out.println(x);
        System.out.println(y);
        if(person1.equals(person2)){
            System.out.println("equal");
        }else{
            System.out.println("not Equal");
        }
    }
}
