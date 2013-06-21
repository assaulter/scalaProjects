/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/21
 * Time: 8:53
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

/**
 * 駅名の情報を格納するレコード
 * @param kanji
 * @param kana
 * @param romaji
 * @param shozoku
 */
case class Ekimei(kanji: String, kana: String, romaji: String, shozoku: String) {

  def hyouji: String = {
    shozoku + ", " + kanji + "(" + kana + ")"
  }
}
