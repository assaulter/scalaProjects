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
      case Nil => 0
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
      case Nil => ""
      case _ => list.head + concat(list.tail)
    }
  }

  // 問題10.1: 昇順で並んだリストと整数を受け取り、昇順となる位置に整数を插入したリストを返す関数
  def insert(list: List[Int], num: Int): List[Int] = {
    list match {
      case Nil => List(num)
      case _ =>
        if (list.head < num) list.head::insert(list.tail, num)
        else num::list
    }
  }

  // 問題10.2: 整数のリストをソートする関数
  def ins_sort(list: List[Int]): List[Int] = {
    list match {
      case Nil => List()
      case _ => insert((ins_sort(list.tail)), list.head)
    }
  }

  // リストの最小値を返す
  def minimum(list: List[Int]): Int = {
    list match {
      case Nil => Int.MaxValue
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
      case Nil => (0,0,0,0)
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
}
