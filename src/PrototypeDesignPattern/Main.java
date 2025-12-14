package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        IntelligentStudent s = new IntelligentStudent();
        s.age = 12;
        s.marks = 78;
        s.name = "Sahil";
        s.university = "JBM";
        s.setAddress("E-7/5 MG Street, New Okhla Envclave, Delhi 110032");
        s.iq = 124;
        IntelligentStudent copy = s.clone();

        Student stu = new Student();
        stu.age = 12;
        stu.marks = 78;
        stu.name = "Ravi";
        stu.university = "IPU";
        stu.setAddress("E-7/5 MG Street, New Okhla Envclave, Delhi 110032");
        Student copyStudent = stu.clone();
    }
}
