import java.util.regex.*;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[a-zA-Z0-9_]{6,}$";

    public boolean validate(String email){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
