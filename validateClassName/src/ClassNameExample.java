import java.util.regex.*;


public class ClassNameExample {
    private static final String CLASSNAME_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";

    public ClassNameExample() {
    }

    public boolean validate(String str){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
