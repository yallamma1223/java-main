class Operators {

    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // unary operators
        // incremanet operators
        // System.out.println(a);// 12
        // System.out.println(a++);// 12
        // System.out.println(++a);// 14
        // System.out.println(a);// 14
        // decrement operators

        // System.out.println(--a);// 11
        // System.out.println(a--);// 11
        // System.out.println(a);// 10

        // relation operators
        System.out.println(a == b);// 12 == 15 false
        System.out.println(a != b);// != true
        System.out.println(a > b);// > false
        System.out.println(a < b);// < true
        System.out.println(a <= b);// >= true
        System.out.println(a >= b);// <=false

        // logical operators
        System.out.println(a < b && a >= b);// &&
        System.out.println(a <= b || a > b);// ||
        System.out.println(a < b || a > b);// ||
        /*
         * true =true #true everything false for&& returs true if one statment is true
         * for ||
         */
        // REALATIONAL OPERATORS

        b *= 2;
        System.out.println(b);//
        int k = --a + a++;
        System.out.println(k);//

    }

}// 11+11