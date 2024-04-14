def mod_exp(a: int, b: int, m: int) -> int:
    """Returns a in power b by modulo m

    Args:
      a: int, the number.
      b: int, the power.
      m: int, the modulo.

    Returns:
      int, a ^ b (mod m).
    """
    if m == 1:
        return 0

    result = 1
    a = a % m

    while b > 0:
        if b % 2 == 1:
            result = (result * a) % m
        b //= 2
        a = (a * a) % m

    return result