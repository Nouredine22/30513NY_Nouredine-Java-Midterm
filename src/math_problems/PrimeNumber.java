package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        printPrim(2,1000000);

    }

//   print prime number begin int start to int end

    static void printPrim(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.println(i + " ");
        }
    }

//    isPrime method return true if int number is prime

    private static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {//O(sqrt(n))
            if (number % i == 0) return false;
        }

        return true;

    }

}



