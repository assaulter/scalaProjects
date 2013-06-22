/**
 * Created with IntelliJ IDEA.
 * User: assaulter
 * Date: 13/06/21
 * Time: 23:35
 * To change this template use File | Settings | File Templates.
 */
package org.assaulter.basic_programming

import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import scala.util.parsing.json.JSONArray

object MetroDataCreator {

  def getEkimeiFromJson(json: String): Ekimei = {
    val gson: Gson = new Gson()
    gson.fromJson(json, classOf[Ekimei])
  }

  def getEkimeiListFromJson(json: String): Array[Ekimei] = {

    val gson: Gson = new Gson()
    gson.fromJson(json, classOf[Array[Ekimei]])
  }
}
