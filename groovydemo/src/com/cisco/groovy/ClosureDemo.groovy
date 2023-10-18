package com.cisco.groovy

LinkedList l=[1,2,3]
print l
println()
println l.class
println()
l<<4

println l
println()
l=l+[5,6,7]
println l
println()
println l-[3,5]
println()
l.forEach { print it }
println()
l.reverseEach { print it }
println()
//l.eachPermutation { println it }

//Set

s=['java','js','python'] as Set
println s
println s.class

//map

m1=[:]

println m1
println m1.class

m2=[CourseName:'Gradle',Rating:5,Price:20]

println m2
println m2.class
