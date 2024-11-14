package Java_consepts.strings;

public class stringBuilder {
    public static String strBuilder() {
        StringBuilder str = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            str.append(ch);
        }
        return str.toString();
    }

    public static void main(String args[]) {
        System.out.println(strBuilder());
    }
}
