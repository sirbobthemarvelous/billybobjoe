#time to open files
#filehandle = open(filename, mode)
#filename is string, mode is r for reading, w for writing
#has to be in same folder as python code
gasp = 'sup\nSucker'
print gasp #\n is considered a single character and causes a line jump
fandub = open('copypasta.txt')
count=0
for callout in fandub: #its a textfile which is basically an array of lines
	count= count+1
	print callout
print 'total lines:'+ str(count)
print fandub.read() #if you really want to read the whole file all at once
print len(fandub.read()) #the character length of the file
#you could use startswith to find specific lines to print, and rstrip to takeaway the \n
fname = raw_input('Enter the filename:')
try:
	fhand = open(fname)
except: 
	print 'File cannot be opened:', fname
	exit()