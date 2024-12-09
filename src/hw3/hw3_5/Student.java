package hw3.hw3_5;

import java.util.Objects;

public class Student {

    private String name;
    private Double gpa;
    private Integer id;

    public Student() {

    }

    public Student(String name, Integer id, Double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    @Override
    public boolean equals(Object otherClass) {
        if (this == otherClass) return false;
        if (otherClass == null || getClass() != otherClass.getClass()) return false;
        Student student = (Student) otherClass;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.id = this.id;
        student.name = this.name;
        student.gpa = this.gpa;
        return student;
    }
}
