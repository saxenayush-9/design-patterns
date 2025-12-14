package PrototypeDesignPattern;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent() {

    }

    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
