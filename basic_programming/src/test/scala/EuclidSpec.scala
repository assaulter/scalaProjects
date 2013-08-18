/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/08/18
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class EuclidSpec extends Specification {

  "euclid method" should {
    "ユークリッドの互除法により、最大公約数を求める" in {
      Euclid.euclid(0, 5) must be_==(5)
      Euclid.euclid(1071, 1029) must be_==(21)
    }
  }
}
