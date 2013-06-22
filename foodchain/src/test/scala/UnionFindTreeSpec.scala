/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
package com.example.foodchain

import org.specs2.mutable._
import org.specs2.specification.Scope

class UnionFindTreeSpec extends Specification {
  "The UnionFindTree" should {
    "create parent Array with sequential numbers" in new scope {
      unionFindTree.parent(9) must beEqualTo(9)
    }
    "create rank Array with 0 numbers" in {
      new UnionFindTree(10).rank(9) must beEqualTo(0)
    }
    "create two group" in {
      val unionFindTree = new UnionFindTree(5)
      unionFindTree.unite(1,2)
      unionFindTree.same(1,2) must beTrue
    }
  }

  //特定の事前処理を行いたい場合には、トレイトを作成する
  trait scope extends Scope {
    val unionFindTree = new UnionFindTree(10)
  }
}
