from typing import Tuple

def extended_euclid(a: int, b: int) -> Tuple[int, int, int]:
    """Returns gcd and coefficients of the expression gcd(a, b) = a * x + b * y

    Args:
        a: int, the first number.
        b: int, the second number.

    Returns:
        (gcd, x, y), where gcd(a, b) = a * x + b * y.
    """
    if b == 0:
        return a, 1, 0
    else:
        gcd, x, y = extended_euclid(b, a % b)
        return gcd, y, x - (a // b) * y