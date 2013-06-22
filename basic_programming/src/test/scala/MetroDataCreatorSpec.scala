/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/22
 * Time: 1:06
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class MetroDataCreatorSpec extends Specification {

  "getEkimeiFromJson method" should {
    "return Ekimei object" in {
      val ekimeiJson =
        """
    {kanji:"和光市"; kana:"わこうし"; romaji:"wakousi"; shozoku:"有楽町線"}
        """
      val ekimei = Ekimei("和光市","わこうし","wakousi","有楽町線")

      MetroDataCreator.getEkimeiFromJson(ekimeiJson) must be_==(ekimei)
    }
  }

  "getEkimeiListFromJson method" should {
    "return Ekimei List" in {
      val ekimeiJson =
        """
    [{kanji:"和光市"; kana:"わこうし"; romaji:"wakousi"; shozoku:"有楽町線"},
    {kanji:"代々木公園"; kana:"よよぎこうえん"; romaji:"yoyogikouen"; shozoku:"千代田線"}]
        """

      val ekimei = Ekimei("和光市","わこうし","wakousi","有楽町線")
      val ekimei2 = Ekimei("代々木公園","よよぎこうえん","yoyogikouen","千代田線")

      MetroDataCreator.getEkimeiListFromJson(ekimeiJson)(0) must be_==(ekimei)
      MetroDataCreator.getEkimeiListFromJson(ekimeiJson)(1) must be_==(ekimei2)
    }
  }
}
