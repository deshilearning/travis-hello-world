package org.jacoco.examples.maven.java;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.apache.http.client.config.RequestConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.HttpClientConfig;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.response.Response;

/**
 * @author Desh.deepak
 *
 */
@ContextConfiguration(classes = SbtddApplication.class)
@TestPropertySource(value = { "classpath:application.properties" })
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringRestControllerTest {
	@Value("${server.port}")
	int port;

	
	  @Test public void getDataTest() {
		  System.out.println();
	  }
	 

	/*
	 * @Test public void GetWeatherDetails() { //String baseUri =
	 * "http://restapi.demoqa.com/utilities/weather/city/Hyderabad"; String res =
	 * get("/utilities/weather/city/Hyderabad").asString(); System.out.println(res);
	 * }
	 */

	
	/*
	 * @Test public void GetWeatherDetails() { RestAssuredConfig config =
	 * RestAssured.config(). }
	 */
	 

	
	@BeforeEach
	public void setBaseUri() {
		//RestAssured.port = port;
		RestAssured.baseURI = "http://localhost"; // replace as appropriate
		//RestAssured.baseURI = "http://restapi.demoqa.com"; // replace as appropriate
	}
}
