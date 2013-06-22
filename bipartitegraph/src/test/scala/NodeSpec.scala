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
      val graph = new Node(1)
      graph.addChild(new Node(2))
      // お遊びでtoStringのオーバーライド
      graph.toString must_== "node value : 1"
      graph.child.toString must_== "List(node value : 2)"
    }
  }
}
