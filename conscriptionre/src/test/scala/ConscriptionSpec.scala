/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/07/08
 * Time: 12:24
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.conscriptionre

import org.specs2.mutable._

class ConscriptionSpec extends Specification {

  "conscription class" should {
    "solve textbook question" in {
      val data = List(Edge(4,3,6831),Edge(1,3,4583),Edge(0,0,6592),Edge(0,1,3063),Edge(3,3,4975),Edge(1,3,2049),Edge(4,2,2104),Edge(2,2,781))
      val conscription = new Conscription(data)

      /**
      val sortedData = conscription.getSortedList
      sortedData(0).cost must be_==(6831)
      sortedData(1).cost must be_==(6592)
        **/


    }
  }
}
