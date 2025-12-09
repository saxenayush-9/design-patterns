package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(12)
                .setBatch("nov4324")
                .setName("Ayush")
                .setPassingYear(2021)
                .build();
        System.out.println(s.getAge());
        System.out.println(s.getBatch());
        System.out.println(s.getName());
        System.out.println(s.getPassingYear());
    }
}
