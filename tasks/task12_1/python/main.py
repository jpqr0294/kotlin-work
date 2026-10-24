# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!

from point import Point

p = Point(15, 7.5)

print(p.x)
print(p.y)

print(p.distance())

p2 = Point(4.5, 7.5)

print(p.distanceTo(p2))