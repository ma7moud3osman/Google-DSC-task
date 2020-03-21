// Mahmoud Osman --> DSC Task

import java.util.Scanner;

public class DSCFirstTask {
    public static void main(String [] args)
    {
        System.out.println("========================= 1 =============================");
        // [1] Write a Java program to print the result of the following operations.
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);
        // b. (55+9) % 9
        System.out.println((55 + 9) % 9);
        // c. 20 + -3*5 / 8
        System.out.println(20 + -3 * 5 / 8);
        // d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        System.out.println("========================= 2 ==============================");
        //***************************************************************************//
        // [2]Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        System.out.print("Enter First Number : ");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));

        System.out.println("========================== 3 =============================");
        //***************************************************************************//
        //[3] Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.print("Enter The Number : ");
        Scanner scanner1 = new Scanner(System.in);
        int c;
        c = scanner1.nextInt();
        for (int i = 1 ; i <= 10; i++)
            System.out.println(c + " x " + i + " = " + (c * i));

        System.out.println("========================= 4 ==============================");
        //***************************************************************************//
           /*  [4] Write a Java program to display the following pattern.
                      J     a   v     v  a
                      J    a a   v   v  a a
                   J  J   aaaaa   v v  aaaaa
                    JJ   a     a   v  a     a         */

        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println("========================== 5 ===========================");
        //***************************************************************************//
        // [5] Write a Java program to compute the specified expressions and print the output.
        double d = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(d);

        System.out.println("========================== 6 ============================");
        //***************************************************************************//
        //[6] Write a Java program to compute a specified formula.
        double f = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(f);

        System.out.println("========================== 7 ============================");
        //***************************************************************************//
        //[7]Write a Java program to print the area and perimeter of a circle.
        double radius = 7.5;
        double pi = 3.141592653589793;
        double perimeter, area;
        area = pi * (radius * radius);
        perimeter = 2 * pi * radius;
        System.out.println(pi);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        System.out.println("======================== End ============================");
    }
}
