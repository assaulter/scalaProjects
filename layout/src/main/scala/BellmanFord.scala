/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 8:06
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.layout

class BellmanFord(cowNum: Int, likeList: List[Edge], dislikeList: List[Edge]) {
  // d[i] : 最初の牛からの距離を表す
  var distList = Array.fill(cowNum)(Int.MaxValue)

  /**
   * 最短経路問題とは、全てのエッジについて、
   * d[i] + c >= d[j] (iからjに伸びるコストcのエッジ, d[i]はi番目のノードの始点からの最短距離)
   * という不等式を満たす、d[s] = 0 (sは始点) とした時の、
   * 全てのノードiについてのd[i]の最大値を求める問題である。
   */

  // ベルマンフォード法で計算した結果を返す
  def calc: Int = {
    // 始点
    distList(0) = 0
    // cowNum分ループを回す。微妙。。。
    for (i <- 0 to cowNum - 1) {
      // 1. d[i+1] + 0 >= d[i]
      for (k <- 0 to cowNum - 2) {
        if (distList(k+1) < Int.MaxValue)
          distList(k) = math.min(distList(k), distList(k+1))
      }

      // 2. d[AL] + DL >= d[BL]
      for (k <- 0 to likeList.length - 1) {
        val al = likeList(k).from
        val bl = likeList(k).to
        val dl = likeList(k).cost

        // 決定できている点からの情報しか使えないので、INFはパスする
        if (distList(al) < Int.MaxValue)
          distList(bl) = math.min(distList(bl), distList(al) + dl)
      }

      // 3. d[BD] - DD >= d[AD] (マイナスのコストを張ることになる)
      for (k <- 0 to dislikeList.length - 1) {
        val ad = dislikeList(k).from
        val bd = dislikeList(k).to
        val dd = dislikeList(k).cost

        if (distList(bd) < Int.MaxValue)
          distList(ad) = math.min(distList(ad), distList(bd) - dd)
      }
    }

    if (distList(0) < 0) {
      -1
    } else {
      distList(cowNum - 1) match {
        case Int.MaxValue => -2
        case _ => distList(cowNum - 1)
      }
    }
  }
}
