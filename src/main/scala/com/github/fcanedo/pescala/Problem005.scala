package com.github.fcanedo.pescala

import scala.collection.mutable.Map

import com.github.fcanedo.pescala.ProjectEulerUtilities.factorExponents

/**
 * What is the smallest number divisible by each of the numbers 1 to 20?
 */
object Problem005 extends EulerProblem {
    def solve(x: Int) = {
        val factors = Map[Long, Long]()

	    /* find all the prime factors of each of the numbers in question
	     * for each prime, keep the one with the largest exponent */
        (1 to x).flatMap(factorExponents(_)).foreach(f => factors(f._1) =  (f._2 max factors.getOrElse(f._1, 0)))

	    /* the prime factors that are left, are the prime factors of the
	     * number we're looking for */
        factors.map(f => math.pow(f._1, f._2)).product.toInt
    }

    override def solution = solve(20)
    def small = solve(10)
}
