/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 8:11
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.layout

import org.specs2.mutable.Specification

class BellmanFordSpec extends Specification {

  "textBook sample" should {
    "return 27" in {
      /// 前２つが最大値の制限、後１つが最小値の制限 (リストを分けるべき？？？)
      /// 0 ~ 4のグラフでやりたいので、教科書の例から１引いている。
      val likeList = List(Edge(0,2,10), Edge(1,3,20))
      val dislikeList = List(Edge(1,2,3))

      val bellman = new BellmanFord(4, likeList, dislikeList)

      bellman.calc must be_==(27)
    }
  }
}
