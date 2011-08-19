package com.github.fcanedo.pescala

import com.github.fcanedo.pescala.ProjectEulerUtilities.primes

/**
 * Calculate the sum of all the primes below two million.
 */
object Problem010 extends EulerProblem {
	def solve(x: Int) = {
		primes takeWhile {_ < x} sum
	}

	override def solution = solve(2000000)
	def small = solve(10)

}
