/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 18:32
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.latticepoint

import org.specs2.mutable.Specification

class LatticePointSpec extends Specification {

  "LatticePoint class's solve method" should {
    "P1(1,11), P2(5,3)を与えると、3を返す" in {
      val p1 = MyPoint(1,11)
      val p2 = MyPoint(5,3)

      val latticePoint = new LatticePoint(p1, p2)

      latticePoint.solve must be_==(3)
    }
  }
}
