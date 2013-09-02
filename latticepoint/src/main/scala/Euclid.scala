/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.latticepoint

object Euclid {

  // nとmの最大公約数を求める
  def euclid(n: Int, m: Int): Int = {
    n match {
      case 0 => m
      case _ => euclid(m%n, n)
    }
  }
}