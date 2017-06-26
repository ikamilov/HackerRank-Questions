i=0
sed 's/[A-Z]/./' | paste -d' ' -s
while read array[$i]
do
    i=$(($i+1))
done


echo ${array[@]}  
