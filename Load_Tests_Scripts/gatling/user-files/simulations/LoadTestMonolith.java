import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.core.body.*;
import io.gatling.javaapi.jdbc.*;

import io.gatling.http.response.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

import io.gatling.core.Predef.*;
import io.gatling.http.Predef.*;
//import scala.concurrent.duration.*;

import java.nio.file.Paths;

public class LoadTestMonolith extends Simulation {

    {
	FeederBuilder csvFeeder = csv(Paths.get("appmono2/users.csv").toString()).circular();

	HttpProtocolBuilder httpProtocol = http
	    .baseUrl("http://192.168.3.136:5001/")
	    .inferHtmlResources()
	    .acceptHeader("*/*")
	    .acceptEncodingHeader("gzip, deflate")
	    .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
	    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/111.0");
    
	Map<CharSequence, String> headers_0 = new HashMap<>();
	headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
	headers_0.put("If-None-Match", "W/\"706-k7sKE3dzm3nGipfV//LSlOVeNn4\"");
	headers_0.put("Sec-Fetch-Dest", "document");
	headers_0.put("Sec-Fetch-Mode", "navigate");
	headers_0.put("Sec-Fetch-Site", "none");
	headers_0.put("Sec-Fetch-User", "?1");
	headers_0.put("Upgrade-Insecure-Requests", "1");
    
	Map<CharSequence, String> headers_1 = new HashMap<>();
	headers_1.put("If-None-Match", "W/\"978d-TxG3ryXAikpg1cFThRZTJ7Y4468\"");
	headers_1.put("Sec-Fetch-Dest", "script");
	headers_1.put("Sec-Fetch-Mode", "no-cors");
	headers_1.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_2 = new HashMap<>();
	headers_2.put("If-None-Match", "W/\"f177c8-bntIipwU4ZZBSwexKP0bd3PEq3E\"");
	headers_2.put("Sec-Fetch-Dest", "script");
	headers_2.put("Sec-Fetch-Mode", "no-cors");
	headers_2.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_3 = new HashMap<>();
	headers_3.put("If-None-Match", "W/\"12f559-74NzGDpqEFPxkI3pUv3iRsV0s8E\"");
	headers_3.put("Sec-Fetch-Dest", "script");
	headers_3.put("Sec-Fetch-Mode", "no-cors");
	headers_3.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_4 = new HashMap<>();
	headers_4.put("If-None-Match", "W/\"19cf-oqVD5+wHcCa7X5zGTgVwn0N3dIk\"");
	headers_4.put("Sec-Fetch-Dest", "script");
	headers_4.put("Sec-Fetch-Mode", "no-cors");
	headers_4.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_5 = new HashMap<>();
	headers_5.put("If-Modified-Since", "Thu, 04 Aug 2022 10:03:02 GMT");
	headers_5.put("If-None-Match", "W/\"2602-182684ef7f0\"");
	headers_5.put("Sec-Fetch-Dest", "empty");
	headers_5.put("Sec-Fetch-Mode", "cors");
	headers_5.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_6 = new HashMap<>();
	headers_6.put("Access-Control-Request-Headers", "cache-control");
	headers_6.put("Access-Control-Request-Method", "GET");
	headers_6.put("Origin", "http://192.168.3.136:3001/");
	headers_6.put("Sec-Fetch-Dest", "empty");
	headers_6.put("Sec-Fetch-Mode", "cors");
	headers_6.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_7 = new HashMap<>();
	headers_7.put("Accept", "application/json, text/plain, */*");
	headers_7.put("Cache-Control", "no-cache");
	headers_7.put("Content-Language", "en");
	headers_7.put("Origin", "http://192.168.3.136:3001/");
	headers_7.put("Sec-Fetch-Dest", "empty");
	headers_7.put("Sec-Fetch-Mode", "cors");
	headers_7.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_8 = new HashMap<>();
	headers_8.put("Accept", "image/avif,image/webp,*/*");
	headers_8.put("If-None-Match", "W/\"2ec6-C52I+EohuCItldtlr8I+GvTMEFI\"");
	headers_8.put("Sec-Fetch-Dest", "image");
	headers_8.put("Sec-Fetch-Mode", "no-cors");
	headers_8.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_10 = new HashMap<>();
	headers_10.put("Accept", "image/avif,image/webp,*/*");
	headers_10.put("If-None-Match", "W/\"50fb0-PheDZav8ewTNjNoBuQLNk/Iscz4\"");
	headers_10.put("Sec-Fetch-Dest", "image");
	headers_10.put("Sec-Fetch-Mode", "no-cors");
	headers_10.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_12 = new HashMap<>();
	headers_12.put("If-None-Match", "W/\"f177c8-bntIipwU4ZZBSwexKP0bd3PEq3E\"");
	headers_12.put("Sec-Fetch-Dest", "empty");
	headers_12.put("Sec-Fetch-Mode", "cors");
	headers_12.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_13 = new HashMap<>();
	headers_13.put("If-None-Match", "W/\"8891d0-EtWZKBMMj9TzqaS+DOxhRkeg394\"");
	headers_13.put("Sec-Fetch-Dest", "empty");
	headers_13.put("Sec-Fetch-Mode", "cors");
	headers_13.put("Sec-Fetch-Site", "same-origin");
    
