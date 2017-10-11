for test in range(int(input())):
	x1, y1, x2, y2 = input().split()
	x1,y1,x2,y2 = int(x1), int(y1), int(x2), int(y2)
	if x1 == x2:
		if y1 < y2:
			print("up")
		else:
			print("down")
	elif y1 == y2:
		if x1 < x2:
			print("right")
		else:
			print("left")
	else:
		print("sad")