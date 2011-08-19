package com.github.fcanedo.pescala

import annotation.tailrec

/**
 * Provides utility methods for solving projecteuler.net problems
 */
object ProjectEulerUtilities {
	/**
	 * Determines the prime factors of a natural number
	 *
	 * @param x the natural number to be factorized
	 * @return a list of prime factors from low to high (with repeats)
	 */
    def factor(x: Long): List[Long] = {
        factor(x, 2)
    }

    private def factor(x: Long, thisFactor: Long): List[Long] = {
        x match {
            case 1 => Nil
            case _ => x % thisFactor match {
                case 0 => thisFactor :: factor(x / thisFactor, thisFactor)
                case _ => factor(x, if (thisFactor == 2) 3 else thisFactor + 2)
            /* Normally we'd try to find the next prime here, but  the algorithm
             * automatically discards non-primes anyway. As an optimization, we
             * skip even numbers */
            }
        }
    }

	/**
	 * Determines the prime factors of a natural number
	 *
	 * @param x the natural number to be factorized
	 * @return a map of prime factors (key) and its exponent (value)
	 */
    def factorExponents(x: Long) = {
        val map = scala.collection.mutable.Map[Long, Long]()
        factor(x).foreach(i => if (map.contains(i)) map.put(i, map(i) + 1) else map.put(i, 1))

        map
    }

	/**
	 * A lazy list of the primes, starting at 2
	 */
	val primes = Stream.cons(2l, sieve(3l))

	private def sieve(n: Long): Stream[Long] = {
		if (primes takeWhile {p => p*p <= n} exists {n % _ == 0}) sieve(n + 2)
		else Stream.cons(n, sieve(n + 2))
	}
}
