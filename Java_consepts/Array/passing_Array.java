package Java_consepts.Array;

public class passing_Array {
    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 99, 98, 96 };
        updateMarks(marks);
        // for print the marks
        System.out.println("updated marks is : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
