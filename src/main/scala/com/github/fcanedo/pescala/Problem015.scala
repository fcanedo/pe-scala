package com.github.fcanedo.pescala

/*
 * Starting in the top left corner in a 20 by 20 grid, how many routes are there to the bottom right corner?
 */
object Problem015 extends EulerProblem {
	def solve(x: Int) = {
		/* Permutations of a bag with x blue balls and x red balls
		 * (x * 2)! / x! / x! */
		val equalPermutations = (BigInt(1) to BigInt(x)).product
 		(BigInt(1) to BigInt(2 * x) product) / equalPermutations / equalPermutations

 	}

	override def solution = solve(20)
	def small = solve(2)
}
