public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
    public static final String[] validPhoneNum = new String[] { "(84)-(0978489648)" };
    public static final String[] invalidPhoneNum = new String[] { "(a8)-(22222222)", "(84)-(7978489648)" };

    public static void main(String args[]) {
        for (String phoneNum : validPhoneNum) {
            boolean isValid = phoneNumberExample.validate(phoneNum);
            System.out.println("Phone number " + phoneNum +" is valid: "+ isValid);
        }
        for (String phoneNum : invalidPhoneNum) {
            boolean isValid = phoneNumberExample.validate(phoneNum);
            System.out.println("Phone number " + phoneNum +" is valid: "+ isValid);
        }
    }
}
