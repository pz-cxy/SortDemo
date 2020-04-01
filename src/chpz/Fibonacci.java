package chpz;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);


    }
}
