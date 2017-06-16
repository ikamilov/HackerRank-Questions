read a
read b
read c

if [ $a = $b ] && [ $a = $c ]; then
    echo "EQUILATERAL"
elif [ $a = $b ] || [ $b = $c ]; then
    echo "ISOSCELES"
elif [ $c > $b ] && [ $b > $a ]; then
    echo "SCALENE"

fi
