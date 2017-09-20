arr1 = [5,4,1,3, 2]
arr2 = [12,3,15,1,7]

new_list = []
for element in arr1:
	if element in arr2:
		new_list.append(element)
print(new_list)