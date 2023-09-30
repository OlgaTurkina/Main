package p4;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        double z = 15;

        int a = x+y;
        int b = 10+x;
        int c = x-y;
        int d = 10-x;
        int e = x*y;
        int f = x/y;
        double f1 = (double)x / y;
        double f2 = x/z;
        System.out.println(f1);
        System.out.println(f2);
        int g = y%x;
        System.out.println(g);

        int h = ++y; //y = y + 1 --y;
        System.out.println(h);
        System.out.println(y);

        int k = x++; // x = x+1 y--;
        System.out.println(k);
        System.out.println(x);

        // 1 приоритет-  x++, y--
        // 2 приоритет- ++x, --y
        // 3 приоритет - *x, /x, %x
        // 4 приоритет - +, -

        //int m = x+5*++y;
       // System.out.println(m);

        int m1 = (x+5)*++y;
        System.out.println(m1);

        double l = 2.0 - 1.1;
        System.out.println(l);

        byte b1 = 7; // 0000 0111
        short s1 = 7; // 0000 0000 0000 0111

        //1 - 0000 0001
        // -1 - 1111 1111
        // 1111 0011 -13



    }
}
