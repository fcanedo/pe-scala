package com.github.fcanedo.pescala

import com.github.fcanedo.pescala.ProjectEulerUtilities.primes

/**
 * Find the 10001st prime.
 */
object Problem007 extends EulerProblem {
	def solve(x: Int) = {
		// zero-based index
		primes(x - 1)
	}

	override def solution = solve(10001)
	def small = solve(6)
}
