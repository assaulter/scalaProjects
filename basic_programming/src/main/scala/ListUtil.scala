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
  /*def insert(list: List[Int], num: Int): List[Int] = {
    list match {
      case Nil
    }
  }*/
}
