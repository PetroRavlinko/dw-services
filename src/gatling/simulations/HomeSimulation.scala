import io.gatling.core.Predef._
import io.gatling.http.Predef._


class HomeSimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:80/services")
  val scn = scenario("home load test")
    .exec(http("John").get("/"))
  setUp(
    scn.inject(
      atOnceUsers(1)
    )
  ).protocols(httpProtocol)
}