/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
package com.example.foodchain

// 生物のタイプを定義する情報
// 1:same 同じ種族
// 2:eat 捕食関係
object LifeType {
  case object EAT extends LifeType(0)
  case object SAME extends LifeType(1)

  private val codeTable = Array(EAT, SAME)

  def complement(code:Int) = codeTable((~code & 0x03) | (code & 0x04))

  sealed abstract class LifeType(val code: Int) {
    def complement = LifeType.complement(code)
  }
}
