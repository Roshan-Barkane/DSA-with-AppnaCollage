package Java_consepts.Variables_Datatype;

import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double pieValue = 3.14;
        // area of circle calculate
        double Area = pieValue * radius * radius;
        System.out.println("Area of circle radius is : " + Area);

    }

}
