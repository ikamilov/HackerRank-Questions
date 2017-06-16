read n
cat >a
cat a |tr ' ' $'\n' |sort -n | uniq -u
