package DZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! It`s a calc");
        Scanner calc = new Scanner(System.in);
        System.out.println("Input x - first number");
        int x = calc.nextInt();
        System.out.println("Input y - second number");
        int y = calc.nextInt();

        System.out.printf("x = %d, y = %d \n", x, y);

        int a = x+y;
        int b = 5+x;
        int c = x-y;
        int d = 5-y;
        int e = x*y;
        double f1 = (double)x / y;

        System.out.printf("x+y = %d \n", a);
        System.out.printf("5+x = %d \n", b);
        System.out.printf("x-y = %d \n", c);
        System.out.printf("5-y = %d \n", d);
        System.out.printf("x*y = %d \n", e);
        System.out.printf("x/y = %.2f \n", f1);

        System.out.println("Bye");
        calc.close();
    }
}
