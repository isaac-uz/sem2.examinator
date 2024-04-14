from typing import Optional

def extended_gcd(a: int, b: int) -> tuple:
    """Extended Euclidean Algorithm to find gcd(a, b) and x, y such that ax + by = gcd(a, b).

    Args:
      a: int, the first number.
      b: int, the second number.

    Returns:
      tuple, (gcd(a, b), x, y)
    """
    if b == 0:
        return a, 1, 0
    else:
        gcd, x, y = extended_gcd(b, a % b)
        return gcd, y, x - (a // b) * y

def modular_inverse(a: int, m: int) -> Optional[int]:
    """Returns the modular inverse if it exists for the given integer a and the modulo m.
    Otherwise returns None.

    Args:
      a: int, the factor.
      m: int, the modulo.

    Returns:
      Optional[int], the modular inverse.
    """
    gcd, x, y = extended_gcd(a, m)
    if gcd == 1:
        return x % m
    else:
        return None