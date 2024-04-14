import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    /**
     * @param n the number for factorization, n >= 2
     * @return the map where the key is a factor and the value is a power of the factor
     */
    public static Map<Integer, Integer> getFactors(int n) {
        Map<Integer, Integer> factors = new LinkedHashMap<>();

        int divisor = 2;
        while (n >= 2) {
            if (n % divisor == 0) {
                if (!factors.containsKey(divisor)) {
                    factors.put(divisor, 0);
                }
                factors.put(divisor, factors.get(divisor) + 1);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        return factors;
    }
}