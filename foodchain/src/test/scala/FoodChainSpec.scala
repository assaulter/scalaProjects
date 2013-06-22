/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */

package com.example.foodchain

import org.specs2.mutable._
import org.specs2.specification.Scope

class FoodChainSpec extends Specification {
  "The FoodChain object" should {
    "validate information" in {
      val info = Information(LifeType.EAT, 10, 10)
      val info2 = Information(LifeType.SAME, 4, 4)
      val foodChain = new FoodChain(5, Array(info))

      foodChain.validateInfo(info) must beTrue
      foodChain.validateInfo(info2) must beFalse
    }
    "solve textbook example" in {
      val informations = Array(
        Information(LifeType.SAME, 101, 1),
        Information(LifeType.EAT,  1,   2),
        Information(LifeType.EAT,  2,   3),
        Information(LifeType.EAT,  3,   3),
        Information(LifeType.SAME, 1,   3),
        Information(LifeType.EAT,  3,   1),
        Information(LifeType.SAME, 5,   5)
      )
      val foodChain = new FoodChain(100, informations)

      foodChain.solver() must_==3
    }
  }
}
