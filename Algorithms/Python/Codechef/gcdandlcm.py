def gcd(x, y):

   while(y):
       x, y = y, x % y

   return x

def lcm(x, y):

   lcm = (x*y)//gcd(x,y)
   return lcm

for test in range(int(input())):
	x,y = map(int, input().split())
	print(str(gcd(x,y)) + " " + str(lcm(x, y)))
