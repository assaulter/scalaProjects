/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.latticepoint

class LatticePoint(p1: MyPoint, p2: MyPoint) {

  // p1,p2を除いた、p1p2上の格子点の数を返す
  def solve: Int = {
    val absX = (p1.x - p2.x).abs
    val absY = (p1.y - p2.y).abs

    Euclid.euclid(absX, absY) - 1
  }
}
