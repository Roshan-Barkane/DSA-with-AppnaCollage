package Java_consepts.function_Methods;

public class callByRefrence {
    public static void main(String arg[]) {
        ChangeValue cv = new ChangeValue();
        cv.value = 10;
        System.out.println(" actual value is : " + cv.value);
        modify(cv);
        System.out.println(" modify value is : " + cv.value);

    }

    public static void modify(ChangeValue cv1) {
        cv1.value = 20;
    }
}

class ChangeValue {
    int value;
}