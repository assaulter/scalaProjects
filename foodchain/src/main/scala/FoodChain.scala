/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/05/19
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 */

package com.example.foodchain

class FoodChain(numOfLife: Int, informations: Array[Information]) {

  val unionFindTree = new UnionFindTree(numOfLife * 3)

  def solver(): Int = {
    var ans = 0

    informations.foreach( (info: Information) => {
      if (validateInfo(info)) {
        ans = succ(ans)
      }

      // xとyが同じ種類の場合
      if (info.lifeType == LifeType.SAME) {
        if (unionFindTree.same(info.x, info.y + numOfLife) || unionFindTree.same(info.x, info.y + 2 * numOfLife)) {
          ans = succ(ans)
        } else {
          unionFindTree.unite(info.x, info.y)
          unionFindTree.unite(info.x + numOfLife, info.y + numOfLife)
          unionFindTree.unite(info.x + numOfLife * 2, info.y + numOfLife * 2)
        }
      }

      // xがyを捕食する場合
      if (info.lifeType == LifeType.EAT) {
        if (unionFindTree.same(info.x, info.y) || unionFindTree.same(info.x, info.y + numOfLife * 2)) {
          ans = succ(ans)
        } else {
          unionFindTree.unite(info.x, info.y + numOfLife)
          unionFindTree.unite(info.x + numOfLife, info.y + numOfLife * 2)
          unionFindTree.unite(info.x + numOfLife * 2, info.y)
        }
      }
    })

    ans
  }

  private def succ(x: Int) = x + 1

  def validateInfo(info: Information): Boolean = {
    info.x < 0 || numOfLife <= info.x || info.y < 0 || numOfLife <= info.y
  }
}
