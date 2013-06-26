/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/06/26
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.basic_programming

/**
 * (* グラフの中の節（駅）を表す型 *)
 * @param namae 駅名（漢字）
 * @param saitan_kyori 最短距離
 * @param temae_list 手前にある駅名（漢字）
 */
case class Eki(namae: String, saitan_kyori: Double, temae_list: List[String]) {

}
