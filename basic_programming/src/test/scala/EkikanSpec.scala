/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 9:07
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

import org.specs2.mutable._

class EkikanSpec extends Specification {

  "The 'Ekikan' class, hyouji method" should {
    "return '起点駅から終点駅までの情報' about 問題8.7" in {
      val osaki_to_shinagawa = Ekikan("大崎", "品川", "", 5.0f, 5)
      osaki_to_shinagawa.hyouji must be_!=/("大崎 - 品川, 経由駅:, 距離:5.0(km), 時間:5(分)")
    }
  }
}
