#regular Expressions, weird program thing
#the regular expressions cheatsheet
import re
#use re.search() to see if a string matches with a regular expression
#re.findall() extracts part of a string that match a regular expression
realTime = open('copypasta.txt')
for line in realTime:
	line = line.rstrip() #take out the end of line whitespace and \not
	if re.search('And ',line):
		print line #only print lines with And