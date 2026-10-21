// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "median when size=1" {
        median(listOf(10f)) shouldBe 10f
    }
    
    "median when size = 2"{
        median(listOf(3f, 5f)) shouldBe 4f
    }

    "median when size = 3" {
        median(listOf(3f, 5f, 7f)) shouldBe 5f
    }

    "median when size = 4" {
        median(listOf(4f, 1f, 2f, 3f)) shouldBe 2.5f
    }
})
