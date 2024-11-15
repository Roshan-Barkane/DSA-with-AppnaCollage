package Java_consepts.strings;

/* Problem no.5 -- > String Compression 
 * aaabbbbccc convert to  a3b4c2
 */
public class stringComparation {
    public static String StrComp(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch;
        int count = 0;
        ch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                count++;
                sb.append(ch);
                sb.append(count);
                break;
            }
            if (ch != str.charAt(i)) {
                if (count == 1) {
                    sb.append(ch);
                    ch = str.charAt(i);
                    count = 1;
                } else {
                    sb.append(ch);
                    sb.append(count);
                    ch = str.charAt(i);
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbbbcc";
        System.out.println(str.toString());
        System.out.println(StrComp(str));
    }
}
