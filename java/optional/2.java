import java.util.Optional;

 class Solution {
    public static Optional<String> optionalString(String inputString) {
        if (inputString.length() >= 5) {
            return Optional.of(inputString);
        } else {
            return Optional.empty();
        }
    }
}
