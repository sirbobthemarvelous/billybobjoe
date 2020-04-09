#HTTP Hypertext Transport Protocol
#four layers of the internet
#transport control protocol built on top of IP (internet protocol)
#provides a nice reliable pipe to transport info from application to application
#TCP connection/pipes are called Sockets
#in computer networking, an internet socket or network socket is an endpoint of a two way street
#inter-process communication flow across and IP-based computer network
#a port is application-specific or process specific software
# lets multiple network applications to coexist on the same server
#there's a list of well-known TCP port numbers
#HTTP is for finding websites
#SSH secure Login
#HTTPS is more secure
#DNS is Domain Name
#FTP is file transer
#if host area has :url, its a test instance of a website
import socket
warlick = socket.socket(socket.AF_INET.socket.SOCK_STREAM) #its gonna be a local socket
warlick.connect(('www.py4inf.com',80)) #host name, port
#basic concept for HTTP - make connection- request document- retrieve doc- close connection
#HTTP part is protocol
#www. .com (website) is host
#page.htm is the document
#one kind of request is the GET request
#oh boy ya remember html href= its a thing
#after request, you get an HTML response
#Internet standards developed by Internet Engineering Task Force (IETF)
#www.ietf.org
#standards are called "RFCs" Requests for Comments
#https://tools.ietf.org/html/rfc7231