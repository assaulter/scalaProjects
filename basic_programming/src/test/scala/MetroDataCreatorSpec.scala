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

  "getEkimeiListAboutTextBook method" should {
    "return Ekimei Array" in {
      val ekimei = Ekimei("代々木公園","よよぎこうえん","yoyogikouen","千代田線")
      MetroDataCreator.getEkimeiListAboutTextBook(1) must be_==(ekimei)
    }
  }

  "getEkikanListAboutTextBook method" should {
    "return Ekikan Array" in {
      val ekikan = Ekikan("代々木公園", "明治神宮前", "千代田線", 1.2, 2)

      MetroDataCreator.getEkikanListAboutTextBook(1) must be_==(ekikan)
    }
  }

  "makeEkiList method" should {
    "ekimei list から eki list を作る" in {
      val ekimeiList = MetroDataCreator.getEkimeiListAboutTextBook

      MetroDataCreator.makeEkiList(ekimeiList)(0) must be_==(Eki("代々木上原", Double.MaxValue, List()))
    }
  }

  "shokika method" should {
    "Ekiリストと起点を受け取ると、起点だけ初期化する" in {
      val ekimeiList = MetroDataCreator.getEkimeiListAboutTextBook
      val ekiList = MetroDataCreator.makeEkiList(ekimeiList)

      MetroDataCreator.shokika("赤坂", ekiList)(5) must be_==(Eki("赤坂", 0.0, List("赤坂")))
    }
  }

  "insEkimei method" should {
    "昇順にならんでいるekimeiListの正しい位置にekimeiを挿入するヘルパー関数" in {
      val sortedEkimeiList = List(
        Ekimei("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
        Ekimei("御茶ノ水", "おちゃのみず", "ochanomizu", "丸ノ内線")
      )

      val ocha = Ekimei("御茶ノ水", "おちゃのみず", "ochanomizu", "丸ノ内線")
      val kurakuen = Ekimei("後楽園", "こうらくえん", "korakuen", "丸ノ内線")

      MetroDataCreator.insEkimei(ocha, sortedEkimeiList) must be_==(sortedEkimeiList)
      MetroDataCreator.insEkimei(kurakuen, sortedEkimeiList)(2) must be_==(kurakuen)
    }
  }

  "seiretu method" should {
    "ekimeiリストを受け取ったら、それをひらがなの順に整列し、駅名の重複を除いたekimeiリストを返す関数。" in {
      val ekimeiList = List(
        Ekimei("後楽園", "こうらくえん", "korakuen", "丸ノ内線"),
        Ekimei("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
        Ekimei("御茶ノ水", "おちゃのみず", "ochanomizu", "丸ノ内線")
      )

      val sortedEkimeiList = List(
        Ekimei("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
        Ekimei("御茶ノ水", "おちゃのみず", "ochanomizu", "丸ノ内線"),
        Ekimei("後楽園", "こうらくえん", "korakuen", "丸ノ内線")
      )

      MetroDataCreator.seiretu(ekimeiList) must be_==(sortedEkimeiList)
    }
  }

  "koushin1 method" should {
    "未確定の駅を必要に応じて更新した駅を返す" in {

    }
  }
}
