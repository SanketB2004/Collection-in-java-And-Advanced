
package challenges;
import java.util.*;

public class cha94 {

    private static class Student {

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
    }

    public static void main(String[] args) {

        PriorityQueue<Student> q = new PriorityQueue<>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return Character.compare(s1.getGrade(), s2.getGrade());
            }
        });

        q.offer(new Student("Sanket", 'D'));
        q.offer(new Student("Amit", 'A'));
        q.offer(new Student("Rohit", 'B'));

        while (!q.isEmpty()) {
            Student s = q.poll();
            System.out.println(s.getName() + " " + s.getGrade());
        }
    }
}