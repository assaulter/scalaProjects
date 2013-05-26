/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

import org.specs2.mutable._

class BipartiteGraphSpec extends Specification {
  "solve method" should {
    "return false at this question" in {
      val graph = Array.range(0,4).map(
        (i:Int) => {new Node(i)}
      )

      graph(0).child = List(graph(1), graph(2))
      graph(1).child = List(graph(0), graph(2))
      graph(2).child = List(graph(0), graph(1))

      val bip = new BipartiteGraph(graph)
      bip.solve() must beFalse
    }
  }
}
