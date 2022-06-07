import pytest
import math

def test_add():
   num1 = 5
   num2 = 5
   sum = num1 + num2
   assert sum == 10

def test_diff():
   num1 = 25
   num2 = 5
   dif = num1 - num2
   assert dif == 20
  
def test_multiply():
   num1 = 25
   num2 = 5
   product = num1 * num2
   assert product == 125

def test_divide():
   num1 = 25
   num2 = 5
   ans = num1 / num2
   assert ans == 5