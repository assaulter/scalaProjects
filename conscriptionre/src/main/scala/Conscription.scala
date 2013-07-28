/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/07/08
 * Time: 12:24
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.conscriptionre

class Conscription(data: List[Edge]) {

  // 多分基本コンストラクタをオーバーライドしたほうが良さげ
  def getSortedList: List[Edge] = {
    data.sortBy(s => s.cost).reverse
  }

  def solve: Int = {
    val sortedList = getSortedList

  }
}
