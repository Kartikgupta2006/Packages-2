package in.KGcoding.challange.gemotry.equals;

import java.util.Objects;

public class Person {

     private String name;

     private int age;

     private  int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
        return per.name.equals(name)&&
                per.age==age &&
                per.id==id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("name=").append(name).append('\'').append(", age=").append(age).append('\'');
        sb.append(", id=").append(id).append("}");
        return sb.toString();
    }
}
