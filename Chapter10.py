#tuples here we go, they are a collection, immutable list
#literal uses parentheses
tulip = ('Lake','Atticus','One-one')
#tuples cant have parts change
#cant sort, cant add or reverse
dir(tulip) #you can only have count or index
#Tuples are faster
(parenial,cracked)=('Child','Reflection')
#you can do that and it basically makes a dictionary
#each thing in the item() is a tuple
#Tuples are comparable, going from the leftmost to the rightmost
print (0,1,2) < (1,5,0) #it'll print true
#you can still sort LISTS of tuples
lumps = [('yeet',50),('skeet',420),('arpi',9)]
print lumps.sort(reverse=True) #reverse=True reverses the order
#or
print sorted(lumps)
#if you want to sort by values instead of key you're gonna have to make a temporary reversed list
#you can use square brackets to create a dynamic list within the brackets in one line
