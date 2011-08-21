package com.github.fcanedo.pescala

/**
 * What is the sum of the digits of the number 2^1000?
 */
object Problem016 extends EulerProblem {
	def solve(x: Int) = {
		List.fill(x)(BigInt(2)).product.toString.map(_.toString.toInt).sum
	}

	override def solution = solve(1000)
	def small = solve(15)
}
