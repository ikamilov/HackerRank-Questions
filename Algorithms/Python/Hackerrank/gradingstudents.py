#!/bin/python3

import sys

def solve(grades):
    # Complete this function
    for grade in grades:
        x = grade % 5
        y = grade + (5 - x)
        z = y - grade
        if y >= 40:
            if z < 3:
                print(y)
            else:
                print(grade)
        else:
            print(grade)

n = int(input().strip())
grades = []
grades_i = 0
for grades_i in range(n):
   grades_t = int(input().strip())
   grades.append(grades_t)
result = solve(grades)
print ("\n".join(map(str, result)))


