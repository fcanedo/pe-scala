package com.github.fcanedo.pescala

/**
 * What is the difference between the sum of the squares and the
 * square of the sums?
 */
object Problem006 extends EulerProblem {
    def solve(x: Int) = {
        val range = 1 to x
        val squareOfSum = math.pow(range.sum, 2)
        val sumOfSquares = range.map(math.pow(_, 2)).sum

        math.abs(squareOfSum - sumOfSquares).toInt
    }
    override def solution = solve(100)
    def small = solve(10)
}
