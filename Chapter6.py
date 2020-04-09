#strings time
word = 'owo what dis'
letter = word[1] #letter will be w, strings can be arrays basically
print len(word) #len is a function that gives length
#you can loop through strings like arrays
for yeet in 'owo':
	print yeet
#loop above will print out the whole word
print word[0:4] #substring thing, first one included, second one not
#if the second one is past the entire string then it'll just stop
print word[:2] # from beginning to not including second one
print word[5:] # from first number included, to the end
print word[:] #thats just the entire string
'owo' in word #it will return true, in operator finds if 
# a specific string is within this other string
# > or < strings is weird and depends on language
# == just means same characters in the same order and stuff
print 'aMbItIoUs NeW sHoW'.lower() #makes the string lowercase
print dir(word) #dir lets you ask what are all the built in functions in python
# since word is a string, it gives you all the string stuff
#docs.python.org/lib/string-methods.html
print word.find('owo') #it'll return the index of the thing found
print word.replace('owo', 'uwu') #replace a thing with another
#stuff for stripping white space: lstrip() rstrip() and strip()
print word.startswith('owo') #it'll give true or false
#you can use find function like find(thing ur looking for, where to start at)