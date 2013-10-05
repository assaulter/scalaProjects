/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/10/05
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.prime

object Prime {

  def isPrime(num: Int): Boolean = {
    // numが素数かどうかを返す
    num match {
      case 1 => false
      case 2 => true
      case _ => search(num, 2)
    }
  }

  def search(num: Int, divider: Int): Boolean = {
    // numがdividerで割れるかどうかを確認する
    val powered = divider * divider
    if (powered > num)
      // 探索範囲になかった場合
      true
    else if (num % divider == 0)
      // 割れた場合
      false
    else
      search(num, divider+1)
  }
}
