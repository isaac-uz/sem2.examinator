import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * @param n the upper bound for primes.
     * @return the list of primes less or equal to n, where 2 <= n < 2^30 = 1073741824.
     */
    public static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        // Check for edge cases where n is less than 2
        if (n < 2) {
            return primes;
        }

        // Create a boolean array to mark non-prime numbers
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark non-prime numbers using the Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collect prime numbers into the list
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
