package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class ComparatorPriorityQueue {

    private static class Student{
      private final String name;
      private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name+" : " + grade;
        }
    }

    public static void main(String[] args) {
        PriorityQueue <Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new Student("kartik", 'A'));
        queue.offer(new Student("ram", 'A'));
        queue.offer(new Student("Shaym", 'B'));
        queue.offer(new Student("kk", 'D'));
        queue.offer(new Student("kak", 'C'));
        utility.print(queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

}
