#loops, watch out for infinite loops
while True: #oh look infinity
	line = raw_input('> ')
	if line[0] == '#':
		continue #new word, means it throws you back to the 
		#beginning of the loop, without finishing ur current thing
	if line == 'yeet':
		break #new word, means you end the loop completely
	print line
print 'Yeeted'
#indefinite loops will end, but we dont know when
#definite loops will end and we can logically figure out exactly when, cuz its in a set
for f in [69,420,413,612,8888]: #for loops goes through a set
	print f #for variable for each thing in a set
print 'done'
# you can create a finding a largest number loop with an if statement in loop
#you can count the placement in a loop
#find totals, find averages
# we could add extra efficiency filtering if you want
#you could use an outside boolean variable
smallest = None #new word, a new type that is just void and can be reinstantiated
if smallest is None: #is and is not are operators that refer to same type and value
	print 'something'
if smallest is not None: #its like a stronger ==, best used for checking special values
	print 'nothing'