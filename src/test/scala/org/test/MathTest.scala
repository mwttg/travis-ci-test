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
    "subtract one number from another number" in {
      Math.sub(10, 5) shouldBe 5
    }
  }
}
