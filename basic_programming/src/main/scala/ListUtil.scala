/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 9:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

object ListUtil {

  // 問題9.4: 受け取った整数リストの長さを再帰で計算して返す関数
  def getLength(list: List[Int]): Int = {
    list match {
      case List() => 0
      case _ => 1 + getLength(list.tail)
    }
  }

  // 問題9.5: 整数のリストを受け取ったら、偶数の要素のみのリストを返す関数
  def even(list: List[Int]): List[Int] = {
    list.filter(_ % 2 == 0)
  }

  // 問題9.6: 文字列のリストからすべてを結合した文字列を返す関数
  def concat(list: List[String]): String = {
    list match {
      case List() => ""
      case _ => list.head + concat(list.tail)
    }
  }

  // 問題10.1: 昇順で並んだリストと整数を受け取り、昇順となる位置に整数を插入したリストを返す関数
  def insert(list: List[Int], num: Int): List[Int] = {
    list match {
      case List() => List(num)
      case _ =>
        if (list.head < num) list.head::insert(list.tail, num)
        else num::list
    }
  }

  // 問題10.2: 整数のリストをソートする関数
  def ins_sort(list: List[Int]): List[Int] = {
    list match {
      case List() => List()
      case _ => insert((ins_sort(list.tail)), list.head)
    }
  }

  // リストの最小値を返す
  def minimum(list: List[Int]): Int = {
    list match {
      case List() => Int.MaxValue
      case _ =>
        val minTail = minimum(list.tail)

        if (list.head <= minTail) list.head
        else minTail
    }
  }

  // 10.4, 学生のデータを集計する
  // A~Dがそれぞれ何人いるか集計して(Int, Int, Int, Int)で返す
  def shukei(list: List[Gakusei]): (Int, Int, Int, Int) = {
    list match {
      case List() => (0,0,0,0)
      case _ =>
        val shukeiTail = shukei(list.tail)

        list.head.rate match {
          case "A" => (shukeiTail._1 + 1, shukeiTail._2, shukeiTail._3, shukeiTail._4)
          case "B" => (shukeiTail._1, shukeiTail._2 + 1, shukeiTail._3, shukeiTail._4)
          case "C" => (shukeiTail._1, shukeiTail._2, shukeiTail._3 + 1, shukeiTail._4)
          case "D" => (shukeiTail._1, shukeiTail._2, shukeiTail._3, shukeiTail._4 + 1)
          case _ => shukeiTail
        }
    }
  }

  // ２つのリストを結合する関数
  def append[A](listA: List[A], listB: List[A]): List[A] = {
    listA match {
      case List() => listB
      case _ => listA.head :: append(listA.tail, listB)
    }
  }

  // ふたつの昇順にならんだいrストをマージする
  def merge(listA: List[Int], listB: List[Int]): List[Int] = {
    (listA, listB) match {
      case (List(), List()) => List()
      case (List(), _)  => listB
      case (_, List()) => listA
      case _ =>
        if (listA.head < listB.head) listA.head::merge(listA.tail, listB)
        else listB.head::merge(listA, listB.tail)
    }
  }

  // 14.1 : 例題
  def filterPositive(list: List[Int]): List[Int] = {
    list match {
      case List() => list
      case _ =>
        if (list.head > 0) list.head :: filterPositive(list.tail)
        else filterPositive(list.tail)
    }
  }

  // 14.1 : 自作filter関数
  // 条件 matcher にあうものだけ抽出する関数
  def myFilter[A](list: List[A], matcher: A => Boolean): List[A] = {
    list match {
      case List() => list
      case _ =>
        if (matcher(list.head)) list.head :: myFilter(list.tail, matcher)
        else myFilter(list.tail, matcher)
    }
  }

  // 問題14.1 : 9.5のevenをfilterを使って書きなおす
  // even : 整数のリストを受け取ったら、偶数の要素のみのリストを返す関数
  def filterEven(list: List[Int]): List[Int] = {
    list.filter(n => n%2 == 0)
  }

  // 問題14.2 : 9.6節のcountAをfilterを使って書きなおす
  def filterCountA(list: List[Gakusei]): Int = {
    list.filter(gakusei => gakusei.rate == "A").length
  }

  // 問題14.8 : 整数の２乗から１ひいた数を返す関数
  val powSubOne:Int => Int = {x => x * x - 1}

  // 問題14.9 : 問題 8.3のperson型の配列から、名前のフィールドを取り出す関数
  // 誤字っぽいので、person_t型の配列から名前を取り出す関数を定義
  val getNameFromPerson:Person => String = {p => p.name}

  // 問題14.14: 文字列のリストからすべてを結合した文字列を返す関数を一行で書く
  def concatByOneLine(list: List[String]): String = {
    list.reduceLeft(_ + _)
  }

  // nから1までのリストを作る
  val enumerate:Int => List[Int] = {x => (1 to x).reverse.toList}

  // 約数を求める関数

}
