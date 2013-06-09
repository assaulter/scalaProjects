/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/09
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.dijkstra

//import scala.util.control.Breaks.{break, breakable}

class Dijkstra(nodeArray: Array[Node]) {

  def dijkstra(start: Node): Unit = {
    // 初期化
    start.cost = 0

    breakable { break =>
      while (true) {
        // 確定ノードを探す
        var doneNode: Node = null
        for (node <- nodeArray) {
          if (!node.isDone && (doneNode == null || node.cost < doneNode.cost)) {
            doneNode = node
          }
        }
        // 終了条件
        if (doneNode == null) break

        // 確定フラグを立てる
        doneNode.isDone = true
        // ノードに接続している情報を更新する
        for (edge <- doneNode.edgeList) {
          // edge.to.cost: ノードの接続先のコスト
          val cost = doneNode.cost + edge.cost
          if (edge.to.cost == Int.MaxValue || cost < edge.to.cost ) {
            edge.to.cost = cost
          }
        }
      }
    }
  }

  def toList(start: Node):List[Edge] = {
    var list = List[Edge]() // Edgeのリスト
    var finish = List[Node]() // 探索済みノードリスト
    listRec(start, list, finish)

    return list
  }

  def breakable(f: (=> Nothing) => Unit) {
    f({ return })
  }

  // toListから再帰的に呼ばれる
  def listRec(node: Node, list: List[Edge], finish: List[Node]):Unit = {
    breakable { break =>
      for (finishNode <- finish) {
        if (finishNode == node) break
      }

      node :: finish //探索済みノードリストに追加

      // エッジをリストに登録
      for (edge <- node.edgeList) {
        edge :: list
        listRec(edge.to, list, finish)
      }
    }
  }

  def getArray = nodeArray

}
