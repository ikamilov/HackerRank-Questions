read n

for((i=0; i<$n; i++)); 
do
	read num1
	sum=$((sum+num1))
done
printf "%.3f\n" $(echo "$sum/$n" | bc -l)
