/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 9:26
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class ListUtilSpec extends Specification {

  "getlength method" should {
    "return list length about 問題9.4" in {
      val list = List(1,2,3,4)
      ListUtil.getLength(list) must be_==(4)
    }
  }

  "even method" should {
    "return 偶数のみで構成されたリストを返す" in {
      val list = List(1,2,3,4)
      ListUtil.even(list) must be_==(List(2,4))
    }
  }

  "concat method" should {
    "return 文字列のリストから、連結した一つの文字列をかえす" in {
      val list = List("a", "b", "c")
      ListUtil.concat(list) must be_!=/("abc")
    }
  }

  "insert method" should {
    "昇順で並んだリストと整数を受け取り、昇順となる位置に整数を插入したリストを返す" in {

      ListUtil.insert(List(), 3) must be_==(List(3))
      ListUtil.insert(List(1), 3) must be_==(List(1,3))
      ListUtil.insert(List(3), 1) must be_==(List(1,3))
      ListUtil.insert(List(1,3,4,7,8), 5) must be_==(List(1,3,4,5,7,8))
    }
  }

  "ins_sort method" should {
    "整数リストをソートする" in {
      ListUtil.ins_sort(List(1)) must be_==(List(1))
      ListUtil.ins_sort(List(3,1)) must be_==(List(1,3))
      ListUtil.ins_sort(List(5,3,8,1,7,4)) must be_==(List(1,3,4,5,7,8))
    }
  }

  "minimun method" should {
    "整数リストの最小値を返す" in {
      ListUtil.minimum(List(3,5,1)) must be_==(1)
    }
  }

  "shukei method" should {
    "各rateの人数のクアッドを返す" in {
      val gakuseiList = List(
        Gakusei("name", 90, "A"),
        Gakusei("name", 80, "A"),
        Gakusei("name", 75, "B"),
        Gakusei("name", 70, "B"),
        Gakusei("name", 65, "C"),
        Gakusei("name", 55, "D")
      )

      ListUtil.shukei(gakuseiList) must be_==((2,2,1,1))
    }
  }
}
