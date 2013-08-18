/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/08/18
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

object Euclid {

  // nとmの最大公約数を求める
  def euclid(n:Int, m:Int): Int = {
    n match {
      case 0 => m
      case _ => euclid(m%n, n)
    }
  }
}
