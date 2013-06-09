/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/09
 * Time: 10:02
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.dijkstra

// エッジを表す。
// immutableなのでcase classで実装
case class Edge(from: Node, to: Node, cost: Int) {

  override def toString() = {
    from.getId + " - " + to.getId + " cost: " + cost
  }
}
