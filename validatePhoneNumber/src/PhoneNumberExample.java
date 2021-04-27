import java.util.regex.*;

public class PhoneNumberExample {
    private static final String PHONENUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public PhoneNumberExample() {
    }

    public boolean validate(String str){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
