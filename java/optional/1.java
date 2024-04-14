import java.util.OptionalInt;

class Solution {
    public static OptionalInt optionalNumber(int number) {
        if (number % 2 == 0) {
            return OptionalInt.of(number);
        } else {
            return OptionalInt.empty();
        }
    }
}



