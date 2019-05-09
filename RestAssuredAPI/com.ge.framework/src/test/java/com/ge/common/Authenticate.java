package com.ge.common;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;


public class Authenticate {
	
	public static Log logger = LogFactory.getLog(Authenticate.class);
	public static Properties prop;
	public static Response responseBody;
	public static String username;
	public static String password;
	public static String dataBase;
	public static String login;
	public static String meridiumToken;
	
	@BeforeSuite
	public static void readConfigFileProperties() throws IOException {
		//How to read the properties file 
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\212588125\\RestAssuredAPI\\com.ge.framework\\config.properties");
		prop.load(ip);
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		dataBase = prop.getProperty("dataBase"); 
		login = prop.getProperty("login");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@Test(priority=1)
	public static void authenticate() {
		Map<String, Object> jsonAsMap = new LinkedHashMap<String, Object>();
		jsonAsMap.put("Id", username);
		jsonAsMap.put("Password", password);
		jsonAsMap.put("DatasourceId", dataBase);
		responseBody = given().contentType(ContentType.JSON).body(jsonAsMap).when().post(login);
		responseBody.then().statusCode(200);
		JsonPath jsonPath = new JsonPath(responseBody.asString());
		logger.info("Response for authenticate API is "+responseBody.asString() + "\n");
		meridiumToken = jsonPath.getString("sessionId")+";"+jsonPath.getString("timezoneId");
		logger.info("Meridium Token is is "+meridiumToken + "\n");
		System.out.println(meridiumToken);
		assertEquals(200,responseBody.getStatusCode());
		assertEquals("id",jsonPath.get("id"), "ID is not correct");
	}
}


