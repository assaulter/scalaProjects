/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

// 隣接行列のリストを受ける
class BipartiteGraph (graph: Array[Node]) {

  // 幅優先探索でgraphを探索する(再帰関数)
  // 頂点vertexをblackで塗って、隣接するやつをwhiteで塗る
  def paint(vertexNum: Int, color: String): Boolean = {
    var result = true

    val vertex = graph(vertexNum)
    vertex.color = color
    // vertexに隣接するNodeを塗る(副作用があるunk map)
    vertex.child.map { child =>
      // 既に同じ色で塗られてたらアウト
      if (child.color == color) {
        result = false
      }
      // 塗られてなかったら、逆の色で塗る
      if (child.color == "") {
        result = paint(child.getVertexNum, reverseColor(color))
      }
    }

    result
  }

  // for-yieldで書きなおす
  def recPaint(vertexNum: Int, color: String): Boolean = {

    val vertex = graph(vertexNum)
    // for-yieldで書きなおす
    for{
      child <- vertex.child
      if (child.color == color)
    } yield child

    true
  }

  // 同じ色で塗られているかどうか
  def isSameColor(vertexChild: List[Node], color: String): Boolean = {
    val sameColorChild = for {
      child <- vertexChild
      if (child.color == color)
    } yield child

    if (sameColorChild.length != 0) true else false
  }

  def solve(): Boolean = {
    var result = true

    graph.foreach { node =>
      // 塗られてなかったら塗る
      if (node.color == "") {
        result = paint(node.getVertexNum, "black")
      }
    }

    result
  }

  def reverseColor(color: String) = {
    color match {
      case "black" => "white"
      case _ => "black"
    }
  }
}
