/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/25
 * Time: 9:39
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class MertoDataUtilSpec extends Specification {

  "romajiToKanji method" should {
    "ローマ字から漢字を返す。なかったら空文字を返す" in {
      val ekimeiList = MetroDataCreator.getEkimeiListAboutTextBook

      MetroDataUtil.romajiToKanji("hoge", ekimeiList) must be_==/("")
      MetroDataUtil.romajiToKanji("asakusa", ekimeiList) must be_==/("浅草")
    }
  }

  "getEkikanKyori method" should {
    "漢字の駅名２つと駅間リストから、距離を返す関数" in {
      val ekikanList = MetroDataCreator.getEkikanListAboutTextBook

      MetroDataUtil.getEkikanKyori("池袋", "要町", ekikanList) must be_==(1.2)
      MetroDataUtil.getEkikanKyori("hoge", "fuga", ekikanList) must be_==(Double.MaxValue)
    }
  }

  "kyoriWoHyouji method" should {
    "ローマ字の駅名を２つ受け取り、そのあいだの距離を調べ、直接つながっている場合には、[a~bまではxkmです]という文字列を返す。そうでない場合には[aとbはつながってません]と返す。そもそも駅名が無い場合には、~という駅名は存在しません。と返す" in {
      val ekimeiList = MetroDataCreator.getEkimeiListAboutTextBook
      val ekikanList = MetroDataCreator.getEkikanListAboutTextBook

      MetroDataUtil.kyoriWoHyouji("myougadani", "shinotsuka", ekimeiList, ekikanList) must be_==/("myougadaniという駅名は存在しません")
      MetroDataUtil.kyoriWoHyouji("myogadani", "shinotsuka", ekimeiList, ekikanList) must be_==/("茗荷谷から新大塚までは1.2kmです")
      MetroDataUtil.kyoriWoHyouji("tokyo", "ootemachi", ekimeiList, ekikanList) must be_==/("ootemachiという駅名は存在しません")

    }
  }
}
