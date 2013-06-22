/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class PersonUtilSpec extends Specification {

  "count_ketsueki_A method" should {
    "return bloodType = A person number" in {
      val personList = List(
        Person("nameA", 170, 60, "2/2", "A"),
        Person("nameB", 170, 65, "2/2", "B"),
        Person("nameC", 170, 60, "2/2", "A"),
        Person("nameD", 170, 65, "2/2", "A")
      )

      PersonUtil.count_ketsueki_A(personList) must be_==(3)
    }
  }

  "sixtyfive method" should {
    "return 体重が65の人の名前のリストを返す" in {
      val personList = List(
        Person("nameA", 170, 60, "2/2", "A"),
        Person("nameB", 170, 65, "2/2", "B"),
        Person("nameC", 170, 60, "2/2", "A"),
        Person("nameD", 170, 65, "2/2", "A")
      )

      PersonUtil.sixtyfive(personList)(0) must be_!=/("nameB")
      PersonUtil.sixtyfive(personList)(1) must be_!=/("nameD")
    }
  }
}
