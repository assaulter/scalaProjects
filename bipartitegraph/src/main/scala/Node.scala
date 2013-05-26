/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

// 頂点を表す数字を引数に取る、Nodeを表すクラス
class Node (vertexNum: Int) {
  // 自分とつながっているノードをリストで表現
  var child: List[Node] = List()
  var color: String = ""

  def addChild(node: Node) {
    child = node::child
  }

  def getVertexNum = vertexNum

  override def toString = "node value : %d".format(vertexNum)
}
