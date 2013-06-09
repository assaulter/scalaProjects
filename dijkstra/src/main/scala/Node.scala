/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/09
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.dijkstra

class Node(vertexId: Int) {
  // 隣接するEdgeのリスト
  var edgeList: List[Edge] = List()
  // このノードへのコスト
  var cost: Int = Int.MaxValue
  // 確定しているノードかどうか
  var isDone = false

  def getId = vertexId
}
