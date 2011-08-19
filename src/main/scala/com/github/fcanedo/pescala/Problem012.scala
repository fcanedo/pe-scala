package com.github.fcanedo.pescala

import collection.Iterator

import com.github.fcanedo.pescala.ProjectEulerUtilities.factorExponents

/**
 * What is the value of the first triangle number to have
 * over five hundred divisors?
 */
object Problem012 extends EulerProblem {
	def divisors(x: Int) = {
		// the product of the (exponents + 1) of the prime factors =
		// the number of divisors
		factorExponents(x).values map { _ + 1 } product
	}

	def solve(x: Int) = {
		val index = Stream.iterate(1)(_ + 1)
		val tNumbers = index.map { x => x * (x + 1) / 2 }
		val result = tNumbers.find(divisors(_) > x)
		result.get
	}
	override def solution = solve(500)
	def small = solve(5)
}
