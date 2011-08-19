package com.github.fcanedo.pescala

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem004 extends EulerProblem {
    def solve(x: Int) = {
        val largestXDigitNumber = List.fill(x)('9').mkString.toInt
        val range = List.range(largestXDigitNumber, 0, -1)

        (for (i <- range;
            j <- range
            if (i * j).toString.reverse == (i * j).toString) yield i * j) max
    }

    override def solution = solve(3)
    def small = solve(2)
}
