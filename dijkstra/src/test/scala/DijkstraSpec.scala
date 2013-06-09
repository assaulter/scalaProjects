/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/09
 * Time: 10:12
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.dijkstra

import org.specs2.mutable._

class DijkstraSpec extends Specification {

  "Dijkstra.scala toList method" should {
    "return EdgeList" in {
      val nodeArray = Array.range(0,4).map(
        (i:Int) => new Node(i)
      )

      nodeArray(0).edgeList = List(
        new Edge(nodeArray(0), nodeArray(1), 2),
        new Edge(nodeArray(0), nodeArray(2), 5)
      )
      nodeArray(1).edgeList = List(
        new Edge(nodeArray(1), nodeArray(0), 2),
        new Edge(nodeArray(1), nodeArray(2), 4),
        new Edge(nodeArray(1), nodeArray(3), 6)
      )
      nodeArray(2).edgeList = List(
        new Edge(nodeArray(2), nodeArray(0), 5),
        new Edge(nodeArray(2), nodeArray(1), 4),
        new Edge(nodeArray(2), nodeArray(3), 2)
      )
      nodeArray(3).edgeList = List(
        new Edge(nodeArray(3), nodeArray(1), 6),
        new Edge(nodeArray(3), nodeArray(2), 2)
      )

      val dijkstra = new Dijkstra(nodeArray)
      dijkstra.dijkstra(nodeArray(0))
      dijkstra.getArray(3).cost must be_==(7)
    }
  }
}
