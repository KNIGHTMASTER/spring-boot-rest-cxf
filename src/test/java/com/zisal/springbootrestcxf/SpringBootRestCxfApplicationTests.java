package com.zisal.springbootrestcxf;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestCxfApplicationTests {

	private static final int PORT = 8084;
	private static WireMockServer wireMockServer = new WireMockServer(PORT);

	private static final String APPLICATION_JSON = "application/json";

	@Test
	public void contextLoads() {
		System.out.println("Setting up!");
		wireMockServer.start();
		WireMock.configureFor("localhost", PORT);
		RestAssured.port = PORT;
		WireMock.stubFor(get(urlEqualTo("/employee/findall")).willReturn(
				aResponse().withStatus(200)
						.withHeader("Content-Type", APPLICATION_JSON)
						.withHeader("Accept", APPLICATION_JSON)
						.withBody("")));
	}

}
