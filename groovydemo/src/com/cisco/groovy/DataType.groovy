package com.cisco.groovy

def a=10
def b=10.24F

println a
println a.class
println b
println b.class

s='Hello'
println s

name="Arup"
s="Hello ${name}"
println s

s='''
I'm selfish, impatient and a little insecure. 
I make mistakes, I am out of control and at times 
hard to handle. But if you can't handle me at 
my worst, then you sure as hell don't deserve me 
at my best.
'''
println s

emailPattern=/[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+/
print "test@hotmail.com" ==~emailPattern
