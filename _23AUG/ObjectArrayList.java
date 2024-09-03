package _23AUG;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int roll;
    private String course;
    public Student(String name, int roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public String getCourse() {
        return course;
    }

}
public class ObjectArrayList {
    public static void main(String[] args) {
        List<Student> Students =new ArrayList<>();
        Students.add(new Student("Chaitanya", 1, "UI/UX"));
        Students.add(new Student("Rafe", 2, "Backend"));
        Students.add(new Student("Karunesh", 3, "Frontend"));
        Students.add(new Student("Husayn", 4, "Leetcode"));
    }
}

