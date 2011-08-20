package com.github.fcanedo.pescala

import scala.collection.mutable.Map
import annotation.tailrec
import collection.GenSeq

/**
 * Find the longest sequence using a starting number under one million.
 */
object Problem014 extends EulerProblem {
	def sequence(x: Long) = {
		Iterator.iterate(x)(n => if (n % 2 == 0) n / 2 else 3 * n + 1).takeWhile(_ != 1).toList ::: 1l :: Nil
	}

	def solve = {
		val solutions = for (i <- 1 to 999999) yield (sequence(i).length, i)
		solutions.max._2
	}

	override def solution = solve
}
