package ss18_string_and_reget.exercise.classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private static final String Name_REGEX = "^[CAP]\\d{4}[GHIKML]$";
    public ClassNameExample() {
        pattern = Pattern.compile(Name_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
