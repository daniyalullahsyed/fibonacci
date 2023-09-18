package Assignment1;

class fibonacci {
    static int fib(int f)
    {
        if (f <= 1)
            return f;

        return fib(f - 1) + fib(f - 2);
    }
    public static void main(String args[])
    {
        int n = 10;

        for (int i = 0; i < n; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}