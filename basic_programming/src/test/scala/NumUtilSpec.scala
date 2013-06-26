/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/26
 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class NumUtilSpec extends Specification {

  "sumOfSquare method" should {
    "0~受け取った数までの２乗の和を求める" in {
      NumUtil.sumOfSquare(1) must be_==(2)
      NumUtil.sumOfSquare(2) must be_==(6)
    }
  }

  "zenkashiki method" should {
    "問題11.2の漸化式のa_nを返す" in {
      NumUtil.zenkashiki(0) must be_==(3)
      NumUtil.zenkashiki(1) must be_==(5)
      NumUtil.zenkashiki(2) must be_==(9)
    }
  }
}
