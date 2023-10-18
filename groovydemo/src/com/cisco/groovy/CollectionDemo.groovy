package com.cisco.groovy

c= {
	println("Closures are supper simple.")
}

//c.call()

d= {
	n=0->
	println(n%2==0? "even":"Odd")
}

d.call(11)
4.times { n->print n }
println()
5.times { print it }
