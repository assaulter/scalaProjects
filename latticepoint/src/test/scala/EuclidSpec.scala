/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/09/02
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.latticepoint

import org.specs2.mutable.Specification

class EuclidSpec extends Specification {

  "euclid methodはnとmの最大公約数を求める" should {
    "互いに素の場合には1を返す" in {
      Euclid.euclid(4,9) must be_==(1)
    }

    "そうでない場合には最大公約数を返す" in {
      Euclid.euclid(30, 42) must be_==(6)
    }
  }
}
