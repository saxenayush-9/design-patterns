package BuilderDesignPattern;

public class Student {
    private String name;
    private int age;
    private String batch;
    private int passingYear;

    public static Builder getBuilder() {
        return new Builder();
    }

    public int getAge() {
        return age;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public String getBatch() {
        return batch;
    }

    public String getName() {
        return name;
    }

    private Student(Builder h) {
        this.name = h.name;
        this.age = h.age;
        this.passingYear = h.passingYear;
        this.batch = h.batch;
    }

    public static class Builder {
        String name;
        int age;
        String batch;
        int passingYear;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassingYear(int passingYear) {
            this.passingYear = passingYear;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
