grep -e '\(^[0-9]\{3\}-[0-9]\{3\}-[0-9]\{4\}$\)' -e '\(^([0-9]\{3\})[ ]\{1\}[0-9]\{3\}-\([0-9]\{4\}\)$\)'  file.txt

# In Bash, we use \ to escape next one trailing character;
# ^ is used to denote the beginning of a line
# $ is used to denote the end of a line
# {M} is used to denote to match exactly M times of the previous occurence/regex
# (...) is used to group pattern/regex together
# Back to this problem: it requires us to match two patterns, for better readability, I used -e and separate the two patterns into two regexes, the first one matches this case: xxx-xxx-xxxx and the second one matches this case: (xxx) xxx-xxxx


