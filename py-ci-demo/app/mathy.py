def add(a, b):
    """Return the sum of a and b."""
    return a + b


def div(a, b):
    """Return a divided by b. Raises ZeroDivisionError if b is 0."""
    if b == 0:
        raise ZeroDivisionError("division by zero")
    return a / b

