read size
read input
p=0
n=0
e=0
for ((i=0; i< $size; i++)) 
do
  if [ $input -gt 0 ]; then
    p=$((p+1))
  elif [ $input -lt 0 ]; then
    n=$((n+1))
  elif [ $inut == 0]; then
    e=$((e+1))
  fi
done
printf "%.6f\n" `echo "$p / $size" | bc -l`
printf "%.6f\n" `echo "$n / $size" | bc -l`
printf "%.6f\n" `echo "$e / $size" | bc -l`
