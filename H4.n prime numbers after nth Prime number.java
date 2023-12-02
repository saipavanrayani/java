import java.util.Scanner;

public class NPrimesAfterNthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find the nth prime number
        int nthPrime = findNthPrime(n);

        // Output
        System.out.println("The " + n + "th prime number is: " + nthPrime);
        System.out.println("The next " + n + " prime numbers are:");

        // Find and print the next n prime numbers
        printNPrimes(nthPrime, n);
    }

    // Function to find the nth prime number
    private static int findNthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to print the next n prime numbers after a given prime number
    private static void printNPrimes(int start, int n) {
        int count = 0;
        int num = start + 1;

        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
OUTPUT:

C:\Users\VAISHNAVI.R\OneDrive\Documents>javac NPrimesAfterNthPrime.java

C:\Users\VAISHNAVI.R\OneDrive\Documents>java NPrimesAfterNthPrime
Enter the value of n: 11
The 11th prime number is: 31
The next 11 prime numbers are:
37
41
43
47
53
59
61
67
71
73
79
