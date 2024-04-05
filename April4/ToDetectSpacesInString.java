package April4;
public class ToDetectSpacesInString {
    public static void main(String[] args) {

        String str="This String Contains  double and   triple spaces";

        //indexOf() will provide the index of the double or triple spaces in a string
        //if not available then -1 is returned
        System.out.println(str.indexOf("  "));//double space
        System.out.println(str.indexOf("   "));//triple space
        System.out.println(str.indexOf("    "));//four spaces
    }
}
