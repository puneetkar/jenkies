import pytest

from app.mathy import add, div


def test_add_integers():
    assert add(2, 3) == 5


def test_add_floats():
    assert add(2.5, 3.5) == 6.0


def test_div_normal():
    assert div(10, 2) == 5


def test_div_float():
    assert div(3, 2) == 1.5


def test_div_zero_raises():
    with pytest.raises(ZeroDivisionError):
        div(1, 0)

