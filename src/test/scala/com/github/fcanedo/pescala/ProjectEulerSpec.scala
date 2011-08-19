package com.github.fcanedo.pescala

import org.specs2.mutable.Specification

class ProjectEulerSpec extends Specification {
    "Solutions of (small versions of) Euler problems" should {
        "be 23 for Problem 1" in {
            Problem001.small === 23
        }
        "be 44 for Problem 2" in {
            Problem002.small === 44
        }
        "be 29 for Problem 3" in {
            Problem003.small === 29
        }
        "be 9009 for Problem 4" in {
            Problem004.small === 9009
        }
        "be 2520 for Problem 5" in {
            Problem005.small === 2520
        }
        "be 2640 for Problem 6" in {
            Problem006.small === 2640
        }
	    "be 13 for Problem 7" in {
		    Problem007.small === 13
	    }
	    "be 60 for Problem 9" in {
		    Problem009.small === 60
	    }
	    "be 17 for Problem 10" in {
		    Problem010.small === 17
	    }
	    "be 28 for Problem 12" in {
		    Problem012.small === 28
	    }
    }

	"Solutions of Euler problems" should {
		"be 233168 for Problem 1" in {
			Problem001.solution === 233168
		}
		"be 4613732 for Problem 2" in {
			Problem002.solution === 4613732
		}
		"be 6857 for Problem 3" in {
			Problem003.solution === 6857
		}
		"be 906609 for Problem 4" in {
			Problem004.solution === 906609
		}
		"be 232792560 for Problem 5" in {
			Problem005.solution === 232792560
		}
		"be 25164150 for Problem 6" in {
			Problem006.solution === 25164150
		}
		"be 104743 for Problem 7" in {
			Problem007.solution === 104743
		}
		"be 40824 for Problem 8" in {
			Problem008.solution === 40824
		}
		"be 31875000 for Problem 9" in {
			Problem009.solution === 31875000
		}
		"be 142913828922 for Problem 10" in {
			Problem010.solution === 142913828922l
		}
		"be 70600674 for Problem 11" in {
			Problem011.solution === 70600674
		}
		"be 76576500 for Problem 12" in {
			Problem012.solution === 76576500
		}
		"be 5537376230 for Problem 13" in {
			Problem012.solution === 5537376230
		}
	}
}