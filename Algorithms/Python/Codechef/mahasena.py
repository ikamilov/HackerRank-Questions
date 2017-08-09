i = int(input())
soldiers = input().split()
even = 0
odd = 0
for soldier in soldiers:
	if int(soldier) % 2 == 0:
		even += 1
	else:
		odd += 1
if even > odd:
	print("READY FOR BATTLE")
elif even == odd:
	print("NOT READY")
else:
	print("NOT READY")
