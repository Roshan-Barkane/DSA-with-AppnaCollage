package Java_consepts.Array;

public class itemManu {
    public static int searchManu(String manu[], String search) {
        for (int i = 0; i < manu.length; i++) {
            if (manu[i] == search) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String arf[]) {
        String manu[] = { "samosha", "kachori", "pohaa", "jalebi", "nukti" };
        String search = "jaleb";
        int index = searchManu(manu, search);
        if (index == -1) {
            System.out.println("Item is not found !");
        } else {
            System.out.println("Item is Available !");

        }
    }
}
