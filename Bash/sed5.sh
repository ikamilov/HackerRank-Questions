sed 's#\([[:digit:]]\{4\}[[:space:]]*\)\([[:digit:]]\{4\}[[:space:]]*\)\([[:digit:]]\{4\}[[:space:]]*\)\([[:digit:]]\{4\}[[:space:]]*\)#\4 \3 \2 \1 #g' | sed 's#[[:space:]]\{1,3\}# #g'
