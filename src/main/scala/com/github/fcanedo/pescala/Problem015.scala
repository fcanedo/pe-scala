package com.github.fcanedo.pescala

/*
 * Starting in the top left corner in a 20 by 20 grid, how many routes are there to the bottom right corner?
 *
 * This problem reduces to: a bag containing 20 blue balls and 20 red balls, how many permutations of the
 * balls are there if you pull out all the balls randomly?
 *
 * Solution: There are 40 balls in total, 40! would be the number of permutations for 40 unique balls. Since
 * there are 2 sets of 20 balls that are equal to each other (ie. a blue ball is a blue ball), there are
 * 20! * 20! permutations that are equal to each other. Therefore: 40! / 20! / 20!
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
