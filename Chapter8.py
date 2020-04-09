#lists, aka collections aka arrays
friends = ['Sammy','Richard','Luna']
#you could put anything in a list or nothing
print friends[2] #you'll get Luna
#Lists are Mutable aka the things in them can be changed
friends[0] = 'Sam Reddick' #replace Sammy with sam
print len(friends) #ya get 3
print range(4) #ya get 0,1,2,3
# this new thing is good for getting the indexes of a List
#you can concatenate Lists with +
#Lists can be sliced like a substring
print dir(friends) #use dir to find all the List methods already there
#add more to a list
theBarn = list()
theBarn.append('Lapis')
theBarn.append(69)
print theBarn
print 69 in theBarn #in is a boolean used for Arrays
print 'peridot' in theBarn
print theBarn.sort() #sort() sorts anything
speak = 'Shadow the Hedghog is a'
print speak.split() #split turns a string into a List of words
rude = 'no ma/ps or ter/fs allowed'
print rude.split('/') # you can specify a delimiter to count as a space