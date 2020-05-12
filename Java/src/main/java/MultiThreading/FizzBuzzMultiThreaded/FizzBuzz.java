package MultiThreading.FizzBuzzMultiThreaded;

import java.util.function.IntConsumer;

class FizzBuzz {

    // Step1 - Create currentNum to compare to N
    private int currentNum = 1;     // Need to start from 1 ...
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // Step2 - Make every method Synchronized
    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {

        // Step3 - Create a while loop to traverse from 1 to n
        while (currentNum <= n) {

            // Step4 - Check if conditions match
            if (currentNum % 3 == 0 && currentNum % 5 != 0) {
                
                printFizz.run();
                currentNum++;

                // Step6 - Notify other threads to wake the fuck up
                notifyAll();
            } else
                wait();

        }

    }

    // Step2 - Make every method Synchronized
    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {

        // Step3 - Create a while loop to traverse from 1 to n
        while (currentNum <= n) {

            // Step4 - Check if conditions match
            if (currentNum % 5 == 0 && currentNum % 3 != 0) {
                printBuzz.run();
                currentNum++;

                // Step6 - Notify other threads to wake the fuck up
                notifyAll();
            } else
                wait();     // Pause the thread

        }
    }
    // Step2 - Make every method Synchronized
    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

        // Step3 - Create a while loop to traverse from 1 to n
        while (currentNum <= n) {

            // Step4 - Check if conditions match
            if (currentNum % 3 == 0 && currentNum % 5 == 0 ) {
                printFizzBuzz.run();
                currentNum++;

                // Step6 - Notify other threads to wake the fuck up
                notifyAll();
            } else
                wait();     // Pause the thread
        }
    }

    // Step2 - Make every method Synchronized
    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {

        // Step3 - Create a while loop to traverse from 1 to n
        while (currentNum <= n) {

            // Step4 - Check if conditions match
            if (currentNum % 3 != 0  && currentNum % 5 != 0) {
                printNumber.accept(currentNum);
                currentNum++;

                // Step6 - Notify other threads to wake the fuck up
                notifyAll();
            } else
                wait(); // Pause the thread

        }
    }
}


/**
 Note
 - Not our solution =/ but thats ok. We learn, we adapt and we move on
 - We need a while loop because our wait() requires a while loop ...
    Why ? Because notify and notifyAll can wake a thread randomly ... however the condition isnt met, hence
        We need a while loop to ensure that we only wake up a thread when its conditions are fully met
 - We know that each thread does a specific job
 Since
 Thread A will call fizz() to check for divisibility of 3 and outputs fizz.
 Thread B will call buzz() to check for divisibility of 5 and outputs buzz.
 Thread C will call fizzbuzz() to check for divisibility of 3 and 5 and outputs fizzbuzz.
 Thread D will call number() which should only output the numbers.

 Solution
 1. Create a variable currentNumber which will keep track of the current number
 2. Make every method synchronized so only one thread can access each method
 3. Create a While loop to traverse from 1 to n
 4. Each thread will check currentNumber and then check if its divisble by 3 or 5 or both
 6. If it is divisble, we notify the other threads to wake the fuck up ..
    Why ? everyone would just sleep
 7. Once each thread is woken up, if its not divisble by 3 or 5 or both, then we increment to the next number using number()


 */