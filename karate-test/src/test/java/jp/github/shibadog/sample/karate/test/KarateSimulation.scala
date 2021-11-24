package jp.github.shibadog.sample.karate.test;

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class KarateSimulation extends Simulation {
  val protocol = karateProtocol(
    "/test" -> pauseFor("get" -> 15)
  )

  val test = scenario("test").exec(karateFeature("classpath:jp/github/shibadog/sample/karate/test/test.feature"))

  setUp(
    test.inject(constantUsersPerSec(10) during (30 seconds)).protocols(protocol)
  )
}
