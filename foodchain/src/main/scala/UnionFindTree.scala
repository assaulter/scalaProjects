package com.example.foodchain

class UnionFindTree(elementNum: Int) {
  var parent: Array[Int] = Array.range(0, elementNum)
  var rank: Array[Int] = Array.fill(elementNum)(0)

  // 根を見つける
  def find(x: Int): Int = {
    if (x == parent(x)) {
      parent(x)
    }
    else {
      parent(x) = find(parent(x))
      parent(x)
    }
  }

  // xとyの属する集合を併合
  def unite(x: Int, y :Int) {
    var rootX = find(x)
    var rootY = find(y)

    if (rootX == rootY) return

    if (rank(rootX) < rank(rootY)) parent(rootX) = rootY
    else parent(rootY) = rootX

    if (rank(rootX) == rank(rootY)) rank(rootX) = rank(rootX) + 1
  }

  def same(x :Int, y :Int): Boolean = {
    return find(x) == find(y)
  }
}
