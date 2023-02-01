package Lesson_3_Udemy;

public class Lesson_3_resolve {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long L1 = 20l;
        double result = 0;
        result = i2/d1+d2%i1-L1;
        System.out.println(result);

        int a = 5, b;

        b = a-- - --a + ++a + a++ + a;

        System.out.println(b);

        int c=8, d;

        d = ++c - c++ + ++c - --c;

        System.out.println(d);




    }

}
