package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalClass() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoint() {
        if (finalClass() >= 60) {
            return 0.0;
        }
        else {
            return 60 - finalClass();
        }
    }
}