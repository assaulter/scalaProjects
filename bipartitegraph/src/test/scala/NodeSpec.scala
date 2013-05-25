/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

import org.specs2.mutable._

class NodeSpec extends Specification {
  "The Node Class" should {
    "could add child and show display" in {
      val graph = new Node[String](1, "green")
      graph.addChild(new Node[String](2, "black"))
      // お遊びでtoStringのオーバーライド
      graph.toString must_== "node value : green"
      graph.child.toString must_== "List(node value : black)"
      // 値がnull、もしくは空文字の場合はNoneを返す
      val emptyNode =  new Node[String](3, "")
      emptyNode.getValue must beNone
    }
  }
}
