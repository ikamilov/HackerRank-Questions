for i in range(int(input())):
	triangle = list(map(int, input().split()))
	if triangle[0] == 180 or triangle[1] == 180 or triangle[2] == 180:
		print("NO")
	elif (triangle[0] + triangle[1] + triangle[2]) == 180:
		print("YES")
	else: 
		print("NO") 
