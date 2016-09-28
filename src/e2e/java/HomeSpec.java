import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HomeSpec {
	@Test
	public void call_home_services_endpoint() {
		given().baseUri("http://localhost:80/services").
				when().get("/").
				then().statusCode(200).
				and().body("message", equalTo("Hello!"));
	}
}
