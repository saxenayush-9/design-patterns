package PrototypeDesignPattern;

public class Student {
    String name;
    int age;
    String university;
    int marks;
    private String address;

    Student() {

    }

    Student(Student s) {
        this.marks = s.marks;
        this.address = s.address;
        this.name = s.name;
        this.age = s.age;
        this.university = s.university;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student clone() {
        return new Student(this);
    }
}
