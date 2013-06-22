/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
package com.example.foodchain

import com.example.foodchain.LifeType.LifeType

// LifeType.EAT, x, y : xはyを食べる
// LifeType.SAME, x, y : xとyは同じ種類
case class Information(lifeType: LifeType, x: Int, y: Int) {

}
