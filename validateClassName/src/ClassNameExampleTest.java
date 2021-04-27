public class ClassNameExampleTest {
    private static final ClassNameExample classNameExample = new ClassNameExample();
    public static final String[] validClasses = {"C0318G"};
    public static final String[] invalidClasses = {"M0318G", "P0323A", "m127I", "0318G"};

    public static void main(String args[]) {
        for (String className: validClasses) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Classname is " + className +" is valid: "+ isValid);
        }
        for (String className : invalidClasses) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Classname is " + className +" is valid: "+ isValid);
        }
    }

}
