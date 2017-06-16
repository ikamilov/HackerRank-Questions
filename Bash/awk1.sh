awk '{
if($2=="" || $3=="" || $4=="")
print "Not all scores available for", $1
'}
