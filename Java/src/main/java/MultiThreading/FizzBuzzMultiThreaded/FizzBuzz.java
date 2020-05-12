package MultiThreading.FizzBuzzMultiThreaded;

import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        if (n % 3 == 0)
            printFizz.run();
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {

        if (n % 5 == 0)
            printBuzz.run();

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

        if (n % 3 == 0 && n % 5 == 0)
            printFizzBuzz.run();

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        System.out.println(printNumber);
    }
}