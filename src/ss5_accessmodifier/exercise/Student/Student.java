package ss5_accessmodifier.exercise.Student;

public class Student {
    private String name = "john";
    private String classA = "C02";

    public Student() {
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassA() {
        return this.classA;
    }

    public void setClassA(String classA) {
        this.classA = classA;
    }
}
