package Java_consepts.strings;

public class palidrone {
    // find the string is palindrome are not
    public static void palinDrome(String string) {
        int track = string.length() - 1;
        int mid = track / 2;
        for (int i = 0; i <= mid; i++) {
            if (string.charAt(i) == string.charAt(track)) {
                track--;
            } else {
                System.out.println("String is not Palindrome");
                return;
            }
        }
        System.out.println("String is Palindrome");
    }

    // second function
    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                // String not a palindrome number
                return false;
            }
        }
        return true;
    }

    public static void main(String ar[]) {
        String str = "racecar";
        String str2 = "racepet";
        palinDrome(str); // as a write string
        palinDrome(str2); // as a wrong string
        // another function
        System.out.println(palindrome(str));
        System.out.println(palindrome(str2));
    }
}
