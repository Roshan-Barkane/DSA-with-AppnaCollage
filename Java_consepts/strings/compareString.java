package Java_consepts.strings;

public class compareString {
    public static String compareStr(String name[]) {

        String bigString = name[0];
        for (int i = 1; i < name.length; i++) {
            if (bigString.compareTo(name[i]) > 0) {
                bigString = name[i];
            }
        }
        return bigString;
    }

    public static void main(String args[]) {
        String name[] = { "roshan", "priyash", "yash", "richa" };
        System.out.println(compareStr(name));
    }
}
