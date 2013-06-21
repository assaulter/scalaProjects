/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/16
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.conscription

import org.specs2.mutable._

class ConscriptionSpec extends Specification {
  "The Conscription Class" should {
    "solve textbook question" in {
      // (x,y,d)のトリプルは、男のx番目と女のy番目の親密度がdであることを示す。
      val relations = List((4,3,6831), (1,3,4583), (0, 0, 6592), (0,1,3063), (3,3,4975), (1,3,2049), (4,2,2104), (2,2,781))

      val conscription = new Conscription(relations)
    }
  }
}
