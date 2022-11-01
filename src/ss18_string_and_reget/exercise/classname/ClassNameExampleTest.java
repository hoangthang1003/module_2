package ss18_string_and_reget.exercise.classname;

public class ClassNameExampleTest {
    public static final String[] validNameclass= new String[]{"C0318G"};
    public static final String[] invalidNameclass= new String[]{"M0318G"};

    public static void main(String[] args) {
        ClassNameExample className = new ClassNameExample();
        for (String nameClass: validNameclass ) {
            boolean isValid = className.validate(nameClass);
            System.out.println("Class is" + nameClass +" "+ "is valid"+" "+ isValid );
        }
        for (String nameClass1: invalidNameclass ) {
            boolean isValid = className.validate(nameClass1);
            System.out.println("Class is" + nameClass1 +" "+ "is valid"+" "+ isValid );
        }
    }
}
