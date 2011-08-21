package com.github.fcanedo.pescala

/**
 * A projecteuler.net problem
 */
abstract class EulerProblem {
	/**
	 * main function for running the algorithm and print the solution
	 */
    def main(args: Array[String]) {
        printSolution
    }

	/**
	 * runs the algorithm and prints the solution
	 */
    def printSolution {
        printf("The solution for Project Euler %s is: [%s]\n",
	        this.getClass.getSimpleName.replaceAll("\\$", ""), solution.toString)
    }

	/**
	 * Implements the algorithm
	 *
	 * @return the solution
	 */
    def solution: Any
}

/**
 * Runs all the algorithms
 */
object EulerProblems {
    def main(args: Array[String]) {
        Problem001.printSolution
        Problem002.printSolution
        Problem003.printSolution
        Problem004.printSolution
	    Problem005.printSolution
	    Problem006.printSolution
	    Problem007.printSolution
	    Problem008.printSolution
	    Problem009.printSolution
	    Problem010.printSolution
	    Problem011.printSolution
	    Problem012.printSolution
	    Problem013.printSolution
	    Problem014.printSolution
	    Problem015.printSolution
	    Problem016.printSolution
	    Problem017.printSolution
	    Problem018.printSolution
    }
}
