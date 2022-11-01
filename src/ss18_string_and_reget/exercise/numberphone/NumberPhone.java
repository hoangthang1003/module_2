package ss18_string_and_reget.exercise.numberphone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern pattern;
    private Matcher matcher;
    private static  final String Number_Phone = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public NumberPhone() {
        pattern = Pattern.compile(Number_Phone);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
