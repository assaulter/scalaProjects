/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/25
 * Time: 9:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

object MetroDataUtil {

  // 問題10.10: ローマ字から漢字を返す。なかったら空文字を返す
  def romajiToKanji(romaji: String, ekimeiList: List[Ekimei]): String = {
    ekimeiList match {
      case Nil => ""
      case _ =>
        if (ekimeiList.head.romaji == romaji) ekimeiList.head.kanji
        else romajiToKanji(romaji, ekimeiList.tail)
    }
  }

  // 問題10.11: 漢字の駅名２つと駅間リストから、距離を返す関数
  def getEkikanKyori(ekimei1: String, ekimei2: String, ekikanList: List[Ekikan]): Double = {
    ekikanList match {
      case Nil => Double.MaxValue
      case _ =>
        lazy val ekikan = ekikanList.head

      if ((ekikan.kiten == ekimei1 && ekikan.shuten == ekimei2)
        || (ekikan.kiten == ekimei2 && ekikan.shuten == ekimei1))
      {
        ekikan.kyori
      } else {
        getEkikanKyori(ekimei1, ekimei2, ekikanList.tail)
      }
    }
  }

  // 問題10.12: ローマ字の駅名を２つ受け取り、そのあいだの距離を調べ、直接つながっている場合には、[a~bまではxkmです]という文字列を返す
  // そうでない場合には[aとbはつながってません]と返す。
  // そもそも駅名が無い場合には、~という駅名は存在しません。と返す
  def kyoriWoHyouji(ekimei1: String, ekimei2: String, ekimeiList: List[Ekimei], ekikanList: List[Ekikan]): String = {
    val kanji1 = romajiToKanji(ekimei1, ekimeiList)
    kanji1 match {
      case "" => ekimei1 + "という駅名は存在しません"
      case _ =>
        val kanji2 = romajiToKanji(ekimei2, ekimeiList)
        kanji2 match {
          case "" => ekimei2 + "という駅名は存在しません"
          case _ =>
            val ekikan = getEkikanKyori(kanji1, kanji2, ekikanList)
              ekikan match {
              case Double.MaxValue => kanji1 + "と" + kanji2 + "はつながっていません"
              case _ => kanji1 + "から" + kanji2 + "までは" + ekikan + "kmです"
            }
        }
    }
  }
}
