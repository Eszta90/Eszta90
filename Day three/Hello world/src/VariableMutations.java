public class VariableMutations {

    public static void main(String[] args) {
        int a = 3;
        a += 10;

        System.out.println(a);

        int b = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);


        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        Math.pow(e, 3);

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger1 = false;

        if (f1 > f2) {
            bigger1 = true;
        }
        System.out.println(bigger1);

        int g1 = 350;
        int g2 = 200;

        boolean bigger2 = false;

        if (g2 * 2 > g1) {
            bigger2 = true;
        }

        System.out.println(bigger2);

        int h = 135798745;

        boolean divisor = false;
        if (h%11 == 0) {
            divisor = true;
        }
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;

        boolean HigherSmaller = false;

        if ( i1 > Math.pow(i2,2) && i1<Math.pow(i2,3)) {
            HigherSmaller = true;
        }
        System.out.println(HigherSmaller);

        int j = 1521;

        boolean dividable = false;
        if (j%3==0 || j%5==0) {

            dividable = true;
        }

        System.out.println(dividable);

        String k = "Apple";

        for (int i=0; i<4; i++){
            System.out.print(k);
        }


    }
}