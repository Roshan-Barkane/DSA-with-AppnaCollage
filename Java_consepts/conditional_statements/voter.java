package Java_consepts.conditional_statements;

public class voter {
    public static void main(String args[]) {
        int age = 14;
        if (age >= 18)
            System.out.println("you must vote");
        else if (age >= 13 && age < 18)
            System.out.println("you can't vote");
        else
            System.out.println("you are kids ");
    }

}
