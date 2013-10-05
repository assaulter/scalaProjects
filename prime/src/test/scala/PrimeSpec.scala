/**
 * Created with IntelliJ IDEA.
 * User: kazukikubo
 * Date: 2013/10/05
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */

package org.assaulter.prime

import org.specs2.mutable._

class PrimeSpec extends Specification {

  "Prime method" should {
    "2は素数である" in {
      Prime.isPrime(2) must beTrue
    }

    "1は素数ではない" in {
      Prime.isPrime(1) must beFalse
    }

    "4は素数ではない" in {
      Prime.isPrime(4) must beFalse
    }

    "997は素数である" in {
      Prime.isPrime(997) must beTrue
    }

    "998は素数ではない" in {
      Prime.isPrime(998) must beFalse
    }

    "999999937は素数である" in {
      Prime.isPrime(999999937) must beTrue
    }
  }
}
