package org.test

import org.scalatest.{Matchers, WordSpec}

class MathTest extends WordSpec with Matchers {
  "Math" should {
    "add two numbers" in {
      Math.add(2, 3) shouldBe 5
    }
    "multiply two number" in {
      Math.mul(2, 3) shouldBe 6
    }
    "divide two numbers" in {
      Math.div(4, 2) shouldBe 2
    }
    "a test that fail (for checking PR buildings)" in {
      3 shouldBe 2
    }
  }
}
