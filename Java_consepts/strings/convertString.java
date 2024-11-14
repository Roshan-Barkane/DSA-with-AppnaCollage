package Java_consepts.strings;

public class convertString {
    public static String firstLetterConvert(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                // add the space of the string
                sb.append(str.charAt(i));
                i++;
                // add the first letter of the string
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // add the all letter of the string
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String arg[]) {
        String str = " hii, i am roshan barkane";
        System.out.println(firstLetterConvert(str));
    }
}
