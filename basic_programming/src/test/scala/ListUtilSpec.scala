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

  "append method" should {
    "２つのリストを結合する" in {
      ListUtil.append(List(), List()) must be_==(List())
      ListUtil.append(List("a"), List("b")) must be_==(List("a", "b"))
    }
  }

  "merge method" should {
    "昇順に並んだリストをマージする" in {
      val listA = List(1,2,3,4)
      val listB = List(3,5,7)

      ListUtil.merge(List(),List()) must be_==(List())
      ListUtil.merge(listA, List()) must be_==(listA)
      ListUtil.merge(List(), listB) must be_==(listB)
      ListUtil.merge(listA, listB) must be_==(List(1,2,3,3,4,5,7))
    }
  }

  "filterPositive method" should {
    "リストから、正の要素のみを取り出す" in {
      val listA = List(-1,1,2,-2,3)

      ListUtil.filterPositive(listA) must be_==(List(1,2,3))
    }
  }

  "myFilter method" should {
    "listからmatcherの条件に引っかかるやつのみの要素を取り出す" in {
      val listA = List(-1,1,2,-2,3)
      val matcher = (x: Int) => x > 0

      ListUtil.myFilter(listA, matcher) must be_==(List(1,2,3))
    }
  }

  "filterEven method" should  {
    "even関数をfilterを使って書きなおした" in {
      val list = List(1,2,3,4)
      ListUtil.filterEven(list) must be_==(List(2,4))
    }
  }

  "filterCountA method" should {
    "学生リストのうち、成績がAの人数を返す" in {
      val list = List(
        Gakusei("name1", 80, "A"),
        Gakusei("name2", 80, "A"),
        Gakusei("name3", 60, "B"),
        Gakusei("name4", 50, "B")
      )

      ListUtil.filterCountA(list) must be_==(2)
    }
  }

  "powSubOne method" should {
    "整数の二乗から１を引いた数を返す" in {
      ListUtil.powSubOne(3) must be_==(8)
    }
  }

  "concatByOneLine method" should {
    "return 文字列のリストから、連結した一つの文字列をかえす" in {
      val list = List("a", "b", "c")
      ListUtil.concatByOneLine(list) must be_!=/("abc")
    }
  }

  "enumerate method" should {
    "n to 1のリストを返す" in {
      ListUtil.enumerate(5) must be_==(List(5,4,3,2,1))
    }
  }

  "quickSort method" should {
    "quick sort を実装" in {
      ListUtil.quickSort(List()) must be_==(List())
      ListUtil.quickSort(List(5,7,3,4,6)) must be_==(List(3,4,5,6,7))
    }
  }

  "takeLess method" should {
    "listから、nより小さい要素のみを返す" in {
      ListUtil.takeLess(4,List(3,5,2,1,7)) must be_==(List(3,2,1))
    }
  }

  "takeGreater method" should {
    "listから、nより大きい要素のみを返す" in {
      ListUtil.takeGreater(4, List(3,5,7,6,4)) must be_==(List(5,7,6))
    }
  }
}