	Map<CharSequence, String> headers_14 = new HashMap<>();
	headers_14.put("Access-Control-Request-Headers", "authorization,x-goog-authuser");
	headers_14.put("Access-Control-Request-Method", "GET");
	headers_14.put("Origin", "https://mail.google.com");
	headers_14.put("Sec-Fetch-Dest", "empty");
	headers_14.put("Sec-Fetch-Mode", "cors");
	headers_14.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_15 = new HashMap<>();
	headers_15.put("Access-Control-Request-Headers", "cache-control,content-type");
	headers_15.put("Access-Control-Request-Method", "POST");
	headers_15.put("Origin", "http://192.168.3.136:3001/");
	headers_15.put("Sec-Fetch-Dest", "empty");
	headers_15.put("Sec-Fetch-Mode", "cors");
	headers_15.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_16 = new HashMap<>();
	headers_16.put("Accept", "application/json, text/plain, */*");
	headers_16.put("Cache-Control", "no-cache");
	headers_16.put("Content-Language", "en");
	headers_16.put("Content-Type", "application/json");
	headers_16.put("Origin", "http://192.168.3.136:3001/");
	headers_16.put("Sec-Fetch-Dest", "empty");
	headers_16.put("Sec-Fetch-Mode", "cors");
	headers_16.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_23 = new HashMap<>();
	headers_23.put("Accept", "application/json, text/plain, */*");
	headers_23.put("Cache-Control", "no-cache");
	headers_23.put("Content-Language", "en");
	headers_23.put("If-None-Match", "W/\"10a-i2MyHkFZzURW/PczDvJOVoUIRRA\"");
	headers_23.put("Origin", "http://192.168.3.136:3001/");
	headers_23.put("Sec-Fetch-Dest", "empty");
	headers_23.put("Sec-Fetch-Mode", "cors");
	headers_23.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_24 = new HashMap<>();
	headers_24.put("Accept", "application/json, text/plain, */*");
	headers_24.put("Cache-Control", "no-cache");
	headers_24.put("Content-Language", "en");
	headers_24.put("If-None-Match", "W/\"8a-YooMuV2QYStu/ccxPxh7qDYCAtA\"");
	headers_24.put("Origin", "http://192.168.3.136:3001/");
	headers_24.put("Sec-Fetch-Dest", "empty");
	headers_24.put("Sec-Fetch-Mode", "cors");
	headers_24.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_26 = new HashMap<>();
	headers_26.put("Accept", "application/json, text/plain, */*");
	headers_26.put("Cache-Control", "no-cache");
	headers_26.put("Content-Language", "en");
	headers_26.put("If-None-Match", "W/\"d7-hv98O96Hr9fyoSkTQ33Dp8qkySw\"");
	headers_26.put("Origin", "http://192.168.3.136:3001/");
	headers_26.put("Sec-Fetch-Dest", "empty");
	headers_26.put("Sec-Fetch-Mode", "cors");
	headers_26.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_27 = new HashMap<>();
	headers_27.put("Accept", "application/json, text/plain, */*");
	headers_27.put("Cache-Control", "no-cache");
	headers_27.put("Content-Language", "en");
	headers_27.put("If-None-Match", "W/\"7e-bRv0nsyqIvm0B6TYf2sLf/H8yjI\"");
	headers_27.put("Origin", "http://192.168.3.136:3001/");
	headers_27.put("Sec-Fetch-Dest", "empty");
	headers_27.put("Sec-Fetch-Mode", "cors");
	headers_27.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_28 = new HashMap<>();
	headers_28.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
	headers_28.put("Origin", "https://mail.google.com");
	headers_28.put("Sec-Fetch-Dest", "empty");
	headers_28.put("Sec-Fetch-Mode", "cors");
	headers_28.put("Sec-Fetch-Site", "same-site");
	headers_28.put("X-Goog-AuthUser", "4");
	headers_28.put("authorization", "SAPISIDHASH 40659c650b768c92b199df9179e5bcf4a4c391c0");
    
