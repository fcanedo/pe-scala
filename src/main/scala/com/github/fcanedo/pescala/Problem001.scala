package com.github.fcanedo.pescala

/**
 * Add all the natural numbers below one thousand that are
 * multiples of 3 or 5.
 */
object Problem001 extends EulerProblem {
    def solve(x: Int) = {
        val multiplesOf3 = List.range(0, x, 3)
        val multiplesOf5 = List.range(0, x, 5)

	    // A set does not contain duplicates
        (multiplesOf3 ::: multiplesOf5).toSet.sum
    }

    override def solution = solve(1000)
    def small = solve(10)
}
