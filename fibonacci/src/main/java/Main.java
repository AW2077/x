public class Main {

    private static int fibonacci_r(int a, int b, int n) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibonacci_r(b, a + b, n - 1);
    }

    private static int fibonacci_i(int a, int b, int n) {
        while (true) {
            if (n == 0) {
                return a;
            }
            if (n == 1) {
                return b;
            }
            int tmp = a;
            a = b;
            b = tmp + b;
            n = n - 1;
        }
//        return fibonacci_r(b, a + b, n - 1);
    }

    public static int fibonacci_r(int n) {
        return fibonacci_r(0, 1, n);
    }

    public static int fibonacci_i(int n) {
        return fibonacci_i(0, 1, n);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (fibonacci_r(i) != fibonacci_i(i)) {
                System.out.println("Różne!!!");
            }
        }
    }
}
