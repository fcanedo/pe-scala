package com.github.fcanedo.pescala

object Problem017 extends EulerProblem {
	def writeNumber(x: Int) = {
		val singles = Array("", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen")
		val tens = Array("", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

		val xThousand = x / 1000
		var remainder = x % 1000
		val xHundred = remainder / 100
		remainder = remainder % 100
		val xTen = remainder / 10

		(x / 1000 match {
			case 0 => ""
			case r => singles(r) + "thousand"
		}) +
		(x % 1000 / 100 match {
			case 0 => ""
			case r => singles(r) + "hundred"
		}) +
		(x % 100 match {
			case 0 => ""
			case r if r < 20 => (if(x > 99) "and" else "")  + singles(r)
			case r => (if(x > 99) "and" else "") + tens(r / 10) + (r % 10 match {
				case 0 => ""
				case r => singles(r)
			})
		})
	}

	def solve(x: Int) = {
		(1 to x).map(writeNumber(_)).mkString.length
	}

	override def solution = solve(1000)
	def small = solve(5)
}
