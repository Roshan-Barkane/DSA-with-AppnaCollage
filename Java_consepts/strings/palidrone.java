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

    public static void main(String ar[]) {
        String str = "racecar";
        String str2 = "racepet";
        palinDrome(str); // as a write string
        palinDrome(str2); // as a wrong string
    }
}
