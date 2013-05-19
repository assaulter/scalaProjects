/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */

package com.example.foodchain

import org.specs2.mutable.Specification

class InformationSpec extends Specification {
  "The Information object" should {
    "create data with type" in {
      Information(LifeType.EAT, 1, 2).lifeType must beEqualTo(LifeType.EAT)
    }
  }
}
