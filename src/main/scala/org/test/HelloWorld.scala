package org.test

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println(s" 2 + 3 = ${Math.add(2, 3)}")
    println(s" 2 * 3 = ${Math.mul(2, 3)}")
  }
}
