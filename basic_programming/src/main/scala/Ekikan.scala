/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 9:04
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

/**
 * 駅と駅の接続情報を格納するレコード(問題8.7)
 * @param kiten
 * @param shuten
 * @param keiyu
 * @param kyori
 * @param jikan
 */
case class Ekikan(kiten: String, shuten: String, keiyu: String, kyori: Double, jikan: Int) {

  def hyouji: String = {
    kiten + " - " + shuten + ", 経由駅:" + keiyu + ", 距離:" + kyori + "(km), 時間:" + jikan + "(分)"
  }
}
