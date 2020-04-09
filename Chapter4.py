def hello(): #defining a new function
	print 'hello'
	print 'its me'
hello() #activating this new function
def greet(lang): #functions sometimes have inputs
	if lang== "en":
		print 'hello'
	elif lang== 'es':
		print 'hola'
	else:
		print 'what'
print greet('bleh'),"you egg" #use a comma to concatenate function and string
def addtwo(a,b):
	added =a+b
	return added #oh would u look at that
