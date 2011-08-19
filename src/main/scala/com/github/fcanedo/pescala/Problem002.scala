package com.github.fcanedo.pescala

/**
 * By considering the terms in the Fibonacci sequence whose values
 * do not exceed four million, find the sum of the even-valued terms.
 */
object Problem002 extends EulerProblem {
    def solve(x: Int) = {
	    fibonacci filter {_ % 2 == 0} takeWhile {_ <= x} sum
    }

	/**
	 * Lazy list containing the elements of the fibonacci sequence
	 */
	lazy val fibonacci: Stream[Long] = 1l #:: 2l #::
			fibonacci.zip(fibonacci.tail).map { case (a, b) => a + b }
			// add up each element with the previous element

    override def solution = solve(4000000)
    def small = solve(90)
}
