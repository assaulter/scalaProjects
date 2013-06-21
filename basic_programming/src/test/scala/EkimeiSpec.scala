/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 8:56
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class EkimeiSpec extends Specification {

  "The 'Ekimei' class, hyouji method" should {
    "return type of String 路線名, 駅名(かな) about 問題8.5, 8.6" in {
      val osaki = Ekimei("大崎", "おおさき", "osaki", "山手線")
      osaki.hyouji must be_!=/("山手線, 大崎(おおさき)")
    }
  }
}
