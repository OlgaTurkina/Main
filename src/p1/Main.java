package p1;

import com.sun.source.doctree.SystemPropertyTree;

public class Main {
    public static void main (String[] args) {

        System.out.println("Hello all");

        int x=5;
        int y=10;
        System.out.println("x=" + x + "; y=" + y);
        System.out.printf("x=%d; y=%d \n", x, y);

        String name = "Ivan";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        }
    }