	Map<CharSequence, String> headers_30 = new HashMap<>();
	headers_30.put("Accept", "application/json, text/plain, */*");
	headers_30.put("Cache-Control", "no-cache");
	headers_30.put("Content-Language", "en");
	headers_30.put("If-None-Match", "W/\"e6-f0slRCzZvQKYbWJSuGtP4/+gIUI\"");
	headers_30.put("Origin", "http://192.168.3.136:3001/");
	headers_30.put("Sec-Fetch-Dest", "empty");
	headers_30.put("Sec-Fetch-Mode", "cors");
	headers_30.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_34 = new HashMap<>();
	headers_34.put("Accept", "application/json, text/plain, */*");
	headers_34.put("Cache-Control", "no-cache");
	headers_34.put("Content-Language", "en");
	headers_34.put("If-None-Match", "W/\"6c-2eI3aulyU1sMMO4jADRTZot5SA4\"");
	headers_34.put("Origin", "http://192.168.3.136:3001/");
	headers_34.put("Sec-Fetch-Dest", "empty");
	headers_34.put("Sec-Fetch-Mode", "cors");
	headers_34.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_35 = new HashMap<>();
	headers_35.put("Accept", "application/json, text/plain, */*");
	headers_35.put("Cache-Control", "no-cache");
	headers_35.put("Content-Language", "en");
	headers_35.put("If-None-Match", "W/\"7c-WmiYEWeQ/4WARB7DaEuJkPVYaZ4\"");
	headers_35.put("Origin", "http://192.168.3.136:3001/");
	headers_35.put("Sec-Fetch-Dest", "empty");
	headers_35.put("Sec-Fetch-Mode", "cors");
	headers_35.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_36 = new HashMap<>();
	headers_36.put("Accept", "application/json, text/plain, */*");
	headers_36.put("Cache-Control", "no-cache");
	headers_36.put("Content-Language", "en");
	headers_36.put("If-None-Match", "W/\"e2a-QvMgCDff23ewsDhscHwTRne5g+Y\"");
	headers_36.put("Origin", "http://192.168.3.136:3001/");
	headers_36.put("Sec-Fetch-Dest", "empty");
	headers_36.put("Sec-Fetch-Mode", "cors");
	headers_36.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_38 = new HashMap<>();
	headers_38.put("Accept", "application/json, text/plain, */*");
	headers_38.put("Cache-Control", "no-cache");
	headers_38.put("Content-Language", "en");
	headers_38.put("If-None-Match", "W/\"2-l9Fw4VUO7kr8CvBlt4zaMCqXZ0w\"");
	headers_38.put("Origin", "http://192.168.3.136:3001/");
	headers_38.put("Sec-Fetch-Dest", "empty");
	headers_38.put("Sec-Fetch-Mode", "cors");
	headers_38.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_41 = new HashMap<>();
	headers_41.put("Accept", "application/json, text/plain, */*");
	headers_41.put("Cache-Control", "no-cache");
	headers_41.put("Content-Language", "en");
	headers_41.put("If-None-Match", "W/\"13a1-XjvYXT8BLhwEvbGNb55+empY89s\"");
	headers_41.put("Origin", "http://192.168.3.136:3001/");
	headers_41.put("Sec-Fetch-Dest", "empty");
	headers_41.put("Sec-Fetch-Mode", "cors");
	headers_41.put("Sec-Fetch-Site", "same-site");
    
	Map<CharSequence, String> headers_42 = new HashMap<>();
	headers_42.put("Content-Type", "application/octet-stream");
	headers_42.put("Sec-Fetch-Dest", "empty");
	headers_42.put("Sec-Fetch-Mode", "no-cors");
	headers_42.put("Sec-Fetch-Site", "none");
    
	Map<CharSequence, String> headers_43 = new HashMap<>();
	headers_43.put("Content-Type", "application/json");
	headers_43.put("Origin", "https://mail.google.com");
	headers_43.put("Sec-Fetch-Dest", "empty");
	headers_43.put("Sec-Fetch-Mode", "cors");
	headers_43.put("Sec-Fetch-Site", "same-origin");
	headers_43.put("X-Framework-Xsrf-Token", "AKwhgQrPm7I62j1AVBp0KHRIPrG719CZ9w:1679153031700");
	headers_43.put("X-Gmail-BTAI", "[null,null,[null,null,null,null,null,0,null,null,null,1,null,null,1,null,0,1,1,0,1,null,null,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,\"fr\",\"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/111.0\",1,0,25,null,0,1,0,1,1,1,1,1,null,1,1,0,1,1,0,0,null,0,1,null,1,0,null,null,0,null,1,0,1,0,null,0,0,0,0,0,null,1000,0,0],null,\"3f81a48cbe\",null,25,\"gmail.pinto-server_20230313.06_p2\",1,5,\"\",3600000,\"+01:00\",1,null,516384276,\"\",\"\",1679559296644,null,163640]");
	headers_43.put("X-Google-BTD", "1");
    
