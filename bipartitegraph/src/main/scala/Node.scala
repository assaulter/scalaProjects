/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

// 頂点を表す数字と中身のオブジェクトを引数に取る、Nodeを表すクラス
class Node[A] (vertexNum: Int, value: A) {
  // 自分とつながっているノードをリストで表現
  var child: List[Node[A]] = List()

  def addChild(node: Node[A]) {
    child = node::child
  }

  override def toString = "node value : " + value.toString

  def getValue: Option[A] = value match {
    case null | "" => None
    case _ => Some(value)
  }

}
