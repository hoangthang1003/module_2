package ss18_string_and_reget.exercise.numberphone;

public class NumberPhoneTest {
    public static final String[] validNumberPhone= new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumberPhone= new String[]{"(a8)-(22222222)"};
    public static void main(String[] args) {
       NumberPhone numberPhone = new NumberPhone();
        for (String number : validNumberPhone) {
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Email is " + number + " is valid: " + isvalid);
        }
        for (String number : invalidNumberPhone) {
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Email is " + number + " is valid: " + isvalid);
        }
    }
}
