/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/26
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

object NumUtil {

  // 階乗を求める
  def fac(num: Int): Int = num match {
    case 0 => 1
    case _ => num * fac(num - 1)
  }

  // べき乗を求める
  def power(n: Int, m: Int): Int = m match {
    case 0 => 1
    case _ => n * power(n, m-1)
  }

  // 問題11.1: 0~受け取った数までの２乗の和を求める関数
  def sumOfSquare(num: Int): Int  = num match {
    case 0 => 1
    case _ => power(num, 2) + sumOfSquare(num - 1)
  }

  // 問題11.2
  // a_0 = 3
  // a_n = 2a_n-1 - 1
  // の漸化式のa_nを求める関数
  def zenkashiki(n: Int): Int = n match {
    case 0 => 3
    case _ => 2 * zenkashiki(n-1) - 1
  }
}
