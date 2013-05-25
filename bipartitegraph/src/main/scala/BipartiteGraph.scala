/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/25
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.bipartitegraph

// 隣接行列のリストを受ける
class BipartiteGraph (graph: Array[Node[String]]) {
  // 頂点を塗る色
  private val black = "black"
  private val white = "white"

  // 幅優先探索でgraphを探索する(再帰関数)
  // 頂点vertexをblackで塗って、隣接するやつをwhiteで塗る
  def paint(vertex: Int) {
    graph(vertex)
  }
}
