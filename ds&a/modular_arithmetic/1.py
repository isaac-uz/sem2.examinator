from typing import List
from math import gcd

def modular_linear(a: int, b: int, m: int) -> List[int]:
    """Returns the list of roots of a modular linear equation ax ≡ b (mod m).

    Args:
      a: int, the factor.
      b: int, the product.
      m: int, the modulo.

    Returns:
      List[int], the list of roots.
    """
    roots = []
    # Calculate gcd of a and m
    d = gcd(a, m)
    # If b is divisible by gcd(a, m), then there are solutions
    if b % d == 0:
        # Find one solution
        x0 = pow(a // d, -1, m // d) * (b // d) % (m // d)
        # Add all solutions by adding multiples of m // d
        for i in range(d):
            roots.append((x0 + i * (m // d)) % m)
    return roots