	Map<CharSequence, String> headers_44 = new HashMap<>();
	headers_44.put("Accept", "image/avif,image/webp,*/*");
	headers_44.put("Sec-Fetch-Dest", "image");
	headers_44.put("Sec-Fetch-Mode", "no-cors");
	headers_44.put("Sec-Fetch-Site", "cross-site");
    
	Map<CharSequence, String> headers_55 = new HashMap<>();
	headers_55.put("Access-Control-Request-Headers", "cache-control");
	headers_55.put("Access-Control-Request-Method", "DELETE");
	headers_55.put("Origin", "http://192.168.3.136:3001/");
	headers_55.put("Sec-Fetch-Dest", "empty");
	headers_55.put("Sec-Fetch-Mode", "cors");
	headers_55.put("Sec-Fetch-Site", "same-site");
    
	String uri6 = "http://192.168.3.136:3001/";    

	ScenarioBuilder scn = scenario("LoadTestMonolith")
	    //.repeat(5).on(
	    .feed(csvFeeder)	    
	    .exec(
		  http("request_1_0")
		  .options("/api/user/login")
		  .headers(headers_15)
		  .resources(
			     http("request_1_1")
			     .post("/api/user/login")
			     .headers(headers_16)
			     .body(StringBody(
					      "{\n" +
					      "  \"email\": \"" + "${email}" + "\",\n" +
					      "  \"password\": \"" + "${password}" + "\"\n" +
					      "}"
					      ))
			     .asJson()
			     .check(jsonPath("$.email").saveAs("EMAIL")
				    //.check(header("set-cookie").saveAs("ACCESS_TOKEN") //OK
				    )
			     )
		  )
       	    .exec(getCookieValue(CookieKey("access_token").saveAs("access_token")))
	    .exec(getCookieValue(CookieKey("refresh_token").saveAs("refresh_token")))
	    .exec( session -> {
		    //System.out.println("ACCESS_TOKEN: "+session.get("access_token").toString());
		    return session;
		   }
		 )	    
	    .doIfOrElse(session -> { return session.get("access_token") != null; } ).then(  
	      pause(5)
	      .exec(
		  http("request_2_0")
		  .options("/api/auth/verify")
		  .headers(headers_6)
		  .resources(
			     http("request_2_1")
			     .get("/api/auth/verify")
			     .headers(headers_34)
			     )
		  )
	      .pause(5)
	      .exec(
		  http("request_3_0")
		  .options("/api/exercise-production")
		  .headers(headers_15)
		  .resources(
			     http("request_3_1")
			     .post("/api/exercise-production")
			     .headers(headers_16)
			     .body(RawFileBody("appmono2/0046_request.json"))
			     )
		  )
  	      .pause(5)	    
	      .exec(
		  http("request_4_0")
		  .options("/api/user/logout")
		  .headers(headers_55)
		  .resources(
			     http("request_4_1")
			     .delete("/api/user/logout")
			     .headers(headers_7)
			     )
		  )	    
	      .exec(flushSessionCookies())
	      .pause(5)
	      .exec(	     
		  http("request_5_0")
		  .options("/api/auth/verify")
		  .headers(headers_6)
		  .resources(http("request_5_1")
			     .get("/api/auth/verify")
			     .headers(headers_34)
			     .check(status().is(401))
			     )
		  //		     )
		  //.pause(10)
		  )
	    	  .pause(5)
				 )
	    .orElse(
		    exec( session -> {
			    System.out.println("LOGIN UNSUCCESSFUL = other reqs skipped for this VU");
			    return session;
			}
			)
		    )
	    ;

	//int max_vus = 10;
	int max_vus = 200;
	//int max_vus = 100;
	//int phase_duration = 20;
	int phase_duration = 60;
    setUp(
	  scn.injectOpen(
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),						    			 
			 nothingFor(240),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized())
	  .constantPauses())
	.protocols(httpProtocol);
	
	/*
	
	int max_vus = 100;
	int phase_duration = 60;
	
	setUp(scn.injectOpen(rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),constantUsersPerSec(max_vus).during(phase_duration).randomized())).protocols(httpProtocol);	    	
	*/
	//setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
    }
}
