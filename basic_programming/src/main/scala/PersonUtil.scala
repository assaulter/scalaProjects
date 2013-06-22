/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

object PersonUtil {

  // 問題9.7: personリストから、血液型がAの人数を返す関数
  def count_ketsueki_A(list: List[Person]): Int = {
    list match {
      case Nil => 0
      case _ => list.head.bloodType match {
        case "A" => 1 + count_ketsueki_A(list.tail)
        case _ => 0 + count_ketsueki_A(list.tail)
      }
    }
  }

  // 問題9.8: 改変。体重が65の人の名前のリストを返す関数
  def sixtyfive(list: List[Person]): List[String] = {
    list.filter( p => p.weight == 65).map( p => p.name)
  }
}
