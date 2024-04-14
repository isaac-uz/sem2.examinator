def find_gcd(a: int, b: int) -> int:
    """Returns the greatest common divisor of two given numbers using Euclidean algorithm."""
    while b:
        a, b = b, a % b
    return a

def find_lcm(a: int, b: int) -> int:
    """Returns the least common multiple of two given numbers.

    Args:
      a: int, the first number.
      b: int, the second number.

    Returns:
      int, the least common multiple.
    """
    return (a * b) // find_gcd(a, b)