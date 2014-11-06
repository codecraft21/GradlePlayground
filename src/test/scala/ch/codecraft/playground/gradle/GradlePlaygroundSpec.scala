package ch.codecraft.playground.gradle

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

/**
 * Created by codecraft on 2014-11-06.
 */
@RunWith(classOf[JUnitRunner])
class GradlePlaygroundSpec extends FlatSpec with Matchers {
  "MyLib getStuff" should "just return Stuff" in {
    MyLib.getStuff should be("Stuff")
  }
}
