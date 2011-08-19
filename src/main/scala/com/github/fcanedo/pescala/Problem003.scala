package com.github.fcanedo.pescala

import ProjectEulerUtilities._

/**
 * Find the largest prime factor of a composite number.
 */
object Problem003 extends EulerProblem {
    def solve(x: Long): Long = {
        factor(x).last
    }

    override def solution = solve(600851475143l)
    def small = solve(13195)
}
