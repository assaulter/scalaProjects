/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 9:26
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class ListUtilSpec extends Specification {

  "getlength method" should {
    "return list length about 問題9.4" in {
      val list = List(1,2,3,4)
      ListUtil.getLength(list) must be_==(4)
    }
  }

  "even method" should {
    "return 偶数のみで構成されたリストを返す" in {
      val list = List(1,2,3,4)
      ListUtil.even(list)(0) must be_==(2)
      ListUtil.even(list)(1) must be_==(4)
    }
  }

  "concat method" should {
    "return 文字列のリストから、連結した一つの文字列をかえす" in {
      val list = List("a", "b", "c")
      ListUtil.concat(list) must be_!=/("abc")
    }
  }
}
