package com.github.fcanedo.pescala

/**
 * Find the only Pythagorean triplet, {a, b, c},
 * for which a + b + c = 1000.
 */
object Problem009 extends EulerProblem {
	def solve(x: Int) = {
		(for {
			c <- 1 to x
			b <- 1 to (c - 1)
			a = x - b - c
			if (a < b)
			if (a*a + b*b == c*c)
		} yield a * b * c) head
	}

	override def solution = solve(1000)
	def small = solve(12)
}
