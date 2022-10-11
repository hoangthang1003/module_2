package ss5_accessmodifier.exercise.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClassA("C08");
        student.setName("Audeptry");
        System.out.print(student.getName()+"\n"+student.getClassA());
    }
}
